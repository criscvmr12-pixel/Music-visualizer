package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class lg implements Parcelable.Creator {
    static void a(hz.a aVar, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, aVar.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, aVar.b());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, aVar.c());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, aVar.d());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, aVar.e());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, aVar.f(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, aVar.g());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, aVar.i(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, (Parcelable) aVar.k(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public hz.a createFromParcel(Parcel parcel) {
        hu huVar = null;
        int iG = 0;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        String strO = null;
        String strO2 = null;
        boolean zC = false;
        int iG2 = 0;
        boolean zC2 = false;
        int iG3 = 0;
        int iG4 = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    iG4 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 2:
                    iG3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 3:
                    zC2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case 4:
                    iG2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 5:
                    zC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case 6:
                    strO2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 7:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 8:
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 9:
                    huVar = (hu) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, hu.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new hz.a(iG4, iG3, zC2, iG2, zC, strO2, iG, strO, huVar);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public hz.a[] newArray(int i) {
        return new hz.a[i];
    }
}
