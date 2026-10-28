package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
class ey implements Runnable {
    final /* synthetic */ fa a;
    final /* synthetic */ et b;

    ey(et etVar, fa faVar) {
        this.b = etVar;
        this.a = faVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.b.f) {
            if (this.b.j.e != -2) {
                return;
            }
            this.b.c.f().a(this.b);
            this.a.a(this.b.j);
        }
    }
}
