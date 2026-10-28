package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
class ho implements Runnable {
    final /* synthetic */ cp a;
    final /* synthetic */ hn b;

    ho(hn hnVar, cp cpVar) {
        this.b = hnVar;
        this.a = cpVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.k();
    }
}
