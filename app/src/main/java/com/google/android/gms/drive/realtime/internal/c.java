package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class c implements Parcelable.Creator {
    static void a(ParcelableCollaborator parcelableCollaborator, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, parcelableCollaborator.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, parcelableCollaborator.b);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, parcelableCollaborator.c);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, parcelableCollaborator.d, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, parcelableCollaborator.e, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, parcelableCollaborator.f, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, parcelableCollaborator.g, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, parcelableCollaborator.h, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ParcelableCollaborator createFromParcel(Parcel parcel) {
        boolean zC = false;
        String strO = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        String strO2 = null;
        String strO3 = null;
        String strO4 = null;
        String strO5 = null;
        boolean zC2 = false;
        int iG = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 2:
                    zC2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case 3:
                    zC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case 4:
                    strO5 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 5:
                    strO4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 6:
                    strO3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 7:
                    strO2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 8:
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
        return new ParcelableCollaborator(iG, zC2, zC, strO5, strO4, strO3, strO2, strO);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ParcelableCollaborator[] newArray(int i) {
        return new ParcelableCollaborator[i];
    }
}
