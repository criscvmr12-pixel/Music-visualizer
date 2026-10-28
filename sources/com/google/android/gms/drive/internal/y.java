package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* JADX INFO: loaded from: classes.dex */
public class y implements Parcelable.Creator {
    static void a(CloseContentsAndUpdateMetadataRequest closeContentsAndUpdateMetadataRequest, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, closeContentsAndUpdateMetadataRequest.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, (Parcelable) closeContentsAndUpdateMetadataRequest.b, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, (Parcelable) closeContentsAndUpdateMetadataRequest.c, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, (Parcelable) closeContentsAndUpdateMetadataRequest.d, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, closeContentsAndUpdateMetadataRequest.e);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, closeContentsAndUpdateMetadataRequest.f, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public CloseContentsAndUpdateMetadataRequest createFromParcel(Parcel parcel) {
        boolean zC = false;
        String strO = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        Contents contents = null;
        MetadataBundle metadataBundle = null;
        DriveId driveId = null;
        int iG = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 2:
                    driveId = (DriveId) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, DriveId.CREATOR);
                    break;
                case 3:
                    metadataBundle = (MetadataBundle) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, MetadataBundle.CREATOR);
                    break;
                case 4:
                    contents = (Contents) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, Contents.CREATOR);
                    break;
                case 5:
                    zC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case 6:
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new CloseContentsAndUpdateMetadataRequest(iG, driveId, metadataBundle, contents, zC, strO);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public CloseContentsAndUpdateMetadataRequest[] newArray(int i) {
        return new CloseContentsAndUpdateMetadataRequest[i];
    }
}
