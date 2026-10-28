package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CameraPosition;

/* JADX INFO: loaded from: classes.dex */
public class a implements Parcelable.Creator {
    static void a(GoogleMapOptions googleMapOptions, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, googleMapOptions.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, googleMapOptions.b());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, googleMapOptions.c());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, googleMapOptions.j());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, (Parcelable) googleMapOptions.k(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, googleMapOptions.d());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, googleMapOptions.e());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, googleMapOptions.f());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, googleMapOptions.g());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 10, googleMapOptions.h());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 11, googleMapOptions.i());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public GoogleMapOptions createFromParcel(Parcel parcel) {
        byte bE = 0;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        CameraPosition cameraPosition = null;
        byte bE2 = 0;
        byte bE3 = 0;
        byte bE4 = 0;
        byte bE5 = 0;
        byte bE6 = 0;
        int iG = 0;
        byte bE7 = 0;
        byte bE8 = 0;
        int iG2 = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    iG2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 2:
                    bE8 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, iA);
                    break;
                case 3:
                    bE7 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, iA);
                    break;
                case 4:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, CameraPosition.CREATOR);
                    break;
                case 6:
                    bE6 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, iA);
                    break;
                case 7:
                    bE5 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, iA);
                    break;
                case 8:
                    bE4 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, iA);
                    break;
                case 9:
                    bE3 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, iA);
                    break;
                case 10:
                    bE2 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, iA);
                    break;
                case com.google.android.gms.c.MapAttrs_uiZoomGestures /* 11 */:
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
        return new GoogleMapOptions(iG2, bE8, bE7, iG, cameraPosition, bE6, bE5, bE4, bE3, bE2, bE);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public GoogleMapOptions[] newArray(int i) {
        return new GoogleMapOptions[i];
    }
}
