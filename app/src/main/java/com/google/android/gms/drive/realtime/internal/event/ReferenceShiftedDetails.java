package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public class ReferenceShiftedDetails implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new d();
    final int a;
    final String b;
    final String c;
    final int d;
    final int e;

    ReferenceShiftedDetails(int i, String str, String str2, int i2, int i3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
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
