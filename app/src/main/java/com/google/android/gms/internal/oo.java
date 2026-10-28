package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class oo {
    private final oq a;
    private final Runnable b;
    private aj c;
    private boolean d;
    private boolean e;
    private long f;

    public oo(oh ohVar) {
        this(ohVar, new oq(hi.a));
    }

    oo(oh ohVar, oq oqVar) {
        this.d = false;
        this.e = false;
        this.f = 0L;
        this.a = oqVar;
        this.b = new op(this, ohVar);
    }

    public void a() {
        this.d = false;
        this.a.a(this.b);
    }

    public void a(aj ajVar) {
        a(ajVar, 60000L);
    }

    public void a(aj ajVar, long j) {
        if (this.d) {
            hj.e("An ad refresh is already scheduled.");
            return;
        }
        this.c = ajVar;
        this.d = true;
        this.f = j;
        if (this.e) {
            return;
        }
        hj.c("Scheduling ad refresh " + j + " milliseconds from now.");
        this.a.a(this.b, j);
    }

    public void b() {
        this.e = true;
        if (this.d) {
            this.a.a(this.b);
        }
    }

    public void c() {
        this.e = false;
        if (this.d) {
            this.d = false;
            a(this.c, this.f);
        }
    }
}
