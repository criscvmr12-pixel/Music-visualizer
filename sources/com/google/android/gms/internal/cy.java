package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class cy {
    private final Runnable a;
    private volatile boolean b = false;

    public cy(cx cxVar) {
        this.a = new cz(this, cxVar);
    }

    public void a() {
        this.b = true;
        hi.a.removeCallbacks(this.a);
    }

    public void b() {
        hi.a.postDelayed(this.a, 250L);
    }
}
