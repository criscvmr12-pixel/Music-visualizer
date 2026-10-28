package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.ku;

/* JADX INFO: loaded from: classes.dex */
public final class ParticipantEntity extends GamesDowngradeableSafeParcel implements Participant {
    public static final Parcelable.Creator CREATOR = new c();
    private final int a;
    private final String b;
    private final String c;
    private final Uri d;
    private final Uri e;
    private final int f;
    private final String g;
    private final boolean h;
    private final PlayerEntity i;
    private final int j;
    private final ParticipantResult k;
    private final String l;
    private final String m;

    ParticipantEntity(int i, String str, String str2, Uri uri, Uri uri2, int i2, String str3, boolean z, PlayerEntity playerEntity, int i3, ParticipantResult participantResult, String str4, String str5) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = uri;
        this.e = uri2;
        this.f = i2;
        this.g = str3;
        this.h = z;
        this.i = playerEntity;
        this.j = i3;
        this.k = participantResult;
        this.l = str4;
        this.m = str5;
    }

    public ParticipantEntity(Participant participant) {
        this.a = 3;
        this.b = participant.k();
        this.c = participant.f();
        this.d = participant.g();
        this.e = participant.i();
        this.f = participant.g_();
        this.g = participant.c();
        this.h = participant.e();
        Player playerL = participant.l();
        this.i = playerL == null ? null : new PlayerEntity(playerL);
        this.j = participant.d();
        this.k = participant.m();
        this.l = participant.h();
        this.m = participant.j();
    }

    static int a(Participant participant) {
        return ku.a(participant.l(), Integer.valueOf(participant.g_()), participant.c(), Boolean.valueOf(participant.e()), participant.f(), participant.g(), participant.i(), Integer.valueOf(participant.d()), participant.m(), participant.k());
    }

    static boolean a(Participant participant, Object obj) {
        if (!(obj instanceof Participant)) {
            return false;
        }
        if (participant == obj) {
            return true;
        }
        Participant participant2 = (Participant) obj;
        return ku.a(participant2.l(), participant.l()) && ku.a(Integer.valueOf(participant2.g_()), Integer.valueOf(participant.g_())) && ku.a(participant2.c(), participant.c()) && ku.a(Boolean.valueOf(participant2.e()), Boolean.valueOf(participant.e())) && ku.a(participant2.f(), participant.f()) && ku.a(participant2.g(), participant.g()) && ku.a(participant2.i(), participant.i()) && ku.a(Integer.valueOf(participant2.d()), Integer.valueOf(participant.d())) && ku.a(participant2.m(), participant.m()) && ku.a(participant2.k(), participant.k());
    }

    static String b(Participant participant) {
        return ku.a(participant).a("ParticipantId", participant.k()).a("Player", participant.l()).a("Status", Integer.valueOf(participant.g_())).a("ClientAddress", participant.c()).a("ConnectedToRoom", Boolean.valueOf(participant.e())).a("DisplayName", participant.f()).a("IconImage", participant.g()).a("IconImageUrl", participant.h()).a("HiResImage", participant.i()).a("HiResImageUrl", participant.j()).a("Capabilities", Integer.valueOf(participant.d())).a("Result", participant.m()).toString();
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    public String c() {
        return this.g;
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    public int d() {
        return this.j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    public boolean e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        return a(this, obj);
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    public String f() {
        return this.i == null ? this.c : this.i.c();
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    public Uri g() {
        return this.i == null ? this.d : this.i.d();
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    public int g_() {
        return this.f;
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    public String h() {
        return this.i == null ? this.l : this.i.e();
    }

    public int hashCode() {
        return a(this);
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    public Uri i() {
        return this.i == null ? this.e : this.i.f();
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    public String j() {
        return this.i == null ? this.m : this.i.g();
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    public String k() {
        return this.b;
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    public Player l() {
        return this.i;
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    public ParticipantResult m() {
        return this.k;
    }

    public int n() {
        return this.a;
    }

    @Override // com.google.android.gms.common.data.d
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Participant a() {
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
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i != null ? 1 : 0);
        if (this.i != null) {
            this.i.writeToParcel(parcel, i);
        }
    }
}
