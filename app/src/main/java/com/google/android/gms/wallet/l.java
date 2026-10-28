package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class l implements Parcelable.Creator {
    static void a(MaskedWalletRequest maskedWalletRequest, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, maskedWalletRequest.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, maskedWalletRequest.a, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, maskedWalletRequest.b);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, maskedWalletRequest.c);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, maskedWalletRequest.d);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, maskedWalletRequest.e, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, maskedWalletRequest.f, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, maskedWalletRequest.g, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, (Parcelable) maskedWalletRequest.h, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 10, maskedWalletRequest.i);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 11, maskedWalletRequest.j);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 12, (Parcelable[]) maskedWalletRequest.k, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 13, maskedWalletRequest.l);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 14, maskedWalletRequest.m);
        com.google.android.gms.common.internal.safeparcel.c.b(parcel, 15, maskedWalletRequest.n, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public MaskedWalletRequest createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iG = 0;
        String strO = null;
        boolean zC = false;
        boolean zC2 = false;
        boolean zC3 = false;
        String strO2 = null;
        String strO3 = null;
        String strO4 = null;
        Cart cart = null;
        boolean zC4 = false;
        boolean zC5 = false;
        CountrySpecification[] countrySpecificationArr = null;
        boolean zC6 = true;
        boolean zC7 = true;
        ArrayList arrayListC = null;
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
                    zC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case 4:
                    zC2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case 5:
                    zC3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case 6:
                    strO2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 7:
                    strO3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 8:
                    strO4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 9:
                    cart = (Cart) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, Cart.CREATOR);
                    break;
                case 10:
                    zC4 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case com.google.android.gms.c.MapAttrs_uiZoomGestures /* 11 */:
                    zC5 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case com.google.android.gms.c.MapAttrs_useViewLifecycle /* 12 */:
                    countrySpecificationArr = (CountrySpecification[]) com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA, CountrySpecification.CREATOR);
                    break;
                case com.google.android.gms.c.MapAttrs_zOrderOnTop /* 13 */:
                    zC6 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case 14:
                    zC7 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case 15:
                    arrayListC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, com.google.android.gms.identity.intents.model.CountrySpecification.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new MaskedWalletRequest(iG, strO, zC, zC2, zC3, strO2, strO3, strO4, cart, zC4, zC5, countrySpecificationArr, zC6, zC7, arrayListC);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public MaskedWalletRequest[] newArray(int i) {
        return new MaskedWalletRequest[i];
    }
}
