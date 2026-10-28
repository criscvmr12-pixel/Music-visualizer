package com.google.android.gms.games.internal.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.games.request.GameRequestEntity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class a implements Parcelable.Creator {
    static void a(GameRequestCluster gameRequestCluster, Parcel parcel, int i) {
        int iA = c.a(parcel);
        c.b(parcel, 1, gameRequestCluster.c(), false);
        c.a(parcel, 1000, gameRequestCluster.b());
        c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public GameRequestCluster createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iG = 0;
        ArrayList arrayListC = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    arrayListC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, GameRequestEntity.CREATOR);
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
        return new GameRequestCluster(iG, arrayListC);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public GameRequestCluster[] newArray(int i) {
        return new GameRequestCluster[i];
    }
}
