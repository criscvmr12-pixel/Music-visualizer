package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class g implements Parcelable.Creator {
    static void a(FullWalletRequest fullWalletRequest, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, fullWalletRequest.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, fullWalletRequest.a, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, fullWalletRequest.b, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, (Parcelable) fullWalletRequest.c, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public FullWalletRequest createFromParcel(Parcel parcel) {
        Cart cart = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iG = 0;
        String strO = null;
        String strO2 = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 2:
                    strO2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 3:
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 4:
                    cart = (Cart) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, Cart.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new FullWalletRequest(iG, strO2, strO, cart);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public FullWalletRequest[] newArray(int i) {
        return new FullWalletRequest[i];
    }
}
