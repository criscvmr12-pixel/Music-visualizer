package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class gs {
    private final Runnable a = new gt(this);
    private volatile Thread b;

    public abstract void a();

    public abstract void b();

    public final void e() {
        gu.a(this.a);
    }

    public final void f() {
        b();
        if (this.b != null) {
            this.b.interrupt();
        }
    }
}
