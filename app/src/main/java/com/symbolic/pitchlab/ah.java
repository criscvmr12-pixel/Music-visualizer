package com.symbolic.pitchlab;

import android.app.Dialog;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
class ah implements AdapterView.OnItemClickListener {
    final /* synthetic */ ActivityOptions a;
    private final /* synthetic */ Dialog b;

    ah(ActivityOptions activityOptions, Dialog dialog) {
        this.a = activityOptions;
        this.b = dialog;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.b.dismiss();
        this.a.i = ActivityOptions.b[i];
        if (this.a.c(this.a.i)) {
            cd.a(this.a.i);
        } else {
            this.a.showDialog(101);
        }
    }
}
