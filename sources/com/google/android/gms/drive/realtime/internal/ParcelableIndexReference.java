package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public class ParcelableIndexReference implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new d();
    final int a;
    final String b;
    final int c;
    final boolean d;

    ParcelableIndexReference(int i, String str, int i2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        d.a(this, parcel, i);
    }
}
