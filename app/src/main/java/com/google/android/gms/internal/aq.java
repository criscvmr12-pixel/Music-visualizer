package com.google.android.gms.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class aq implements bc {
    private final ar a;

    public aq(ar arVar) {
        this.a = arVar;
    }

    @Override // com.google.android.gms.internal.bc
    public void a(hl hlVar, Map map) {
        String str = (String) map.get("name");
        if (str == null) {
            hj.e("App event with no name parameter.");
        } else {
            this.a.a(str, (String) map.get("info"));
        }
    }
}
