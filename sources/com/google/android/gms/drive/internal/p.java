package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveId;

/* JADX INFO: loaded from: classes.dex */
public class p implements Parcelable.Creator {
    static void a(OpenContentsRequest openContentsRequest, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, openContentsRequest.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, (Parcelable) openContentsRequest.b, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, openContentsRequest.c);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public OpenContentsRequest createFromParcel(Parcel parcel) {
        int iG;
        DriveId driveId;
        int iG2;
        int i = 0;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        DriveId driveId2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    int i3 = i;
                    driveId = driveId2;
                    iG2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    iG = i3;
                    break;
                case 2:
                    DriveId driveId3 = (DriveId) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, DriveId.CREATOR);
                    iG2 = i2;
                    iG = i;
                    driveId = driveId3;
                    break;
                case 3:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    driveId = driveId2;
                    iG2 = i2;
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    iG = i;
                    driveId = driveId2;
                    iG2 = i2;
                    break;
            }
            i2 = iG2;
            driveId2 = driveId;
            i = iG;
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new OpenContentsRequest(i2, driveId2, i);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public OpenContentsRequest[] newArray(int i) {
        return new OpenContentsRequest[i];
    }
}
