package com.google.android.gms.internal;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class et extends gs implements fd, hp {
    private final bw a;
    private final es b;
    private final hl c;
    private final Context e;
    private final fm g;
    private final nh h;
    private gs i;
    private dv j;
    private bk l;
    private bn m;
    private bs n;
    private final Object d = new Object();
    private final Object f = new Object();
    private boolean k = false;

    public et(Context context, fm fmVar, nh nhVar, hl hlVar, bw bwVar, es esVar) {
        this.a = bwVar;
        this.b = esVar;
        this.c = hlVar;
        this.e = context;
        this.g = fmVar;
        this.h = nhVar;
    }

    private am a(dt dtVar) throws ez {
        if (this.j.m == null) {
            throw new ez("The ad response must specify one of the supported ad sizes.", 0);
        }
        String[] strArrSplit = this.j.m.split("x");
        if (strArrSplit.length != 2) {
            throw new ez("Could not parse the ad size from the ad response: " + this.j.m, 0);
        }
        try {
            int i = Integer.parseInt(strArrSplit[0]);
            int i2 = Integer.parseInt(strArrSplit[1]);
            for (am amVar : dtVar.d.h) {
                float f = this.e.getResources().getDisplayMetrics().density;
                int i3 = amVar.f == -1 ? (int) (amVar.g / f) : amVar.f;
                int i4 = amVar.c == -2 ? (int) (amVar.d / f) : amVar.c;
                if (i == i3 && i2 == i4) {
                    return new am(amVar, dtVar.d.h);
                }
            }
            throw new ez("The ad size from the ad response was not one of the requested sizes: " + this.j.m, 0);
        } catch (NumberFormatException e) {
            throw new ez("Could not parse the ad size from the ad response: " + this.j.m, 0);
        }
    }

    private void a(dt dtVar, long j) throws ez {
        synchronized (this.d) {
            this.l = new bk(this.e, dtVar, this.a, this.m);
        }
        this.n = this.l.a(j, 60000L);
        switch (this.n.a) {
            case 0:
                return;
            case 1:
                throw new ez("No fill from any mediation ad networks.", 3);
            default:
                throw new ez("Unexpected mediation result: " + this.n.a, 0);
        }
    }

    private void b(long j) throws ez {
        hi.a.post(new ex(this));
        d(j);
    }

    private void c() throws ez {
        if (this.j.e == -3) {
            return;
        }
        if (TextUtils.isEmpty(this.j.c)) {
            throw new ez("No fill from ad server.", 3);
        }
        if (this.j.h) {
            try {
                this.m = new bn(this.j.c);
            } catch (JSONException e) {
                throw new ez("Could not parse mediation config: " + this.j.c, 0);
            }
        }
    }

    private void c(long j) throws ez {
        while (e(j)) {
            if (this.j != null) {
                synchronized (this.d) {
                    this.i = null;
                }
                if (this.j.e != -2 && this.j.e != -3) {
                    throw new ez("There was a problem getting an ad response. ErrorCode: " + this.j.e, this.j.e);
                }
                return;
            }
        }
        throw new ez("Timed out waiting for ad response.", 2);
    }

    private void d(long j) throws ez {
        while (e(j)) {
            if (this.k) {
                return;
            }
        }
        throw new ez("Timed out waiting for WebView to finish loading.", 2);
    }

    private boolean e(long j) throws ez {
        long jElapsedRealtime = 60000 - (SystemClock.elapsedRealtime() - j);
        if (jElapsedRealtime <= 0) {
            return false;
        }
        try {
            this.f.wait(jElapsedRealtime);
            return true;
        } catch (InterruptedException e) {
            throw new ez("Ad request cancelled.", -1);
        }
    }

    @Override // com.google.android.gms.internal.gs
    public void a() {
        long j;
        am amVar;
        JSONObject jSONObject;
        synchronized (this.f) {
            hj.a("AdLoaderBackgroundTask started.");
            dt dtVar = new dt(this.g, this.h.a().a(this.e));
            int iA = -2;
            try {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                gs gsVarA = fc.a(this.e, dtVar, this);
                synchronized (this.d) {
                    this.i = gsVarA;
                    if (this.i == null) {
                        throw new ez("Could not start the ad request service.", 0);
                    }
                }
                c(jElapsedRealtime);
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                c();
                am amVarA = dtVar.d.h != null ? a(dtVar) : null;
                if (this.j.h) {
                    a(dtVar, jElapsedRealtime);
                } else if (this.j.p) {
                    a(jElapsedRealtime);
                } else {
                    b(jElapsedRealtime);
                }
                j = jElapsedRealtime2;
                amVar = amVarA;
            } catch (ez e) {
                iA = e.a();
                if (iA == 3 || iA == -1) {
                    hj.c(e.getMessage());
                } else {
                    hj.e(e.getMessage());
                }
                if (this.j == null) {
                    this.j = new dv(iA);
                } else {
                    this.j = new dv(iA, this.j.k);
                }
                hi.a.post(new eu(this));
                j = -1;
                amVar = null;
            }
            if (TextUtils.isEmpty(this.j.r)) {
                jSONObject = null;
            } else {
                try {
                    jSONObject = new JSONObject(this.j.r);
                } catch (Exception e2) {
                    hj.b("Error parsing the JSON for Active View.", e2);
                    jSONObject = null;
                }
            }
            hi.a.post(new ev(this, new gj(dtVar.c, this.c, this.j.d, iA, this.j.f, this.j.j, this.j.l, this.j.k, dtVar.i, this.j.h, this.n != null ? this.n.b : null, this.n != null ? this.n.c : null, this.n != null ? this.n.d : null, this.m, this.n != null ? this.n.e : null, this.j.i, amVar, this.j.g, j, this.j.n, this.j.o, jSONObject)));
        }
    }

    protected void a(long j) throws ez {
        int i;
        int i2;
        am amVarE = this.c.e();
        if (amVarE.e) {
            i = this.e.getResources().getDisplayMetrics().widthPixels;
            i2 = this.e.getResources().getDisplayMetrics().heightPixels;
        } else {
            i = amVarE.g;
            i2 = amVarE.d;
        }
        fa faVar = new fa(this, this.c, i, i2);
        hi.a.post(new ey(this, faVar));
        d(j);
        if (faVar.c()) {
            hj.a("Ad-Network indicated no fill with passback URL.");
            throw new ez("AdNetwork sent passback url", 3);
        }
        if (!faVar.d()) {
            throw new ez("AdNetwork timed out", 2);
        }
    }

    @Override // com.google.android.gms.internal.fd
    public void a(dv dvVar) {
        synchronized (this.f) {
            hj.a("Received ad response.");
            this.j = dvVar;
            this.f.notify();
        }
    }

    @Override // com.google.android.gms.internal.hp
    public void a(hl hlVar) {
        synchronized (this.f) {
            hj.a("WebView finished loading.");
            this.k = true;
            this.f.notify();
        }
    }

    @Override // com.google.android.gms.internal.gs
    public void b() {
        synchronized (this.d) {
            if (this.i != null) {
                this.i.f();
            }
            this.c.stopLoading();
            gx.a(this.c);
            if (this.l != null) {
                this.l.a();
            }
        }
    }
}
