package com.google.android.gms.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class bk {
    private final dt a;
    private final bw b;
    private final Context c;
    private final bn e;
    private bq g;
    private final Object d = new Object();
    private boolean f = false;

    public bk(Context context, dt dtVar, bw bwVar, bn bnVar) {
        this.c = context;
        this.a = dtVar;
        this.b = bwVar;
        this.e = bnVar;
    }

    public bs a(long j, long j2) {
        hj.a("Starting mediation.");
        for (bm bmVar : this.e.a) {
            hj.c("Trying mediation network: " + bmVar.b);
            for (String str : bmVar.c) {
                synchronized (this.d) {
                    if (this.f) {
                        return new bs(-1);
                    }
                    this.g = new bq(this.c, str, this.b, this.e, bmVar, this.a.c, this.a.d, this.a.k);
                    bs bsVarA = this.g.a(j, j2);
                    if (bsVarA.a == 0) {
                        hj.a("Adapter succeeded.");
                        return bsVarA;
                    }
                    if (bsVarA.c != null) {
                        hi.a.post(new bl(this, bsVarA));
                    }
                }
            }
        }
        return new bs(1);
    }

    public void a() {
        synchronized (this.d) {
            this.f = true;
            if (this.g != null) {
                this.g.a();
            }
        }
    }
}
