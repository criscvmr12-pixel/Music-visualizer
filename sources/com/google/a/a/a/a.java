package com.google.a.a.a;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.c.e;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.f;
import com.google.android.gms.ads.g;
import com.google.android.gms.internal.hi;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class a implements com.google.android.gms.ads.c.c, e {
    private f a;
    private g b;

    private static com.google.android.gms.ads.b a(Context context, com.google.android.gms.ads.c.a aVar, Bundle bundle, Bundle bundle2) {
        d dVar = new d();
        Date dateA = aVar.a();
        if (dateA != null) {
            dVar.a(dateA);
        }
        int iB = aVar.b();
        if (iB != 0) {
            dVar.a(iB);
        }
        Set setC = aVar.c();
        if (setC != null) {
            Iterator it = setC.iterator();
            while (it.hasNext()) {
                dVar.a((String) it.next());
            }
        }
        if (aVar.d()) {
            dVar.b(hi.a(context));
        }
        if (bundle2.getInt("tagForChildDirectedTreatment") != -1) {
            dVar.a(bundle2.getInt("tagForChildDirectedTreatment") == 1);
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putInt("gw", 1);
        bundle.putString("mad_hac", bundle2.getString("mad_hac"));
        if (!TextUtils.isEmpty(bundle2.getString("adJson"))) {
            bundle.putString("_ad", bundle2.getString("adJson"));
        }
        bundle.putBoolean("_noRefresh", true);
        dVar.a(a.class, bundle);
        return dVar.a();
    }

    @Override // com.google.android.gms.ads.c.b
    public void a() {
        if (this.a != null) {
            this.a.a();
            this.a = null;
        }
        if (this.b != null) {
            this.b = null;
        }
    }

    @Override // com.google.android.gms.ads.c.c
    public void a(Context context, com.google.android.gms.ads.c.d dVar, Bundle bundle, com.google.android.gms.ads.e eVar, com.google.android.gms.ads.c.a aVar, Bundle bundle2) {
        this.a = new f(context);
        this.a.setAdSize(new com.google.android.gms.ads.e(eVar.b(), eVar.a()));
        this.a.setAdUnitId(bundle.getString("pubid"));
        this.a.setAdListener(new b(this, dVar));
        this.a.a(a(context, aVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.c.e
    public void a(Context context, com.google.android.gms.ads.c.f fVar, Bundle bundle, com.google.android.gms.ads.c.a aVar, Bundle bundle2) {
        this.b = new g(context);
        this.b.a(bundle.getString("pubid"));
        this.b.a(new c(this, fVar));
        this.b.a(a(context, aVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.c.b
    public void b() {
        if (this.a != null) {
            this.a.b();
        }
    }

    @Override // com.google.android.gms.ads.c.b
    public void c() {
        if (this.a != null) {
            this.a.c();
        }
    }

    @Override // com.google.android.gms.ads.c.c
    public View d() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.c.e
    public void e() {
        this.b.b();
    }
}
