package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* JADX INFO: loaded from: classes.dex */
public class k implements Parcelable.Creator {
    static void a(MaskedWallet maskedWallet, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, maskedWallet.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, maskedWallet.a, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, maskedWallet.b, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, maskedWallet.c, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, maskedWallet.d, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, (Parcelable) maskedWallet.e, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, (Parcelable) maskedWallet.f, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, (Parcelable[]) maskedWallet.g, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, (Parcelable[]) maskedWallet.h, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 10, (Parcelable) maskedWallet.i, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 11, (Parcelable) maskedWallet.j, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 12, (Parcelable[]) maskedWallet.k, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public MaskedWallet createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iG = 0;
        String strO = null;
        String strO2 = null;
        String[] strArrA = null;
        String strO3 = null;
        Address address = null;
        Address address2 = null;
        LoyaltyWalletObject[] loyaltyWalletObjectArr = null;
        OfferWalletObject[] offerWalletObjectArr = null;
        UserAddress userAddress = null;
        UserAddress userAddress2 = null;
        InstrumentInfo[] instrumentInfoArr = null;
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
                    strArrA = com.google.android.gms.common.internal.safeparcel.a.A(parcel, iA);
                    break;
                case 5:
                    strO3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 6:
                    address = (Address) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, Address.CREATOR);
                    break;
                case 7:
                    address2 = (Address) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, Address.CREATOR);
                    break;
                case 8:
                    loyaltyWalletObjectArr = (LoyaltyWalletObject[]) com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA, LoyaltyWalletObject.CREATOR);
                    break;
                case 9:
                    offerWalletObjectArr = (OfferWalletObject[]) com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA, OfferWalletObject.CREATOR);
                    break;
                case 10:
                    userAddress = (UserAddress) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, UserAddress.CREATOR);
                    break;
                case com.google.android.gms.c.MapAttrs_uiZoomGestures /* 11 */:
                    userAddress2 = (UserAddress) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, UserAddress.CREATOR);
                    break;
                case com.google.android.gms.c.MapAttrs_useViewLifecycle /* 12 */:
                    instrumentInfoArr = (InstrumentInfo[]) com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA, InstrumentInfo.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new MaskedWallet(iG, strO, strO2, strArrA, strO3, address, address2, loyaltyWalletObjectArr, offerWalletObjectArr, userAddress, userAddress2, instrumentInfoArr);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public MaskedWallet[] newArray(int i) {
        return new MaskedWallet[i];
    }
}
