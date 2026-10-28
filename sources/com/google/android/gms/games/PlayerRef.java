package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.player.MostRecentGameInfo;
import com.google.android.gms.games.internal.player.MostRecentGameInfoRef;

/* JADX INFO: loaded from: classes.dex */
public final class PlayerRef extends com.google.android.gms.common.data.f implements Player {
    private final com.google.android.gms.games.internal.player.b c;
    private final PlayerLevelInfo d;
    private final MostRecentGameInfoRef e;

    public PlayerRef(DataHolder dataHolder, int i) {
        this(dataHolder, i, null);
    }

    public PlayerRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i);
        this.c = new com.google.android.gms.games.internal.player.b(str);
        this.e = new MostRecentGameInfoRef(dataHolder, i, this.c);
        if (!p()) {
            this.d = null;
            return;
        }
        int iC = c(this.c.k);
        int iC2 = c(this.c.n);
        PlayerLevel playerLevel = new PlayerLevel(iC, b(this.c.l), b(this.c.m));
        this.d = new PlayerLevelInfo(b(this.c.j), b(this.c.p), playerLevel, iC != iC2 ? new PlayerLevel(iC2, b(this.c.m), b(this.c.o)) : playerLevel);
    }

    private boolean p() {
        return (i(this.c.j) || b(this.c.j) == -1) ? false : true;
    }

    @Override // com.google.android.gms.games.Player
    public String b_() {
        return e(this.c.a);
    }

    @Override // com.google.android.gms.games.Player
    public String c() {
        return e(this.c.b);
    }

    @Override // com.google.android.gms.games.Player
    public Uri d() {
        return h(this.c.c);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.Player
    public String e() {
        return e(this.c.d);
    }

    @Override // com.google.android.gms.common.data.f
    public boolean equals(Object obj) {
        return PlayerEntity.a(this, obj);
    }

    @Override // com.google.android.gms.games.Player
    public Uri f() {
        return h(this.c.e);
    }

    @Override // com.google.android.gms.games.Player
    public String g() {
        return e(this.c.f);
    }

    @Override // com.google.android.gms.games.Player
    public long h() {
        return b(this.c.g);
    }

    @Override // com.google.android.gms.common.data.f
    public int hashCode() {
        return PlayerEntity.a(this);
    }

    @Override // com.google.android.gms.games.Player
    public long i() {
        if (!a(this.c.i) || i(this.c.i)) {
            return -1L;
        }
        return b(this.c.i);
    }

    @Override // com.google.android.gms.games.Player
    public int j() {
        return c(this.c.h);
    }

    @Override // com.google.android.gms.games.Player
    public boolean k() {
        return d(this.c.r);
    }

    @Override // com.google.android.gms.games.Player
    public String l() {
        return e(this.c.q);
    }

    @Override // com.google.android.gms.games.Player
    public PlayerLevelInfo m() {
        return this.d;
    }

    @Override // com.google.android.gms.games.Player
    public MostRecentGameInfo n() {
        if (i(this.c.s)) {
            return null;
        }
        return this.e;
    }

    @Override // com.google.android.gms.common.data.d
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Player a() {
        return new PlayerEntity(this);
    }

    public String toString() {
        return PlayerEntity.b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((PlayerEntity) a()).writeToParcel(parcel, i);
    }
}
