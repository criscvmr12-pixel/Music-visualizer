package com.google.android.gms.internal;

import android.content.Context;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
final class ol {
    public final oj a;
    public final String b;
    public final Context c;
    public final nh d;
    public final ew e;
    public v f;
    public gs g;
    public am h;
    public gj i;
    public gl j;
    public af k;
    public ek l;
    public ec m;
    public dx n;
    public gq o = null;
    public boolean p = false;
    private HashSet q = null;

    public ol(Context context, am amVar, String str, ew ewVar) {
        if (amVar.e) {
            this.a = null;
        } else {
            this.a = new oj(context);
            this.a.setMinimumWidth(amVar.g);
            this.a.setMinimumHeight(amVar.d);
            this.a.setVisibility(4);
        }
        this.h = amVar;
        this.b = str;
        this.c = context;
        this.e = ewVar;
        this.d = new nh(new ok(this));
    }

    public HashSet a() {
        return this.q;
    }

    public void a(HashSet hashSet) {
        this.q = hashSet;
    }
}
