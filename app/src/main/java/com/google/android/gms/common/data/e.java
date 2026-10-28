package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class e implements Parcelable.Creator {
    static void a(a aVar, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, aVar.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, (Parcelable) aVar.b, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, aVar.c);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a createFromParcel(Parcel parcel) {
        int iG;
        ParcelFileDescriptor parcelFileDescriptor;
        int iG2;
        int i = 0;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    int i3 = i;
                    parcelFileDescriptor = parcelFileDescriptor2;
                    iG2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    iG = i3;
                    break;
                case 2:
                    ParcelFileDescriptor parcelFileDescriptor3 = (ParcelFileDescriptor) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, ParcelFileDescriptor.CREATOR);
                    iG2 = i2;
                    iG = i;
                    parcelFileDescriptor = parcelFileDescriptor3;
                    break;
                case 3:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    parcelFileDescriptor = parcelFileDescriptor2;
                    iG2 = i2;
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    iG = i;
                    parcelFileDescriptor = parcelFileDescriptor2;
                    iG2 = i2;
                    break;
            }
            i2 = iG2;
            parcelFileDescriptor2 = parcelFileDescriptor;
            i = iG;
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new a(i2, parcelFileDescriptor2, i);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a[] newArray(int i) {
        return new a[i];
    }
}
