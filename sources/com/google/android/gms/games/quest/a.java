package com.google.android.gms.games.quest;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;

/* JADX INFO: loaded from: classes.dex */
public class a implements Parcelable.Creator {
    static void a(MilestoneEntity milestoneEntity, Parcel parcel, int i) {
        int iA = c.a(parcel);
        c.a(parcel, 1, milestoneEntity.j_(), false);
        c.a(parcel, 1000, milestoneEntity.h());
        c.a(parcel, 2, milestoneEntity.c());
        c.a(parcel, 3, milestoneEntity.f());
        c.a(parcel, 4, milestoneEntity.g(), false);
        c.a(parcel, 5, milestoneEntity.e());
        c.a(parcel, 6, milestoneEntity.d(), false);
        c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public MilestoneEntity createFromParcel(Parcel parcel) {
        long jI = 0;
        int iG = 0;
        String strO = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        byte[] bArrR = null;
        long jI2 = 0;
        String strO2 = null;
        int iG2 = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    strO2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 2:
                    jI2 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case 3:
                    jI = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case 4:
                    bArrR = com.google.android.gms.common.internal.safeparcel.a.r(parcel, iA);
                    break;
                case 5:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 6:
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 1000:
                    iG2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new MilestoneEntity(iG2, strO2, jI2, jI, bArrR, iG, strO);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public MilestoneEntity[] newArray(int i) {
        return new MilestoneEntity[i];
    }
}
