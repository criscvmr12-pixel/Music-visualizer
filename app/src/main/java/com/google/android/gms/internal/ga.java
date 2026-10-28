package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class ga {
    private hl d;
    private String e;
    private ge g;
    private final Object c = new Object();
    private int f = -2;
    public final bc a = new gb(this);
    public final bc b = new gc(this);

    public ga(String str) {
        this.e = str;
    }

    public int a() {
        int i;
        synchronized (this.c) {
            i = this.f;
        }
        return i;
    }

    public void a(hl hlVar) {
        synchronized (this.c) {
            this.d = hlVar;
        }
    }

    public ge b() {
        ge geVar;
        synchronized (this.c) {
            while (this.g == null && this.f == -2) {
                try {
                    try {
                        this.c.wait();
                    } catch (InterruptedException e) {
                        hj.e("Ad request service was interrupted.");
                        geVar = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            geVar = this.g;
        }
        return geVar;
    }
}
