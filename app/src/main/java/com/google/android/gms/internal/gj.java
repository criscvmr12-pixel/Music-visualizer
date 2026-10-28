package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class gj {
    public final aj a;
    public final hl b;
    public final List c;
    public final int d;
    public final List e;
    public final List f;
    public final int g;
    public final long h;
    public final String i;
    public final JSONObject j;
    public final boolean k;
    public final bm l;
    public final bz m;
    public final String n;
    public final bn o;
    public final bp p;
    public final long q;
    public final am r;
    public final long s;
    public final long t;
    public final long u;
    public final String v;

    public gj(aj ajVar, hl hlVar, List list, int i, List list2, List list3, int i2, long j, String str, boolean z, bm bmVar, bz bzVar, String str2, bn bnVar, bp bpVar, long j2, am amVar, long j3, long j4, long j5, String str3, JSONObject jSONObject) {
        this.a = ajVar;
        this.b = hlVar;
        this.c = list != null ? Collections.unmodifiableList(list) : null;
        this.d = i;
        this.e = list2 != null ? Collections.unmodifiableList(list2) : null;
        this.f = list3 != null ? Collections.unmodifiableList(list3) : null;
        this.g = i2;
        this.h = j;
        this.i = str;
        this.k = z;
        this.l = bmVar;
        this.m = bzVar;
        this.n = str2;
        this.o = bnVar;
        this.p = bpVar;
        this.q = j2;
        this.r = amVar;
        this.s = j3;
        this.t = j4;
        this.u = j5;
        this.v = str3;
        this.j = jSONObject;
    }
}
