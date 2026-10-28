package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class e implements Parcelable.Creator {
    static void a(d dVar, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, dVar.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, (Parcelable) dVar.a, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, (Parcelable) dVar.b, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public d createFromParcel(Parcel parcel) {
        OfferWalletObject offerWalletObject;
        LoyaltyWalletObject loyaltyWalletObject;
        int iG;
        OfferWalletObject offerWalletObject2 = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        LoyaltyWalletObject loyaltyWalletObject2 = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    OfferWalletObject offerWalletObject3 = offerWalletObject2;
                    loyaltyWalletObject = loyaltyWalletObject2;
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    offerWalletObject = offerWalletObject3;
                    break;
                case 2:
                    LoyaltyWalletObject loyaltyWalletObject3 = (LoyaltyWalletObject) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, LoyaltyWalletObject.CREATOR);
                    iG = i;
                    offerWalletObject = offerWalletObject2;
                    loyaltyWalletObject = loyaltyWalletObject3;
                    break;
                case 3:
                    offerWalletObject = (OfferWalletObject) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, OfferWalletObject.CREATOR);
                    loyaltyWalletObject = loyaltyWalletObject2;
                    iG = i;
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    offerWalletObject = offerWalletObject2;
                    loyaltyWalletObject = loyaltyWalletObject2;
                    iG = i;
                    break;
            }
            i = iG;
            loyaltyWalletObject2 = loyaltyWalletObject;
            offerWalletObject2 = offerWalletObject;
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new d(i, loyaltyWalletObject2, offerWalletObject2);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public d[] newArray(int i) {
        return new d[i];
    }
}
