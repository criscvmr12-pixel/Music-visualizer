package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class s implements Parcelable.Creator {
    static void a(p pVar, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, pVar.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, pVar.a, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, pVar.b, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, (Parcelable) pVar.c, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, (Parcelable) pVar.d, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, (Parcelable) pVar.e, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public p createFromParcel(Parcel parcel) {
        n nVar = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iG = 0;
        n nVar2 = null;
        l lVar = null;
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
                    lVar = (l) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, l.CREATOR);
                    break;
                case 5:
                    nVar2 = (n) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, n.CREATOR);
                    break;
                case 6:
                    nVar = (n) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, n.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new p(iG, strO2, strO, lVar, nVar2, nVar);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public p[] newArray(int i) {
        return new p[i];
    }
}
