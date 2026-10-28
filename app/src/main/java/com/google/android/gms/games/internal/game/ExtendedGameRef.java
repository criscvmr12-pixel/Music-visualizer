package com.google.android.gms.games.internal.game;

import android.os.Parcel;
import com.google.android.gms.common.data.f;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataRef;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ExtendedGameRef extends f implements ExtendedGame {
    private final GameRef c;
    private final SnapshotMetadataRef d;
    private final int e;

    @Override // com.google.android.gms.games.internal.game.ExtendedGame
    public ArrayList c() {
        if (this.a.c("badge_title", this.b, this.a.a(this.b)) == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(this.e);
        for (int i = 0; i < this.e; i++) {
            arrayList.add(new GameBadgeRef(this.a, this.b + i));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.games.internal.game.ExtendedGame
    public int d() {
        return c("availability");
    }

    @Override // com.google.android.gms.games.internal.game.ExtendedGame
    public Game d_() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.internal.game.ExtendedGame
    public boolean e() {
        return d("owned");
    }

    @Override // com.google.android.gms.common.data.f
    public boolean equals(Object obj) {
        return ExtendedGameEntity.a(this, obj);
    }

    @Override // com.google.android.gms.games.internal.game.ExtendedGame
    public int f() {
        return c("achievement_unlocked_count");
    }

    @Override // com.google.android.gms.games.internal.game.ExtendedGame
    public long g() {
        return b("last_played_server_time");
    }

    @Override // com.google.android.gms.games.internal.game.ExtendedGame
    public long h() {
        return b("price_micros");
    }

    @Override // com.google.android.gms.common.data.f
    public int hashCode() {
        return ExtendedGameEntity.a(this);
    }

    @Override // com.google.android.gms.games.internal.game.ExtendedGame
    public String i() {
        return e("formatted_price");
    }

    @Override // com.google.android.gms.games.internal.game.ExtendedGame
    public long j() {
        return b("full_price_micros");
    }

    @Override // com.google.android.gms.games.internal.game.ExtendedGame
    public String k() {
        return e("formatted_full_price");
    }

    @Override // com.google.android.gms.games.internal.game.ExtendedGame
    public SnapshotMetadata l() {
        return this.d;
    }

    @Override // com.google.android.gms.common.data.d
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public ExtendedGame a() {
        return new ExtendedGameEntity(this);
    }

    public String toString() {
        return ExtendedGameEntity.b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((ExtendedGameEntity) a()).writeToParcel(parcel, i);
    }
}
