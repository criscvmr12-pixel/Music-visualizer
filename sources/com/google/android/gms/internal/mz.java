package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class mz implements Parcelable.Creator {
    static void a(ko koVar, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        Set setE = koVar.e();
        if (setE.contains(1)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, koVar.f());
        }
        if (setE.contains(2)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, (Parcelable) koVar.g(), i, true);
        }
        if (setE.contains(3)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, koVar.h(), true);
        }
        if (setE.contains(4)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, (Parcelable) koVar.i(), i, true);
        }
        if (setE.contains(5)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, koVar.j(), true);
        }
        if (setE.contains(6)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, koVar.k(), true);
        }
        if (setE.contains(7)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, koVar.l(), true);
        }
        if (setE.contains(8)) {
            com.google.android.gms.common.internal.safeparcel.c.b(parcel, 8, koVar.m(), true);
        }
        if (setE.contains(9)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, koVar.n());
        }
        if (setE.contains(10)) {
            com.google.android.gms.common.internal.safeparcel.c.b(parcel, 10, koVar.o(), true);
        }
        if (setE.contains(11)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 11, (Parcelable) koVar.p(), i, true);
        }
        if (setE.contains(12)) {
            com.google.android.gms.common.internal.safeparcel.c.b(parcel, 12, koVar.q(), true);
        }
        if (setE.contains(13)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 13, koVar.r(), true);
        }
        if (setE.contains(14)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 14, koVar.s(), true);
        }
        if (setE.contains(15)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 15, (Parcelable) koVar.t(), i, true);
        }
        if (setE.contains(17)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 17, koVar.v(), true);
        }
        if (setE.contains(16)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 16, koVar.u(), true);
        }
        if (setE.contains(19)) {
            com.google.android.gms.common.internal.safeparcel.c.b(parcel, 19, koVar.x(), true);
        }
        if (setE.contains(18)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 18, koVar.w(), true);
        }
        if (setE.contains(21)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 21, koVar.z(), true);
        }
        if (setE.contains(20)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 20, koVar.y(), true);
        }
        if (setE.contains(23)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 23, koVar.B(), true);
        }
        if (setE.contains(22)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 22, koVar.A(), true);
        }
        if (setE.contains(25)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 25, koVar.D(), true);
        }
        if (setE.contains(24)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 24, koVar.C(), true);
        }
        if (setE.contains(27)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 27, koVar.F(), true);
        }
        if (setE.contains(26)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 26, koVar.E(), true);
        }
        if (setE.contains(29)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 29, (Parcelable) koVar.H(), i, true);
        }
        if (setE.contains(28)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 28, koVar.G(), true);
        }
        if (setE.contains(31)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 31, koVar.J(), true);
        }
        if (setE.contains(30)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 30, koVar.I(), true);
        }
        if (setE.contains(34)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 34, (Parcelable) koVar.M(), i, true);
        }
        if (setE.contains(32)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 32, koVar.K(), true);
        }
        if (setE.contains(33)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 33, koVar.L(), true);
        }
        if (setE.contains(38)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 38, koVar.P());
        }
        if (setE.contains(39)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 39, koVar.Q(), true);
        }
        if (setE.contains(36)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 36, koVar.N());
        }
        if (setE.contains(37)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 37, (Parcelable) koVar.O(), i, true);
        }
        if (setE.contains(42)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 42, koVar.T(), true);
        }
        if (setE.contains(43)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 43, koVar.U(), true);
        }
        if (setE.contains(40)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 40, (Parcelable) koVar.R(), i, true);
        }
        if (setE.contains(41)) {
            com.google.android.gms.common.internal.safeparcel.c.b(parcel, 41, koVar.S(), true);
        }
        if (setE.contains(46)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 46, (Parcelable) koVar.X(), i, true);
        }
        if (setE.contains(47)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 47, koVar.Y(), true);
        }
        if (setE.contains(44)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 44, koVar.V(), true);
        }
        if (setE.contains(45)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 45, koVar.W(), true);
        }
        if (setE.contains(51)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 51, koVar.ac(), true);
        }
        if (setE.contains(50)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 50, (Parcelable) koVar.ab(), i, true);
        }
        if (setE.contains(49)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 49, koVar.aa(), true);
        }
        if (setE.contains(48)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 48, koVar.Z(), true);
        }
        if (setE.contains(55)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 55, koVar.ag(), true);
        }
        if (setE.contains(54)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 54, koVar.af(), true);
        }
        if (setE.contains(53)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 53, koVar.ae(), true);
        }
        if (setE.contains(52)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 52, koVar.ad(), true);
        }
        if (setE.contains(56)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 56, koVar.ah(), true);
        }
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ko createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        HashSet hashSet = new HashSet();
        int iG = 0;
        ko koVar = null;
        ArrayList arrayListB = null;
        ko koVar2 = null;
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        ArrayList arrayListC = null;
        int iG2 = 0;
        ArrayList arrayListC2 = null;
        ko koVar3 = null;
        ArrayList arrayListC3 = null;
        String strO4 = null;
        String strO5 = null;
        ko koVar4 = null;
        String strO6 = null;
        String strO7 = null;
        String strO8 = null;
        ArrayList arrayListC4 = null;
        String strO9 = null;
        String strO10 = null;
        String strO11 = null;
        String strO12 = null;
        String strO13 = null;
        String strO14 = null;
        String strO15 = null;
        String strO16 = null;
        String strO17 = null;
        ko koVar5 = null;
        String strO18 = null;
        String strO19 = null;
        String strO20 = null;
        String strO21 = null;
        ko koVar6 = null;
        double dM = 0.0d;
        ko koVar7 = null;
        double dM2 = 0.0d;
        String strO22 = null;
        ko koVar8 = null;
        ArrayList arrayListC5 = null;
        String strO23 = null;
        String strO24 = null;
        String strO25 = null;
        String strO26 = null;
        ko koVar9 = null;
        String strO27 = null;
        String strO28 = null;
        String strO29 = null;
        ko koVar10 = null;
        String strO30 = null;
        String strO31 = null;
        String strO32 = null;
        String strO33 = null;
        String strO34 = null;
        String strO35 = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    hashSet.add(1);
                    break;
                case 2:
                    ko koVar11 = (ko) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, ko.CREATOR);
                    hashSet.add(2);
                    koVar = koVar11;
                    break;
                case 3:
                    arrayListB = com.google.android.gms.common.internal.safeparcel.a.B(parcel, iA);
                    hashSet.add(3);
                    break;
                case 4:
                    ko koVar12 = (ko) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, ko.CREATOR);
                    hashSet.add(4);
                    koVar2 = koVar12;
                    break;
                case 5:
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(5);
                    break;
                case 6:
                    strO2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(6);
                    break;
                case 7:
                    strO3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(7);
                    break;
                case 8:
                    arrayListC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, ko.CREATOR);
                    hashSet.add(8);
                    break;
                case 9:
                    iG2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    hashSet.add(9);
                    break;
                case 10:
                    arrayListC2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, ko.CREATOR);
                    hashSet.add(10);
                    break;
                case com.google.android.gms.c.MapAttrs_uiZoomGestures /* 11 */:
                    ko koVar13 = (ko) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, ko.CREATOR);
                    hashSet.add(11);
                    koVar3 = koVar13;
                    break;
                case com.google.android.gms.c.MapAttrs_useViewLifecycle /* 12 */:
                    arrayListC3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, ko.CREATOR);
                    hashSet.add(12);
                    break;
                case com.google.android.gms.c.MapAttrs_zOrderOnTop /* 13 */:
                    strO4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(13);
                    break;
                case 14:
                    strO5 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(14);
                    break;
                case 15:
                    ko koVar14 = (ko) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, ko.CREATOR);
                    hashSet.add(15);
                    koVar4 = koVar14;
                    break;
                case 16:
                    strO6 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(16);
                    break;
                case 17:
                    strO7 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(17);
                    break;
                case 18:
                    strO8 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(18);
                    break;
                case 19:
                    arrayListC4 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, ko.CREATOR);
                    hashSet.add(19);
                    break;
                case 20:
                    strO9 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(20);
                    break;
                case 21:
                    strO10 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(21);
                    break;
                case 22:
                    strO11 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(22);
                    break;
                case 23:
                    strO12 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(23);
                    break;
                case 24:
                    strO13 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(24);
                    break;
                case 25:
                    strO14 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(25);
                    break;
                case 26:
                    strO15 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(26);
                    break;
                case 27:
                    strO16 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(27);
                    break;
                case 28:
                    strO17 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(28);
                    break;
                case 29:
                    ko koVar15 = (ko) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, ko.CREATOR);
                    hashSet.add(29);
                    koVar5 = koVar15;
                    break;
                case 30:
                    strO18 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(30);
                    break;
                case 31:
                    strO19 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(31);
                    break;
                case 32:
                    strO20 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(32);
                    break;
                case 33:
                    strO21 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(33);
                    break;
                case 34:
                    ko koVar16 = (ko) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, ko.CREATOR);
                    hashSet.add(34);
                    koVar6 = koVar16;
                    break;
                case 35:
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
                case 36:
                    dM = com.google.android.gms.common.internal.safeparcel.a.m(parcel, iA);
                    hashSet.add(36);
                    break;
                case 37:
                    ko koVar17 = (ko) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, ko.CREATOR);
                    hashSet.add(37);
                    koVar7 = koVar17;
                    break;
                case 38:
                    dM2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, iA);
                    hashSet.add(38);
                    break;
                case 39:
                    strO22 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(39);
                    break;
                case 40:
                    ko koVar18 = (ko) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, ko.CREATOR);
                    hashSet.add(40);
                    koVar8 = koVar18;
                    break;
                case 41:
                    arrayListC5 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, ko.CREATOR);
                    hashSet.add(41);
                    break;
                case 42:
                    strO23 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(42);
                    break;
                case 43:
                    strO24 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(43);
                    break;
                case 44:
                    strO25 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(44);
                    break;
                case 45:
                    strO26 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(45);
                    break;
                case 46:
                    ko koVar19 = (ko) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, ko.CREATOR);
                    hashSet.add(46);
                    koVar9 = koVar19;
                    break;
                case 47:
                    strO27 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(47);
                    break;
                case 48:
                    strO28 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(48);
                    break;
                case 49:
                    strO29 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(49);
                    break;
                case 50:
                    ko koVar20 = (ko) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, ko.CREATOR);
                    hashSet.add(50);
                    koVar10 = koVar20;
                    break;
                case 51:
                    strO30 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(51);
                    break;
                case 52:
                    strO31 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(52);
                    break;
                case 53:
                    strO32 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(53);
                    break;
                case 54:
                    strO33 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(54);
                    break;
                case 55:
                    strO34 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(55);
                    break;
                case 56:
                    strO35 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(56);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new ko(hashSet, iG, koVar, arrayListB, koVar2, strO, strO2, strO3, arrayListC, iG2, arrayListC2, koVar3, arrayListC3, strO4, strO5, koVar4, strO6, strO7, strO8, arrayListC4, strO9, strO10, strO11, strO12, strO13, strO14, strO15, strO16, strO17, koVar5, strO18, strO19, strO20, strO21, koVar6, dM, koVar7, dM2, strO22, koVar8, arrayListC5, strO23, strO24, strO25, strO26, koVar9, strO27, strO28, strO29, koVar10, strO30, strO31, strO32, strO33, strO34, strO35);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ko[] newArray(int i) {
        return new ko[i];
    }
}
