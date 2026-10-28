package com.google.android.gms.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class gb implements bc {
    final /* synthetic */ ga a;

    gb(ga gaVar) {
        this.a = gaVar;
    }

    @Override // com.google.android.gms.internal.bc
    public void a(hl hlVar, Map map) {
        synchronized (this.a.c) {
            ge geVar = new ge(map);
            hj.e("Invalid " + geVar.d() + " request error: " + geVar.a());
            this.a.f = 1;
            this.a.c.notify();
        }
    }
}
