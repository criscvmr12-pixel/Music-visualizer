package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class g implements Parcelable.Creator {
    static void a(MarkerOptions markerOptions, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, markerOptions.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, (Parcelable) markerOptions.c(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, markerOptions.d(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, markerOptions.e(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, markerOptions.b(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, markerOptions.f());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, markerOptions.g());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, markerOptions.h());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, markerOptions.i());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 10, markerOptions.j());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 11, markerOptions.k());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 12, markerOptions.l());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 13, markerOptions.m());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 14, markerOptions.n());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public MarkerOptions createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iG = 0;
        LatLng latLng = null;
        String strO = null;
        String strO2 = null;
        IBinder iBinderP = null;
        float fL = 0.0f;
        float fL2 = 0.0f;
        boolean zC = false;
        boolean zC2 = false;
        boolean zC3 = false;
        float fL3 = 0.0f;
        float fL4 = 0.5f;
        float fL5 = 0.0f;
        float fL6 = 1.0f;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 2:
                    latLng = (LatLng) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, LatLng.CREATOR);
                    break;
                case 3:
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 4:
                    strO2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 5:
                    iBinderP = com.google.android.gms.common.internal.safeparcel.a.p(parcel, iA);
                    break;
                case 6:
                    fL = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case 7:
                    fL2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case 8:
                    zC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case 9:
                    zC2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case 10:
                    zC3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case com.google.android.gms.c.MapAttrs_uiZoomGestures /* 11 */:
                    fL3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case com.google.android.gms.c.MapAttrs_useViewLifecycle /* 12 */:
                    fL4 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case com.google.android.gms.c.MapAttrs_zOrderOnTop /* 13 */:
                    fL5 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case 14:
                    fL6 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new MarkerOptions(iG, latLng, strO, strO2, iBinderP, fL, fL2, zC, zC2, zC3, fL3, fL4, fL5, fL6);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public MarkerOptions[] newArray(int i) {
        return new MarkerOptions[i];
    }
}
