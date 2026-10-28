package com.google.android.gms.games.event;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.games.PlayerEntity;

/* JADX INFO: loaded from: classes.dex */
public class a implements Parcelable.Creator {
    static void a(EventEntity eventEntity, Parcel parcel, int i) {
        int iA = c.a(parcel);
        c.a(parcel, 1, eventEntity.c_(), false);
        c.a(parcel, 1000, eventEntity.k());
        c.a(parcel, 2, eventEntity.c(), false);
        c.a(parcel, 3, eventEntity.d(), false);
        c.a(parcel, 4, (Parcelable) eventEntity.e(), i, false);
        c.a(parcel, 5, eventEntity.f(), false);
        c.a(parcel, 6, (Parcelable) eventEntity.g(), i, false);
        c.a(parcel, 7, eventEntity.h());
        c.a(parcel, 8, eventEntity.i(), false);
        c.a(parcel, 9, eventEntity.j());
        c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public EventEntity createFromParcel(Parcel parcel) {
        boolean zC = false;
        String strO = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        long jI = 0;
        PlayerEntity playerEntity = null;
        String strO2 = null;
        Uri uri = null;
        String strO3 = null;
        String strO4 = null;
        String strO5 = null;
        int iG = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    strO5 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 2:
                    strO4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 3:
                    strO3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 4:
                    uri = (Uri) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, Uri.CREATOR);
                    break;
                case 5:
                    strO2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 6:
                    playerEntity = (PlayerEntity) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, PlayerEntity.CREATOR);
                    break;
                case 7:
                    jI = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case 8:
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 9:
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
            throw new b("Overread allowed size end=" + iB, parcel);
        }
        return new EventEntity(iG, strO5, strO4, strO3, uri, strO2, playerEntity, jI, strO, zC);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public EventEntity[] newArray(int i) {
        return new EventEntity[i];
    }
}
