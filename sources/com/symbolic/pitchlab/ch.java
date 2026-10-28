package com.symbolic.pitchlab;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class ch {
    private String a;
    private View.OnClickListener b;
    private boolean c;

    public ch(String str, boolean z, View.OnClickListener onClickListener) {
        this.a = str;
        this.c = z;
        this.b = onClickListener;
    }

    public void a(View view) {
        ((TextView) view.findViewById(R.id.checkableText)).setText(this.a);
    }
}
