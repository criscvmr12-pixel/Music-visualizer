package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

/* JADX INFO: loaded from: classes.dex */
public class TrashResourceRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new u();
    final int a;
    final DriveId b;

    TrashResourceRequest(int i, DriveId driveId) {
        this.a = i;
        this.b = driveId;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        u.a(this, parcel, i);
    }
}
