package com.symbolic.pitchlab;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* JADX INFO: loaded from: classes.dex */
class o implements AdapterView.OnItemClickListener {
    final /* synthetic */ ActivityOptions a;
    private final /* synthetic */ cq b;
    private final /* synthetic */ ListView c;

    o(ActivityOptions activityOptions, cq cqVar, ListView listView) {
        this.a = activityOptions;
        this.b = cqVar;
        this.c = listView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ((cp) this.b.getItem(i)).b(this.c);
    }
}
