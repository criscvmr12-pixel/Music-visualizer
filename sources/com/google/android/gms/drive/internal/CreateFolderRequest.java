package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.ky;

/* JADX INFO: loaded from: classes.dex */
public class CreateFolderRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new ad();
    final int a;
    final DriveId b;
    final MetadataBundle c;

    CreateFolderRequest(int i, DriveId driveId, MetadataBundle metadataBundle) {
        this.a = i;
        this.b = (DriveId) ky.a(driveId);
        this.c = (MetadataBundle) ky.a(metadataBundle);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ad.a(this, parcel, i);
    }
}
