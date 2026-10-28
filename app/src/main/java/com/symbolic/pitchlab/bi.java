package com.symbolic.pitchlab;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class bi implements View.OnClickListener {
    final /* synthetic */ ActivityVisualiser a;

    bi(ActivityVisualiser activityVisualiser) {
        this.a = activityVisualiser;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (cd.v() != 0) {
            this.a.f();
        } else {
            this.a.showDialog(100);
        }
    }
}
