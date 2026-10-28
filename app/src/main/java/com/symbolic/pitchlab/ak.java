package com.symbolic.pitchlab;

import android.app.Dialog;
import android.view.View;
import android.widget.AdapterView;
import android.widget.RadioGroup;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class ak implements AdapterView.OnItemClickListener {
    final /* synthetic */ ActivityOptions a;
    private final /* synthetic */ Dialog b;
    private final /* synthetic */ List c;
    private final /* synthetic */ RadioGroup d;

    ak(ActivityOptions activityOptions, Dialog dialog, List list, RadioGroup radioGroup) {
        this.a = activityOptions;
        this.b = dialog;
        this.c = list;
        this.d = radioGroup;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.b.dismiss();
        ce ceVar = (ce) this.c.get(i);
        switch (this.d.getCheckedRadioButtonId()) {
            case R.id.temperament_custom_select_buttonLoad /* 2131165363 */:
                cd.b(ceVar.a());
                break;
            case R.id.temperament_custom_select_buttonEdit /* 2131165365 */:
                cd.d(i);
                this.a.showDialog(113);
                break;
            case R.id.temperament_custom_select_buttonDelete /* 2131165366 */:
                cd.d(i);
                this.a.showDialog(114);
                break;
        }
    }
}
