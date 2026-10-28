package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.PlayerEntity;

/* JADX INFO: loaded from: classes.dex */
public class c implements Parcelable.Creator {
    static void a(SnapshotMetadataEntity snapshotMetadataEntity, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, (Parcelable) snapshotMetadataEntity.l_(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, snapshotMetadataEntity.m());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, (Parcelable) snapshotMetadataEntity.c(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, snapshotMetadataEntity.d(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, (Parcelable) snapshotMetadataEntity.e(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, snapshotMetadataEntity.f(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, snapshotMetadataEntity.i(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, snapshotMetadataEntity.j(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, snapshotMetadataEntity.k());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 10, snapshotMetadataEntity.l());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 11, snapshotMetadataEntity.g());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 12, snapshotMetadataEntity.h(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public SnapshotMetadataEntity createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iG = 0;
        GameEntity gameEntity = null;
        PlayerEntity playerEntity = null;
        String strO = null;
        Uri uri = null;
        String strO2 = null;
        String strO3 = null;
        String strO4 = null;
        long jI = 0;
        long jI2 = 0;
        float fL = 0.0f;
        String strO5 = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    gameEntity = (GameEntity) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, GameEntity.CREATOR);
                    break;
                case 2:
                    playerEntity = (PlayerEntity) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, PlayerEntity.CREATOR);
                    break;
                case 3:
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 5:
                    uri = (Uri) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, Uri.CREATOR);
                    break;
                case 6:
                    strO2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 7:
                    strO3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 8:
                    strO4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 9:
                    jI = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case 10:
                    jI2 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case com.google.android.gms.c.MapAttrs_uiZoomGestures /* 11 */:
                    fL = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case com.google.android.gms.c.MapAttrs_useViewLifecycle /* 12 */:
                    strO5 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
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
        return new SnapshotMetadataEntity(iG, gameEntity, playerEntity, strO, uri, strO2, strO3, strO4, jI, jI2, fL, strO5);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public SnapshotMetadataEntity[] newArray(int i) {
        return new SnapshotMetadataEntity[i];
    }
}
