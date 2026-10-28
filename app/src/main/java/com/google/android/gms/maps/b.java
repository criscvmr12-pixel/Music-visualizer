package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

/* JADX INFO: loaded from: classes.dex */
public class b implements Parcelable.Creator {
    static void a(StreetViewPanoramaOptions streetViewPanoramaOptions, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, streetViewPanoramaOptions.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, (Parcelable) streetViewPanoramaOptions.g(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, streetViewPanoramaOptions.j(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, (Parcelable) streetViewPanoramaOptions.h(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, streetViewPanoramaOptions.i(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, streetViewPanoramaOptions.b());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, streetViewPanoramaOptions.c());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, streetViewPanoramaOptions.d());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, streetViewPanoramaOptions.e());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 10, streetViewPanoramaOptions.f());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public StreetViewPanoramaOptions createFromParcel(Parcel parcel) {
        Integer numH = null;
        byte bE = 0;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        byte bE2 = 0;
        byte bE3 = 0;
        byte bE4 = 0;
        byte bE5 = 0;
        LatLng latLng = null;
        String strO = null;
        StreetViewPanoramaCamera streetViewPanoramaCamera = null;
        int iG = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 2:
                    streetViewPanoramaCamera = (StreetViewPanoramaCamera) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, StreetViewPanoramaCamera.CREATOR);
                    break;
                case 3:
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 4:
                    latLng = (LatLng) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, LatLng.CREATOR);
                    break;
                case 5:
                    numH = com.google.android.gms.common.internal.safeparcel.a.h(parcel, iA);
                    break;
                case 6:
                    bE5 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, iA);
                    break;
                case 7:
                    bE4 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, iA);
                    break;
                case 8:
                    bE3 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, iA);
                    break;
                case 9:
                    bE2 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, iA);
                    break;
                case 10:
                    bE = com.google.android.gms.common.internal.safeparcel.a.e(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new StreetViewPanoramaOptions(iG, streetViewPanoramaCamera, strO, latLng, numH, bE5, bE4, bE3, bE2, bE);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public StreetViewPanoramaOptions[] newArray(int i) {
        return new StreetViewPanoramaOptions[i];
    }
}
