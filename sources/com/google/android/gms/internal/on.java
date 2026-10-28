package com.google.android.gms.internal;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
class on implements a {
    private hl a;

    public on(hl hlVar) {
        this.a = hlVar;
    }

    @Override // com.google.android.gms.internal.a
    public void a(d dVar, boolean z) {
        HashMap map = new HashMap();
        map.put("isVisible", z ? "1" : "0");
        this.a.a("onAdVisibilityChanged", map);
    }
}
