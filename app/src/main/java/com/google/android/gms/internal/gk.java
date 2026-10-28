package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public class gk implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new jh();
    private final int a;
    private double b;
    private boolean c;
    private int d;

    public gk() {
        this(1, Double.NaN, false, -1);
    }

    gk(int i, double d, boolean z, int i2) {
        this.a = i;
        this.b = d;
        this.c = z;
        this.d = i2;
    }

    public int a() {
        return this.a;
    }

    public double b() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gk)) {
            return false;
        }
        gk gkVar = (gk) obj;
        return this.b == gkVar.b && this.c == gkVar.c && this.d == gkVar.d;
    }

    public int hashCode() {
        return ku.a(Double.valueOf(this.b), Boolean.valueOf(this.c), Integer.valueOf(this.d));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        jh.a(this, parcel, i);
    }
}
