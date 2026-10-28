package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* JADX INFO: loaded from: classes.dex */
public class CreateFileIntentSenderRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new ab();
    final int a;
    final MetadataBundle b;
    final int c;
    final String d;
    final DriveId e;
    final Integer f;

    CreateFileIntentSenderRequest(int i, MetadataBundle metadataBundle, int i2, String str, DriveId driveId, Integer num) {
        this.a = i;
        this.b = metadataBundle;
        this.c = i2;
        this.d = str;
        this.e = driveId;
        this.f = num;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ab.a(this, parcel, i);
    }
}
