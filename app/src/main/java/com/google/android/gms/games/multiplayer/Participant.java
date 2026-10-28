package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.games.Player;

/* JADX INFO: loaded from: classes.dex */
public interface Participant extends Parcelable, com.google.android.gms.common.data.d {
    String c();

    int d();

    boolean e();

    String f();

    Uri g();

    int g_();

    @Deprecated
    String h();

    Uri i();

    @Deprecated
    String j();

    String k();

    Player l();

    ParticipantResult m();
}
