package com.symbolic.pitchlab;

import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
class ck extends TimerTask {
    final /* synthetic */ cj a;

    ck(cj cjVar) {
        this.a = cjVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        this.a.b();
    }
}
