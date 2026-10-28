package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.internal.ku;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class RoomEntity extends GamesDowngradeableSafeParcel implements Room {
    public static final Parcelable.Creator CREATOR = new c();
    private final int a;
    private final String b;
    private final String c;
    private final long d;
    private final int e;
    private final String f;
    private final int g;
    private final Bundle h;
    private final ArrayList i;
    private final int j;

    RoomEntity(int i, String str, String str2, long j, int i2, String str3, int i3, Bundle bundle, ArrayList arrayList, int i4) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = i2;
        this.f = str3;
        this.g = i3;
        this.h = bundle;
        this.i = arrayList;
        this.j = i4;
    }

    public RoomEntity(Room room) {
        this.a = 2;
        this.b = room.h_();
        this.c = room.c();
        this.d = room.d();
        this.e = room.e();
        this.f = room.f();
        this.g = room.g();
        this.h = room.h();
        ArrayList arrayListL = room.l();
        int size = arrayListL.size();
        this.i = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            this.i.add((ParticipantEntity) ((Participant) arrayListL.get(i)).a());
        }
        this.j = room.i();
    }

    static int a(Room room) {
        return ku.a(room.h_(), room.c(), Long.valueOf(room.d()), Integer.valueOf(room.e()), room.f(), Integer.valueOf(room.g()), room.h(), room.l(), Integer.valueOf(room.i()));
    }

    static boolean a(Room room, Object obj) {
        if (!(obj instanceof Room)) {
            return false;
        }
        if (room == obj) {
            return true;
        }
        Room room2 = (Room) obj;
        return ku.a(room2.h_(), room.h_()) && ku.a(room2.c(), room.c()) && ku.a(Long.valueOf(room2.d()), Long.valueOf(room.d())) && ku.a(Integer.valueOf(room2.e()), Integer.valueOf(room.e())) && ku.a(room2.f(), room.f()) && ku.a(Integer.valueOf(room2.g()), Integer.valueOf(room.g())) && ku.a(room2.h(), room.h()) && ku.a(room2.l(), room.l()) && ku.a(Integer.valueOf(room2.i()), Integer.valueOf(room.i()));
    }

    static String b(Room room) {
        return ku.a(room).a("RoomId", room.h_()).a("CreatorId", room.c()).a("CreationTimestamp", Long.valueOf(room.d())).a("RoomStatus", Integer.valueOf(room.e())).a("Description", room.f()).a("Variant", Integer.valueOf(room.g())).a("AutoMatchCriteria", room.h()).a("Participants", room.l()).a("AutoMatchWaitEstimateSeconds", Integer.valueOf(room.i())).toString();
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    public String c() {
        return this.c;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    public long d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    public int e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        return a(this, obj);
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    public String f() {
        return this.f;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    public int g() {
        return this.g;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    public Bundle h() {
        return this.h;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    public String h_() {
        return this.b;
    }

    public int hashCode() {
        return a(this);
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    public int i() {
        return this.j;
    }

    public int j() {
        return this.a;
    }

    @Override // com.google.android.gms.common.data.d
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Room a() {
        return this;
    }

    @Override // com.google.android.gms.games.multiplayer.f
    public ArrayList l() {
        return new ArrayList(this.i);
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
        parcel.writeLong(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeBundle(this.h);
        int size = this.i.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            ((ParticipantEntity) this.i.get(i2)).writeToParcel(parcel, i);
        }
    }
}
