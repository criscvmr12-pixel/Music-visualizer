package com.symbolic.pitchlab;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class bg implements View.OnClickListener {
    final /* synthetic */ bc a;
    private final /* synthetic */ cs[] b;

    bg(bc bcVar, cs[] csVarArr) {
        this.a = bcVar;
        this.b = csVarArr;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        for (int i = 0; i < 12; i++) {
            this.b[i].a();
        }
    }
}
