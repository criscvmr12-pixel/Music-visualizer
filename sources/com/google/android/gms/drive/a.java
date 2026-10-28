package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class a implements Parcelable.Creator {
    static void a(Contents contents, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, contents.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, (Parcelable) contents.b, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, contents.c);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, contents.d);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, (Parcelable) contents.e, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, contents.f, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, contents.g);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Contents createFromParcel(Parcel parcel) {
        String strO = null;
        boolean zC = false;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        DriveId driveId = null;
        int iG = 0;
        int iG2 = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        int iG3 = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    iG3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 2:
                    parcelFileDescriptor = (ParcelFileDescriptor) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, ParcelFileDescriptor.CREATOR);
                    break;
                case 3:
                    iG2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 4:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 5:
                    driveId = (DriveId) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, DriveId.CREATOR);
                    break;
                case 6:
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 7:
                    zC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new Contents(iG3, parcelFileDescriptor, iG2, iG, driveId, strO, zC);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Contents[] newArray(int i) {
        return new Contents[i];
    }
}
