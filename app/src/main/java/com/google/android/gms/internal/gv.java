package com.google.android.gms.internal;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
final class gv implements Runnable {
    final /* synthetic */ Runnable a;

    gv(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        this.a.run();
    }
}
