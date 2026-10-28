package com.symbolic.pitchlab;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class l implements View.OnClickListener {
    final /* synthetic */ ActivityOptions a;

    l(ActivityOptions activityOptions) {
        this.a = activityOptions;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.a.showDialog(107);
    }
}
