package com.google.android.gms.plus.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;

/* JADX INFO: loaded from: classes.dex */
public class b implements Parcelable.Creator {
    static void a(h hVar, Parcel parcel, int i) {
        int iA = c.a(parcel);
        c.a(parcel, 1, hVar.b(), false);
        c.a(parcel, 1000, hVar.a());
        c.a(parcel, 2, hVar.c(), false);
        c.a(parcel, 3, hVar.d(), false);
        c.a(parcel, 4, hVar.e(), false);
        c.a(parcel, 5, hVar.f(), false);
        c.a(parcel, 6, hVar.g(), false);
        c.a(parcel, 7, hVar.h(), false);
        c.a(parcel, 8, hVar.i(), false);
        c.a(parcel, 9, (Parcelable) hVar.j(), i, false);
        c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public h createFromParcel(Parcel parcel) {
        PlusCommonExtras plusCommonExtras = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iG = 0;
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        String strO4 = null;
        String[] strArrA = null;
        String[] strArrA2 = null;
        String[] strArrA3 = null;
        String strO5 = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    strO5 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 2:
                    strArrA3 = com.google.android.gms.common.internal.safeparcel.a.A(parcel, iA);
                    break;
                case 3:
                    strArrA2 = com.google.android.gms.common.internal.safeparcel.a.A(parcel, iA);
                    break;
                case 4:
                    strArrA = com.google.android.gms.common.internal.safeparcel.a.A(parcel, iA);
                    break;
                case 5:
                    strO4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 6:
                    strO3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 7:
                    strO2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 8:
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 9:
                    plusCommonExtras = (PlusCommonExtras) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, PlusCommonExtras.CREATOR);
                    break;
                case 1000:
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
        return new h(iG, strO5, strArrA3, strArrA2, strArrA, strO4, strO3, strO2, strO, plusCommonExtras);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public h[] newArray(int i) {
        return new h[i];
    }
}
