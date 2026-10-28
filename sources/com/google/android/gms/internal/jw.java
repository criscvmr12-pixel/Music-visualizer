package com.google.android.gms.internal;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class jw {
    final /* synthetic */ js a;
    private Object b;
    private boolean c = false;

    public jw(js jsVar, Object obj) {
        this.a = jsVar;
        this.b = obj;
    }

    protected abstract void a();

    protected abstract void a(Object obj);

    public void b() {
        Object obj;
        synchronized (this) {
            obj = this.b;
            if (this.c) {
                Log.w("GmsClient", "Callback proxy " + this + " being reused. This is not safe.");
            }
        }
        if (obj != null) {
            try {
                a(obj);
            } catch (RuntimeException e) {
                a();
                throw e;
            }
        } else {
            a();
        }
        synchronized (this) {
            this.c = true;
        }
        c();
    }

    public void c() {
        d();
        synchronized (this.a.g) {
            this.a.g.remove(this);
        }
    }

    public void d() {
        synchronized (this) {
            this.b = null;
        }
    }
}
