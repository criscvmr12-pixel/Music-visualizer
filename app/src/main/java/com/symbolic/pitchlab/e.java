package com.symbolic.pitchlab;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
class e implements DialogInterface.OnClickListener {
    final /* synthetic */ ActivityCrashlogs a;

    e(ActivityCrashlogs activityCrashlogs) {
        this.a = activityCrashlogs;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.e();
    }
}
