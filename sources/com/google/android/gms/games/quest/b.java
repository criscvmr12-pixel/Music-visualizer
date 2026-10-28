package com.google.android.gms.games.quest;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b implements Parcelable.Creator {
    static void a(QuestEntity questEntity, Parcel parcel, int i) {
        int iA = c.a(parcel);
        c.a(parcel, 1, (Parcelable) questEntity.j(), i, false);
        c.a(parcel, 2, questEntity.k_(), false);
        c.a(parcel, 3, questEntity.m());
        c.a(parcel, 4, (Parcelable) questEntity.e(), i, false);
        c.a(parcel, 5, questEntity.f(), false);
        c.a(parcel, 6, questEntity.d(), false);
        c.a(parcel, 7, questEntity.n());
        c.a(parcel, 8, questEntity.o());
        c.a(parcel, 9, (Parcelable) questEntity.g(), i, false);
        c.a(parcel, 10, questEntity.h(), false);
        c.a(parcel, 12, questEntity.c(), false);
        c.a(parcel, 13, questEntity.p());
        c.a(parcel, 14, questEntity.q());
        c.a(parcel, 15, questEntity.k());
        c.b(parcel, 17, questEntity.i(), false);
        c.a(parcel, 16, questEntity.l());
        c.a(parcel, 1000, questEntity.r());
        c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public QuestEntity createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iG = 0;
        GameEntity gameEntity = null;
        String strO = null;
        long jI = 0;
        Uri uri = null;
        String strO2 = null;
        String strO3 = null;
        long jI2 = 0;
        long jI3 = 0;
        Uri uri2 = null;
        String strO4 = null;
        String strO5 = null;
        long jI4 = 0;
        long jI5 = 0;
        int iG2 = 0;
        int iG3 = 0;
        ArrayList arrayListC = null;
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
                    uri = (Uri) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, Uri.CREATOR);
                    break;
                case 5:
                    strO2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 6:
                    strO3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 7:
                    jI2 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case 8:
                    jI3 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case 9:
                    uri2 = (Uri) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, Uri.CREATOR);
                    break;
                case 10:
                    strO4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case com.google.android.gms.c.MapAttrs_useViewLifecycle /* 12 */:
                    strO5 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case com.google.android.gms.c.MapAttrs_zOrderOnTop /* 13 */:
                    jI4 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case 14:
                    jI5 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case 15:
                    iG2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 16:
                    iG3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 17:
                    arrayListC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, MilestoneEntity.CREATOR);
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
        return new QuestEntity(iG, gameEntity, strO, jI, uri, strO2, strO3, jI2, jI3, uri2, strO4, strO5, jI4, jI5, iG2, iG3, arrayListC);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public QuestEntity[] newArray(int i) {
        return new QuestEntity[i];
    }
}
