package com.google.android.gms.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class gq {
    private final Object a;
    private int b;
    private int c;
    private final gn d;
    private final String e;

    gq(gn gnVar, String str) {
        this.a = new Object();
        this.d = gnVar;
        this.e = str;
    }

    public gq(String str) {
        this(gn.a(), str);
    }

    public Bundle a() {
        Bundle bundle;
        synchronized (this.a) {
            bundle = new Bundle();
            bundle.putInt("pmnli", this.b);
            bundle.putInt("pmnll", this.c);
        }
        return bundle;
    }

    public void a(int i, int i2) {
        synchronized (this.a) {
            this.b = i;
            this.c = i2;
            this.d.a(this.e, this);
        }
    }
}
