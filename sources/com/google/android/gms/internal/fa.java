package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class fa implements Runnable {
    protected final hl a;
    protected boolean b;
    protected boolean c;
    private final Handler d;
    private final long e;
    private long f;
    private hp g;
    private final int h;
    private final int i;

    public fa(hp hpVar, hl hlVar, int i, int i2) {
        this(hpVar, hlVar, i, i2, 200L, 50L);
    }

    public fa(hp hpVar, hl hlVar, int i, int i2, long j, long j2) {
        this.e = j;
        this.f = j2;
        this.d = new Handler(Looper.getMainLooper());
        this.a = hlVar;
        this.g = hpVar;
        this.b = false;
        this.c = false;
        this.h = i2;
        this.i = i;
    }

    static /* synthetic */ long c(fa faVar) {
        long j = faVar.f - 1;
        faVar.f = j;
        return j;
    }

    public void a() {
        this.d.postDelayed(this, this.e);
    }

    public void a(dv dvVar) {
        a(dvVar, new iv(this, this.a, dvVar.q));
    }

    public void a(dv dvVar, iv ivVar) {
        this.a.setWebViewClient(ivVar);
        this.a.loadDataWithBaseURL(TextUtils.isEmpty(dvVar.b) ? null : gx.a(dvVar.b), dvVar.c, "text/html", "UTF-8", null);
    }

    public synchronized void b() {
        this.b = true;
    }

    public synchronized boolean c() {
        return this.b;
    }

    public boolean d() {
        return this.c;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.a == null || c()) {
            this.g.a(this.a);
        } else {
            new fb(this, this.a).execute(new Void[0]);
        }
    }
}
