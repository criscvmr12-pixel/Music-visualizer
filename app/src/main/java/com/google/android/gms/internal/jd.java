package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class jd implements Parcelable.Creator {
    static void a(fs fsVar, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, (Parcelable) fsVar.b, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, fsVar.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, fsVar.c);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, fsVar.d);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, fsVar.e, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, (Parcelable) fsVar.f, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public fs createFromParcel(Parcel parcel) {
        int iG = 0;
        fh fhVar = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        long jI = 0;
        String strO = null;
        fj fjVar = null;
        int iG2 = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    fjVar = (fj) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, fj.CREATOR);
                    break;
                case 2:
                    jI = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case 3:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 4:
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 5:
                    fhVar = (fh) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, fh.CREATOR);
                    break;
                case 1000:
                    iG2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new fs(iG2, fjVar, jI, iG, strO, fhVar);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public fs[] newArray(int i) {
        return new fs[i];
    }
}
