package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class fi extends ff implements com.google.android.gms.common.c, com.google.android.gms.common.d {
    private final fd a;
    private final fk b;
    private final Object c;

    public fi(Context context, dt dtVar, fd fdVar) {
        super(dtVar, fdVar);
        this.c = new Object();
        this.a = fdVar;
        this.b = new fk(context, this, this, dtVar.k.d);
        this.b.f();
    }

    @Override // com.google.android.gms.common.c
    public void a(Bundle bundle) {
        e();
    }

    @Override // com.google.android.gms.common.d
    public void a(com.google.android.gms.common.a aVar) {
        this.a.a(new dv(0));
    }

    @Override // com.google.android.gms.internal.ff
    public void c() {
        synchronized (this.c) {
            if (this.b.g() || this.b.h()) {
                this.b.i();
            }
        }
    }

    @Override // com.google.android.gms.internal.ff
    public fr d() {
        fr frVarC;
        synchronized (this.c) {
            try {
                frVarC = this.b.c();
            } catch (IllegalStateException e) {
                frVarC = null;
            }
        }
        return frVarC;
    }

    @Override // com.google.android.gms.common.c
    public void m_() {
        hj.a("Disconnected from remote ad request service.");
    }
}
