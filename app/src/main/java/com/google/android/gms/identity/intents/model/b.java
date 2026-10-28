package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;

/* JADX INFO: loaded from: classes.dex */
public class b implements Parcelable.Creator {
    static void a(UserAddress userAddress, Parcel parcel, int i) {
        int iA = c.a(parcel);
        c.a(parcel, 1, userAddress.a());
        c.a(parcel, 2, userAddress.a, false);
        c.a(parcel, 3, userAddress.b, false);
        c.a(parcel, 4, userAddress.c, false);
        c.a(parcel, 5, userAddress.d, false);
        c.a(parcel, 6, userAddress.e, false);
        c.a(parcel, 7, userAddress.f, false);
        c.a(parcel, 8, userAddress.g, false);
        c.a(parcel, 9, userAddress.h, false);
        c.a(parcel, 10, userAddress.i, false);
        c.a(parcel, 11, userAddress.j, false);
        c.a(parcel, 12, userAddress.k, false);
        c.a(parcel, 13, userAddress.l, false);
        c.a(parcel, 14, userAddress.m);
        c.a(parcel, 15, userAddress.n, false);
        c.a(parcel, 16, userAddress.o, false);
        c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public UserAddress createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iG = 0;
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        String strO4 = null;
        String strO5 = null;
        String strO6 = null;
        String strO7 = null;
        String strO8 = null;
        String strO9 = null;
        String strO10 = null;
        String strO11 = null;
        String strO12 = null;
        boolean zC = false;
        String strO13 = null;
        String strO14 = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 2:
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 3:
                    strO2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 4:
                    strO3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 5:
                    strO4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 6:
                    strO5 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 7:
                    strO6 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 8:
                    strO7 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 9:
                    strO8 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 10:
                    strO9 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case com.google.android.gms.c.MapAttrs_uiZoomGestures /* 11 */:
                    strO10 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case com.google.android.gms.c.MapAttrs_useViewLifecycle /* 12 */:
                    strO11 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case com.google.android.gms.c.MapAttrs_zOrderOnTop /* 13 */:
                    strO12 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 14:
                    zC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case 15:
                    strO13 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 16:
                    strO14 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new UserAddress(iG, strO, strO2, strO3, strO4, strO5, strO6, strO7, strO8, strO9, strO10, strO11, strO12, zC, strO13, strO14);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public UserAddress[] newArray(int i) {
        return new UserAddress[i];
    }
}
