package com.symbolic.pitchlab;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
class bj implements DialogInterface.OnClickListener {
    final /* synthetic */ ActivityVisualiser a;
    private final /* synthetic */ int b;

    bj(ActivityVisualiser activityVisualiser, int i) {
        this.a = activityVisualiser;
        this.b = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (i >= this.b) {
            this.a.f();
        } else {
            cd.h(i);
        }
    }
}
