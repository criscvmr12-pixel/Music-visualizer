package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class s implements Parcelable.Creator {
    static void a(am amVar, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, amVar.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, amVar.b, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, amVar.c);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, amVar.d);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, amVar.e);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, amVar.f);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, amVar.g);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, (Parcelable[]) amVar.h, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public am createFromParcel(Parcel parcel) {
        am[] amVarArr = null;
        int iG = 0;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iG2 = 0;
        boolean zC = false;
        int iG3 = 0;
        int iG4 = 0;
        String strO = null;
        int iG5 = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    iG5 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 2:
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 3:
                    iG4 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 4:
                    iG3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 5:
                    zC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case 6:
                    iG2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 7:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 8:
                    amVarArr = (am[]) com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA, am.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new am(iG5, strO, iG4, iG3, zC, iG2, iG, amVarArr);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public am[] newArray(int i) {
        return new am[i];
    }
}
