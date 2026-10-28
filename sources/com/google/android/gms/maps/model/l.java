package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class l implements Parcelable.Creator {
    static void a(StreetViewPanoramaLocation streetViewPanoramaLocation, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, streetViewPanoramaLocation.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, (Parcelable[]) streetViewPanoramaLocation.a, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, (Parcelable) streetViewPanoramaLocation.b, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, streetViewPanoramaLocation.c, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public StreetViewPanoramaLocation createFromParcel(Parcel parcel) {
        String strO;
        LatLng latLng;
        StreetViewPanoramaLink[] streetViewPanoramaLinkArr;
        int iG;
        String str = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        LatLng latLng2 = null;
        StreetViewPanoramaLink[] streetViewPanoramaLinkArr2 = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    String str2 = str;
                    latLng = latLng2;
                    streetViewPanoramaLinkArr = streetViewPanoramaLinkArr2;
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    strO = str2;
                    break;
                case 2:
                    iG = i;
                    LatLng latLng3 = latLng2;
                    streetViewPanoramaLinkArr = (StreetViewPanoramaLink[]) com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA, StreetViewPanoramaLink.CREATOR);
                    strO = str;
                    latLng = latLng3;
                    break;
                case 3:
                    streetViewPanoramaLinkArr = streetViewPanoramaLinkArr2;
                    iG = i;
                    String str3 = str;
                    latLng = (LatLng) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, LatLng.CREATOR);
                    strO = str3;
                    break;
                case 4:
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    latLng = latLng2;
                    streetViewPanoramaLinkArr = streetViewPanoramaLinkArr2;
                    iG = i;
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    strO = str;
                    latLng = latLng2;
                    streetViewPanoramaLinkArr = streetViewPanoramaLinkArr2;
                    iG = i;
                    break;
            }
            i = iG;
            streetViewPanoramaLinkArr2 = streetViewPanoramaLinkArr;
            latLng2 = latLng;
            str = strO;
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new StreetViewPanoramaLocation(i, streetViewPanoramaLinkArr2, latLng2, str);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public StreetViewPanoramaLocation[] newArray(int i) {
        return new StreetViewPanoramaLocation[i];
    }
}
