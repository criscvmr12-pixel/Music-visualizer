package com.google.android.gms.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class jy implements com.google.android.gms.common.api.c {
    private final com.google.android.gms.common.c a;

    public jy(com.google.android.gms.common.c cVar) {
        this.a = cVar;
    }

    @Override // com.google.android.gms.common.api.c
    public void a(int i) {
        this.a.m_();
    }

    @Override // com.google.android.gms.common.api.c
    public void a(Bundle bundle) {
        this.a.a(bundle);
    }

    public boolean equals(Object obj) {
        return obj instanceof jy ? this.a.equals(((jy) obj).a) : this.a.equals(obj);
    }
}
