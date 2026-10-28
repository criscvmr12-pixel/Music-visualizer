package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class al {
    private final bv a;
    private final r b;
    private com.google.android.gms.ads.a c;
    private z d;
    private com.google.android.gms.ads.e[] e;
    private String f;
    private String g;
    private ViewGroup h;
    private com.google.android.gms.ads.a.a i;
    private com.google.android.gms.ads.d.b j;
    private com.google.android.gms.ads.d.d k;

    public al(ViewGroup viewGroup) {
        this(viewGroup, null, false, r.a());
    }

    al(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, r rVar) {
        this.a = new bv();
        this.h = viewGroup;
        this.b = rVar;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                u uVar = new u(context, attributeSet);
                this.e = uVar.a(z);
                this.f = uVar.a();
                if (viewGroup.isInEditMode()) {
                    hi.a(viewGroup, new am(context, this.e[0]), "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                hi.a(viewGroup, new am(context, com.google.android.gms.ads.e.a), e.getMessage(), e.getMessage());
            }
        }
    }

    private void h() {
        try {
            com.google.android.gms.a.a aVarA = this.d.a();
            if (aVarA == null) {
                return;
            }
            this.h.addView((View) com.google.android.gms.a.d.a(aVarA));
        } catch (RemoteException e) {
            hj.c("Failed to get an ad frame.", e);
        }
    }

    private void i() {
        if ((this.e == null || this.f == null) && this.d == null) {
            throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
        }
        Context context = this.h.getContext();
        this.d = p.a(context, new am(context, this.e), this.f, this.a);
        if (this.c != null) {
            this.d.a(new o(this.c));
        }
        if (this.i != null) {
            this.d.a(new t(this.i));
        }
        if (this.j != null) {
            this.d.a(new en(this.j));
        }
        if (this.k != null) {
            this.d.a(new eq(this.k), this.g);
        }
        h();
    }

    public void a() {
        try {
            if (this.d != null) {
                this.d.b();
            }
        } catch (RemoteException e) {
            hj.c("Failed to destroy AdView.", e);
        }
    }

    public void a(com.google.android.gms.ads.a aVar) {
        try {
            this.c = aVar;
            if (this.d != null) {
                this.d.a(aVar != null ? new o(aVar) : null);
            }
        } catch (RemoteException e) {
            hj.c("Failed to set the AdListener.", e);
        }
    }

    public void a(com.google.android.gms.ads.d.b bVar) {
        if (this.k != null) {
            throw new IllegalStateException("Play store purchase parameter has already been set.");
        }
        try {
            this.j = bVar;
            if (this.d != null) {
                this.d.a(bVar != null ? new en(bVar) : null);
            }
        } catch (RemoteException e) {
            hj.c("Failed to set the InAppPurchaseListener.", e);
        }
    }

    public void a(ai aiVar) {
        try {
            if (this.d == null) {
                i();
            }
            if (this.d.a(this.b.a(this.h.getContext(), aiVar))) {
                this.a.a(aiVar.i());
            }
        } catch (RemoteException e) {
            hj.c("Failed to load ad.", e);
        }
    }

    public void a(String str) {
        if (this.f != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.f = str;
    }

    public void a(com.google.android.gms.ads.e... eVarArr) {
        if (this.e != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        b(eVarArr);
    }

    public com.google.android.gms.ads.a b() {
        return this.c;
    }

    public void b(com.google.android.gms.ads.e... eVarArr) {
        this.e = eVarArr;
        try {
            if (this.d != null) {
                this.d.a(new am(this.h.getContext(), this.e));
            }
        } catch (RemoteException e) {
            hj.c("Failed to set the ad size.", e);
        }
        this.h.requestLayout();
    }

    public com.google.android.gms.ads.e c() {
        try {
            if (this.d != null) {
                return this.d.i().a();
            }
        } catch (RemoteException e) {
            hj.c("Failed to get the current AdSize.", e);
        }
        if (this.e != null) {
            return this.e[0];
        }
        return null;
    }

    public String d() {
        return this.f;
    }

    public com.google.android.gms.ads.d.b e() {
        return this.j;
    }

    public void f() {
        try {
            if (this.d != null) {
                this.d.d();
            }
        } catch (RemoteException e) {
            hj.c("Failed to call pause.", e);
        }
    }

    public void g() {
        try {
            if (this.d != null) {
                this.d.e();
            }
        } catch (RemoteException e) {
            hj.c("Failed to call resume.", e);
        }
    }
}
