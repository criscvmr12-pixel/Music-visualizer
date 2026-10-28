package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class gd {
    private String a;
    private String b;
    private String c;
    private List d;
    private String e;
    private String f;
    private List g;
    private List k;
    private long h = -1;
    private boolean i = false;
    private final long j = -1;
    private long l = -1;
    private int m = -1;

    private static String a(Map map, String str) {
        List list = (List) map.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    private static long b(Map map, String str) {
        List list = (List) map.get(str);
        if (list != null && !list.isEmpty()) {
            String str2 = (String) list.get(0);
            try {
                return (long) (Float.parseFloat(str2) * 1000.0f);
            } catch (NumberFormatException e) {
                hj.e("Could not parse float from " + str + " header: " + str2);
            }
        }
        return -1L;
    }

    private void b(Map map) {
        this.a = a(map, "X-Afma-Ad-Size");
    }

    private static List c(Map map, String str) {
        String str2;
        List list = (List) map.get(str);
        if (list == null || list.isEmpty() || (str2 = (String) list.get(0)) == null) {
            return null;
        }
        return Arrays.asList(str2.trim().split("\\s+"));
    }

    private void c(Map map) {
        List listC = c(map, "X-Afma-Click-Tracking-Urls");
        if (listC != null) {
            this.d = listC;
        }
    }

    private void d(Map map) {
        List list = (List) map.get("X-Afma-Debug-Dialog");
        if (list == null || list.isEmpty()) {
            return;
        }
        this.e = (String) list.get(0);
    }

    private void e(Map map) {
        List listC = c(map, "X-Afma-Tracking-Urls");
        if (listC != null) {
            this.g = listC;
        }
    }

    private void f(Map map) {
        long jB = b(map, "X-Afma-Interstitial-Timeout");
        if (jB != -1) {
            this.h = jB;
        }
    }

    private void g(Map map) {
        this.f = a(map, "X-Afma-ActiveView");
    }

    private void h(Map map) {
        List list = (List) map.get("X-Afma-Mediation");
        if (list == null || list.isEmpty()) {
            return;
        }
        this.i = Boolean.valueOf((String) list.get(0)).booleanValue();
    }

    private void i(Map map) {
        List listC = c(map, "X-Afma-Manual-Tracking-Urls");
        if (listC != null) {
            this.k = listC;
        }
    }

    private void j(Map map) {
        long jB = b(map, "X-Afma-Refresh-Rate");
        if (jB != -1) {
            this.l = jB;
        }
    }

    private void k(Map map) {
        List list = (List) map.get("X-Afma-Orientation");
        if (list == null || list.isEmpty()) {
            return;
        }
        String str = (String) list.get(0);
        if ("portrait".equalsIgnoreCase(str)) {
            this.m = gx.c();
        } else if ("landscape".equalsIgnoreCase(str)) {
            this.m = gx.b();
        }
    }

    public dv a(long j) {
        return new dv(this.b, this.c, this.d, this.g, this.h, this.i, -1L, this.k, this.l, this.m, this.a, j, this.e, this.f);
    }

    public void a(String str, Map map, String str2) {
        this.b = str;
        this.c = str2;
        a(map);
    }

    public void a(Map map) {
        b(map);
        c(map);
        d(map);
        e(map);
        f(map);
        h(map);
        i(map);
        j(map);
        k(map);
        g(map);
    }
}
