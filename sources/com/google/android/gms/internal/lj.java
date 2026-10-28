package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class lj implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new nn();
    String[] a;
    byte[][] b;
    private final int c;

    lj() {
        this(1, new String[0], new byte[0][]);
    }

    lj(int i, String[] strArr, byte[][] bArr) {
        this.c = i;
        this.a = strArr;
        this.b = bArr;
    }

    public int a() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        nn.a(this, parcel, i);
    }
}
