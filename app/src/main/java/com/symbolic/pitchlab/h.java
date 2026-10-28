package com.symbolic.pitchlab;

import android.app.AlertDialog;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class h implements View.OnClickListener {
    final /* synthetic */ ActivityCrashlogs a;
    private final /* synthetic */ AlertDialog b;

    h(ActivityCrashlogs activityCrashlogs, AlertDialog alertDialog) {
        this.a = activityCrashlogs;
        this.b = alertDialog;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.a.e();
        this.b.dismiss();
    }
}
