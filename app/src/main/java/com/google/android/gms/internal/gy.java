package com.google.android.gms.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class gy implements Runnable {
    final /* synthetic */ Context a;

    gy(Context context) {
        this.a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (gx.a) {
            String unused = gx.c = gx.e(this.a);
            gx.a.notifyAll();
        }
    }
}
