package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public class CreateContentsRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new aa();
    final int a;

    public CreateContentsRequest() {
        this(1);
    }

    CreateContentsRequest(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        aa.a(this, parcel, i);
    }
}
