package com.google.android.gms.internal;

import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public class dx {
    private final String a;

    public dx(String str) {
        this.a = str;
    }

    public String a() {
        return gx.d();
    }

    public boolean a(String str, int i, Intent intent) {
        if (str == null || intent == null) {
            return false;
        }
        String strB = dw.b(intent);
        String strC = dw.c(intent);
        if (strB == null || strC == null) {
            return false;
        }
        if (!str.equals(dw.a(strB))) {
            hj.e("Developer payload not match.");
            return false;
        }
        if (this.a == null || dy.a(this.a, strB, strC)) {
            return true;
        }
        hj.e("Fail to verify signature.");
        return false;
    }
}
