package com.symbolic.pitchlab;

import android.app.Dialog;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
class ai implements AdapterView.OnItemClickListener {
    final /* synthetic */ ActivityOptions a;
    private final /* synthetic */ Dialog b;

    ai(ActivityOptions activityOptions, Dialog dialog) {
        this.a = activityOptions;
        this.b = dialog;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.b.dismiss();
        cd.b(ActivityOptions.c[i]);
    }
}
