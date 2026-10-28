package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class iz implements Parcelable.Creator {
    static void a(fl flVar, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, flVar.c, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, flVar.b);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, (Parcelable) flVar.d, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, flVar.e);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, flVar.f, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public fl createFromParcel(Parcel parcel) {
        byte[] bArrR = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iG = 0;
        int iG2 = -1;
        fq fqVar = null;
        String strO = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 3:
                    fqVar = (fq) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, fq.CREATOR);
                    break;
                case 4:
                    iG2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 5:
                    bArrR = com.google.android.gms.common.internal.safeparcel.a.r(parcel, iA);
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
        return new fl(iG, strO, fqVar, iG2, bArrR);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public fl[] newArray(int i) {
        return new fl[i];
    }
}
