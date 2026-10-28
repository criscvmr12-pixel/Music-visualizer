package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ln;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class e implements Parcelable.Creator {
    static void a(CommonWalletObject commonWalletObject, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, commonWalletObject.b());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, commonWalletObject.a, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, commonWalletObject.b, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, commonWalletObject.c, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, commonWalletObject.d, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, commonWalletObject.e, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, commonWalletObject.f, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, commonWalletObject.g, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, commonWalletObject.h, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 10, commonWalletObject.i);
        com.google.android.gms.common.internal.safeparcel.c.b(parcel, 11, commonWalletObject.j, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 12, (Parcelable) commonWalletObject.k, i, false);
        com.google.android.gms.common.internal.safeparcel.c.b(parcel, 13, commonWalletObject.l, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 14, commonWalletObject.m, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 15, commonWalletObject.n, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 17, commonWalletObject.p);
        com.google.android.gms.common.internal.safeparcel.c.b(parcel, 16, commonWalletObject.o, false);
        com.google.android.gms.common.internal.safeparcel.c.b(parcel, 19, commonWalletObject.r, false);
        com.google.android.gms.common.internal.safeparcel.c.b(parcel, 18, commonWalletObject.q, false);
        com.google.android.gms.common.internal.safeparcel.c.b(parcel, 20, commonWalletObject.s, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public CommonWalletObject createFromParcel(Parcel parcel) {
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
        int iG2 = 0;
        ArrayList arrayListA = ln.a();
        l lVar = null;
        ArrayList arrayListA2 = ln.a();
        String strO9 = null;
        String strO10 = null;
        ArrayList arrayListA3 = ln.a();
        boolean zC = false;
        ArrayList arrayListA4 = ln.a();
        ArrayList arrayListA5 = ln.a();
        ArrayList arrayListA6 = ln.a();
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
                    iG2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case com.google.android.gms.c.MapAttrs_uiZoomGestures /* 11 */:
                    arrayListA = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, p.CREATOR);
                    break;
                case com.google.android.gms.c.MapAttrs_useViewLifecycle /* 12 */:
                    lVar = (l) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, l.CREATOR);
                    break;
                case com.google.android.gms.c.MapAttrs_zOrderOnTop /* 13 */:
                    arrayListA2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, LatLng.CREATOR);
                    break;
                case 14:
                    strO9 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 15:
                    strO10 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 16:
                    arrayListA3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, d.CREATOR);
                    break;
                case 17:
                    zC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case 18:
                    arrayListA4 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, n.CREATOR);
                    break;
                case 19:
                    arrayListA5 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, j.CREATOR);
                    break;
                case 20:
                    arrayListA6 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, n.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new CommonWalletObject(iG, strO, strO2, strO3, strO4, strO5, strO6, strO7, strO8, iG2, arrayListA, lVar, arrayListA2, strO9, strO10, arrayListA3, zC, arrayListA4, arrayListA5, arrayListA6);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public CommonWalletObject[] newArray(int i) {
        return new CommonWalletObject[i];
    }
}
