package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ke {
    private final kg b;
    private final Handler f;
    private final ArrayList c = new ArrayList();
    final ArrayList a = new ArrayList();
    private boolean d = false;
    private final ArrayList e = new ArrayList();

    public ke(Context context, Looper looper, kg kgVar) {
        this.b = kgVar;
        this.f = new kf(this, looper);
    }

    protected void a() {
        synchronized (this.c) {
            a(this.b.l());
        }
    }

    public void a(int i) {
        this.f.removeMessages(1);
        synchronized (this.c) {
            this.d = true;
            for (com.google.android.gms.common.api.c cVar : new ArrayList(this.c)) {
                if (!this.b.n()) {
                    break;
                } else if (this.c.contains(cVar)) {
                    cVar.a(i);
                }
            }
            this.d = false;
        }
    }

    public void a(Bundle bundle) {
        synchronized (this.c) {
            ky.a(!this.d);
            this.f.removeMessages(1);
            this.d = true;
            ky.a(this.a.size() == 0);
            for (com.google.android.gms.common.api.c cVar : new ArrayList(this.c)) {
                if (!this.b.n() || !this.b.g()) {
                    break;
                } else if (!this.a.contains(cVar)) {
                    cVar.a(bundle);
                }
            }
            this.a.clear();
            this.d = false;
        }
    }

    public void a(com.google.android.gms.common.a aVar) {
        this.f.removeMessages(1);
        synchronized (this.e) {
            for (com.google.android.gms.common.d dVar : new ArrayList(this.e)) {
                if (!this.b.n()) {
                    return;
                }
                if (this.e.contains(dVar)) {
                    dVar.a(aVar);
                }
            }
        }
    }

    public void a(com.google.android.gms.common.api.c cVar) {
        ky.a(cVar);
        synchronized (this.c) {
            if (this.c.contains(cVar)) {
                Log.w("GmsClientEvents", "registerConnectionCallbacks(): listener " + cVar + " is already registered");
            } else {
                this.c.add(cVar);
            }
        }
        if (this.b.g()) {
            this.f.sendMessage(this.f.obtainMessage(1, cVar));
        }
    }

    public void a(com.google.android.gms.common.d dVar) {
        ky.a(dVar);
        synchronized (this.e) {
            if (this.e.contains(dVar)) {
                Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + dVar + " is already registered");
            } else {
                this.e.add(dVar);
            }
        }
    }
}
