package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.games.internal.player.MostRecentGameInfo;

/* JADX INFO: loaded from: classes.dex */
public interface Player extends Parcelable, com.google.android.gms.common.data.d {
    String b_();

    String c();

    Uri d();

    @Deprecated
    String e();

    Uri f();

    @Deprecated
    String g();

    long h();

    long i();

    int j();

    boolean k();

    String l();

    PlayerLevelInfo m();

    MostRecentGameInfo n();
}
