package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.data.d;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.multiplayer.f;

/* JADX INFO: loaded from: classes.dex */
public interface TurnBasedMatch extends Parcelable, d, f {
    public static final int[] a_ = {0, 1, 2, 3};

    String c();

    String d();

    long e();

    int f();

    int g();

    String h();

    int i();

    Game i_();

    String j();

    long k();

    String m();

    byte[] n();

    int o();

    String p();

    byte[] q();

    int r();

    Bundle s();

    int t();

    boolean u();

    String v();
}
