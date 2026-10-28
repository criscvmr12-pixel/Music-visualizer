package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: loaded from: classes.dex */
public final class GameRef extends com.google.android.gms.common.data.f implements Game {
    public GameRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    @Override // com.google.android.gms.games.Game
    public String a_() {
        return e("external_game_id");
    }

    @Override // com.google.android.gms.games.Game
    public String c() {
        return e("display_name");
    }

    @Override // com.google.android.gms.games.Game
    public String d() {
        return e("primary_category");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.Game
    public String e() {
        return e("secondary_category");
    }

    @Override // com.google.android.gms.common.data.f
    public boolean equals(Object obj) {
        return GameEntity.a(this, obj);
    }

    @Override // com.google.android.gms.games.Game
    public String f() {
        return e("game_description");
    }

    @Override // com.google.android.gms.games.Game
    public String g() {
        return e("developer_name");
    }

    @Override // com.google.android.gms.games.Game
    public Uri h() {
        return h("game_icon_image_uri");
    }

    @Override // com.google.android.gms.common.data.f
    public int hashCode() {
        return GameEntity.a(this);
    }

    @Override // com.google.android.gms.games.Game
    public String i() {
        return e("game_icon_image_url");
    }

    @Override // com.google.android.gms.games.Game
    public Uri j() {
        return h("game_hi_res_image_uri");
    }

    @Override // com.google.android.gms.games.Game
    public String k() {
        return e("game_hi_res_image_url");
    }

    @Override // com.google.android.gms.games.Game
    public Uri l() {
        return h("featured_image_uri");
    }

    @Override // com.google.android.gms.games.Game
    public String m() {
        return e("featured_image_url");
    }

    @Override // com.google.android.gms.games.Game
    public boolean n() {
        return d("play_enabled_game");
    }

    @Override // com.google.android.gms.games.Game
    public boolean o() {
        return d("muted");
    }

    @Override // com.google.android.gms.games.Game
    public boolean p() {
        return d("identity_sharing_confirmed");
    }

    @Override // com.google.android.gms.games.Game
    public boolean q() {
        return c("installed") > 0;
    }

    @Override // com.google.android.gms.games.Game
    public String r() {
        return e("package_name");
    }

    @Override // com.google.android.gms.games.Game
    public int s() {
        return c("gameplay_acl_status");
    }

    @Override // com.google.android.gms.games.Game
    public int t() {
        return c("achievement_total_count");
    }

    public String toString() {
        return GameEntity.b(this);
    }

    @Override // com.google.android.gms.games.Game
    public int u() {
        return c("leaderboard_count");
    }

    @Override // com.google.android.gms.games.Game
    public boolean v() {
        return c("real_time_support") > 0;
    }

    @Override // com.google.android.gms.games.Game
    public boolean w() {
        return c("turn_based_support") > 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((GameEntity) a()).writeToParcel(parcel, i);
    }

    @Override // com.google.android.gms.games.Game
    public boolean x() {
        return c("snapshots_enabled") > 0;
    }

    @Override // com.google.android.gms.common.data.d
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Game a() {
        return new GameEntity(this);
    }
}
