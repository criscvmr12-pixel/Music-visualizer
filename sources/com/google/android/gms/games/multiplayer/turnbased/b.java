package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b implements Parcelable.Creator {
    static void a(TurnBasedMatchEntity turnBasedMatchEntity, Parcel parcel, int i) {
        int iA = c.a(parcel);
        c.a(parcel, 1, (Parcelable) turnBasedMatchEntity.i_(), i, false);
        c.a(parcel, 2, turnBasedMatchEntity.c(), false);
        c.a(parcel, 3, turnBasedMatchEntity.d(), false);
        c.a(parcel, 4, turnBasedMatchEntity.e());
        c.a(parcel, 5, turnBasedMatchEntity.j(), false);
        c.a(parcel, 6, turnBasedMatchEntity.k());
        c.a(parcel, 7, turnBasedMatchEntity.m(), false);
        c.a(parcel, 8, turnBasedMatchEntity.f());
        c.a(parcel, 10, turnBasedMatchEntity.i());
        c.a(parcel, 11, turnBasedMatchEntity.o());
        c.a(parcel, 12, turnBasedMatchEntity.n(), false);
        c.b(parcel, 13, turnBasedMatchEntity.l(), false);
        c.a(parcel, 14, turnBasedMatchEntity.p(), false);
        c.a(parcel, 15, turnBasedMatchEntity.q(), false);
        c.a(parcel, 17, turnBasedMatchEntity.s(), false);
        c.a(parcel, 16, turnBasedMatchEntity.r());
        c.a(parcel, 1000, turnBasedMatchEntity.w());
        c.a(parcel, 19, turnBasedMatchEntity.u());
        c.a(parcel, 18, turnBasedMatchEntity.g());
        c.a(parcel, 21, turnBasedMatchEntity.v(), false);
        c.a(parcel, 20, turnBasedMatchEntity.h(), false);
        c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public TurnBasedMatchEntity createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iG = 0;
        GameEntity gameEntity = null;
        String strO = null;
        String strO2 = null;
        long jI = 0;
        String strO3 = null;
        long jI2 = 0;
        String strO4 = null;
        int iG2 = 0;
        int iG3 = 0;
        int iG4 = 0;
        byte[] bArrR = null;
        ArrayList arrayListC = null;
        String strO5 = null;
        byte[] bArrR2 = null;
        int iG5 = 0;
        Bundle bundleQ = null;
        int iG6 = 0;
        boolean zC = false;
        String strO6 = null;
        String strO7 = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    gameEntity = (GameEntity) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, GameEntity.CREATOR);
                    break;
                case 2:
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 3:
                    strO2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 4:
                    jI = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case 5:
                    strO3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 6:
                    jI2 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case 7:
                    strO4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 8:
                    iG2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 10:
                    iG3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case com.google.android.gms.c.MapAttrs_uiZoomGestures /* 11 */:
                    iG4 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case com.google.android.gms.c.MapAttrs_useViewLifecycle /* 12 */:
                    bArrR = com.google.android.gms.common.internal.safeparcel.a.r(parcel, iA);
                    break;
                case com.google.android.gms.c.MapAttrs_zOrderOnTop /* 13 */:
                    arrayListC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, ParticipantEntity.CREATOR);
                    break;
                case 14:
                    strO5 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 15:
                    bArrR2 = com.google.android.gms.common.internal.safeparcel.a.r(parcel, iA);
                    break;
                case 16:
                    iG5 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 17:
                    bundleQ = com.google.android.gms.common.internal.safeparcel.a.q(parcel, iA);
                    break;
                case 18:
                    iG6 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 19:
                    zC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case 20:
                    strO6 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 21:
                    strO7 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
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
        return new TurnBasedMatchEntity(iG, gameEntity, strO, strO2, jI, strO3, jI2, strO4, iG2, iG3, iG4, bArrR, arrayListC, strO5, bArrR2, iG5, bundleQ, iG6, zC, strO6, strO7);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public TurnBasedMatchEntity[] newArray(int i) {
        return new TurnBasedMatchEntity[i];
    }
}
