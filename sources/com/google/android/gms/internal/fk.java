package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public class fk extends js {
    final int a;

    public fk(Context context, com.google.android.gms.common.c cVar, com.google.android.gms.common.d dVar, int i) {
        super(context, cVar, dVar, new String[0]);
        this.a = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.js
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public fr b(IBinder iBinder) {
        return ft.a(iBinder);
    }

    @Override // com.google.android.gms.internal.js
    protected String a() {
        return "com.google.android.gms.ads.service.START";
    }

    @Override // com.google.android.gms.internal.js
    protected void a(kp kpVar, jz jzVar) {
        kpVar.g(jzVar, this.a, j().getPackageName(), new Bundle());
    }

    @Override // com.google.android.gms.internal.js
    protected String b() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    public fr c() {
        return (fr) super.m();
    }
}
