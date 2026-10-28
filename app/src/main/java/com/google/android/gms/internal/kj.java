package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class kj implements ServiceConnection {
    final /* synthetic */ ki a;

    public kj(ki kiVar) {
        this.a = kiVar;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.a.a.d) {
            this.a.g = iBinder;
            this.a.h = componentName;
            Iterator it = this.a.d.iterator();
            while (it.hasNext()) {
                ((ka) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.a.e = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.a.a.d) {
            this.a.g = null;
            this.a.h = componentName;
            Iterator it = this.a.d.iterator();
            while (it.hasNext()) {
                ((ka) it.next()).onServiceDisconnected(componentName);
            }
            this.a.e = 2;
        }
    }
}
