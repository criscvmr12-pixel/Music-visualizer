package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
class br implements Runnable {
    final /* synthetic */ bp a;
    final /* synthetic */ bq b;

    br(bq bqVar, bp bpVar) {
        this.b = bqVar;
        this.a = bpVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.b.h) {
            if (this.b.k != -2) {
                return;
            }
            this.b.j = this.b.b();
            if (this.b.j == null) {
                this.b.a(4);
            } else {
                this.a.a(this.b);
                this.b.a(this.a);
            }
        }
    }
}
