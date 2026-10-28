package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class lm implements Parcelable.Creator {
    static void a(Cif cif, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, cif.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, cif.e(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, (Parcelable) cif.f(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Cif createFromParcel(Parcel parcel) {
        ic icVar = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iG = 0;
        Parcel parcelC = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 2:
                    parcelC = com.google.android.gms.common.internal.safeparcel.a.C(parcel, iA);
                    break;
                case 3:
                    icVar = (ic) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, ic.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new Cif(iG, parcelC, icVar);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Cif[] newArray(int i) {
        return new Cif[i];
    }
}
