package com.symbolic.pitchlab;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
class ag implements DialogInterface.OnClickListener {
    final /* synthetic */ ActivityOptions a;

    ag(ActivityOptions activityOptions) {
        this.a = activityOptions;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.a.showDialog(116);
    }
}
