package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class an {
    private final bv a;
    private final Context b;
    private final r c;
    private com.google.android.gms.ads.a d;
    private z e;
    private String f;
    private String g;
    private com.google.android.gms.ads.a.a h;
    private com.google.android.gms.ads.d.d i;
    private com.google.android.gms.ads.d.b j;

    public an(Context context) {
        this(context, r.a());
    }

    public an(Context context, r rVar) {
        this.a = new bv();
        this.b = context;
        this.c = rVar;
    }

    private void b(String str) {
        if (this.f == null) {
            c(str);
        }
        this.e = p.a(this.b, new am(), this.f, this.a);
        if (this.d != null) {
            this.e.a(new o(this.d));
        }
        if (this.h != null) {
            this.e.a(new t(this.h));
        }
        if (this.j != null) {
            this.e.a(new en(this.j));
        }
        if (this.i != null) {
            this.e.a(new eq(this.i), this.g);
        }
    }

    private void c(String str) {
        if (this.e == null) {
            throw new IllegalStateException("The ad unit ID must be set on InterstitialAd before " + str + " is called.");
        }
    }

    public void a(com.google.android.gms.ads.a aVar) {
        try {
            this.d = aVar;
            if (this.e != null) {
                this.e.a(aVar != null ? new o(aVar) : null);
            }
        } catch (RemoteException e) {
            hj.c("Failed to set the AdListener.", e);
        }
    }

    public void a(ai aiVar) {
        try {
            if (this.e == null) {
                b("loadAd");
            }
            if (this.e.a(this.c.a(this.b, aiVar))) {
                this.a.a(aiVar.i());
            }
        } catch (RemoteException e) {
            hj.c("Failed to load ad.", e);
        }
    }

    public void a(String str) {
        if (this.f != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
        }
        this.f = str;
    }

    public boolean a() {
        try {
            if (this.e == null) {
                return false;
            }
            return this.e.c();
        } catch (RemoteException e) {
            hj.c("Failed to check if ad is ready.", e);
            return false;
        }
    }

    public void b() {
        try {
            c("show");
            this.e.f();
        } catch (RemoteException e) {
            hj.c("Failed to show interstitial.", e);
        }
    }
}
