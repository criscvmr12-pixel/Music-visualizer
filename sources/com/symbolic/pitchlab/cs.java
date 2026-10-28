package com.symbolic.pitchlab;

import android.app.Dialog;
import android.widget.Button;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class cs {
    private float a;
    private float b;
    private float c;
    private TextView d;

    public cs(Dialog dialog, float f, float f2, float f3, float f4, float f5, float f6, int i, int i2, int i3, int i4, int i5) {
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = (TextView) dialog.findViewById(i3);
        this.d.setText(Float.toString(f));
        this.d.setOnClickListener(new ct(this));
        ((Button) dialog.findViewById(i)).setOnClickListener(new cu(this, f5));
        ((Button) dialog.findViewById(i2)).setOnClickListener(new cv(this, f6));
        ((Button) dialog.findViewById(i4)).setOnClickListener(new cw(this, f6));
        ((Button) dialog.findViewById(i5)).setOnClickListener(new cx(this, f5));
    }

    private String a(String str, float f) {
        try {
            float f2 = ((int) ((Float.parseFloat(str) + f) * 10.0f)) / 10.0f;
            if (f2 < this.b) {
                f2 = this.b;
            }
            if (f2 > this.c) {
                f2 = this.c;
            }
            return Float.toString(f2);
        } catch (Exception e) {
            return Float.toString(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(float f) {
        String string = this.d.getText().toString();
        String strA = a(string, f);
        if (strA.equals(string)) {
            return;
        }
        this.d.setText(strA);
    }

    public void a() {
        a(this.a);
    }

    public void a(float f) {
        if (f < this.b) {
            f = this.b;
        }
        if (f > this.c) {
            f = this.c;
        }
        this.d.setText(Float.toString(f));
    }

    public float b() {
        try {
            return Float.parseFloat(this.d.getText().toString());
        } catch (Exception e) {
            return this.a;
        }
    }
}
