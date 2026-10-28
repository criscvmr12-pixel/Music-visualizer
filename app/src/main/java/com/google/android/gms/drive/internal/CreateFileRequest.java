package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.ky;

/* JADX INFO: loaded from: classes.dex */
public class CreateFileRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new ac();
    final int a;
    final DriveId b;
    final MetadataBundle c;
    final Contents d;
    final Integer e;
    final boolean f;
    final String g;

    CreateFileRequest(int i, DriveId driveId, MetadataBundle metadataBundle, Contents contents, Integer num, boolean z, String str) {
        this.a = i;
        this.b = (DriveId) ky.a(driveId);
        this.c = (MetadataBundle) ky.a(metadataBundle);
        if (num == null || num.intValue() == 0) {
            this.d = (Contents) ky.a(contents);
        } else {
            this.d = null;
        }
        this.e = num;
        this.f = z;
        this.g = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ac.a(this, parcel, i);
    }
}
