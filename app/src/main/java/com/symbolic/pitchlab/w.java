package com.symbolic.pitchlab;

import android.app.Dialog;
import android.view.View;
import android.widget.Spinner;

/* JADX INFO: loaded from: classes.dex */
class w implements View.OnClickListener {
    final /* synthetic */ ActivityOptions a;
    private final /* synthetic */ Dialog b;
    private final /* synthetic */ Spinner c;
    private final /* synthetic */ Spinner d;
    private final /* synthetic */ Spinner e;

    w(ActivityOptions activityOptions, Dialog dialog, Spinner spinner, Spinner spinner2, Spinner spinner3) {
        this.a = activityOptions;
        this.b = dialog;
        this.c = spinner;
        this.d = spinner2;
        this.e = spinner3;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.b.dismiss();
        switch (this.c.getSelectedItemPosition()) {
            case 0:
                cd.e(4);
                break;
            case 1:
                cd.e(5);
                break;
        }
        cd.c(this.d.getSelectedItem().toString());
        cd.d(this.e.getSelectedItem().toString());
    }
}
