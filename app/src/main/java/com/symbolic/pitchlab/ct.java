package com.symbolic.pitchlab;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class ct implements View.OnClickListener {
    final /* synthetic */ cs a;

    ct(cs csVar) {
        this.a = csVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.a.a();
    }
}
