package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.internal.player.MostRecentGameInfo;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;
import com.google.android.gms.internal.jo;
import com.google.android.gms.internal.ku;

/* JADX INFO: loaded from: classes.dex */
public final class PlayerEntity extends GamesDowngradeableSafeParcel implements Player {
    public static final Parcelable.Creator CREATOR = new c();
    private final int a;
    private final String b;
    private final String c;
    private final Uri d;
    private final Uri e;
    private final long f;
    private final int g;
    private final long h;
    private final String i;
    private final String j;
    private final String k;
    private final MostRecentGameInfoEntity l;
    private final PlayerLevelInfo m;
    private final boolean n;

    PlayerEntity(int i, String str, String str2, Uri uri, Uri uri2, long j, int i2, long j2, String str3, String str4, String str5, MostRecentGameInfoEntity mostRecentGameInfoEntity, PlayerLevelInfo playerLevelInfo, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = uri;
        this.i = str3;
        this.e = uri2;
        this.j = str4;
        this.f = j;
        this.g = i2;
        this.h = j2;
        this.k = str5;
        this.n = z;
        this.l = mostRecentGameInfoEntity;
        this.m = playerLevelInfo;
    }

    public PlayerEntity(Player player) {
        this.a = 10;
        this.b = player.b_();
        this.c = player.c();
        this.d = player.d();
        this.i = player.e();
        this.e = player.f();
        this.j = player.g();
        this.f = player.h();
        this.g = player.j();
        this.h = player.i();
        this.k = player.l();
        this.n = player.k();
        MostRecentGameInfo mostRecentGameInfoN = player.n();
        this.l = mostRecentGameInfoN == null ? null : new MostRecentGameInfoEntity(mostRecentGameInfoN);
        this.m = player.m();
        jo.a((Object) this.b);
        jo.a((Object) this.c);
        jo.a(this.f > 0);
    }

    static int a(Player player) {
        return ku.a(player.b_(), player.c(), player.d(), player.f(), Long.valueOf(player.h()), player.l(), player.m());
    }

    static boolean a(Player player, Object obj) {
        if (!(obj instanceof Player)) {
            return false;
        }
        if (player == obj) {
            return true;
        }
        Player player2 = (Player) obj;
        return ku.a(player2.b_(), player.b_()) && ku.a(player2.c(), player.c()) && ku.a(player2.d(), player.d()) && ku.a(player2.f(), player.f()) && ku.a(Long.valueOf(player2.h()), Long.valueOf(player.h())) && ku.a(player2.l(), player.l()) && ku.a(player2.m(), player.m());
    }

    static String b(Player player) {
        return ku.a(player).a("PlayerId", player.b_()).a("DisplayName", player.c()).a("IconImageUri", player.d()).a("IconImageUrl", player.e()).a("HiResImageUri", player.f()).a("HiResImageUrl", player.g()).a("RetrievedTimestamp", Long.valueOf(player.h())).a("Title", player.l()).a("LevelInfo", player.m()).toString();
    }

    @Override // com.google.android.gms.games.Player
    public String b_() {
        return this.b;
    }

    @Override // com.google.android.gms.games.Player
    public String c() {
        return this.c;
    }

    @Override // com.google.android.gms.games.Player
    public Uri d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.Player
    public String e() {
        return this.i;
    }

    public boolean equals(Object obj) {
        return a(this, obj);
    }

    @Override // com.google.android.gms.games.Player
    public Uri f() {
        return this.e;
    }

    @Override // com.google.android.gms.games.Player
    public String g() {
        return this.j;
    }

    @Override // com.google.android.gms.games.Player
    public long h() {
        return this.f;
    }

    public int hashCode() {
        return a(this);
    }

    @Override // com.google.android.gms.games.Player
    public long i() {
        return this.h;
    }

    @Override // com.google.android.gms.games.Player
    public int j() {
        return this.g;
    }

    @Override // com.google.android.gms.games.Player
    public boolean k() {
        return this.n;
    }

    @Override // com.google.android.gms.games.Player
    public String l() {
        return this.k;
    }

    @Override // com.google.android.gms.games.Player
    public PlayerLevelInfo m() {
        return this.m;
    }

    @Override // com.google.android.gms.games.Player
    public MostRecentGameInfo n() {
        return this.l;
    }

    public int o() {
        return this.a;
    }

    @Override // com.google.android.gms.common.data.d
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Player a() {
        return this;
    }

    public String toString() {
        return b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (!D()) {
            d.a(this, parcel, i);
            return;
        }
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d == null ? null : this.d.toString());
        parcel.writeString(this.e != null ? this.e.toString() : null);
        parcel.writeLong(this.f);
    }
}
