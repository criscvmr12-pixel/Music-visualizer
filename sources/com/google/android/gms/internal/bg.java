package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bg implements bc {
    private final bd a;

    public bg(bd bdVar) {
        this.a = bdVar;
    }

    private static boolean a(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    private static int b(Map map) {
        String str = (String) map.get("o");
        if (str != null) {
            if ("p".equalsIgnoreCase(str)) {
                return gx.c();
            }
            if ("l".equalsIgnoreCase(str)) {
                return gx.b();
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.bc
    public void a(hl hlVar, Map map) {
        String str = (String) map.get("a");
        if (str == null) {
            hj.e("Action missing from an open GMSG.");
            return;
        }
        hn hnVarF = hlVar.f();
        if ("expand".equalsIgnoreCase(str)) {
            if (hlVar.i()) {
                hj.e("Cannot expand WebView that is already expanded.");
                return;
            } else {
                hnVarF.a(a(map), b(map));
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str)) {
            String str2 = (String) map.get("u");
            if (str2 != null) {
                hnVarF.a(a(map), b(map), str2);
                return;
            } else {
                hnVarF.a(a(map), b(map), (String) map.get("html"), (String) map.get("baseurl"));
                return;
            }
        }
        if (!"in_app_purchase".equalsIgnoreCase(str)) {
            hnVarF.a(new cf((String) map.get("i"), (String) map.get("u"), (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e")));
            return;
        }
        String str3 = (String) map.get("product_id");
        String str4 = (String) map.get("report_urls");
        if (this.a != null) {
            if (str4 == null || str4.isEmpty()) {
                this.a.a(str3, new ArrayList());
            } else {
                this.a.a(str3, new ArrayList(Arrays.asList(str4.split(" "))));
            }
        }
    }
}
