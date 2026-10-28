package com.google.android.gms.internal;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public class oq {
    private final Handler a;

    public oq(Handler handler) {
        this.a = handler;
    }

    public void a(Runnable runnable) {
        this.a.removeCallbacks(runnable);
    }

    public boolean a(Runnable runnable, long j) {
        return this.a.postDelayed(runnable, j);
    }
}
