package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class h implements Parcelable.Creator {
    static void a(PolygonOptions polygonOptions, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, polygonOptions.a());
        com.google.android.gms.common.internal.safeparcel.c.b(parcel, 2, polygonOptions.c(), false);
        com.google.android.gms.common.internal.safeparcel.c.c(parcel, 3, polygonOptions.b(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, polygonOptions.d());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, polygonOptions.e());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, polygonOptions.f());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, polygonOptions.g());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, polygonOptions.h());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, polygonOptions.i());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public PolygonOptions createFromParcel(Parcel parcel) {
        float fL = 0.0f;
        boolean zC = false;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        ArrayList arrayListC = null;
        ArrayList arrayList = new ArrayList();
        boolean zC2 = false;
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
                    arrayListC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, LatLng.CREATOR);
                    break;
                case 3:
                    com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, arrayList, getClass().getClassLoader());
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
                    zC2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case 9:
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
        return new PolygonOptions(iG3, arrayListC, arrayList, fL2, iG2, iG, fL, zC2, zC);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public PolygonOptions[] newArray(int i) {
        return new PolygonOptions[i];
    }
}
