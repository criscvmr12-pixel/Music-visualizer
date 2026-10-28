package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class k implements Parcelable.Creator {
    static void a(g gVar, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, gVar.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, gVar.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, gVar.b, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, gVar.c);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, gVar.d, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, gVar.e);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, gVar.f);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public g createFromParcel(Parcel parcel) {
        String strO = null;
        int iG = 0;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        double dM = 0.0d;
        long jI = 0;
        int iG2 = -1;
        String strO2 = null;
        int iG3 = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    iG3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 2:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 3:
                    strO2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 4:
                    dM = com.google.android.gms.common.internal.safeparcel.a.m(parcel, iA);
                    break;
                case 5:
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 6:
                    jI = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case 7:
                    iG2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new g(iG3, iG, strO2, dM, strO, jI, iG2);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public g[] newArray(int i) {
        return new g[i];
    }
}
