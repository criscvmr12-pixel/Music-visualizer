package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class q implements Parcelable.Creator {
    static void a(aj ajVar, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, ajVar.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, ajVar.b);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, ajVar.c, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, ajVar.d);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, ajVar.e, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, ajVar.f);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, ajVar.g);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, ajVar.h);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, ajVar.i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 10, (Parcelable) ajVar.j, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 11, (Parcelable) ajVar.k, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 12, ajVar.l, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 13, ajVar.m, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public aj createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iG = 0;
        long jI = 0;
        Bundle bundleQ = null;
        int iG2 = 0;
        ArrayList arrayListB = null;
        boolean zC = false;
        int iG3 = 0;
        boolean zC2 = false;
        String strO = null;
        ax axVar = null;
        Location location = null;
        String strO2 = null;
        Bundle bundleQ2 = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 2:
                    jI = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case 3:
                    bundleQ = com.google.android.gms.common.internal.safeparcel.a.q(parcel, iA);
                    break;
                case 4:
                    iG2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 5:
                    arrayListB = com.google.android.gms.common.internal.safeparcel.a.B(parcel, iA);
                    break;
                case 6:
                    zC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case 7:
                    iG3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 8:
                    zC2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case 9:
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 10:
                    axVar = (ax) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, ax.CREATOR);
                    break;
                case com.google.android.gms.c.MapAttrs_uiZoomGestures /* 11 */:
                    location = (Location) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, Location.CREATOR);
                    break;
                case com.google.android.gms.c.MapAttrs_useViewLifecycle /* 12 */:
                    strO2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case com.google.android.gms.c.MapAttrs_zOrderOnTop /* 13 */:
                    bundleQ2 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new aj(iG, jI, bundleQ, iG2, arrayListB, zC, iG3, zC2, strO, axVar, location, strO2, bundleQ2);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public aj[] newArray(int i) {
        return new aj[i];
    }
}
