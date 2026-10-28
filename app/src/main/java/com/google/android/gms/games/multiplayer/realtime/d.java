package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class d implements Parcelable.Creator {
    static void a(RoomEntity roomEntity, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, roomEntity.h_(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, roomEntity.j());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, roomEntity.c(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, roomEntity.d());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, roomEntity.e());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, roomEntity.f(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, roomEntity.g());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, roomEntity.h(), false);
        com.google.android.gms.common.internal.safeparcel.c.b(parcel, 8, roomEntity.l(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, roomEntity.i());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public RoomEntity createFromParcel(Parcel parcel) {
        int iG = 0;
        ArrayList arrayListC = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        long jI = 0;
        Bundle bundleQ = null;
        int iG2 = 0;
        String strO = null;
        int iG3 = 0;
        String strO2 = null;
        String strO3 = null;
        int iG4 = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    strO3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 2:
                    strO2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 3:
                    jI = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case 4:
                    iG3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 5:
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 6:
                    iG2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 7:
                    bundleQ = com.google.android.gms.common.internal.safeparcel.a.q(parcel, iA);
                    break;
                case 8:
                    arrayListC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, ParticipantEntity.CREATOR);
                    break;
                case 9:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 1000:
                    iG4 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new RoomEntity(iG4, strO3, strO2, jI, iG3, strO, iG2, bundleQ, arrayListC, iG);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public RoomEntity[] newArray(int i) {
        return new RoomEntity[i];
    }
}
