package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class kc implements com.google.android.gms.common.api.d {
    private final com.google.android.gms.common.d a;

    public kc(com.google.android.gms.common.d dVar) {
        this.a = dVar;
    }

    @Override // com.google.android.gms.common.d
    public void a(com.google.android.gms.common.a aVar) {
        this.a.a(aVar);
    }

    public boolean equals(Object obj) {
        return obj instanceof kc ? this.a.equals(((kc) obj).a) : this.a.equals(obj);
    }
}
