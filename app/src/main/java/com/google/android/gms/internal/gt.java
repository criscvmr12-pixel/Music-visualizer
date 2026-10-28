package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
class gt implements Runnable {
    final /* synthetic */ gs a;

    gt(gs gsVar) {
        this.a = gsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b = Thread.currentThread();
        this.a.a();
    }
}
