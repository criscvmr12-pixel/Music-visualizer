package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class nn implements Parcelable.Creator {
    static void a(lj ljVar, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, ljVar.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, ljVar.a, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, ljVar.b, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public lj createFromParcel(Parcel parcel) {
        String[] strArrA = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iG = 0;
        byte[][] bArrS = (byte[][]) null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 2:
                    strArrA = com.google.android.gms.common.internal.safeparcel.a.A(parcel, iA);
                    break;
                case 3:
                    bArrS = com.google.android.gms.common.internal.safeparcel.a.s(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new lj(iG, strArrA, bArrS);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public lj[] newArray(int i) {
        return new lj[i];
    }
}
