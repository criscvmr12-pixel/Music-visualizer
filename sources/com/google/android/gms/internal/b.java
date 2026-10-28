package com.google.android.gms.internal;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private final String a;
    private final JSONObject b;
    private final String c;
    private final String d;

    public b(String str, ew ewVar, String str2, JSONObject jSONObject) {
        this.d = ewVar.b;
        this.b = jSONObject;
        this.c = str;
        this.a = str2;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.d;
    }

    public JSONObject c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }
}
