package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public class gf implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new jf();
    private final int a;
    private String b;

    public gf() {
        this(1, null);
    }

    gf(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public int a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gf) {
            return jg.a(this.b, ((gf) obj).b);
        }
        return false;
    }

    public int hashCode() {
        return ku.a(this.b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        jf.a(this, parcel, i);
    }
}
