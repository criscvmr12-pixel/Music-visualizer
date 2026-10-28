package com.google.android.gms.internal;

import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bv extends bx {
    private Map a;

    private bz b(String str) throws RemoteException {
        try {
            Class<?> cls = Class.forName(str, false, bv.class.getClassLoader());
            if (com.google.a.a.b.class.isAssignableFrom(cls)) {
                com.google.a.a.b bVar = (com.google.a.a.b) cls.newInstance();
                return new ck(bVar, (com.google.a.a.j) this.a.get(bVar.b()));
            }
            if (com.google.android.gms.ads.c.b.class.isAssignableFrom(cls)) {
                return new ch((com.google.android.gms.ads.c.b) cls.newInstance());
            }
            hj.e("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
            throw new RemoteException();
        } catch (Throwable th) {
            hj.e("Could not instantiate mediation adapter: " + str + ". " + th.getMessage());
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.bw
    public bz a(String str) {
        return b(str);
    }

    public void a(Map map) {
        this.a = map;
    }
}
