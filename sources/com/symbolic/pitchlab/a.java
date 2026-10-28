package com.symbolic.pitchlab;

/* JADX INFO: loaded from: classes.dex */
class a implements Runnable {
    final /* synthetic */ ActivityCrashlogs a;

    a(ActivityCrashlogs activityCrashlogs) {
        this.a = activityCrashlogs;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.a.f) {
            this.a.showDialog(101);
        } else {
            this.a.showDialog(100);
        }
    }
}
