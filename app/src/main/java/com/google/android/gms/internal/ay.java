package com.google.android.gms.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class ay implements bc {
    ay() {
    }

    @Override // com.google.android.gms.internal.bc
    public void a(hl hlVar, Map map) {
        cp cpVarD = hlVar.d();
        if (cpVarD == null) {
            hj.e("A GMSG tried to use a custom close button on something that wasn't an overlay.");
        } else {
            cpVarD.b("1".equals(map.get("custom_close")));
        }
    }
}
