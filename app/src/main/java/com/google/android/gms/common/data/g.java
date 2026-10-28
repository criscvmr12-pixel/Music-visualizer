package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class g implements Parcelable.Creator {
    static void a(DataHolder dataHolder, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, dataHolder.c(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, dataHolder.b());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, (Parcelable[]) dataHolder.d(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, dataHolder.e());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, dataHolder.f(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DataHolder createFromParcel(Parcel parcel) {
        int iG = 0;
        Bundle bundleQ = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        CursorWindow[] cursorWindowArr = null;
        String[] strArrA = null;
        int iG2 = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    strArrA = com.google.android.gms.common.internal.safeparcel.a.A(parcel, iA);
                    break;
                case 2:
                    cursorWindowArr = (CursorWindow[]) com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA, CursorWindow.CREATOR);
                    break;
                case 3:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 4:
                    bundleQ = com.google.android.gms.common.internal.safeparcel.a.q(parcel, iA);
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
        DataHolder dataHolder = new DataHolder(iG2, strArrA, cursorWindowArr, iG, bundleQ);
        dataHolder.a();
        return dataHolder;
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DataHolder[] newArray(int i) {
        return new DataHolder[i];
    }
}
