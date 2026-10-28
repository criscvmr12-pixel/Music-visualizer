package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class mo implements Parcelable.Creator {
    static void a(ji jiVar, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, jiVar.f(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, jiVar.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, jiVar.g());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, jiVar.b());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, jiVar.c());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, jiVar.d());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, jiVar.e());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, jiVar.h());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, jiVar.i());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, jiVar.j());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ji createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iG = 0;
        String strO = null;
        int iG2 = 0;
        short sF = 0;
        double dM = 0.0d;
        double dM2 = 0.0d;
        float fL = 0.0f;
        long jI = 0;
        int iG3 = 0;
        int iG4 = -1;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 2:
                    jI = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case 3:
                    sF = com.google.android.gms.common.internal.safeparcel.a.f(parcel, iA);
                    break;
                case 4:
                    dM = com.google.android.gms.common.internal.safeparcel.a.m(parcel, iA);
                    break;
                case 5:
                    dM2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, iA);
                    break;
                case 6:
                    fL = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case 7:
                    iG2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 8:
                    iG3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 9:
                    iG4 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
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
        return new ji(iG, strO, iG2, sF, dM, dM2, fL, jI, iG3, iG4);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ji[] newArray(int i) {
        return new ji[i];
    }
}
