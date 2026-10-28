package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class w implements SafeParcelable {
    public static final om CREATOR = new om();
    public final int a;
    public final boolean b;
    public final boolean c;

    w(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public w(boolean z, boolean z2) {
        this.a = 1;
        this.b = z;
        this.c = z2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        om.a(this, parcel, i);
    }
}
