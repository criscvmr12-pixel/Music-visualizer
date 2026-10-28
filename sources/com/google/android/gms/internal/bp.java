package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bp extends cd {
    private final Object a = new Object();
    private bt b;
    private bo c;

    @Override // com.google.android.gms.internal.cc
    public void a() {
        synchronized (this.a) {
            if (this.c != null) {
                this.c.j();
            }
        }
    }

    @Override // com.google.android.gms.internal.cc
    public void a(int i) {
        synchronized (this.a) {
            if (this.b != null) {
                this.b.a(i == 3 ? 1 : 2);
                this.b = null;
            }
        }
    }

    public void a(bo boVar) {
        synchronized (this.a) {
            this.c = boVar;
        }
    }

    public void a(bt btVar) {
        synchronized (this.a) {
            this.b = btVar;
        }
    }

    @Override // com.google.android.gms.internal.cc
    public void b() {
        synchronized (this.a) {
            if (this.c != null) {
                this.c.k();
            }
        }
    }

    @Override // com.google.android.gms.internal.cc
    public void c() {
        synchronized (this.a) {
            if (this.c != null) {
                this.c.l();
            }
        }
    }

    @Override // com.google.android.gms.internal.cc
    public void d() {
        synchronized (this.a) {
            if (this.c != null) {
                this.c.m();
            }
        }
    }

    @Override // com.google.android.gms.internal.cc
    public void e() {
        synchronized (this.a) {
            if (this.b != null) {
                this.b.a(0);
                this.b = null;
            } else {
                if (this.c != null) {
                    this.c.n();
                }
            }
        }
    }
}
