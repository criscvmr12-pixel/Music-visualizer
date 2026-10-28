package com.symbolic.pitchlab;

import android.app.Dialog;
import android.view.View;
import android.widget.Spinner;

/* JADX INFO: loaded from: classes.dex */
class aa implements View.OnClickListener {
    final /* synthetic */ ActivityOptions a;
    private final /* synthetic */ Dialog b;
    private final /* synthetic */ Spinner c;
    private final /* synthetic */ Spinner d;
    private final /* synthetic */ Spinner e;

    aa(ActivityOptions activityOptions, Dialog dialog, Spinner spinner, Spinner spinner2, Spinner spinner3) {
        this.a = activityOptions;
        this.b = dialog;
        this.c = spinner;
        this.d = spinner2;
        this.e = spinner3;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.b.dismiss();
        cd.f(this.c.getSelectedItemPosition());
        cd.b(ActivityOptions.g[this.d.getSelectedItemPosition()]);
        cd.g(this.e.getSelectedItemPosition());
    }
}
