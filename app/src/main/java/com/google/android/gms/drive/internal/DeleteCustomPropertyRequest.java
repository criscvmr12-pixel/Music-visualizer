package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.CustomPropertyKey;

/* JADX INFO: loaded from: classes.dex */
public class DeleteCustomPropertyRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new ae();
    final int a;
    final DriveId b;
    final CustomPropertyKey c;

    DeleteCustomPropertyRequest(int i, DriveId driveId, CustomPropertyKey customPropertyKey) {
        this.a = i;
        this.b = driveId;
        this.c = customPropertyKey;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ae.a(this, parcel, i);
    }
}
