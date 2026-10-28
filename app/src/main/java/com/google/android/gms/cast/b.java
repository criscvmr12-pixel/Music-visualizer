package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.images.WebImage;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b implements Parcelable.Creator {
    static void a(CastDevice castDevice, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, castDevice.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, castDevice.b(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, castDevice.a, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, castDevice.c(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, castDevice.d(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, castDevice.e(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, castDevice.f());
        com.google.android.gms.common.internal.safeparcel.c.b(parcel, 8, castDevice.g(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, castDevice.h());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public CastDevice createFromParcel(Parcel parcel) {
        int iG = 0;
        ArrayList arrayListC = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iG2 = 0;
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        String strO4 = null;
        String strO5 = null;
        int iG3 = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    iG3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 2:
                    strO5 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 3:
                    strO4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 4:
                    strO3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 5:
                    strO2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 6:
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 7:
                    iG2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 8:
                    arrayListC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, WebImage.CREATOR);
                    break;
                case 9:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new CastDevice(iG3, strO5, strO4, strO3, strO2, strO, iG2, arrayListC, iG);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public CastDevice[] newArray(int i) {
        return new CastDevice[i];
    }
}
