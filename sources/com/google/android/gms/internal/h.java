package com.google.android.gms.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class h implements bc {
    final /* synthetic */ d a;

    h(d dVar) {
        this.a = dVar;
    }

    @Override // com.google.android.gms.internal.bc
    public void a(hl hlVar, Map map) {
        if (map.containsKey("pingType") && "unloadPing".equals(map.get("pingType"))) {
            this.a.c(this.a.g);
            hj.c("Unregistered GMSG handlers for: " + this.a.e.d());
        }
    }
}
