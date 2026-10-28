package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class nb implements Parcelable.Creator {
    static void a(kt ktVar, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        Set setE = ktVar.e();
        if (setE.contains(1)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, ktVar.f());
        }
        if (setE.contains(2)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, ktVar.g(), true);
        }
        if (setE.contains(3)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, (Parcelable) ktVar.h(), i, true);
        }
        if (setE.contains(4)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, ktVar.i(), true);
        }
        if (setE.contains(5)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, ktVar.j(), true);
        }
        if (setE.contains(6)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, ktVar.k());
        }
        if (setE.contains(7)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, (Parcelable) ktVar.l(), i, true);
        }
        if (setE.contains(8)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, ktVar.m(), true);
        }
        if (setE.contains(9)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, ktVar.n(), true);
        }
        if (setE.contains(12)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 12, ktVar.o());
        }
        if (setE.contains(14)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 14, ktVar.p(), true);
        }
        if (setE.contains(15)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 15, (Parcelable) ktVar.q(), i, true);
        }
        if (setE.contains(16)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 16, ktVar.r());
        }
        if (setE.contains(19)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 19, (Parcelable) ktVar.t(), i, true);
        }
        if (setE.contains(18)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 18, ktVar.s(), true);
        }
        if (setE.contains(21)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 21, ktVar.v());
        }
        if (setE.contains(20)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 20, ktVar.u(), true);
        }
        if (setE.contains(23)) {
            com.google.android.gms.common.internal.safeparcel.c.b(parcel, 23, ktVar.x(), true);
        }
        if (setE.contains(22)) {
            com.google.android.gms.common.internal.safeparcel.c.b(parcel, 22, ktVar.w(), true);
        }
        if (setE.contains(25)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 25, ktVar.z());
        }
        if (setE.contains(24)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 24, ktVar.y());
        }
        if (setE.contains(27)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 27, ktVar.B(), true);
        }
        if (setE.contains(26)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 26, ktVar.A(), true);
        }
        if (setE.contains(29)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 29, ktVar.D());
        }
        if (setE.contains(28)) {
            com.google.android.gms.common.internal.safeparcel.c.b(parcel, 28, ktVar.C(), true);
        }
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public kt createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        HashSet hashSet = new HashSet();
        int iG = 0;
        String strO = null;
        kt.a aVar = null;
        String strO2 = null;
        String strO3 = null;
        int iG2 = 0;
        kt.b bVar = null;
        String strO4 = null;
        String strO5 = null;
        int iG3 = 0;
        String strO6 = null;
        kt.c cVar = null;
        boolean zC = false;
        String strO7 = null;
        kt.d dVar = null;
        String strO8 = null;
        int iG4 = 0;
        ArrayList arrayListC = null;
        ArrayList arrayListC2 = null;
        int iG5 = 0;
        int iG6 = 0;
        String strO9 = null;
        String strO10 = null;
        ArrayList arrayListC3 = null;
        boolean zC2 = false;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    hashSet.add(1);
                    break;
                case 2:
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(2);
                    break;
                case 3:
                    kt.a aVar2 = (kt.a) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, kt.a.CREATOR);
                    hashSet.add(3);
                    aVar = aVar2;
                    break;
                case 4:
                    strO2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(4);
                    break;
                case 5:
                    strO3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(5);
                    break;
                case 6:
                    iG2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    hashSet.add(6);
                    break;
                case 7:
                    kt.b bVar2 = (kt.b) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, kt.b.CREATOR);
                    hashSet.add(7);
                    bVar = bVar2;
                    break;
                case 8:
                    strO4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(8);
                    break;
                case 9:
                    strO5 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(9);
                    break;
                case 10:
                case com.google.android.gms.c.MapAttrs_uiZoomGestures /* 11 */:
                case com.google.android.gms.c.MapAttrs_zOrderOnTop /* 13 */:
                case 17:
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
                case com.google.android.gms.c.MapAttrs_useViewLifecycle /* 12 */:
                    iG3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    hashSet.add(12);
                    break;
                case 14:
                    strO6 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(14);
                    break;
                case 15:
                    kt.c cVar2 = (kt.c) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, kt.c.CREATOR);
                    hashSet.add(15);
                    cVar = cVar2;
                    break;
                case 16:
                    zC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    hashSet.add(16);
                    break;
                case 18:
                    strO7 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(18);
                    break;
                case 19:
                    kt.d dVar2 = (kt.d) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, kt.d.CREATOR);
                    hashSet.add(19);
                    dVar = dVar2;
                    break;
                case 20:
                    strO8 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(20);
                    break;
                case 21:
                    iG4 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    hashSet.add(21);
                    break;
                case 22:
                    arrayListC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, kt.f.CREATOR);
                    hashSet.add(22);
                    break;
                case 23:
                    arrayListC2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, kt.g.CREATOR);
                    hashSet.add(23);
                    break;
                case 24:
                    iG5 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    hashSet.add(24);
                    break;
                case 25:
                    iG6 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    hashSet.add(25);
                    break;
                case 26:
                    strO9 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(26);
                    break;
                case 27:
                    strO10 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(27);
                    break;
                case 28:
                    arrayListC3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, kt.h.CREATOR);
                    hashSet.add(28);
                    break;
                case 29:
                    zC2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    hashSet.add(29);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new kt(hashSet, iG, strO, aVar, strO2, strO3, iG2, bVar, strO4, strO5, iG3, strO6, cVar, zC, strO7, dVar, strO8, iG4, arrayListC, arrayListC2, iG5, iG6, strO9, strO10, arrayListC3, zC2);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public kt[] newArray(int i) {
        return new kt[i];
    }
}
