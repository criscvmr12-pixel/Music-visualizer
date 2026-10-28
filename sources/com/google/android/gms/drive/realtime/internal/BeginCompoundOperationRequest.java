package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public class BeginCompoundOperationRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new a();
    final int a;
    final boolean b;
    final String c;

    BeginCompoundOperationRequest(int i, boolean z, String str) {
        this.a = i;
        this.b = z;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel, i);
    }
}
