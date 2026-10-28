package com.symbolic.pitchlab;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class bb implements View.OnClickListener {
    final /* synthetic */ aw a;
    private final /* synthetic */ Dialog b;

    bb(aw awVar, Dialog dialog) {
        this.a = awVar;
        this.b = dialog;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.b.dismiss();
        this.a.a.showDialog(116);
    }
}
