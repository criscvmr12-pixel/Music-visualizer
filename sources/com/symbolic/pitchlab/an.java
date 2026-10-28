package com.symbolic.pitchlab;

import android.app.Dialog;
import android.view.View;
import android.widget.AdapterView;
import android.widget.RadioGroup;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class an implements AdapterView.OnItemClickListener {
    final /* synthetic */ ActivityOptions a;
    private final /* synthetic */ Dialog b;
    private final /* synthetic */ List c;
    private final /* synthetic */ RadioGroup d;

    an(ActivityOptions activityOptions, Dialog dialog, List list, RadioGroup radioGroup) {
        this.a = activityOptions;
        this.b = dialog;
        this.c = list;
        this.d = radioGroup;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.b.dismiss();
        cb cbVar = (cb) this.c.get(i);
        switch (this.d.getCheckedRadioButtonId()) {
            case R.id.instrument_custom_select_buttonLoad /* 2131165248 */:
                cd.a(cbVar.a());
                break;
            case R.id.instrument_custom_select_buttonEdit /* 2131165250 */:
                cd.c(i);
                this.a.showDialog(118);
                break;
            case R.id.instrument_custom_select_buttonDelete /* 2131165251 */:
                cd.c(i);
                this.a.showDialog(119);
                break;
        }
    }
}
