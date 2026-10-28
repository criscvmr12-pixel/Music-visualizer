package com.google.android.gms.games.request;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.PlayerEntity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class a implements Parcelable.Creator {
    static void a(GameRequestEntity gameRequestEntity, Parcel parcel, int i) {
        int iA = c.a(parcel);
        c.a(parcel, 1, (Parcelable) gameRequestEntity.e(), i, false);
        c.a(parcel, 1000, gameRequestEntity.b());
        c.a(parcel, 2, (Parcelable) gameRequestEntity.f(), i, false);
        c.a(parcel, 3, gameRequestEntity.h(), false);
        c.a(parcel, 4, gameRequestEntity.d(), false);
        c.b(parcel, 5, gameRequestEntity.n(), false);
        c.a(parcel, 7, gameRequestEntity.i());
        c.a(parcel, 9, gameRequestEntity.j());
        c.a(parcel, 10, gameRequestEntity.k());
        c.a(parcel, 11, gameRequestEntity.c(), false);
        c.a(parcel, 12, gameRequestEntity.l());
        c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public GameRequestEntity createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iG = 0;
        GameEntity gameEntity = null;
        PlayerEntity playerEntity = null;
        byte[] bArrR = null;
        String strO = null;
        ArrayList arrayListC = null;
        int iG2 = 0;
        long jI = 0;
        long jI2 = 0;
        Bundle bundleQ = null;
        int iG3 = 0;
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
                    bArrR = com.google.android.gms.common.internal.safeparcel.a.r(parcel, iA);
                    break;
                case 4:
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 5:
                    arrayListC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, PlayerEntity.CREATOR);
                    break;
                case 7:
                    iG2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 9:
                    jI = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case 10:
                    jI2 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case com.google.android.gms.c.MapAttrs_uiZoomGestures /* 11 */:
                    bundleQ = com.google.android.gms.common.internal.safeparcel.a.q(parcel, iA);
                    break;
                case com.google.android.gms.c.MapAttrs_useViewLifecycle /* 12 */:
                    iG3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
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
            throw new b("Overread allowed size end=" + iB, parcel);
        }
        return new GameRequestEntity(iG, gameEntity, playerEntity, bArrR, strO, arrayListC, iG2, jI, jI2, bundleQ, iG3);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public GameRequestEntity[] newArray(int i) {
        return new GameRequestEntity[i];
    }
}
