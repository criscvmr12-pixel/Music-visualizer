package com.symbolic.pitchlab;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class bh implements View.OnClickListener {
    final /* synthetic */ bc a;
    private final /* synthetic */ Dialog b;

    bh(bc bcVar, Dialog dialog) {
        this.a = bcVar;
        this.b = dialog;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.b.dismiss();
        this.a.a.showDialog(111);
    }
}
