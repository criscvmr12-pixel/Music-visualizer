package com.google.a;

import com.google.android.gms.ads.e;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class c {
    public static final c a = new c(-1, -2, "mb");
    public static final c b = new c(320, 50, "mb");
    public static final c c = new c(300, 250, "as");
    public static final c d = new c(468, 60, "as");
    public static final c e = new c(728, 90, "as");
    public static final c f = new c(160, 600, "as");
    private final e g;

    private c(int i, int i2, String str) {
        this(new e(i, i2));
    }

    public c(e eVar) {
        this.g = eVar;
    }

    public int a() {
        return this.g.b();
    }

    public int b() {
        return this.g.a();
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.g.equals(((c) obj).g);
        }
        return false;
    }

    public int hashCode() {
        return this.g.hashCode();
    }

    public String toString() {
        return this.g.toString();
    }
}
