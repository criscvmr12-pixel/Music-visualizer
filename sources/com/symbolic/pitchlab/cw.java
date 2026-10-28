package com.symbolic.pitchlab;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class cw implements View.OnClickListener {
    final /* synthetic */ cs a;
    private final /* synthetic */ float b;

    cw(cs csVar, float f) {
        this.a = csVar;
        this.b = f;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.a.b(this.b);
    }
}
