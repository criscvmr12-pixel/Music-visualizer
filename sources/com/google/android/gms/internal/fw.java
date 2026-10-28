package com.google.android.gms.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class fw implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ dt b;
    final /* synthetic */ ga c;
    final /* synthetic */ hp d;
    final /* synthetic */ String e;

    fw(Context context, dt dtVar, ga gaVar, hp hpVar, String str) {
        this.a = context;
        this.b = dtVar;
        this.c = gaVar;
        this.d = hpVar;
        this.e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        hl hlVarA = hl.a(this.a, new am(), false, false, null, this.b.k);
        hlVarA.setWillNotDraw(true);
        this.c.a(hlVarA);
        hn hnVarF = hlVarA.f();
        hnVarF.a("/invalidRequest", this.c.a);
        hnVarF.a("/loadAdURL", this.c.b);
        hnVarF.a("/log", as.g);
        hnVarF.a(this.d);
        hj.a("Loading the JS library.");
        hlVarA.loadUrl(this.e);
    }
}
