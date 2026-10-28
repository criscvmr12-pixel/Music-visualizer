package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

/* JADX INFO: loaded from: classes.dex */
public class LoadRealtimeRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new c();
    final int a;
    final DriveId b;
    final boolean c;

    LoadRealtimeRequest(int i, DriveId driveId, boolean z) {
        this.a = i;
        this.b = driveId;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        c.a(this, parcel, i);
    }
}
