package com.google.android.gms.games.internal.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.InvitationEntity;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.internal.jo;
import com.google.android.gms.internal.ku;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ZInvitationCluster implements SafeParcelable, Invitation {
    public static final a CREATOR = new a();
    private final int a;
    private final ArrayList b;

    ZInvitationCluster(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
        m();
    }

    private void m() {
        jo.a(!this.b.isEmpty());
        Invitation invitation = (Invitation) this.b.get(0);
        int size = this.b.size();
        for (int i = 1; i < size; i++) {
            jo.a(invitation.f().equals(((Invitation) this.b.get(i)).f()), "All the invitations must be from the same inviter");
        }
    }

    public int b() {
        return this.a;
    }

    public ArrayList c() {
        return new ArrayList(this.b);
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    public Game d() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    public String e() {
        return ((InvitationEntity) this.b.get(0)).e();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ZInvitationCluster)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ZInvitationCluster zInvitationCluster = (ZInvitationCluster) obj;
        if (zInvitationCluster.b.size() != this.b.size()) {
            return false;
        }
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            if (!((Invitation) this.b.get(i)).equals((Invitation) zInvitationCluster.b.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    public Participant f() {
        return ((InvitationEntity) this.b.get(0)).f();
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    public long g() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    public int h() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public int hashCode() {
        return ku.a(this.b.toArray());
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    public int i() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    public int j() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    @Override // com.google.android.gms.common.data.d
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Invitation a() {
        return this;
    }

    @Override // com.google.android.gms.games.multiplayer.f
    public ArrayList l() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel, i);
    }
}
