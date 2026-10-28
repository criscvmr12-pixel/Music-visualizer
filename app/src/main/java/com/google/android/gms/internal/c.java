package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c implements j {
    private final Object a = new Object();
    private WeakHashMap b = new WeakHashMap();
    private ArrayList c = new ArrayList();

    public d a(am amVar, gj gjVar) {
        d dVar;
        synchronized (this.a) {
            if (a(gjVar)) {
                dVar = (d) this.b.get(gjVar);
            } else {
                dVar = new d(amVar, gjVar);
                dVar.a(this);
                this.b.put(gjVar, dVar);
                this.c.add(dVar);
            }
        }
        return dVar;
    }

    public void a() {
        synchronized (this.a) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((d) it.next()).j();
            }
        }
    }

    @Override // com.google.android.gms.internal.j
    public void a(d dVar) {
        synchronized (this.a) {
            if (!dVar.e()) {
                this.c.remove(dVar);
            }
        }
    }

    public boolean a(gj gjVar) {
        boolean z;
        synchronized (this.a) {
            d dVar = (d) this.b.get(gjVar);
            z = dVar != null && dVar.e();
        }
        return z;
    }

    public void b() {
        synchronized (this.a) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((d) it.next()).k();
            }
        }
    }

    public void b(gj gjVar) {
        synchronized (this.a) {
            d dVar = (d) this.b.get(gjVar);
            if (dVar != null) {
                dVar.c();
            }
        }
    }

    public void c() {
        synchronized (this.a) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((d) it.next()).l();
            }
        }
    }
}
