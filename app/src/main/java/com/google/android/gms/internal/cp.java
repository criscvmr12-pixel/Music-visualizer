package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes.dex */
public class cp extends df {
    private static final int a = Color.argb(0, 0, 0, 0);
    private final Activity b;
    private ci c;
    private cx d;
    private hl e;
    private cu f;
    private da g;
    private boolean h;
    private FrameLayout i;
    private WebChromeClient.CustomViewCallback j;
    private boolean k = false;
    private boolean l = false;
    private boolean m = false;
    private RelativeLayout n;

    public cp(Activity activity) {
        this.b = activity;
    }

    public static void a(Context context, ci ciVar) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", ciVar.n.e);
        ci.a(intent, ciVar);
        intent.addFlags(524288);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    private static RelativeLayout.LayoutParams c(int i, int i2, int i3, int i4) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        layoutParams.addRule(10);
        layoutParams.addRule(9);
        return layoutParams;
    }

    private void c(boolean z) throws cs {
        if (!this.h) {
            this.b.requestWindowFeature(1);
        }
        Window window = this.b.getWindow();
        if (!this.m || this.c.q.c) {
            window.setFlags(1024, 1024);
        }
        a(this.c.k);
        if (Build.VERSION.SDK_INT >= 11) {
            hj.a("Enabling hardware acceleration on the AdActivity window.");
            hf.a(window);
        }
        this.n = new ct(this.b, this.c.p);
        if (this.m) {
            this.n.setBackgroundColor(a);
        } else {
            this.n.setBackgroundColor(-16777216);
        }
        this.b.setContentView(this.n);
        j();
        boolean zA = this.c.e.f().a();
        if (z) {
            this.e = hl.a(this.b, this.c.e.e(), true, zA, null, this.c.n);
            this.e.f().a(null, null, this.c.f, this.c.j, true, this.c.o);
            this.e.f().a(new cq(this));
            if (this.c.m != null) {
                this.e.loadUrl(this.c.m);
            } else {
                if (this.c.i == null) {
                    throw new cs("No URL or HTML to display in ad overlay.");
                }
                this.e.loadDataWithBaseURL(this.c.g, this.c.i, "text/html", "UTF-8", null);
            }
        } else {
            this.e = this.c.e;
            this.e.setContext(this.b);
        }
        this.e.a(this);
        ViewParent parent = this.e.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            ((ViewGroup) parent).removeView(this.e);
        }
        if (this.m) {
            this.e.setBackgroundColor(a);
        }
        this.n.addView(this.e, -1, -1);
        if (!z) {
            this.e.c();
        }
        a(zA);
    }

    private void l() {
        if (!this.b.isFinishing() || this.l) {
            return;
        }
        this.l = true;
        if (this.b.isFinishing()) {
            if (this.e != null) {
                this.e.b();
                this.n.removeView(this.e);
                if (this.f != null) {
                    this.e.a(false);
                    this.f.c.addView(this.e, this.f.a, this.f.b);
                }
            }
            if (this.c == null || this.c.d == null) {
                return;
            }
            this.c.d.o();
        }
    }

    public void a() {
        this.b.finish();
    }

    public void a(int i) {
        this.b.setRequestedOrientation(i);
    }

    public void a(int i, int i2, int i3, int i4) {
        if (this.d != null) {
            this.d.setLayoutParams(c(i, i2, i3, i4));
        }
    }

    @Override // com.google.android.gms.internal.de
    public void a(Bundle bundle) {
        this.k = bundle != null ? bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false) : false;
        try {
            this.c = ci.a(this.b.getIntent());
            if (this.c.q != null) {
                this.m = this.c.q.b;
            } else {
                this.m = false;
            }
            if (this.c == null) {
                throw new cs("Could not get info for ad overlay.");
            }
            if (bundle == null) {
                if (this.c.d != null) {
                    this.c.d.p();
                }
                if (this.c.l != 1 && this.c.c != null) {
                    this.c.c.r();
                }
            }
            switch (this.c.l) {
                case 1:
                    c(false);
                    return;
                case 2:
                    this.f = new cu(this.c.e);
                    c(false);
                    return;
                case 3:
                    c(true);
                    return;
                case 4:
                    if (this.k) {
                        this.b.finish();
                        return;
                    } else {
                        if (cn.a(this.b, this.c.b, this.c.j)) {
                            return;
                        }
                        this.b.finish();
                        return;
                    }
                default:
                    throw new cs("Could not determine ad overlay type.");
            }
        } catch (cs e) {
            hj.e(e.getMessage());
            this.b.finish();
        }
    }

    public void a(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        this.i = new FrameLayout(this.b);
        this.i.setBackgroundColor(-16777216);
        this.i.addView(view, -1, -1);
        this.b.setContentView(this.i);
        j();
        this.j = customViewCallback;
    }

    public void a(boolean z) {
        this.g = new da(this.b, z ? 50 : 32);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        this.g.a(this.c.h);
        this.n.addView(this.g, layoutParams);
    }

    public cx b() {
        return this.d;
    }

    public void b(int i, int i2, int i3, int i4) {
        if (this.d == null) {
            this.d = new cx(this.b, this.e);
            this.n.addView(this.d, 0, c(i, i2, i3, i4));
            this.e.f().a(false);
        }
    }

    @Override // com.google.android.gms.internal.de
    public void b(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.k);
    }

    public void b(boolean z) {
        if (this.g != null) {
            this.g.a(z);
        }
    }

    public void c() {
        if (this.c != null) {
            a(this.c.k);
        }
        if (this.i != null) {
            this.b.setContentView(this.n);
            j();
            this.i.removeAllViews();
            this.i = null;
        }
        if (this.j != null) {
            this.j.onCustomViewHidden();
            this.j = null;
        }
    }

    @Override // com.google.android.gms.internal.de
    public void d() {
    }

    @Override // com.google.android.gms.internal.de
    public void e() {
    }

    @Override // com.google.android.gms.internal.de
    public void f() {
        if (this.c != null && this.c.l == 4) {
            if (this.k) {
                this.b.finish();
            } else {
                this.k = true;
            }
        }
        if (this.e != null) {
            gx.b(this.e);
        }
    }

    @Override // com.google.android.gms.internal.de
    public void g() {
        if (this.d != null) {
            this.d.c();
        }
        c();
        if (this.e != null && (!this.b.isFinishing() || this.f == null)) {
            gx.a(this.e);
        }
        l();
    }

    @Override // com.google.android.gms.internal.de
    public void h() {
        l();
    }

    @Override // com.google.android.gms.internal.de
    public void i() {
        if (this.d != null) {
            this.d.a();
        }
        if (this.e != null) {
            this.n.removeView(this.e);
        }
        l();
    }

    @Override // com.google.android.gms.internal.de
    public void j() {
        this.h = true;
    }

    public void k() {
        this.n.removeView(this.g);
        a(true);
    }
}
