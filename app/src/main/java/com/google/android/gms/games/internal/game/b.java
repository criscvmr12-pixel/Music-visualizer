package com.google.android.gms.games.internal.game;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b implements Parcelable.Creator {
    static void a(ExtendedGameEntity extendedGameEntity, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, (Parcelable) extendedGameEntity.d_(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, extendedGameEntity.m());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, extendedGameEntity.d());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, extendedGameEntity.e());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, extendedGameEntity.f());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, extendedGameEntity.g());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, extendedGameEntity.h());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, extendedGameEntity.i(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, extendedGameEntity.j());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, extendedGameEntity.k(), false);
        com.google.android.gms.common.internal.safeparcel.c.b(parcel, 10, extendedGameEntity.c(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 11, (Parcelable) extendedGameEntity.l(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ExtendedGameEntity createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iG = 0;
        GameEntity gameEntity = null;
        int iG2 = 0;
        boolean zC = false;
        int iG3 = 0;
        long jI = 0;
        long jI2 = 0;
        String strO = null;
        long jI3 = 0;
        String strO2 = null;
        ArrayList arrayListC = null;
        SnapshotMetadataEntity snapshotMetadataEntity = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    gameEntity = (GameEntity) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, GameEntity.CREATOR);
                    break;
                case 2:
                    iG2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 3:
                    zC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case 4:
                    iG3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 5:
                    jI = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case 6:
                    jI2 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case 7:
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 8:
                    jI3 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case 9:
                    strO2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 10:
                    arrayListC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, GameBadgeEntity.CREATOR);
                    break;
                case com.google.android.gms.c.MapAttrs_uiZoomGestures /* 11 */:
                    snapshotMetadataEntity = (SnapshotMetadataEntity) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, SnapshotMetadataEntity.CREATOR);
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
        return new ExtendedGameEntity(iG, gameEntity, iG2, zC, iG3, jI, jI2, strO, jI3, strO2, arrayListC, snapshotMetadataEntity);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ExtendedGameEntity[] newArray(int i) {
        return new ExtendedGameEntity[i];
    }
}
