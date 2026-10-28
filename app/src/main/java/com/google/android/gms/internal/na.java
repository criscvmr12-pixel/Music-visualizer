package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class na implements Parcelable.Creator {
    static void a(kq kqVar, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        Set setE = kqVar.e();
        if (setE.contains(1)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, kqVar.f());
        }
        if (setE.contains(2)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, kqVar.g(), true);
        }
        if (setE.contains(4)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, (Parcelable) kqVar.h(), i, true);
        }
        if (setE.contains(5)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, kqVar.i(), true);
        }
        if (setE.contains(6)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, (Parcelable) kqVar.j(), i, true);
        }
        if (setE.contains(7)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, kqVar.k(), true);
        }
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public kq createFromParcel(Parcel parcel) {
        String strO = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        HashSet hashSet = new HashSet();
        int iG = 0;
        ko koVar = null;
        String strO2 = null;
        ko koVar2 = null;
        String strO3 = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    hashSet.add(1);
                    break;
                case 2:
                    strO3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(2);
                    break;
                case 3:
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
                case 4:
                    ko koVar3 = (ko) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, ko.CREATOR);
                    hashSet.add(4);
                    koVar2 = koVar3;
                    break;
                case 5:
                    strO2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(5);
                    break;
                case 6:
                    ko koVar4 = (ko) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, ko.CREATOR);
                    hashSet.add(6);
                    koVar = koVar4;
                    break;
                case 7:
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    hashSet.add(7);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new kq(hashSet, iG, strO3, koVar2, strO2, koVar, strO);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public kq[] newArray(int i) {
        return new kq[i];
    }
}
