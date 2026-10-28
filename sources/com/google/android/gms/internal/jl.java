package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class jl implements SafeParcelable {
    public static final mp CREATOR = new mp();
    private final int a;
    private final int b;
    private final int c;
    private final jn d;

    jl(int i, int i2, int i3, jn jnVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = jnVar;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public jn d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        mp mpVar = CREATOR;
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jl)) {
            return false;
        }
        jl jlVar = (jl) obj;
        return this.b == jlVar.b && this.c == jlVar.c && this.d.equals(jlVar.d);
    }

    public int hashCode() {
        return ku.a(Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public String toString() {
        return ku.a(this).a("transitionTypes", Integer.valueOf(this.b)).a("loiteringTimeMillis", Integer.valueOf(this.c)).a("placeFilter", this.d).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        mp mpVar = CREATOR;
        mp.a(this, parcel, i);
    }
}
