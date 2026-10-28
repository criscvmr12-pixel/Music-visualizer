package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class jm {
    public final int a;
    public final int b;

    public jm(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof jm)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        jm jmVar = (jm) obj;
        return jmVar.a == this.a && jmVar.b == this.b;
    }

    public int hashCode() {
        return ku.a(Integer.valueOf(this.a), Integer.valueOf(this.b));
    }
}
