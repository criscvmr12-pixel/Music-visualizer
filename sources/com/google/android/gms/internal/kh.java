package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class kh implements Handler.Callback {
    private static final Object a = new Object();
    private static kh b;
    private final Context c;
    private final HashMap d = new HashMap();
    private final Handler e;

    private kh(Context context) {
        this.e = new Handler(context.getMainLooper(), this);
        this.c = context.getApplicationContext();
    }

    public static kh a(Context context) {
        synchronized (a) {
            if (b == null) {
                b = new kh(context.getApplicationContext());
            }
        }
        return b;
    }

    public boolean a(String str, ka kaVar) {
        boolean zC;
        synchronized (this.d) {
            ki kiVar = (ki) this.d.get(str);
            if (kiVar != null) {
                this.e.removeMessages(0, kiVar);
                if (!kiVar.c(kaVar)) {
                    kiVar.a(kaVar);
                    switch (kiVar.d()) {
                        case 1:
                            kaVar.onServiceConnected(kiVar.g(), kiVar.f());
                            break;
                        case 2:
                            kiVar.a(this.c.bindService(new Intent(str).setPackage("com.google.android.gms"), kiVar.a(), 129));
                            break;
                    }
                } else {
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  startServiceAction=" + str);
                }
            } else {
                kiVar = new ki(this, str);
                kiVar.a(kaVar);
                kiVar.a(this.c.bindService(new Intent(str).setPackage("com.google.android.gms"), kiVar.a(), 129));
                this.d.put(str, kiVar);
            }
            zC = kiVar.c();
        }
        return zC;
    }

    public void b(String str, ka kaVar) {
        synchronized (this.d) {
            ki kiVar = (ki) this.d.get(str);
            if (kiVar == null) {
                throw new IllegalStateException("Nonexistent connection status for service action: " + str);
            }
            if (!kiVar.c(kaVar)) {
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  startServiceAction=" + str);
            }
            kiVar.b(kaVar);
            if (kiVar.e()) {
                this.e.sendMessageDelayed(this.e.obtainMessage(0, kiVar), 5000L);
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                ki kiVar = (ki) message.obj;
                synchronized (this.d) {
                    if (kiVar.e()) {
                        this.c.unbindService(kiVar.a());
                        this.d.remove(kiVar.b());
                    }
                    break;
                }
                return true;
            default:
                return false;
        }
    }
}
