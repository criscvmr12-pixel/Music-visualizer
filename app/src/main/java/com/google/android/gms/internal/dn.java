package com.google.android.gms.internal;

import android.content.Intent;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
class dn implements Runnable {
    final /* synthetic */ dq a;
    final /* synthetic */ Intent b;
    final /* synthetic */ dm c;

    dn(dm dmVar, dq dqVar, Intent intent) {
        this.c = dmVar;
        this.a = dqVar;
        this.b = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.c.h.a(this.a.b, -1, this.b)) {
                this.c.d.a(new dr(this.c.c, this.a.c, true, -1, this.b, this.a));
            } else {
                this.c.d.a(new dr(this.c.c, this.a.c, false, -1, this.b, this.a));
            }
        } catch (RemoteException e) {
            hj.e("Fail to verify and dispatch pending transaction");
        }
    }
}
