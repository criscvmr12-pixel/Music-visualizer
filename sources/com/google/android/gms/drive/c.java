package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class c implements Parcelable.Creator {
    static void a(StorageStats storageStats, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, storageStats.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, storageStats.b);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, storageStats.c);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, storageStats.d);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, storageStats.e);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, storageStats.f);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public StorageStats createFromParcel(Parcel parcel) {
        int iG = 0;
        long jI = 0;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        long jI2 = 0;
        long jI3 = 0;
        long jI4 = 0;
        int iG2 = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    iG2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 2:
                    jI4 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case 3:
                    jI3 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case 4:
                    jI2 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case 5:
                    jI = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case 6:
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
        return new StorageStats(iG2, jI4, jI3, jI2, jI, iG);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public StorageStats[] newArray(int i) {
        return new StorageStats[i];
    }
}
