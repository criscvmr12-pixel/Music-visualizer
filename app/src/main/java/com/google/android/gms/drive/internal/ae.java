package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.CustomPropertyKey;

/* JADX INFO: loaded from: classes.dex */
public class ae implements Parcelable.Creator {
    static void a(DeleteCustomPropertyRequest deleteCustomPropertyRequest, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, deleteCustomPropertyRequest.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, (Parcelable) deleteCustomPropertyRequest.b, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, (Parcelable) deleteCustomPropertyRequest.c, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DeleteCustomPropertyRequest createFromParcel(Parcel parcel) {
        CustomPropertyKey customPropertyKey;
        DriveId driveId;
        int iG;
        CustomPropertyKey customPropertyKey2 = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        DriveId driveId2 = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    CustomPropertyKey customPropertyKey3 = customPropertyKey2;
                    driveId = driveId2;
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    customPropertyKey = customPropertyKey3;
                    break;
                case 2:
                    DriveId driveId3 = (DriveId) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, DriveId.CREATOR);
                    iG = i;
                    customPropertyKey = customPropertyKey2;
                    driveId = driveId3;
                    break;
                case 3:
                    customPropertyKey = (CustomPropertyKey) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, CustomPropertyKey.CREATOR);
                    driveId = driveId2;
                    iG = i;
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    customPropertyKey = customPropertyKey2;
                    driveId = driveId2;
                    iG = i;
                    break;
            }
            i = iG;
            driveId2 = driveId;
            customPropertyKey2 = customPropertyKey;
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new DeleteCustomPropertyRequest(i, driveId2, customPropertyKey2);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DeleteCustomPropertyRequest[] newArray(int i) {
        return new DeleteCustomPropertyRequest[i];
    }
}
