package com.google.android.gms.internal;

import java.util.Date;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class cm {
    public static com.google.a.a.a a(aj ajVar) {
        return new com.google.a.a.a(new Date(ajVar.b), a(ajVar.d), ajVar.e != null ? new HashSet(ajVar.e) : null, ajVar.f, ajVar.k);
    }

    public static com.google.a.b a(int i) {
        switch (i) {
            case 1:
                return com.google.a.b.MALE;
            case 2:
                return com.google.a.b.FEMALE;
            default:
                return com.google.a.b.UNKNOWN;
        }
    }

    public static com.google.a.c a(am amVar) {
        com.google.a.c[] cVarArr = {com.google.a.c.a, com.google.a.c.b, com.google.a.c.c, com.google.a.c.d, com.google.a.c.e, com.google.a.c.f};
        for (int i = 0; i < cVarArr.length; i++) {
            if (cVarArr[i].a() == amVar.f && cVarArr[i].b() == amVar.c) {
                return cVarArr[i];
            }
        }
        return new com.google.a.c(com.google.android.gms.ads.h.a(amVar.f, amVar.c, amVar.b));
    }
}
