package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class op implements Runnable {
    final /* synthetic */ oh a;
    final /* synthetic */ oo b;
    private final WeakReference c;

    op(oo ooVar, oh ohVar) {
        this.b = ooVar;
        this.a = ohVar;
        this.c = new WeakReference(this.a);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.b.d = false;
        oh ohVar = (oh) this.c.get();
        if (ohVar != null) {
            ohVar.b(this.b.c);
        }
    }
}
