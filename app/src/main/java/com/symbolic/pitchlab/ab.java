package com.symbolic.pitchlab;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class ab implements View.OnClickListener {
    final /* synthetic */ ActivityOptions a;
    private final /* synthetic */ Dialog b;

    ab(ActivityOptions activityOptions, Dialog dialog) {
        this.a = activityOptions;
        this.b = dialog;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.b.dismiss();
    }
}
