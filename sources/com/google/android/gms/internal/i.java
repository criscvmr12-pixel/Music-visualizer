package com.google.android.gms.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class i implements bc {
    final /* synthetic */ d a;

    i(d dVar) {
        this.a = dVar;
    }

    @Override // com.google.android.gms.internal.bc
    public void a(hl hlVar, Map map) {
        if (map.containsKey("isVisible")) {
            this.a.a(Boolean.valueOf("1".equals(map.get("isVisible")) || "true".equals(map.get("isVisible"))).booleanValue());
        }
    }
}
