package com.google.android.gms.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class gc implements bc {
    final /* synthetic */ ga a;

    gc(ga gaVar) {
        this.a = gaVar;
    }

    @Override // com.google.android.gms.internal.bc
    public void a(hl hlVar, Map map) {
        synchronized (this.a.c) {
            ge geVar = new ge(map);
            String strC = geVar.c();
            if (strC == null) {
                hj.e("URL missing in loadAdUrl GMSG.");
                return;
            }
            if (strC.contains("%40mediation_adapters%40")) {
                hj.d("Ad request URL modified to " + strC.replaceAll("%40mediation_adapters%40", gr.a(hlVar.getContext(), (String) map.get("check_adapters"), this.a.e)));
            }
            this.a.g = geVar;
            this.a.c.notify();
        }
    }
}
