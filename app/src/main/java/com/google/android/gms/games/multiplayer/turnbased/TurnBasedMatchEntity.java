package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.internal.ku;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class TurnBasedMatchEntity implements SafeParcelable, TurnBasedMatch {
    public static final b CREATOR = new b();
    private final int b;
    private final GameEntity c;
    private final String d;
    private final String e;
    private final long f;
    private final String g;
    private final long h;
    private final String i;
    private final int j;
    private final int k;
    private final int l;
    private final byte[] m;
    private final ArrayList n;
    private final String o;
    private final byte[] p;
    private final int q;
    private final Bundle r;
    private final int s;
    private final boolean t;
    private final String u;
    private final String v;

    TurnBasedMatchEntity(int i, GameEntity gameEntity, String str, String str2, long j, String str3, long j2, String str4, int i2, int i3, int i4, byte[] bArr, ArrayList arrayList, String str5, byte[] bArr2, int i5, Bundle bundle, int i6, boolean z, String str6, String str7) {
        this.b = i;
        this.c = gameEntity;
        this.d = str;
        this.e = str2;
        this.f = j;
        this.g = str3;
        this.h = j2;
        this.i = str4;
        this.j = i2;
        this.s = i6;
        this.k = i3;
        this.l = i4;
        this.m = bArr;
        this.n = arrayList;
        this.o = str5;
        this.p = bArr2;
        this.q = i5;
        this.r = bundle;
        this.t = z;
        this.u = str6;
        this.v = str7;
    }

    public TurnBasedMatchEntity(TurnBasedMatch turnBasedMatch) {
        this.b = 2;
        this.c = new GameEntity(turnBasedMatch.i_());
        this.d = turnBasedMatch.c();
        this.e = turnBasedMatch.d();
        this.f = turnBasedMatch.e();
        this.g = turnBasedMatch.j();
        this.h = turnBasedMatch.k();
        this.i = turnBasedMatch.m();
        this.j = turnBasedMatch.f();
        this.s = turnBasedMatch.g();
        this.k = turnBasedMatch.i();
        this.l = turnBasedMatch.o();
        this.o = turnBasedMatch.p();
        this.q = turnBasedMatch.r();
        this.r = turnBasedMatch.s();
        this.t = turnBasedMatch.u();
        this.u = turnBasedMatch.h();
        this.v = turnBasedMatch.v();
        byte[] bArrN = turnBasedMatch.n();
        if (bArrN == null) {
            this.m = null;
        } else {
            this.m = new byte[bArrN.length];
            System.arraycopy(bArrN, 0, this.m, 0, bArrN.length);
        }
        byte[] bArrQ = turnBasedMatch.q();
        if (bArrQ == null) {
            this.p = null;
        } else {
            this.p = new byte[bArrQ.length];
            System.arraycopy(bArrQ, 0, this.p, 0, bArrQ.length);
        }
        ArrayList arrayListL = turnBasedMatch.l();
        int size = arrayListL.size();
        this.n = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            this.n.add((ParticipantEntity) ((Participant) arrayListL.get(i)).a());
        }
    }

    static int a(TurnBasedMatch turnBasedMatch) {
        return ku.a(turnBasedMatch.i_(), turnBasedMatch.c(), turnBasedMatch.d(), Long.valueOf(turnBasedMatch.e()), turnBasedMatch.j(), Long.valueOf(turnBasedMatch.k()), turnBasedMatch.m(), Integer.valueOf(turnBasedMatch.f()), Integer.valueOf(turnBasedMatch.g()), turnBasedMatch.h(), Integer.valueOf(turnBasedMatch.i()), Integer.valueOf(turnBasedMatch.o()), turnBasedMatch.l(), turnBasedMatch.p(), Integer.valueOf(turnBasedMatch.r()), turnBasedMatch.s(), Integer.valueOf(turnBasedMatch.t()), Boolean.valueOf(turnBasedMatch.u()));
    }

    static boolean a(TurnBasedMatch turnBasedMatch, Object obj) {
        if (!(obj instanceof TurnBasedMatch)) {
            return false;
        }
        if (turnBasedMatch == obj) {
            return true;
        }
        TurnBasedMatch turnBasedMatch2 = (TurnBasedMatch) obj;
        return ku.a(turnBasedMatch2.i_(), turnBasedMatch.i_()) && ku.a(turnBasedMatch2.c(), turnBasedMatch.c()) && ku.a(turnBasedMatch2.d(), turnBasedMatch.d()) && ku.a(Long.valueOf(turnBasedMatch2.e()), Long.valueOf(turnBasedMatch.e())) && ku.a(turnBasedMatch2.j(), turnBasedMatch.j()) && ku.a(Long.valueOf(turnBasedMatch2.k()), Long.valueOf(turnBasedMatch.k())) && ku.a(turnBasedMatch2.m(), turnBasedMatch.m()) && ku.a(Integer.valueOf(turnBasedMatch2.f()), Integer.valueOf(turnBasedMatch.f())) && ku.a(Integer.valueOf(turnBasedMatch2.g()), Integer.valueOf(turnBasedMatch.g())) && ku.a(turnBasedMatch2.h(), turnBasedMatch.h()) && ku.a(Integer.valueOf(turnBasedMatch2.i()), Integer.valueOf(turnBasedMatch.i())) && ku.a(Integer.valueOf(turnBasedMatch2.o()), Integer.valueOf(turnBasedMatch.o())) && ku.a(turnBasedMatch2.l(), turnBasedMatch.l()) && ku.a(turnBasedMatch2.p(), turnBasedMatch.p()) && ku.a(Integer.valueOf(turnBasedMatch2.r()), Integer.valueOf(turnBasedMatch.r())) && ku.a(turnBasedMatch2.s(), turnBasedMatch.s()) && ku.a(Integer.valueOf(turnBasedMatch2.t()), Integer.valueOf(turnBasedMatch.t())) && ku.a(Boolean.valueOf(turnBasedMatch2.u()), Boolean.valueOf(turnBasedMatch.u()));
    }

    static String b(TurnBasedMatch turnBasedMatch) {
        return ku.a(turnBasedMatch).a("Game", turnBasedMatch.i_()).a("MatchId", turnBasedMatch.c()).a("CreatorId", turnBasedMatch.d()).a("CreationTimestamp", Long.valueOf(turnBasedMatch.e())).a("LastUpdaterId", turnBasedMatch.j()).a("LastUpdatedTimestamp", Long.valueOf(turnBasedMatch.k())).a("PendingParticipantId", turnBasedMatch.m()).a("MatchStatus", Integer.valueOf(turnBasedMatch.f())).a("TurnStatus", Integer.valueOf(turnBasedMatch.g())).a("Description", turnBasedMatch.h()).a("Variant", Integer.valueOf(turnBasedMatch.i())).a("Data", turnBasedMatch.n()).a("Version", Integer.valueOf(turnBasedMatch.o())).a("Participants", turnBasedMatch.l()).a("RematchId", turnBasedMatch.p()).a("PreviousData", turnBasedMatch.q()).a("MatchNumber", Integer.valueOf(turnBasedMatch.r())).a("AutoMatchCriteria", turnBasedMatch.s()).a("AvailableAutoMatchSlots", Integer.valueOf(turnBasedMatch.t())).a("LocallyModified", Boolean.valueOf(turnBasedMatch.u())).a("DescriptionParticipantId", turnBasedMatch.v()).toString();
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public String c() {
        return this.d;
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public String d() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public long e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        return a(this, obj);
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public int f() {
        return this.j;
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public int g() {
        return this.s;
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public String h() {
        return this.u;
    }

    public int hashCode() {
        return a(this);
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public int i() {
        return this.k;
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public Game i_() {
        return this.c;
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public String j() {
        return this.g;
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public long k() {
        return this.h;
    }

    @Override // com.google.android.gms.games.multiplayer.f
    public ArrayList l() {
        return new ArrayList(this.n);
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public String m() {
        return this.i;
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public byte[] n() {
        return this.m;
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public int o() {
        return this.l;
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public String p() {
        return this.o;
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public byte[] q() {
        return this.p;
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public int r() {
        return this.q;
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public Bundle s() {
        return this.r;
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public int t() {
        if (this.r == null) {
            return 0;
        }
        return this.r.getInt("max_automatch_players");
    }

    public String toString() {
        return b(this);
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public boolean u() {
        return this.t;
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public String v() {
        return this.v;
    }

    public int w() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        b.a(this, parcel, i);
    }

    @Override // com.google.android.gms.common.data.d
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public TurnBasedMatch a() {
        return this;
    }
}
