package com.symbolic.pitchlab;

import android.app.Dialog;
import android.view.View;
import android.widget.AdapterView;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class am implements AdapterView.OnItemClickListener {
    final /* synthetic */ ActivityOptions a;
    private final /* synthetic */ Dialog b;
    private final /* synthetic */ List c;

    am(ActivityOptions activityOptions, Dialog dialog, List list) {
        this.a = activityOptions;
        this.b = dialog;
        this.c = list;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.b.dismiss();
        cd.a(((cb) this.c.get(i)).a());
    }
}
