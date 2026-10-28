package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

/* JADX INFO: loaded from: classes.dex */
public class AuthorizeAccessRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new w();
    final int a;
    final long b;
    final DriveId c;

    AuthorizeAccessRequest(int i, long j, DriveId driveId) {
        this.a = i;
        this.b = j;
        this.c = driveId;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        w.a(this, parcel, i);
    }
}
