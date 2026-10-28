package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class fo implements Parcelable.Creator {
    static void a(dt dtVar, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, dtVar.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, dtVar.b, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, (Parcelable) dtVar.c, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, (Parcelable) dtVar.d, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, dtVar.e, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, (Parcelable) dtVar.f, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, (Parcelable) dtVar.g, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, dtVar.h, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, dtVar.i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 10, dtVar.j, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 11, (Parcelable) dtVar.k, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 12, dtVar.l, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public dt createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iG = 0;
        Bundle bundleQ = null;
        aj ajVar = null;
        am amVar = null;
        String strO = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String strO2 = null;
        String strO3 = null;
        String strO4 = null;
        ew ewVar = null;
        Bundle bundleQ2 = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 2:
                    bundleQ = com.google.android.gms.common.internal.safeparcel.a.q(parcel, iA);
                    break;
                case 3:
                    ajVar = (aj) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, aj.CREATOR);
                    break;
                case 4:
                    amVar = (am) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, am.CREATOR);
                    break;
                case 5:
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, PackageInfo.CREATOR);
                    break;
                case 8:
                    strO2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 9:
                    strO3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 10:
                    strO4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case com.google.android.gms.c.MapAttrs_uiZoomGestures /* 11 */:
                    ewVar = (ew) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, ew.CREATOR);
                    break;
                case com.google.android.gms.c.MapAttrs_useViewLifecycle /* 12 */:
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
        return new dt(iG, bundleQ, ajVar, amVar, strO, applicationInfo, packageInfo, strO2, strO3, strO4, ewVar, bundleQ2);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public dt[] newArray(int i) {
        return new dt[i];
    }
}
