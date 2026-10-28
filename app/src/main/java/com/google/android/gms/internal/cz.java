package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class cz implements Runnable {
    final /* synthetic */ cx a;
    final /* synthetic */ cy b;
    private final WeakReference c;

    cz(cy cyVar, cx cxVar) {
        this.b = cyVar;
        this.a = cxVar;
        this.c = new WeakReference(this.a);
    }

    @Override // java.lang.Runnable
    public void run() {
        cx cxVar = (cx) this.c.get();
        if (this.b.b || cxVar == null) {
            return;
        }
        cxVar.e();
        this.b.b();
    }
}
