package com.google.android.gms.games.event;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.d;
import com.google.android.gms.games.Player;

/* JADX INFO: loaded from: classes.dex */
public interface Event extends Parcelable, d {
    String c();

    String c_();

    String d();

    Uri e();

    @Deprecated
    String f();

    Player g();

    long h();

    String i();

    boolean j();
}
