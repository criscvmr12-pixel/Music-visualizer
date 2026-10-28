package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class d implements Parcelable.Creator {
    static void a(LocationRequest locationRequest, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, locationRequest.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, locationRequest.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, locationRequest.b);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, locationRequest.c);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, locationRequest.d);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, locationRequest.e);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, locationRequest.f);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, locationRequest.g);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public LocationRequest createFromParcel(Parcel parcel) {
        boolean zC = false;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iG = 102;
        long jI = 3600000;
        long jI2 = 600000;
        long jI3 = Long.MAX_VALUE;
        int iG2 = Integer.MAX_VALUE;
        float fL = 0.0f;
        int iG3 = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 2:
                    jI = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case 3:
                    jI2 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case 4:
                    zC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case 5:
                    jI3 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case 6:
                    iG2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 7:
                    fL = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case 1000:
                    iG3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new LocationRequest(iG3, iG, jI, jI2, zC, jI3, iG2, fL);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public LocationRequest[] newArray(int i) {
        return new LocationRequest[i];
    }
}
