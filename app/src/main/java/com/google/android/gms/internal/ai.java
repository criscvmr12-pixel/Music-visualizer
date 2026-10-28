package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ai {
    public static final String a = hi.a("emulator");
    private final Date b;
    private final String c;
    private final int d;
    private final Set e;
    private final Location f;
    private final boolean g;
    private final Bundle h;
    private final Map i;
    private final String j;
    private final com.google.android.gms.ads.e.a k;
    private final int l;
    private final Set m;

    public ai(ak akVar) {
        this(akVar, null);
    }

    public ai(ak akVar, com.google.android.gms.ads.e.a aVar) {
        this.b = akVar.e;
        this.c = akVar.f;
        this.d = akVar.g;
        this.e = Collections.unmodifiableSet(akVar.a);
        this.f = akVar.h;
        this.g = akVar.i;
        this.h = akVar.b;
        this.i = Collections.unmodifiableMap(akVar.c);
        this.j = akVar.j;
        this.k = aVar;
        this.l = akVar.k;
        this.m = Collections.unmodifiableSet(akVar.d);
    }

    public Bundle a(Class cls) {
        return this.h.getBundle(cls.getName());
    }

    public Date a() {
        return this.b;
    }

    public boolean a(Context context) {
        return this.m.contains(hi.a(context));
    }

    public String b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public Set d() {
        return this.e;
    }

    public Location e() {
        return this.f;
    }

    public boolean f() {
        return this.g;
    }

    public String g() {
        return this.j;
    }

    public com.google.android.gms.ads.e.a h() {
        return this.k;
    }

    public Map i() {
        return this.i;
    }

    public Bundle j() {
        return this.h;
    }

    public int k() {
        return this.l;
    }
}
