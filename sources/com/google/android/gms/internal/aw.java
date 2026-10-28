package com.google.android.gms.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class aw implements bc {
    aw() {
    }

    @Override // com.google.android.gms.internal.bc
    public void a(hl hlVar, Map map) {
        cp cpVarD = hlVar.d();
        if (cpVarD == null) {
            hj.e("A GMSG tried to close something that wasn't an overlay.");
        } else {
            cpVarD.a();
        }
    }
}
