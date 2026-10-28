package com.symbolic.pitchlab;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class k implements View.OnClickListener {
    final /* synthetic */ ActivityOptions a;

    k(ActivityOptions activityOptions) {
        this.a = activityOptions;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.a.showDialog(102);
    }
}
