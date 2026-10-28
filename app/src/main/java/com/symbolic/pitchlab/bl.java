package com.symbolic.pitchlab;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
class bl implements DialogInterface.OnDismissListener {
    final /* synthetic */ ActivityWelcome a;

    bl(ActivityWelcome activityWelcome) {
        this.a = activityWelcome;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.a.a();
    }
}
