package com.google.android.gms.internal;

import android.content.ComponentName;
import android.os.IBinder;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
final class ki {
    final /* synthetic */ kh a;
    private final String b;
    private final kj c = new kj(this);
    private final HashSet d = new HashSet();
    private int e = 0;
    private boolean f;
    private IBinder g;
    private ComponentName h;

    public ki(kh khVar, String str) {
        this.a = khVar;
        this.b = str;
    }

    public kj a() {
        return this.c;
    }

    public void a(ka kaVar) {
        this.d.add(kaVar);
    }

    public void a(boolean z) {
        this.f = z;
    }

    public String b() {
        return this.b;
    }

    public void b(ka kaVar) {
        this.d.remove(kaVar);
    }

    public boolean c() {
        return this.f;
    }

    public boolean c(ka kaVar) {
        return this.d.contains(kaVar);
    }

    public int d() {
        return this.e;
    }

    public boolean e() {
        return this.d.isEmpty();
    }

    public IBinder f() {
        return this.g;
    }

    public ComponentName g() {
        return this.h;
    }
}
