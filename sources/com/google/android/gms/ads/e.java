package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.internal.am;
import com.google.android.gms.internal.hi;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final e a = new e(320, 50, "320x50_mb");
    public static final e b = new e(468, 60, "468x60_as");
    public static final e c = new e(320, 100, "320x100_as");
    public static final e d = new e(728, 90, "728x90_as");
    public static final e e = new e(300, 250, "300x250_as");
    public static final e f = new e(160, 600, "160x600_as");
    public static final e g = new e(-1, -2, "smart_banner");
    private final int h;
    private final int i;
    private final String j;

    public e(int i, int i2) {
        this(i, i2, (i == -1 ? "FULL" : String.valueOf(i)) + "x" + (i2 == -2 ? "AUTO" : String.valueOf(i2)) + "_as");
    }

    e(int i, int i2, String str) {
        if (i < 0 && i != -1) {
            throw new IllegalArgumentException("Invalid width for AdSize: " + i);
        }
        if (i2 < 0 && i2 != -2) {
            throw new IllegalArgumentException("Invalid height for AdSize: " + i2);
        }
        this.h = i;
        this.i = i2;
        this.j = str;
    }

    public int a() {
        return this.i;
    }

    public int a(Context context) {
        return this.i == -2 ? am.b(context.getResources().getDisplayMetrics()) : hi.a(context, this.i);
    }

    public int b() {
        return this.h;
    }

    public int b(Context context) {
        return this.h == -1 ? am.a(context.getResources().getDisplayMetrics()) : hi.a(context, this.h);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.h == eVar.h && this.i == eVar.i && this.j.equals(eVar.j);
    }

    public int hashCode() {
        return this.j.hashCode();
    }

    public String toString() {
        return this.j;
    }
}
