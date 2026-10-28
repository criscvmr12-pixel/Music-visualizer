package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.ku;
import com.google.android.gms.internal.ky;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class InvitationEntity extends GamesDowngradeableSafeParcel implements Invitation {
    public static final Parcelable.Creator CREATOR = new a();
    private final int a;
    private final GameEntity b;
    private final String c;
    private final long d;
    private final int e;
    private final ParticipantEntity f;
    private final ArrayList g;
    private final int h;
    private final int i;

    InvitationEntity(int i, GameEntity gameEntity, String str, long j, int i2, ParticipantEntity participantEntity, ArrayList arrayList, int i3, int i4) {
        this.a = i;
        this.b = gameEntity;
        this.c = str;
        this.d = j;
        this.e = i2;
        this.f = participantEntity;
        this.g = arrayList;
        this.h = i3;
        this.i = i4;
    }

    InvitationEntity(Invitation invitation) {
        this.a = 2;
        this.b = new GameEntity(invitation.d());
        this.c = invitation.e();
        this.d = invitation.g();
        this.e = invitation.h();
        this.h = invitation.i();
        this.i = invitation.j();
        String strK = invitation.f().k();
        Participant participant = null;
        ArrayList arrayListL = invitation.l();
        int size = arrayListL.size();
        this.g = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            Participant participant2 = (Participant) arrayListL.get(i);
            if (participant2.k().equals(strK)) {
                participant = participant2;
            }
            this.g.add((ParticipantEntity) participant2.a());
        }
        ky.a(participant, "Must have a valid inviter!");
        this.f = (ParticipantEntity) participant.a();
    }

    static int a(Invitation invitation) {
        return ku.a(invitation.d(), invitation.e(), Long.valueOf(invitation.g()), Integer.valueOf(invitation.h()), invitation.f(), invitation.l(), Integer.valueOf(invitation.i()), Integer.valueOf(invitation.j()));
    }

    static boolean a(Invitation invitation, Object obj) {
        if (!(obj instanceof Invitation)) {
            return false;
        }
        if (invitation == obj) {
            return true;
        }
        Invitation invitation2 = (Invitation) obj;
        return ku.a(invitation2.d(), invitation.d()) && ku.a(invitation2.e(), invitation.e()) && ku.a(Long.valueOf(invitation2.g()), Long.valueOf(invitation.g())) && ku.a(Integer.valueOf(invitation2.h()), Integer.valueOf(invitation.h())) && ku.a(invitation2.f(), invitation.f()) && ku.a(invitation2.l(), invitation.l()) && ku.a(Integer.valueOf(invitation2.i()), Integer.valueOf(invitation.i())) && ku.a(Integer.valueOf(invitation2.j()), Integer.valueOf(invitation.j()));
    }

    static String b(Invitation invitation) {
        return ku.a(invitation).a("Game", invitation.d()).a("InvitationId", invitation.e()).a("CreationTimestamp", Long.valueOf(invitation.g())).a("InvitationType", Integer.valueOf(invitation.h())).a("Inviter", invitation.f()).a("Participants", invitation.l()).a("Variant", Integer.valueOf(invitation.i())).a("AvailableAutoMatchSlots", Integer.valueOf(invitation.j())).toString();
    }

    public int b() {
        return this.a;
    }

    @Override // com.google.android.gms.common.data.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Invitation a() {
        return this;
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    public Game d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        return a(this, obj);
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    public Participant f() {
        return this.f;
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    public long g() {
        return this.d;
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    public int h() {
        return this.e;
    }

    public int hashCode() {
        return a(this);
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    public int i() {
        return this.h;
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    public int j() {
        return this.i;
    }

    @Override // com.google.android.gms.games.multiplayer.f
    public ArrayList l() {
        return new ArrayList(this.g);
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
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
        parcel.writeInt(this.e);
        this.f.writeToParcel(parcel, i);
        int size = this.g.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            ((ParticipantEntity) this.g.get(i2)).writeToParcel(parcel, i);
        }
    }
}
