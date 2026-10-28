package com.google.android.gms.games.internal.game;

import android.os.Parcel;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class a extends b {
    a() {
    }

    @Override // com.google.android.gms.games.internal.game.b, android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a */
    public ExtendedGameEntity createFromParcel(Parcel parcel) {
        if (ExtendedGameEntity.b(ExtendedGameEntity.C()) || ExtendedGameEntity.b(ExtendedGameEntity.class.getCanonicalName())) {
            return super.createFromParcel(parcel);
        }
        GameEntity gameEntity = (GameEntity) GameEntity.CREATOR.createFromParcel(parcel);
        int i = parcel.readInt();
        boolean z = parcel.readInt() == 1;
        int i2 = parcel.readInt();
        long j = parcel.readLong();
        long j2 = parcel.readLong();
        String string = parcel.readString();
        long j3 = parcel.readLong();
        String string2 = parcel.readString();
        int i3 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            arrayList.add(GameBadgeEntity.CREATOR.createFromParcel(parcel));
        }
        return new ExtendedGameEntity(2, gameEntity, i, z, i2, j, j2, string, j3, string2, arrayList, null);
    }
}
