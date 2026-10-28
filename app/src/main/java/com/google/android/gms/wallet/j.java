package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ln;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.p;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class j implements Parcelable.Creator {
    static void a(LoyaltyWalletObject loyaltyWalletObject, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, loyaltyWalletObject.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, loyaltyWalletObject.a, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, loyaltyWalletObject.b, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, loyaltyWalletObject.c, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, loyaltyWalletObject.d, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, loyaltyWalletObject.e, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, loyaltyWalletObject.f, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, loyaltyWalletObject.g, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, loyaltyWalletObject.h, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 10, loyaltyWalletObject.i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 11, loyaltyWalletObject.j, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 12, loyaltyWalletObject.k);
        com.google.android.gms.common.internal.safeparcel.c.b(parcel, 13, loyaltyWalletObject.l, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 14, (Parcelable) loyaltyWalletObject.m, i, false);
        com.google.android.gms.common.internal.safeparcel.c.b(parcel, 15, loyaltyWalletObject.n, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 17, loyaltyWalletObject.p, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 16, loyaltyWalletObject.o, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 19, loyaltyWalletObject.r);
        com.google.android.gms.common.internal.safeparcel.c.b(parcel, 18, loyaltyWalletObject.q, false);
        com.google.android.gms.common.internal.safeparcel.c.b(parcel, 21, loyaltyWalletObject.t, false);
        com.google.android.gms.common.internal.safeparcel.c.b(parcel, 20, loyaltyWalletObject.s, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 23, (Parcelable) loyaltyWalletObject.v, i, false);
        com.google.android.gms.common.internal.safeparcel.c.b(parcel, 22, loyaltyWalletObject.u, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public LoyaltyWalletObject createFromParcel(Parcel parcel) {
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
        int iG2 = 0;
        ArrayList arrayListA = ln.a();
        com.google.android.gms.wallet.wobs.l lVar = null;
        ArrayList arrayListA2 = ln.a();
        String strO11 = null;
        String strO12 = null;
        ArrayList arrayListA3 = ln.a();
        boolean zC = false;
        ArrayList arrayListA4 = ln.a();
        ArrayList arrayListA5 = ln.a();
        ArrayList arrayListA6 = ln.a();
        com.google.android.gms.wallet.wobs.f fVar = null;
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
                    iG2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case com.google.android.gms.c.MapAttrs_zOrderOnTop /* 13 */:
                    arrayListA = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, p.CREATOR);
                    break;
                case 14:
                    lVar = (com.google.android.gms.wallet.wobs.l) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, com.google.android.gms.wallet.wobs.l.CREATOR);
                    break;
                case 15:
                    arrayListA2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, LatLng.CREATOR);
                    break;
                case 16:
                    strO11 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 17:
                    strO12 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 18:
                    arrayListA3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, com.google.android.gms.wallet.wobs.d.CREATOR);
                    break;
                case 19:
                    zC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case 20:
                    arrayListA4 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, com.google.android.gms.wallet.wobs.n.CREATOR);
                    break;
                case 21:
                    arrayListA5 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, com.google.android.gms.wallet.wobs.j.CREATOR);
                    break;
                case 22:
                    arrayListA6 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, com.google.android.gms.wallet.wobs.n.CREATOR);
                    break;
                case 23:
                    fVar = (com.google.android.gms.wallet.wobs.f) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, com.google.android.gms.wallet.wobs.f.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new LoyaltyWalletObject(iG, strO, strO2, strO3, strO4, strO5, strO6, strO7, strO8, strO9, strO10, iG2, arrayListA, lVar, arrayListA2, strO11, strO12, arrayListA3, zC, arrayListA4, arrayListA5, arrayListA6, fVar);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public LoyaltyWalletObject[] newArray(int i) {
        return new LoyaltyWalletObject[i];
    }
}
