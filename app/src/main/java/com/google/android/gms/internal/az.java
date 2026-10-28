package com.google.android.gms.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class az implements bc {
    az() {
    }

    @Override // com.google.android.gms.internal.bc
    public void a(hl hlVar, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            hj.e("URL missing from httpTrack GMSG.");
        } else {
            new hh(hlVar.getContext(), hlVar.h().b, str).e();
        }
    }
}
