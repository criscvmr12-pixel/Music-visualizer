package com.google.android.gms.common;

import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public class h extends Exception {
    private final Intent a;

    public h(String str, Intent intent) {
        super(str);
        this.a = intent;
    }
}
