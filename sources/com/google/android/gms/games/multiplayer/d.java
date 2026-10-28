package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.PlayerEntity;

/* JADX INFO: loaded from: classes.dex */
public class d implements Parcelable.Creator {
    static void a(ParticipantEntity participantEntity, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, participantEntity.k(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, participantEntity.n());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, participantEntity.f(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, (Parcelable) participantEntity.g(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, (Parcelable) participantEntity.i(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, participantEntity.g_());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, participantEntity.c(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, participantEntity.e());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, (Parcelable) participantEntity.l(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, participantEntity.d());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 10, (Parcelable) participantEntity.m(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 11, participantEntity.h(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 12, participantEntity.j(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ParticipantEntity createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iG = 0;
        String strO = null;
        String strO2 = null;
        Uri uri = null;
        Uri uri2 = null;
        int iG2 = 0;
        String strO3 = null;
        boolean zC = false;
        PlayerEntity playerEntity = null;
        int iG3 = 0;
        ParticipantResult participantResult = null;
        String strO4 = null;
        String strO5 = null;
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
                    iG2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 6:
                    strO3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 7:
                    zC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case 8:
                    playerEntity = (PlayerEntity) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, PlayerEntity.CREATOR);
                    break;
                case 9:
                    iG3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 10:
                    participantResult = (ParticipantResult) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, ParticipantResult.CREATOR);
                    break;
                case com.google.android.gms.c.MapAttrs_uiZoomGestures /* 11 */:
                    strO4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
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
        return new ParticipantEntity(iG, strO, strO2, uri, uri2, iG2, strO3, zC, playerEntity, iG3, participantResult, strO4, strO5);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ParticipantEntity[] newArray(int i) {
        return new ParticipantEntity[i];
    }
}
