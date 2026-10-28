package com.google.android.gms.internal;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class av implements bc {
    av() {
    }

    @Override // com.google.android.gms.internal.bc
    public void a(hl hlVar, Map map) {
        Uri uriA;
        String str = (String) map.get("u");
        if (str == null) {
            hj.e("URL missing from click GMSG.");
            return;
        }
        Uri uri = Uri.parse(str);
        try {
            nh nhVarG = hlVar.g();
            uriA = (nhVarG == null || !nhVarG.a(uri)) ? uri : nhVarG.a(uri, hlVar.getContext());
        } catch (np e) {
            hj.e("Unable to append parameter to URL: " + str);
        }
        new hh(hlVar.getContext(), hlVar.h().b, uriA.toString()).e();
    }
}
