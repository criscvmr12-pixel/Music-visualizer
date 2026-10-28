package com.symbolic.pitchlab;

/* JADX INFO: loaded from: classes.dex */
public class bm {
    private static com.google.android.gms.ads.g a = null;

    public static void a() {
        if (a == null || !a.a()) {
            return;
        }
        a.b();
    }

    public static com.google.android.gms.ads.b b() {
        return new com.google.android.gms.ads.d().a();
    }
}
