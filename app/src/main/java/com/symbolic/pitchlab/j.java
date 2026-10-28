package com.symbolic.pitchlab;

import android.text.InputFilter;
import android.text.Spanned;

/* JADX INFO: loaded from: classes.dex */
class j implements InputFilter {
    final /* synthetic */ ActivityOptions a;

    j(ActivityOptions activityOptions) {
        this.a = activityOptions;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (i2 > i) {
            while (i < i2) {
                if (!" !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~".contains(String.valueOf(charSequence.charAt(i)))) {
                    return "";
                }
                i++;
            }
        }
        return null;
    }
}
