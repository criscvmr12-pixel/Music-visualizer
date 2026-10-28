package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class ix implements Parcelable.Creator {
    static void a(fh fhVar, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, (Parcelable[]) fhVar.b, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, fhVar.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, fhVar.c, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, fhVar.d);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public fh createFromParcel(Parcel parcel) {
        boolean zC;
        String strO;
        fl[] flVarArr;
        int iG;
        String str = null;
        boolean z = false;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        fl[] flVarArr2 = null;
        int i = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    iG = i;
                    String str2 = str;
                    flVarArr = (fl[]) com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA, fl.CREATOR);
                    zC = z;
                    strO = str2;
                    break;
                case 2:
                    flVarArr = flVarArr2;
                    iG = i;
                    boolean z2 = z;
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    zC = z2;
                    break;
                case 3:
                    zC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    strO = str;
                    flVarArr = flVarArr2;
                    iG = i;
                    break;
                case 1000:
                    boolean z3 = z;
                    strO = str;
                    flVarArr = flVarArr2;
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    zC = z3;
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    zC = z;
                    strO = str;
                    flVarArr = flVarArr2;
                    iG = i;
                    break;
            }
            i = iG;
            flVarArr2 = flVarArr;
            str = strO;
            z = zC;
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new fh(i, flVarArr2, str, z);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public fh[] newArray(int i) {
        return new fh[i];
    }
}
