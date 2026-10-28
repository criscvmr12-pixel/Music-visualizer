package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;

/* JADX INFO: loaded from: classes.dex */
public class d implements Parcelable.Creator {
    static void a(PlayerEntity playerEntity, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, playerEntity.b_(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, playerEntity.c(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, (Parcelable) playerEntity.d(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, (Parcelable) playerEntity.f(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, playerEntity.h());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, playerEntity.j());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, playerEntity.i());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, playerEntity.e(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, playerEntity.g(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 14, playerEntity.l(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 15, (Parcelable) playerEntity.n(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 17, playerEntity.k());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 16, (Parcelable) playerEntity.m(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, playerEntity.o());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public PlayerEntity createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iG = 0;
        String strO = null;
        String strO2 = null;
        Uri uri = null;
        Uri uri2 = null;
        long jI = 0;
        int iG2 = 0;
        long jI2 = 0;
        String strO3 = null;
        String strO4 = null;
        String strO5 = null;
        MostRecentGameInfoEntity mostRecentGameInfoEntity = null;
        PlayerLevelInfo playerLevelInfo = null;
        boolean zC = false;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 2:
                    strO2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 3:
                    uri = (Uri) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, Uri.CREATOR);
                    break;
                case 4:
                    uri2 = (Uri) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, Uri.CREATOR);
                    break;
                case 5:
                    jI = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case 6:
                    iG2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 7:
                    jI2 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case 8:
                    strO3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 9:
                    strO4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 14:
                    strO5 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 15:
                    mostRecentGameInfoEntity = (MostRecentGameInfoEntity) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, MostRecentGameInfoEntity.CREATOR);
                    break;
                case 16:
                    playerLevelInfo = (PlayerLevelInfo) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, PlayerLevelInfo.CREATOR);
                    break;
                case 17:
                    zC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
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
        return new PlayerEntity(iG, strO, strO2, uri, uri2, jI, iG2, jI2, strO3, strO4, strO5, mostRecentGameInfoEntity, playerLevelInfo, zC);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public PlayerEntity[] newArray(int i) {
        return new PlayerEntity[i];
    }
}
