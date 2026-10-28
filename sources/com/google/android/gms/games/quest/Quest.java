package com.google.android.gms.games.quest;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.d;
import com.google.android.gms.games.Game;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface Quest extends Parcelable, d {
    public static final int[] b_ = {1, 2, 3, 4, 6, 5};
    public static final String[] c_ = {Integer.toString(1), Integer.toString(2), Integer.toString(3)};

    String c();

    String d();

    Uri e();

    @Deprecated
    String f();

    Uri g();

    @Deprecated
    String h();

    List i();

    Game j();

    int k();

    String k_();

    int l();

    long m();

    long n();

    long o();

    long p();

    long q();
}
