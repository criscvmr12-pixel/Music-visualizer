package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class ge {
    private final List a;
    private final List b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final boolean h;
    private final int i;

    public ge(Map map) {
        this.g = (String) map.get("url");
        this.d = (String) map.get("base_uri");
        this.e = (String) map.get("post_parameters");
        this.h = a((String) map.get("drt_include"));
        this.c = (String) map.get("activation_overlay_url");
        this.b = b((String) map.get("check_packages"));
        this.i = c((String) map.get("request_id"));
        this.f = (String) map.get("type");
        this.a = b((String) map.get("errors"));
    }

    private static boolean a(String str) {
        return str != null && (str.equals("1") || str.equals("true"));
    }

    private List b(String str) {
        if (str == null) {
            return null;
        }
        return Arrays.asList(str.split(","));
    }

    private int c(String str) {
        if (str == null) {
            return 0;
        }
        return Integer.parseInt(str);
    }

    public List a() {
        return this.a;
    }

    public String b() {
        return this.e;
    }

    public String c() {
        return this.g;
    }

    public String d() {
        return this.f;
    }

    public boolean e() {
        return this.h;
    }
}
