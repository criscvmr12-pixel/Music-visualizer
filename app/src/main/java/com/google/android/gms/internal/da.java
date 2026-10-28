package com.google.android.gms.internal;

import android.R;
import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;

/* JADX INFO: loaded from: classes.dex */
public final class da extends FrameLayout implements View.OnClickListener {
    private final Activity a;
    private final ImageButton b;

    public da(Activity activity, int i) {
        super(activity);
        this.a = activity;
        setOnClickListener(this);
        this.b = new ImageButton(activity);
        this.b.setImageResource(R.drawable.btn_dialog);
        this.b.setBackgroundColor(0);
        this.b.setOnClickListener(this);
        this.b.setPadding(0, 0, 0, 0);
        int iA = hi.a(activity, i);
        addView(this.b, new FrameLayout.LayoutParams(iA, iA, 17));
    }

    public void a(boolean z) {
        this.b.setVisibility(z ? 4 : 0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.a.finish();
    }
}
