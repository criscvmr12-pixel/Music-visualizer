package com.google.android.gms.internal;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ns extends nt {
    protected List e;

    @Override // com.google.android.gms.internal.nt
    public void a(nq nqVar) throws nr {
        int size = this.e == null ? 0 : this.e.size();
        for (int i = 0; i < size; i++) {
            nv nvVar = (nv) this.e.get(i);
            nqVar.e(nvVar.a);
            nqVar.b(nvVar.b);
        }
    }

    @Override // com.google.android.gms.internal.nt
    protected int b() {
        int size = this.e == null ? 0 : this.e.size();
        int iF = 0;
        for (int i = 0; i < size; i++) {
            nv nvVar = (nv) this.e.get(i);
            iF = iF + nq.f(nvVar.a) + nvVar.b.length;
        }
        return iF;
    }
}
