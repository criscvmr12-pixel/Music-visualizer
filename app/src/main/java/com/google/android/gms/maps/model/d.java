package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class d implements Parcelable.Creator {
    static void a(GroundOverlayOptions groundOverlayOptions, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, groundOverlayOptions.b());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, groundOverlayOptions.a(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, (Parcelable) groundOverlayOptions.c(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, groundOverlayOptions.d());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, groundOverlayOptions.e());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, (Parcelable) groundOverlayOptions.f(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, groundOverlayOptions.g());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, groundOverlayOptions.h());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, groundOverlayOptions.l());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 10, groundOverlayOptions.i());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 11, groundOverlayOptions.j());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 12, groundOverlayOptions.k());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public GroundOverlayOptions createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iG = 0;
        IBinder iBinderP = null;
        LatLng latLng = null;
        float fL = 0.0f;
        float fL2 = 0.0f;
        LatLngBounds latLngBounds = null;
        float fL3 = 0.0f;
        float fL4 = 0.0f;
        boolean zC = false;
        float fL5 = 0.0f;
        float fL6 = 0.0f;
        float fL7 = 0.0f;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 2:
                    iBinderP = com.google.android.gms.common.internal.safeparcel.a.p(parcel, iA);
                    break;
                case 3:
                    latLng = (LatLng) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, LatLng.CREATOR);
                    break;
                case 4:
                    fL = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case 5:
                    fL2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, LatLngBounds.CREATOR);
                    break;
                case 7:
                    fL3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case 8:
                    fL4 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case 9:
                    zC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case 10:
                    fL5 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case com.google.android.gms.c.MapAttrs_uiZoomGestures /* 11 */:
                    fL6 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case com.google.android.gms.c.MapAttrs_useViewLifecycle /* 12 */:
                    fL7 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new GroundOverlayOptions(iG, iBinderP, latLng, fL, fL2, latLngBounds, fL3, fL4, zC, fL5, fL6, fL7);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public GroundOverlayOptions[] newArray(int i) {
        return new GroundOverlayOptions[i];
    }
}
