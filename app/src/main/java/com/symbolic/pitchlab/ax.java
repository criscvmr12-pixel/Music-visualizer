package com.symbolic.pitchlab;

import android.app.Dialog;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

/* JADX INFO: loaded from: classes.dex */
class ax implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ aw a;
    private final /* synthetic */ Dialog b;
    private final /* synthetic */ int[] c;
    private final /* synthetic */ Spinner d;

    ax(aw awVar, Dialog dialog, int[] iArr, Spinner spinner) {
        this.a = awVar;
        this.b = dialog;
        this.c = iArr;
        this.d = spinner;
    }

    private void a(int i) {
        ActivityOptions.b(this.b, this.c, this.d.getSelectedItemPosition() + 2);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        a(i);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView adapterView) {
        a(0);
    }
}
