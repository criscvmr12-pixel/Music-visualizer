package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class fx implements hp {
    final /* synthetic */ String a;

    fx(String str) {
        this.a = str;
    }

    @Override // com.google.android.gms.internal.hp
    public void a(hl hlVar) {
        String str = String.format("javascript:%s(%s);", "AFMA_buildAdURL", this.a);
        hj.d("About to execute: " + str);
        hlVar.loadUrl(str);
    }
}
