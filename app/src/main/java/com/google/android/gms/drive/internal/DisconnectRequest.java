package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public class DisconnectRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new ag();
    final int a;

    public DisconnectRequest() {
        this(1);
    }

    DisconnectRequest(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ag.a(this, parcel, i);
    }
}
