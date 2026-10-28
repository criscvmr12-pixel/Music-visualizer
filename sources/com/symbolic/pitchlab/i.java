package com.symbolic.pitchlab;

import android.app.AlertDialog;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class i implements View.OnClickListener {
    final /* synthetic */ ActivityCrashlogs a;
    private final /* synthetic */ AlertDialog b;

    i(ActivityCrashlogs activityCrashlogs, AlertDialog alertDialog) {
        this.a = activityCrashlogs;
        this.b = alertDialog;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ActivityCrashlogs.c(this.a.d);
        this.a.e();
        this.b.dismiss();
    }
}
