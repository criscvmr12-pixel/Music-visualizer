package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class jc implements Parcelable.Creator {
    static void a(fq fqVar, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, fqVar.b, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, fqVar.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, fqVar.c, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, fqVar.d);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, fqVar.e);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, fqVar.f);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, fqVar.g, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, (Parcelable[]) fqVar.h, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, fqVar.i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 11, fqVar.j, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public fq createFromParcel(Parcel parcel) {
        boolean zC = false;
        String strO = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iG = 1;
        int[] iArrU = null;
        fn[] fnVarArr = null;
        String strO2 = null;
        boolean zC2 = false;
        String strO3 = null;
        String strO4 = null;
        int iG2 = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    strO4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 2:
                    strO3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 3:
                    zC2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case 4:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 5:
                    zC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case 6:
                    strO2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 7:
                    fnVarArr = (fn[]) com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA, fn.CREATOR);
                    break;
                case 8:
                    iArrU = com.google.android.gms.common.internal.safeparcel.a.u(parcel, iA);
                    break;
                case com.google.android.gms.c.MapAttrs_uiZoomGestures /* 11 */:
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 1000:
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
        return new fq(iG2, strO4, strO3, zC2, iG, zC, strO2, fnVarArr, iArrU, strO);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public fq[] newArray(int i) {
        return new fq[i];
    }
}
