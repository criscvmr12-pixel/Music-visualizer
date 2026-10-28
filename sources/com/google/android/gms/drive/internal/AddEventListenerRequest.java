package com.google.android.gms.drive.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

/* JADX INFO: loaded from: classes.dex */
public class AddEventListenerRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new a();
    final int a;
    final DriveId b;
    final int c;
    final PendingIntent d;

    AddEventListenerRequest(int i, DriveId driveId, int i2, PendingIntent pendingIntent) {
        this.a = i;
        this.b = driveId;
        this.c = i2;
        this.d = pendingIntent;
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
