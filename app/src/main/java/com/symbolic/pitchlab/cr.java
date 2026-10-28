package com.symbolic.pitchlab;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class cr implements cp {
    private String a;

    cr(String str) {
        this.a = str;
    }

    @Override // com.symbolic.pitchlab.cp
    public void a(View view) {
        view.setClickable(false);
        view.findViewById(R.id.optionItem_SeparatorLayout).setVisibility(0);
        view.findViewById(R.id.optionItem_OptionLayout).setVisibility(8);
        ((TextView) view.findViewById(R.id.optionItem_SeparatorTitle)).setText(this.a);
    }

    @Override // com.symbolic.pitchlab.cp
    public boolean a() {
        return false;
    }

    @Override // com.symbolic.pitchlab.cp
    public void b(View view) {
    }
}
