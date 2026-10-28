package com.symbolic.pitchlab;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
class f implements DialogInterface.OnClickListener {
    final /* synthetic */ ActivityCrashlogs a;

    f(ActivityCrashlogs activityCrashlogs) {
        this.a = activityCrashlogs;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        ActivityCrashlogs.c(this.a.d);
        this.a.e();
    }
}
