package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ch extends ca {
    private final com.google.android.gms.ads.c.b a;

    public ch(com.google.android.gms.ads.c.b bVar) {
        this.a = bVar;
    }

    private Bundle a(String str, int i, String str2) throws RemoteException {
        hj.e("Server parameters: " + str);
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.a instanceof com.google.a.a.a.a) {
                bundle.putString("adJson", str2);
                bundle.putInt("tagForChildDirectedTreatment", i);
            }
            return bundle;
        } catch (Throwable th) {
            hj.c("Could not get Server Parameters Bundle.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.bz
    public com.google.android.gms.a.a a() throws RemoteException {
        if (!(this.a instanceof com.google.android.gms.ads.c.c)) {
            hj.e("MediationAdapter is not a MediationBannerAdapter: " + this.a.getClass().getCanonicalName());
            throw new RemoteException();
        }
        try {
            return com.google.android.gms.a.d.a(((com.google.android.gms.ads.c.c) this.a).d());
        } catch (Throwable th) {
            hj.c("Could not get banner view from adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.bz
    public void a(com.google.android.gms.a.a aVar, aj ajVar, String str, cc ccVar) throws RemoteException {
        a(aVar, ajVar, str, (String) null, ccVar);
    }

    @Override // com.google.android.gms.internal.bz
    public void a(com.google.android.gms.a.a aVar, aj ajVar, String str, String str2, cc ccVar) throws RemoteException {
        if (!(this.a instanceof com.google.android.gms.ads.c.e)) {
            hj.e("MediationAdapter is not a MediationInterstitialAdapter: " + this.a.getClass().getCanonicalName());
            throw new RemoteException();
        }
        hj.a("Requesting interstitial ad from adapter.");
        try {
            com.google.android.gms.ads.c.e eVar = (com.google.android.gms.ads.c.e) this.a;
            eVar.a((Context) com.google.android.gms.a.d.a(aVar), new cj(ccVar), a(str, ajVar.g, str2), new cg(new Date(ajVar.b), ajVar.d, ajVar.e != null ? new HashSet(ajVar.e) : null, ajVar.f, ajVar.g), ajVar.m != null ? ajVar.m.getBundle(eVar.getClass().getName()) : null);
        } catch (Throwable th) {
            hj.c("Could not request interstitial ad from adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.bz
    public void a(com.google.android.gms.a.a aVar, am amVar, aj ajVar, String str, cc ccVar) throws RemoteException {
        a(aVar, amVar, ajVar, str, null, ccVar);
    }

    @Override // com.google.android.gms.internal.bz
    public void a(com.google.android.gms.a.a aVar, am amVar, aj ajVar, String str, String str2, cc ccVar) throws RemoteException {
        if (!(this.a instanceof com.google.android.gms.ads.c.c)) {
            hj.e("MediationAdapter is not a MediationBannerAdapter: " + this.a.getClass().getCanonicalName());
            throw new RemoteException();
        }
        hj.a("Requesting banner ad from adapter.");
        try {
            com.google.android.gms.ads.c.c cVar = (com.google.android.gms.ads.c.c) this.a;
            cVar.a((Context) com.google.android.gms.a.d.a(aVar), new cj(ccVar), a(str, ajVar.g, str2), com.google.android.gms.ads.h.a(amVar.f, amVar.c, amVar.b), new cg(new Date(ajVar.b), ajVar.d, ajVar.e != null ? new HashSet(ajVar.e) : null, ajVar.f, ajVar.g), ajVar.m != null ? ajVar.m.getBundle(cVar.getClass().getName()) : null);
        } catch (Throwable th) {
            hj.c("Could not request banner ad from adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.bz
    public void b() throws RemoteException {
        if (!(this.a instanceof com.google.android.gms.ads.c.e)) {
            hj.e("MediationAdapter is not a MediationInterstitialAdapter: " + this.a.getClass().getCanonicalName());
            throw new RemoteException();
        }
        hj.a("Showing interstitial from adapter.");
        try {
            ((com.google.android.gms.ads.c.e) this.a).e();
        } catch (Throwable th) {
            hj.c("Could not show interstitial from adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.bz
    public void c() throws RemoteException {
        try {
            this.a.a();
        } catch (Throwable th) {
            hj.c("Could not destroy adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.bz
    public void d() throws RemoteException {
        try {
            this.a.b();
        } catch (Throwable th) {
            hj.c("Could not pause adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.bz
    public void e() throws RemoteException {
        try {
            this.a.c();
        } catch (Throwable th) {
            hj.c("Could not resume adapter.", th);
            throw new RemoteException();
        }
    }
}
