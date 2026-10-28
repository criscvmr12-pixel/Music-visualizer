package com.google.android.gms.internal;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
class bl implements Runnable {
    final /* synthetic */ bs a;
    final /* synthetic */ bk b;

    bl(bk bkVar, bs bsVar) {
        this.b = bkVar;
        this.a = bsVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.a.c.c();
        } catch (RemoteException e) {
            hj.c("Could not destroy mediation adapter.", e);
        }
    }
}
