package com.google.android.gms.games.internal.game;

import android.os.Parcel;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;
import com.google.android.gms.internal.ku;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ExtendedGameEntity extends GamesDowngradeableSafeParcel implements ExtendedGame {
    public static final b CREATOR = new a();
    private final int a;
    private final GameEntity b;
    private final int c;
    private final boolean d;
    private final int e;
    private final long f;
    private final long g;
    private final String h;
    private final long i;
    private final String j;
    private final ArrayList k;
    private final SnapshotMetadataEntity l;

    ExtendedGameEntity(int i, GameEntity gameEntity, int i2, boolean z, int i3, long j, long j2, String str, long j3, String str2, ArrayList arrayList, SnapshotMetadataEntity snapshotMetadataEntity) {
        this.a = i;
        this.b = gameEntity;
        this.c = i2;
        this.d = z;
        this.e = i3;
        this.f = j;
        this.g = j2;
        this.h = str;
        this.i = j3;
        this.j = str2;
        this.k = arrayList;
        this.l = snapshotMetadataEntity;
    }

    public ExtendedGameEntity(ExtendedGame extendedGame) {
        this.a = 2;
        Game gameD_ = extendedGame.d_();
        this.b = gameD_ == null ? null : new GameEntity(gameD_);
        this.c = extendedGame.d();
        this.d = extendedGame.e();
        this.e = extendedGame.f();
        this.f = extendedGame.g();
        this.g = extendedGame.h();
        this.h = extendedGame.i();
        this.i = extendedGame.j();
        this.j = extendedGame.k();
        SnapshotMetadata snapshotMetadataL = extendedGame.l();
        this.l = snapshotMetadataL != null ? new SnapshotMetadataEntity(snapshotMetadataL) : null;
        ArrayList arrayListC = extendedGame.c();
        int size = arrayListC.size();
        this.k = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            this.k.add((GameBadgeEntity) ((GameBadge) arrayListC.get(i)).a());
        }
    }

    static int a(ExtendedGame extendedGame) {
        return ku.a(extendedGame.d_(), Integer.valueOf(extendedGame.d()), Boolean.valueOf(extendedGame.e()), Integer.valueOf(extendedGame.f()), Long.valueOf(extendedGame.g()), Long.valueOf(extendedGame.h()), extendedGame.i(), Long.valueOf(extendedGame.j()), extendedGame.k());
    }

    static boolean a(ExtendedGame extendedGame, Object obj) {
        if (!(obj instanceof ExtendedGame)) {
            return false;
        }
        if (extendedGame == obj) {
            return true;
        }
        ExtendedGame extendedGame2 = (ExtendedGame) obj;
        return ku.a(extendedGame2.d_(), extendedGame.d_()) && ku.a(Integer.valueOf(extendedGame2.d()), Integer.valueOf(extendedGame.d())) && ku.a(Boolean.valueOf(extendedGame2.e()), Boolean.valueOf(extendedGame.e())) && ku.a(Integer.valueOf(extendedGame2.f()), Integer.valueOf(extendedGame.f())) && ku.a(Long.valueOf(extendedGame2.g()), Long.valueOf(extendedGame.g())) && ku.a(Long.valueOf(extendedGame2.h()), Long.valueOf(extendedGame.h())) && ku.a(extendedGame2.i(), extendedGame.i()) && ku.a(Long.valueOf(extendedGame2.j()), Long.valueOf(extendedGame.j())) && ku.a(extendedGame2.k(), extendedGame.k());
    }

    static String b(ExtendedGame extendedGame) {
        return ku.a(extendedGame).a("Game", extendedGame.d_()).a("Availability", Integer.valueOf(extendedGame.d())).a("Owned", Boolean.valueOf(extendedGame.e())).a("AchievementUnlockedCount", Integer.valueOf(extendedGame.f())).a("LastPlayedServerTimestamp", Long.valueOf(extendedGame.g())).a("PriceMicros", Long.valueOf(extendedGame.h())).a("FormattedPrice", extendedGame.i()).a("FullPriceMicros", Long.valueOf(extendedGame.j())).a("FormattedFullPrice", extendedGame.k()).a("Snapshot", extendedGame.l()).toString();
    }

    @Override // com.google.android.gms.games.internal.game.ExtendedGame
    public ArrayList c() {
        return new ArrayList(this.k);
    }

    @Override // com.google.android.gms.games.internal.game.ExtendedGame
    public int d() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.internal.game.ExtendedGame
    public boolean e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        return a(this, obj);
    }

    @Override // com.google.android.gms.games.internal.game.ExtendedGame
    public int f() {
        return this.e;
    }

    @Override // com.google.android.gms.games.internal.game.ExtendedGame
    public long g() {
        return this.f;
    }

    @Override // com.google.android.gms.games.internal.game.ExtendedGame
    public long h() {
        return this.g;
    }

    public int hashCode() {
        return a(this);
    }

    @Override // com.google.android.gms.games.internal.game.ExtendedGame
    public String i() {
        return this.h;
    }

    @Override // com.google.android.gms.games.internal.game.ExtendedGame
    public long j() {
        return this.i;
    }

    @Override // com.google.android.gms.games.internal.game.ExtendedGame
    public String k() {
        return this.j;
    }

    @Override // com.google.android.gms.games.internal.game.ExtendedGame
    public SnapshotMetadata l() {
        return this.l;
    }

    public int m() {
        return this.a;
    }

    @Override // com.google.android.gms.games.internal.game.ExtendedGame
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public GameEntity d_() {
        return this.b;
    }

    @Override // com.google.android.gms.common.data.d
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public ExtendedGame a() {
        return this;
    }

    public String toString() {
        return b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (!D()) {
            b.a(this, parcel, i);
            return;
        }
        this.b.writeToParcel(parcel, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e);
        parcel.writeLong(this.f);
        parcel.writeLong(this.g);
        parcel.writeString(this.h);
        parcel.writeLong(this.i);
        parcel.writeString(this.j);
        int size = this.k.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            ((GameBadgeEntity) this.k.get(i2)).writeToParcel(parcel, i);
        }
    }
}
