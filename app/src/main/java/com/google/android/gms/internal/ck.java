package com.google.android.gms.internal;

import android.app.Activity;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ck extends ca {
    private final com.google.a.a.b a;
    private final com.google.a.a.j b;

    public ck(com.google.a.a.b bVar, com.google.a.a.j jVar) {
        this.a = bVar;
        this.b = jVar;
    }

    private com.google.a.a.g a(String str, int i, String str2) throws RemoteException {
        HashMap map;
        try {
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                map = new HashMap(jSONObject.length());
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject.getString(next));
                }
            } else {
                map = new HashMap(0);
            }
            Class clsC = this.a.c();
            if (clsC == null) {
                return null;
            }
            com.google.a.a.g gVar = (com.google.a.a.g) clsC.newInstance();
            gVar.a(map);
            return gVar;
        } catch (Throwable th) {
            hj.c("Could not get MediationServerParameters.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.bz
    public com.google.android.gms.a.a a() throws RemoteException {
        if (!(this.a instanceof com.google.a.a.c)) {
            hj.e("MediationAdapter is not a MediationBannerAdapter: " + this.a.getClass().getCanonicalName());
            throw new RemoteException();
        }
        try {
            return com.google.android.gms.a.d.a(((com.google.a.a.c) this.a).d());
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
        if (!(this.a instanceof com.google.a.a.e)) {
            hj.e("MediationAdapter is not a MediationInterstitialAdapter: " + this.a.getClass().getCanonicalName());
            throw new RemoteException();
        }
        hj.a("Requesting interstitial ad from adapter.");
        try {
            ((com.google.a.a.e) this.a).a(new cl(ccVar), (Activity) com.google.android.gms.a.d.a(aVar), a(str, ajVar.g, str2), cm.a(ajVar), this.b);
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
        if (!(this.a instanceof com.google.a.a.c)) {
            hj.e("MediationAdapter is not a MediationBannerAdapter: " + this.a.getClass().getCanonicalName());
            throw new RemoteException();
        }
        hj.a("Requesting banner ad from adapter.");
        try {
            ((com.google.a.a.c) this.a).a(new cl(ccVar), (Activity) com.google.android.gms.a.d.a(aVar), a(str, ajVar.g, str2), cm.a(amVar), cm.a(ajVar), this.b);
        } catch (Throwable th) {
            hj.c("Could not request banner ad from adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.bz
    public void b() throws RemoteException {
        if (!(this.a instanceof com.google.a.a.e)) {
            hj.e("MediationAdapter is not a MediationInterstitialAdapter: " + this.a.getClass().getCanonicalName());
            throw new RemoteException();
        }
        hj.a("Showing interstitial from adapter.");
        try {
            ((com.google.a.a.e) this.a).d();
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
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.bz
    public void e() throws RemoteException {
        throw new RemoteException();
    }
}
