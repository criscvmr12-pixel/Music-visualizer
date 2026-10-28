package com.google.android.gms.common.data;

import android.net.Uri;
import com.google.android.gms.internal.ku;
import com.google.android.gms.internal.ky;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    protected final DataHolder a;
    protected int b;
    private int c;

    public f(DataHolder dataHolder, int i) {
        this.a = (DataHolder) ky.a(dataHolder);
        a(i);
    }

    protected void a(int i) {
        ky.a(i >= 0 && i < this.a.g());
        this.b = i;
        this.c = this.a.a(this.b);
    }

    public boolean a(String str) {
        return this.a.a(str);
    }

    protected int b() {
        return this.b;
    }

    protected long b(String str) {
        return this.a.a(str, this.b, this.c);
    }

    protected int c(String str) {
        return this.a.b(str, this.b, this.c);
    }

    protected boolean d(String str) {
        return this.a.d(str, this.b, this.c);
    }

    protected String e(String str) {
        return this.a.c(str, this.b, this.c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return ku.a(Integer.valueOf(fVar.b), Integer.valueOf(this.b)) && ku.a(Integer.valueOf(fVar.c), Integer.valueOf(this.c)) && fVar.a == this.a;
    }

    protected float f(String str) {
        return this.a.e(str, this.b, this.c);
    }

    protected byte[] g(String str) {
        return this.a.f(str, this.b, this.c);
    }

    protected Uri h(String str) {
        return this.a.g(str, this.b, this.c);
    }

    public int hashCode() {
        return ku.a(Integer.valueOf(this.b), Integer.valueOf(this.c), this.a);
    }

    protected boolean i(String str) {
        return this.a.h(str, this.b, this.c);
    }
}
