package com.google.android.gms.internal;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class cj implements com.google.android.gms.ads.c.d, com.google.android.gms.ads.c.f {
    private final cc a;

    public cj(cc ccVar) {
        this.a = ccVar;
    }

    @Override // com.google.android.gms.ads.c.d
    public void a(com.google.android.gms.ads.c.c cVar) {
        ky.b("onAdLoaded must be called on the main UI thread.");
        hj.a("Adapter called onAdLoaded.");
        try {
            this.a.e();
        } catch (RemoteException e) {
            hj.c("Could not call onAdLoaded.", e);
        }
    }

    @Override // com.google.android.gms.ads.c.d
    public void a(com.google.android.gms.ads.c.c cVar, int i) {
        ky.b("onAdFailedToLoad must be called on the main UI thread.");
        hj.a("Adapter called onAdFailedToLoad with error. " + i);
        try {
            this.a.a(i);
        } catch (RemoteException e) {
            hj.c("Could not call onAdFailedToLoad.", e);
        }
    }

    @Override // com.google.android.gms.ads.c.f
    public void a(com.google.android.gms.ads.c.e eVar) {
        ky.b("onAdLoaded must be called on the main UI thread.");
        hj.a("Adapter called onAdLoaded.");
        try {
            this.a.e();
        } catch (RemoteException e) {
            hj.c("Could not call onAdLoaded.", e);
        }
    }

    @Override // com.google.android.gms.ads.c.f
    public void a(com.google.android.gms.ads.c.e eVar, int i) {
        ky.b("onAdFailedToLoad must be called on the main UI thread.");
        hj.a("Adapter called onAdFailedToLoad with error " + i + ".");
        try {
            this.a.a(i);
        } catch (RemoteException e) {
            hj.c("Could not call onAdFailedToLoad.", e);
        }
    }

    @Override // com.google.android.gms.ads.c.d
    public void b(com.google.android.gms.ads.c.c cVar) {
        ky.b("onAdOpened must be called on the main UI thread.");
        hj.a("Adapter called onAdOpened.");
        try {
            this.a.d();
        } catch (RemoteException e) {
            hj.c("Could not call onAdOpened.", e);
        }
    }

    @Override // com.google.android.gms.ads.c.f
    public void b(com.google.android.gms.ads.c.e eVar) {
        ky.b("onAdOpened must be called on the main UI thread.");
        hj.a("Adapter called onAdOpened.");
        try {
            this.a.d();
        } catch (RemoteException e) {
            hj.c("Could not call onAdOpened.", e);
        }
    }

    @Override // com.google.android.gms.ads.c.d
    public void c(com.google.android.gms.ads.c.c cVar) {
        ky.b("onAdClosed must be called on the main UI thread.");
        hj.a("Adapter called onAdClosed.");
        try {
            this.a.b();
        } catch (RemoteException e) {
            hj.c("Could not call onAdClosed.", e);
        }
    }

    @Override // com.google.android.gms.ads.c.f
    public void c(com.google.android.gms.ads.c.e eVar) {
        ky.b("onAdClosed must be called on the main UI thread.");
        hj.a("Adapter called onAdClosed.");
        try {
            this.a.b();
        } catch (RemoteException e) {
            hj.c("Could not call onAdClosed.", e);
        }
    }

    @Override // com.google.android.gms.ads.c.d
    public void d(com.google.android.gms.ads.c.c cVar) {
        ky.b("onAdLeftApplication must be called on the main UI thread.");
        hj.a("Adapter called onAdLeftApplication.");
        try {
            this.a.c();
        } catch (RemoteException e) {
            hj.c("Could not call onAdLeftApplication.", e);
        }
    }

    @Override // com.google.android.gms.ads.c.f
    public void d(com.google.android.gms.ads.c.e eVar) {
        ky.b("onAdLeftApplication must be called on the main UI thread.");
        hj.a("Adapter called onAdLeftApplication.");
        try {
            this.a.c();
        } catch (RemoteException e) {
            hj.c("Could not call onAdLeftApplication.", e);
        }
    }

    @Override // com.google.android.gms.ads.c.d
    public void e(com.google.android.gms.ads.c.c cVar) {
        ky.b("onAdClicked must be called on the main UI thread.");
        hj.a("Adapter called onAdClicked.");
        try {
            this.a.a();
        } catch (RemoteException e) {
            hj.c("Could not call onAdClicked.", e);
        }
    }
}
