package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* JADX INFO: loaded from: classes.dex */
public class f implements Parcelable.Creator {
    static void a(FullWallet fullWallet, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, fullWallet.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, fullWallet.a, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, fullWallet.b, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, (Parcelable) fullWallet.c, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, fullWallet.d, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, (Parcelable) fullWallet.e, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, (Parcelable) fullWallet.f, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, fullWallet.g, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, (Parcelable) fullWallet.h, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 10, (Parcelable) fullWallet.i, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 11, (Parcelable[]) fullWallet.j, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public FullWallet createFromParcel(Parcel parcel) {
        InstrumentInfo[] instrumentInfoArr = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iG = 0;
        UserAddress userAddress = null;
        UserAddress userAddress2 = null;
        String[] strArrA = null;
        Address address = null;
        Address address2 = null;
        String strO = null;
        ProxyCard proxyCard = null;
        String strO2 = null;
        String strO3 = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 2:
                    strO3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 3:
                    strO2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 4:
                    proxyCard = (ProxyCard) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, ProxyCard.CREATOR);
                    break;
                case 5:
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 6:
                    address2 = (Address) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, Address.CREATOR);
                    break;
                case 7:
                    address = (Address) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, Address.CREATOR);
                    break;
                case 8:
                    strArrA = com.google.android.gms.common.internal.safeparcel.a.A(parcel, iA);
                    break;
                case 9:
                    userAddress2 = (UserAddress) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, UserAddress.CREATOR);
                    break;
                case 10:
                    userAddress = (UserAddress) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, UserAddress.CREATOR);
                    break;
                case com.google.android.gms.c.MapAttrs_uiZoomGestures /* 11 */:
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
        return new FullWallet(iG, strO3, strO2, proxyCard, strO, address2, address, strArrA, userAddress2, userAddress, instrumentInfoArr);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public FullWallet[] newArray(int i) {
        return new FullWallet[i];
    }
}
