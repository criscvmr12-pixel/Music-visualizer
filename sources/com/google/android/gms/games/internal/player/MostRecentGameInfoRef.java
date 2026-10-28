package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.f;

/* JADX INFO: loaded from: classes.dex */
public final class MostRecentGameInfoRef extends f implements MostRecentGameInfo {
    private final b c;

    public MostRecentGameInfoRef(DataHolder dataHolder, int i, b bVar) {
        super(dataHolder, i);
        this.c = bVar;
    }

    @Override // com.google.android.gms.games.internal.player.MostRecentGameInfo
    public String c() {
        return e(this.c.t);
    }

    @Override // com.google.android.gms.games.internal.player.MostRecentGameInfo
    public long d() {
        return b(this.c.u);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.internal.player.MostRecentGameInfo
    public Uri e() {
        return h(this.c.v);
    }

    @Override // com.google.android.gms.common.data.f
    public boolean equals(Object obj) {
        return MostRecentGameInfoEntity.a(this, obj);
    }

    @Override // com.google.android.gms.games.internal.player.MostRecentGameInfo
    public Uri f() {
        return h(this.c.w);
    }

    @Override // com.google.android.gms.games.internal.player.MostRecentGameInfo
    public String f_() {
        return e(this.c.s);
    }

    @Override // com.google.android.gms.games.internal.player.MostRecentGameInfo
    public Uri g() {
        return h(this.c.x);
    }

    @Override // com.google.android.gms.common.data.d
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public MostRecentGameInfo a() {
        return new MostRecentGameInfoEntity(this);
    }

    @Override // com.google.android.gms.common.data.f
    public int hashCode() {
        return MostRecentGameInfoEntity.a(this);
    }

    public String toString() {
        return MostRecentGameInfoEntity.b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((MostRecentGameInfoEntity) a()).writeToParcel(parcel, i);
    }
}
