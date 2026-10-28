package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b implements Parcelable.Creator {
    static void a(InvitationEntity invitationEntity, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, (Parcelable) invitationEntity.d(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, invitationEntity.b());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, invitationEntity.e(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, invitationEntity.g());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, invitationEntity.h());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, (Parcelable) invitationEntity.f(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.b(parcel, 6, invitationEntity.l(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, invitationEntity.i());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, invitationEntity.j());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InvitationEntity createFromParcel(Parcel parcel) {
        ArrayList arrayListC = null;
        int iG = 0;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        long jI = 0;
        int iG2 = 0;
        ParticipantEntity participantEntity = null;
        int iG3 = 0;
        String strO = null;
        GameEntity gameEntity = null;
        int iG4 = 0;
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
                    jI = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case 4:
                    iG3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 5:
                    participantEntity = (ParticipantEntity) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, ParticipantEntity.CREATOR);
                    break;
                case 6:
                    arrayListC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, ParticipantEntity.CREATOR);
                    break;
                case 7:
                    iG2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 8:
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
        return new InvitationEntity(iG4, gameEntity, strO, jI, iG3, participantEntity, arrayListC, iG2, iG);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InvitationEntity[] newArray(int i) {
        return new InvitationEntity[i];
    }
}
