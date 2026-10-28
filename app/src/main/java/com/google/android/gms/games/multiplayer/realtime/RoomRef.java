package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.f;
import com.google.android.gms.games.multiplayer.ParticipantRef;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class RoomRef extends f implements Room {
    private final int c;

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    public String c() {
        return e("creator_external");
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    public long d() {
        return b("creation_timestamp");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    public int e() {
        return c("status");
    }

    @Override // com.google.android.gms.common.data.f
    public boolean equals(Object obj) {
        return RoomEntity.a(this, obj);
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    public String f() {
        return e("description");
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    public int g() {
        return c("variant");
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    public Bundle h() {
        if (d("has_automatch_criteria")) {
            return b.a(c("automatch_min_players"), c("automatch_max_players"), b("automatch_bit_mask"));
        }
        return null;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    public String h_() {
        return e("external_match_id");
    }

    @Override // com.google.android.gms.common.data.f
    public int hashCode() {
        return RoomEntity.a(this);
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    public int i() {
        return c("automatch_wait_estimate_sec");
    }

    @Override // com.google.android.gms.common.data.d
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Room a() {
        return new RoomEntity(this);
    }

    @Override // com.google.android.gms.games.multiplayer.f
    public ArrayList l() {
        ArrayList arrayList = new ArrayList(this.c);
        for (int i = 0; i < this.c; i++) {
            arrayList.add(new ParticipantRef(this.a, this.b + i));
        }
        return arrayList;
    }

    public String toString() {
        return RoomEntity.b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((RoomEntity) a()).writeToParcel(parcel, i);
    }
}
