package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class c implements Parcelable.Creator {
    static void a(CircleOptions circleOptions, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, circleOptions.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, (Parcelable) circleOptions.b(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, circleOptions.c());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, circleOptions.d());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, circleOptions.e());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, circleOptions.f());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, circleOptions.g());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, circleOptions.h());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public CircleOptions createFromParcel(Parcel parcel) {
        float fL = 0.0f;
        boolean zC = false;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        LatLng latLng = null;
        double dM = 0.0d;
        int iG = 0;
        int iG2 = 0;
        float fL2 = 0.0f;
        int iG3 = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    iG3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 2:
                    latLng = (LatLng) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, LatLng.CREATOR);
                    break;
                case 3:
                    dM = com.google.android.gms.common.internal.safeparcel.a.m(parcel, iA);
                    break;
                case 4:
                    fL2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case 5:
                    iG2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 6:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 7:
                    fL = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case 8:
                    zC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new CircleOptions(iG3, latLng, dM, fL2, iG2, iG, fL, zC);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public CircleOptions[] newArray(int i) {
        return new CircleOptions[i];
    }
}
