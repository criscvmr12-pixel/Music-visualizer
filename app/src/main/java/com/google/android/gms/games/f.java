package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class f implements Parcelable.Creator {
    static void a(PlayerLevelInfo playerLevelInfo, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, playerLevelInfo.b());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, playerLevelInfo.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, playerLevelInfo.c());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, (Parcelable) playerLevelInfo.d(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, (Parcelable) playerLevelInfo.e(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public PlayerLevelInfo createFromParcel(Parcel parcel) {
        long jI = 0;
        PlayerLevel playerLevel = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iG = 0;
        PlayerLevel playerLevel2 = null;
        long jI2 = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    jI2 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case 2:
                    jI = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case 3:
                    playerLevel2 = (PlayerLevel) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, PlayerLevel.CREATOR);
                    break;
                case 4:
                    playerLevel = (PlayerLevel) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, PlayerLevel.CREATOR);
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
        return new PlayerLevelInfo(iG, jI2, jI, playerLevel2, playerLevel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public PlayerLevelInfo[] newArray(int i) {
        return new PlayerLevelInfo[i];
    }
}
