package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class d implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new e();
    LoyaltyWalletObject a;
    OfferWalletObject b;
    private final int c;

    d() {
        this.c = 2;
    }

    d(int i, LoyaltyWalletObject loyaltyWalletObject, OfferWalletObject offerWalletObject) {
        this.c = i;
        this.a = loyaltyWalletObject;
        this.b = offerWalletObject;
    }

    public int a() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        e.a(this, parcel, i);
    }
}
