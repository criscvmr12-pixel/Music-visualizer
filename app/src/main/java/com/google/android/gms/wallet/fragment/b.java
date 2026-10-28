package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class b implements Parcelable.Creator {
    static void a(WalletFragmentOptions walletFragmentOptions, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, walletFragmentOptions.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, walletFragmentOptions.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, walletFragmentOptions.b());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, (Parcelable) walletFragmentOptions.c(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, walletFragmentOptions.d());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public WalletFragmentOptions createFromParcel(Parcel parcel) {
        int iG = 1;
        int iG2 = 0;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        WalletFragmentStyle walletFragmentStyle = null;
        int iG3 = 1;
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
                    iG2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 4:
                    walletFragmentStyle = (WalletFragmentStyle) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, WalletFragmentStyle.CREATOR);
                    break;
                case 5:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new WalletFragmentOptions(iG4, iG3, iG2, walletFragmentStyle, iG);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public WalletFragmentOptions[] newArray(int i) {
        return new WalletFragmentOptions[i];
    }
}
