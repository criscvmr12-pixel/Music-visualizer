package com.symbolic.pitchlab;

import android.view.View;

/* JADX INFO: renamed from: com.symbolic.pitchlab.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class ViewOnClickListenerC0001r implements View.OnClickListener {
    final /* synthetic */ ActivityOptions a;

    ViewOnClickListenerC0001r(ActivityOptions activityOptions) {
        this.a = activityOptions;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.a.j.a();
    }
}
