package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class m implements Parcelable.Creator {
    static void a(f fVar, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, fVar.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, fVar.a, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, (Parcelable) fVar.b, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, fVar.c, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, (Parcelable) fVar.d, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public f createFromParcel(Parcel parcel) {
        l lVar = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iG = 0;
        String strO = null;
        g gVar = null;
        String strO2 = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 2:
                    strO2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 3:
                    gVar = (g) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, g.CREATOR);
                    break;
                case 4:
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 5:
                    lVar = (l) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, l.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new f(iG, strO2, gVar, strO, lVar);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public f[] newArray(int i) {
        return new f[i];
    }
}
