package com.symbolic.pitchlab;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class co implements cp {
    private String a;
    private String b;
    private View.OnClickListener c;

    public co(String str, String str2, View.OnClickListener onClickListener) {
        this.a = str;
        this.b = str2;
        this.c = onClickListener;
    }

    @Override // com.symbolic.pitchlab.cp
    public void a(View view) {
        view.findViewById(R.id.optionItem_SeparatorLayout).setVisibility(8);
        view.findViewById(R.id.optionItem_OptionLayout).setVisibility(0);
        view.findViewById(R.id.optionItem_OptionCheckBox).setVisibility(8);
        TextView textView = (TextView) view.findViewById(R.id.optionItem_OptionTitle);
        TextView textView2 = (TextView) view.findViewById(R.id.optionItem_OptionDescription);
        textView.setText(this.a);
        textView2.setText(this.b);
    }

    @Override // com.symbolic.pitchlab.cp
    public boolean a() {
        return true;
    }

    @Override // com.symbolic.pitchlab.cp
    public void b(View view) {
        if (this.c != null) {
            this.c.onClick(view);
        }
    }
}
