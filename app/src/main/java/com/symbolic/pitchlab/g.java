package com.symbolic.pitchlab;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.View;
import android.widget.Toast;

/* JADX INFO: loaded from: classes.dex */
class g implements View.OnClickListener {
    final /* synthetic */ ActivityCrashlogs a;
    private final /* synthetic */ AlertDialog b;

    g(ActivityCrashlogs activityCrashlogs, AlertDialog alertDialog) {
        this.a = activityCrashlogs;
        this.b = alertDialog;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (!ActivityCrashlogs.d(this.a.d)) {
            Toast.makeText(this.a, "Email attempt failed (couldn't zip crashlog directory)", 0).show();
        } else if (!ActivityCrashlogs.b((Activity) this.a)) {
            Toast.makeText(this.a, "Email attempt failed (couldn't start email client)", 0).show();
        } else {
            this.a.f = true;
            this.b.dismiss();
        }
    }
}
