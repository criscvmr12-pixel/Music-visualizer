package com.symbolic.pitchlab;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class al implements View.OnClickListener {
    final /* synthetic */ ActivityOptions a;
    private final /* synthetic */ Dialog b;

    al(ActivityOptions activityOptions, Dialog dialog) {
        this.a = activityOptions;
        this.b = dialog;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.b.dismiss();
        this.a.showDialog(112);
    }
}
