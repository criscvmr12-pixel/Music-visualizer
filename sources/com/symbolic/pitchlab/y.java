package com.symbolic.pitchlab;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class y implements View.OnClickListener {
    final /* synthetic */ ActivityOptions a;
    private final /* synthetic */ Dialog b;

    y(ActivityOptions activityOptions, Dialog dialog) {
        this.a = activityOptions;
        this.b = dialog;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.b.dismiss();
        int iA = 0;
        for (int i = 0; i < ActivityOptions.e.length; i++) {
            iA |= this.a.a(1 << i, this.b, ActivityOptions.e[i]);
        }
        cd.k(iA);
    }
}
