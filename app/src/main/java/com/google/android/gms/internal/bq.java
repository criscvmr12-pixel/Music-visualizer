package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class bq implements bt {
    private final String a;
    private final bw b;
    private final long c;
    private final bm d;
    private final aj e;
    private final am f;
    private final Context g;
    private final ew i;
    private bz j;
    private final Object h = new Object();
    private int k = -2;

    public bq(Context context, String str, bw bwVar, bn bnVar, bm bmVar, aj ajVar, am amVar, ew ewVar) {
        this.g = context;
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            this.a = a(bmVar);
        } else {
            this.a = str;
        }
        this.b = bwVar;
        this.c = bnVar.b != -1 ? bnVar.b : 10000L;
        this.d = bmVar;
        this.e = ajVar;
        this.f = amVar;
        this.i = ewVar;
    }

    private String a(bm bmVar) {
        try {
            return (TextUtils.isEmpty(bmVar.e) || !com.google.android.gms.ads.c.a.a.class.isAssignableFrom(Class.forName(bmVar.e, false, bq.class.getClassLoader()))) ? "com.google.ads.mediation.customevent.CustomEventAdapter" : "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";
        } catch (ClassNotFoundException e) {
            hj.e("Could not create custom event adapter.");
        }
    }

    private void a(long j, long j2, long j3, long j4) {
        while (this.k == -2) {
            b(j, j2, j3, j4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(bp bpVar) {
        try {
            if (this.i.d < 4100000) {
                if (this.f.e) {
                    this.j.a(com.google.android.gms.a.d.a(this.g), this.e, this.d.g, bpVar);
                } else {
                    this.j.a(com.google.android.gms.a.d.a(this.g), this.f, this.e, this.d.g, bpVar);
                }
            } else if (this.f.e) {
                this.j.a(com.google.android.gms.a.d.a(this.g), this.e, this.d.g, this.d.a, bpVar);
            } else {
                this.j.a(com.google.android.gms.a.d.a(this.g), this.f, this.e, this.d.g, this.d.a, bpVar);
            }
        } catch (RemoteException e) {
            hj.c("Could not request ad from mediation adapter.", e);
            a(5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public bz b() {
        hj.c("Instantiating mediation adapter: " + this.a);
        try {
            return this.b.a(this.a);
        } catch (RemoteException e) {
            hj.a("Could not instantiate mediation adapter: " + this.a, e);
            return null;
        }
    }

    private void b(long j, long j2, long j3, long j4) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j5 = j2 - (jElapsedRealtime - j);
        long j6 = j4 - (jElapsedRealtime - j3);
        if (j5 <= 0 || j6 <= 0) {
            hj.c("Timed out waiting for adapter.");
            this.k = 3;
        } else {
            try {
                this.h.wait(Math.min(j5, j6));
            } catch (InterruptedException e) {
                this.k = -1;
            }
        }
    }

    public bs a(long j, long j2) {
        bs bsVar;
        synchronized (this.h) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            bp bpVar = new bp();
            hi.a.post(new br(this, bpVar));
            a(jElapsedRealtime, this.c, j, j2);
            bsVar = new bs(this.d, this.j, this.a, bpVar, this.k);
        }
        return bsVar;
    }

    public void a() {
        synchronized (this.h) {
            try {
                if (this.j != null) {
                    this.j.c();
                }
            } catch (RemoteException e) {
                hj.c("Could not destroy mediation adapter.", e);
            }
            this.k = -1;
            this.h.notify();
        }
    }

    @Override // com.google.android.gms.internal.bt
    public void a(int i) {
        synchronized (this.h) {
            this.k = i;
            this.h.notify();
        }
    }
}
