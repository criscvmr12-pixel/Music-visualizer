package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class i implements Parcelable.Creator {
    static void a(LineItem lineItem, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, lineItem.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, lineItem.a, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, lineItem.b, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, lineItem.c, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, lineItem.d, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, lineItem.e);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, lineItem.f, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public LineItem createFromParcel(Parcel parcel) {
        int iG = 0;
        String strO = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        String strO2 = null;
        String strO3 = null;
        String strO4 = null;
        String strO5 = null;
        int iG2 = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    iG2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
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
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 7:
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new LineItem(iG2, strO5, strO4, strO3, strO2, iG, strO);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public LineItem[] newArray(int i) {
        return new LineItem[i];
    }
}
