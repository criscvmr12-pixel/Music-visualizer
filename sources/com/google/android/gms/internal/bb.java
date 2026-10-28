package com.google.android.gms.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class bb implements bc {
    bb() {
    }

    @Override // com.google.android.gms.internal.bc
    public void a(hl hlVar, Map map) {
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int i = Integer.parseInt(str);
            int i2 = Integer.parseInt(str2);
            int i3 = Integer.parseInt(str3);
            nh nhVarG = hlVar.g();
            if (nhVarG != null) {
                nhVarG.a().a(i, i2, i3);
            }
        } catch (NumberFormatException e) {
            hj.e("Could not parse touch parameters from gmsg.");
        }
    }
}
