package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class j implements Parcelable.Creator {
    static void a(StreetViewPanoramaCamera streetViewPanoramaCamera, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, streetViewPanoramaCamera.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, streetViewPanoramaCamera.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, streetViewPanoramaCamera.b);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, streetViewPanoramaCamera.c);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public StreetViewPanoramaCamera createFromParcel(Parcel parcel) {
        float fL = 0.0f;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        float fL2 = 0.0f;
        int iG = 0;
        float fL3 = 0.0f;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 2:
                    fL2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case 3:
                    fL3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case 4:
                    fL = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new StreetViewPanoramaCamera(iG, fL2, fL3, fL);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public StreetViewPanoramaCamera[] newArray(int i) {
        return new StreetViewPanoramaCamera[i];
    }
}
