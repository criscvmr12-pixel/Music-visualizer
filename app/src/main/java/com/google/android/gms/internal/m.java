package com.google.android.gms.internal;

import android.content.Context;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class m implements k {
    private final hl a;

    public m(Context context, ew ewVar) {
        this.a = hl.a(context, new am(), false, false, null, ewVar);
    }

    @Override // com.google.android.gms.internal.k
    public void a() {
        gx.a(this.a);
    }

    @Override // com.google.android.gms.internal.k
    public void a(l lVar) {
        this.a.f().a(new n(this, lVar));
    }

    @Override // com.google.android.gms.internal.k
    public void a(String str) {
        this.a.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.k
    public void a(String str, bc bcVar) {
        this.a.f().a(str, bcVar);
    }

    @Override // com.google.android.gms.internal.k
    public void a(String str, JSONObject jSONObject) {
        this.a.a(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.k
    public void b() {
        gx.b(this.a);
    }

    @Override // com.google.android.gms.internal.k
    public void b(String str) {
        this.a.f().a(str, (bc) null);
    }
}
