package com.google.android.gms.internal;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public abstract class ff extends gs {
    private final dt a;
    private final fd b;

    public ff(dt dtVar, fd fdVar) {
        this.a = dtVar;
        this.b = fdVar;
    }

    private static dv a(fr frVar, dt dtVar) {
        try {
            return frVar.a(dtVar);
        } catch (RemoteException e) {
            hj.c("Could not fetch ad response from ad request service.", e);
            return null;
        } catch (NullPointerException e2) {
            hj.c("Could not fetch ad response from ad request service due to an Exception.", e2);
            return null;
        } catch (SecurityException e3) {
            hj.c("Could not fetch ad response from ad request service due to an Exception.", e3);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.gs
    public final void a() {
        dv dvVarA;
        try {
            fr frVarD = d();
            if (frVarD == null || (dvVarA = a(frVarD, this.a)) == null) {
                dvVarA = new dv(0);
            }
            c();
            this.b.a(dvVarA);
        } catch (Throwable th) {
            c();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.gs
    public final void b() {
        c();
    }

    public abstract void c();

    public abstract fr d();
}
