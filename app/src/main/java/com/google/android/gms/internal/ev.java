package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
class ev implements Runnable {
    final /* synthetic */ gj a;
    final /* synthetic */ et b;

    ev(et etVar, gj gjVar) {
        this.b = etVar;
        this.a = gjVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.b.f) {
            this.b.b.a(this.a);
        }
    }
}
