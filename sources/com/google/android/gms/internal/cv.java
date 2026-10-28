package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class cv implements Parcelable.Creator {
    static void a(ci ciVar, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, ciVar.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, (Parcelable) ciVar.b, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, ciVar.a(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, ciVar.b(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, ciVar.c(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, ciVar.d(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, ciVar.g, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, ciVar.h);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, ciVar.i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 10, ciVar.f(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 11, ciVar.k);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 12, ciVar.l);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 13, ciVar.m, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 14, (Parcelable) ciVar.n, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 15, ciVar.e(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 17, (Parcelable) ciVar.q, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 16, ciVar.p, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ci createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iG = 0;
        cf cfVar = null;
        IBinder iBinderP = null;
        IBinder iBinderP2 = null;
        IBinder iBinderP3 = null;
        IBinder iBinderP4 = null;
        String strO = null;
        boolean zC = false;
        String strO2 = null;
        IBinder iBinderP5 = null;
        int iG2 = 0;
        int iG3 = 0;
        String strO3 = null;
        ew ewVar = null;
        IBinder iBinderP6 = null;
        String strO4 = null;
        w wVar = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 2:
                    cfVar = (cf) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, cf.CREATOR);
                    break;
                case 3:
                    iBinderP = com.google.android.gms.common.internal.safeparcel.a.p(parcel, iA);
                    break;
                case 4:
                    iBinderP2 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, iA);
                    break;
                case 5:
                    iBinderP3 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, iA);
                    break;
                case 6:
                    iBinderP4 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, iA);
                    break;
                case 7:
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 8:
                    zC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case 9:
                    strO2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 10:
                    iBinderP5 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, iA);
                    break;
                case com.google.android.gms.c.MapAttrs_uiZoomGestures /* 11 */:
                    iG2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case com.google.android.gms.c.MapAttrs_useViewLifecycle /* 12 */:
                    iG3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case com.google.android.gms.c.MapAttrs_zOrderOnTop /* 13 */:
                    strO3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 14:
                    ewVar = (ew) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, ew.CREATOR);
                    break;
                case 15:
                    iBinderP6 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, iA);
                    break;
                case 16:
                    strO4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 17:
                    wVar = (w) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, w.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new ci(iG, cfVar, iBinderP, iBinderP2, iBinderP3, iBinderP4, strO, zC, strO2, iBinderP5, iG2, iG3, strO3, ewVar, iBinderP6, strO4, wVar);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ci[] newArray(int i) {
        return new ci[i];
    }
}
