package com.google.android.gms.internal;

import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class hn extends WebViewClient {
    protected final hl a;
    private og d;
    private cw e;
    private hp f;
    private ar g;
    private bd i;
    private bf j;
    private boolean k;
    private db l;
    private final HashMap b = new HashMap();
    private final Object c = new Object();
    private boolean h = false;

    public hn(hl hlVar, boolean z) {
        this.a = hlVar;
        this.k = z;
    }

    private static boolean a(Uri uri) {
        String scheme = uri.getScheme();
        return "http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme);
    }

    private void b(Uri uri) {
        String path = uri.getPath();
        bc bcVar = (bc) this.b.get(path);
        if (bcVar == null) {
            hj.d("No GMSG handler found for GMSG: " + uri);
            return;
        }
        Map mapA = gx.a(uri);
        if (hj.a(2)) {
            hj.d("Received GMSG: " + path);
            for (String str : mapA.keySet()) {
                hj.d("  " + str + ": " + ((String) mapA.get(str)));
            }
        }
        bcVar.a(this.a, mapA);
    }

    public final void a(cf cfVar) {
        boolean zI = this.a.i();
        a(new ci(cfVar, (!zI || this.a.e().e) ? this.d : null, zI ? null : this.e, this.l, this.a.h()));
    }

    protected void a(ci ciVar) {
        cp.a(this.a.getContext(), ciVar);
    }

    public final void a(hp hpVar) {
        this.f = hpVar;
    }

    public void a(og ogVar, cw cwVar, ar arVar, db dbVar, boolean z, bd bdVar) {
        a("/appEvent", new aq(arVar));
        a("/canOpenURLs", as.b);
        a("/click", as.c);
        a("/close", as.d);
        a("/customClose", as.e);
        a("/httpTrack", as.f);
        a("/log", as.g);
        a("/open", new bg(bdVar));
        a("/touch", as.h);
        a("/video", as.i);
        this.d = ogVar;
        this.e = cwVar;
        this.g = arVar;
        this.i = bdVar;
        this.l = dbVar;
        a(z);
    }

    public void a(og ogVar, cw cwVar, ar arVar, db dbVar, boolean z, bd bdVar, bf bfVar) {
        a(ogVar, cwVar, arVar, dbVar, z, bdVar);
        a("/setInterstitialProperties", new be(bfVar));
        this.j = bfVar;
    }

    public final void a(String str, bc bcVar) {
        this.b.put(str, bcVar);
    }

    public final void a(boolean z) {
        this.h = z;
    }

    public final void a(boolean z, int i) {
        a(new ci((!this.a.i() || this.a.e().e) ? this.d : null, this.e, this.l, this.a, z, i, this.a.h()));
    }

    public final void a(boolean z, int i, String str) {
        boolean zI = this.a.i();
        a(new ci((!zI || this.a.e().e) ? this.d : null, zI ? null : this.e, this.g, this.l, this.a, z, i, str, this.a.h(), this.i));
    }

    public final void a(boolean z, int i, String str, String str2) {
        boolean zI = this.a.i();
        a(new ci((!zI || this.a.e().e) ? this.d : null, zI ? null : this.e, this.g, this.l, this.a, z, i, str, str2, this.a.h(), this.i));
    }

    public boolean a() {
        boolean z;
        synchronized (this.c) {
            z = this.k;
        }
        return z;
    }

    public final void b() {
        synchronized (this.c) {
            this.b.clear();
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = false;
            this.k = false;
            this.i = null;
            this.l = null;
        }
    }

    public final void c() {
        synchronized (this.c) {
            this.h = false;
            this.k = true;
            cp cpVarD = this.a.d();
            if (cpVarD != null) {
                if (hi.b()) {
                    cpVarD.k();
                } else {
                    hi.a.post(new ho(this, cpVarD));
                }
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        hj.d("Loading resource: " + str);
        Uri uri = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            b(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (this.f != null) {
            this.f.a(this.a);
            this.f = null;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri uri;
        hj.d("AdWebView shouldOverrideUrlLoading: " + str);
        Uri uriA = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uriA.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriA.getHost())) {
            b(uriA);
        } else {
            if (this.h && webView == this.a && a(uriA)) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            if (this.a.willNotDraw()) {
                hj.e("AdWebView unable to handle URL: " + str);
            } else {
                try {
                    nh nhVarG = this.a.g();
                    if (nhVarG != null && nhVarG.a(uriA)) {
                        uriA = nhVarG.a(uriA, this.a.getContext());
                    }
                    uri = uriA;
                } catch (np e) {
                    hj.e("Unable to append parameter to URL: " + str);
                    uri = uriA;
                }
                a(new cf("android.intent.action.VIEW", uri.toString(), null, null, null, null, null));
            }
        }
        return true;
    }
}
