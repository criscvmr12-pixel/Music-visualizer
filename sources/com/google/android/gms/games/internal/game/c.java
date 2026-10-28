package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
final class c extends d {
    c() {
    }

    @Override // com.google.android.gms.games.internal.game.d, android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a */
    public GameBadgeEntity createFromParcel(Parcel parcel) {
        if (GameBadgeEntity.b(GameBadgeEntity.C()) || GameBadgeEntity.b(GameBadgeEntity.class.getCanonicalName())) {
            return super.createFromParcel(parcel);
        }
        int i = parcel.readInt();
        String string = parcel.readString();
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        return new GameBadgeEntity(1, i, string, string2, string3 == null ? null : Uri.parse(string3));
    }
}
