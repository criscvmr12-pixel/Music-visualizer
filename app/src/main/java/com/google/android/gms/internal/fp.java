package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class fp implements Parcelable.Creator {
    static void a(dv dvVar, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, dvVar.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, dvVar.b, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, dvVar.c, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, dvVar.d, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, dvVar.e);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, dvVar.f, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, dvVar.g);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, dvVar.h);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, dvVar.i);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 10, dvVar.j, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 11, dvVar.k);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 12, dvVar.l);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 13, dvVar.m, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 14, dvVar.n);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 15, dvVar.o, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 19, dvVar.q, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 18, dvVar.p);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 21, dvVar.r, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public dv createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iG = 0;
        String strO = null;
        String strO2 = null;
        ArrayList arrayListB = null;
        int iG2 = 0;
        ArrayList arrayListB2 = null;
        long jI = 0;
        boolean zC = false;
        long jI2 = 0;
        ArrayList arrayListB3 = null;
        long jI3 = 0;
        int iG3 = 0;
        String strO3 = null;
        long jI4 = 0;
        String strO4 = null;
        boolean zC2 = false;
        String strO5 = null;
        String strO6 = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 2:
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 3:
                    strO2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 4:
                    arrayListB = com.google.android.gms.common.internal.safeparcel.a.B(parcel, iA);
                    break;
                case 5:
                    iG2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 6:
                    arrayListB2 = com.google.android.gms.common.internal.safeparcel.a.B(parcel, iA);
                    break;
                case 7:
                    jI = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case 8:
                    zC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case 9:
                    jI2 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case 10:
                    arrayListB3 = com.google.android.gms.common.internal.safeparcel.a.B(parcel, iA);
                    break;
                case com.google.android.gms.c.MapAttrs_uiZoomGestures /* 11 */:
                    jI3 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case com.google.android.gms.c.MapAttrs_useViewLifecycle /* 12 */:
                    iG3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case com.google.android.gms.c.MapAttrs_zOrderOnTop /* 13 */:
                    strO3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 14:
                    jI4 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case 15:
                    strO4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 16:
                case 17:
                case 20:
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
                case 18:
                    zC2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case 19:
                    strO5 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 21:
                    strO6 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new dv(iG, strO, strO2, arrayListB, iG2, arrayListB2, jI, zC, jI2, arrayListB3, jI3, iG3, strO3, jI4, strO4, zC2, strO5, strO6);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public dv[] newArray(int i) {
        return new dv[i];
    }
}
