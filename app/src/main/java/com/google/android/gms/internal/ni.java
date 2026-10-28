package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class ni implements Parcelable.Creator {
    static void a(kt.d dVar, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        Set setE = dVar.e();
        if (setE.contains(1)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, dVar.f());
        }
        if (setE.contains(2)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, dVar.g(), true);
        }
        if (setE.contains(3)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, dVar.h(), true);
        }
        if (setE.contains(4)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, dVar.i(), true);
        }
        if (setE.contains(5)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, dVar.j(), true);
        }
        if (setE.contains(6)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, dVar.k(), true);
        }
        if (setE.contains(7)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, dVar.l(), true);
        }
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public kt.d createFromParcel(Parcel parcel) {
        String strO = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        HashSet hashSet = new HashSet();
        int iG = 0;
        String strO2 = null;
        String strO3 = null;
        String strO4 = null;
        String strO5 = null;
        String strO6 = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    hashSet.add(1);
                    break;
                case 2:
                    strO6 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(2);
                    break;
                case 3:
                    strO5 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(3);
                    break;
                case 4:
                    strO4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(4);
                    break;
                case 5:
                    strO3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(5);
                    break;
                case 6:
                    strO2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(6);
                    break;
                case 7:
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(7);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new kt.d(hashSet, iG, strO6, strO5, strO4, strO3, strO2, strO);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public kt.d[] newArray(int i) {
        return new kt.d[i];
    }
}
