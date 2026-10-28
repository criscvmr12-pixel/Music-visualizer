package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class lh implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new nm();
    int[] a;
    private final int b;

    lh() {
        this(1, null);
    }

    lh(int i, int[] iArr) {
        this.b = i;
        this.a = iArr;
    }

    public int a() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        nm.a(this, parcel, i);
    }
}
