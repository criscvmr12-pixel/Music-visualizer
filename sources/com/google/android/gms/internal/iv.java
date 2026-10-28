package com.google.android.gms.internal;

import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.net.URI;
import java.net.URISyntaxException;

/* JADX INFO: loaded from: classes.dex */
public class iv extends WebViewClient {
    private final String a;
    private boolean b = false;
    private final hl c;
    private final fa d;

    public iv(fa faVar, hl hlVar, String str) {
        this.a = b(str);
        this.c = hlVar;
        this.d = faVar;
    }

    private String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return str.endsWith("/") ? str.substring(0, str.length() - 1) : str;
        } catch (IndexOutOfBoundsException e) {
            hj.b(e.getMessage());
            return str;
        }
    }

    protected boolean a(String str) {
        boolean z = false;
        String strB = b(str);
        if (!TextUtils.isEmpty(strB)) {
            try {
                URI uri = new URI(strB);
                if ("passback".equals(uri.getScheme())) {
                    hj.a("Passback received");
                    this.d.b();
                    z = true;
                } else if (!TextUtils.isEmpty(this.a)) {
                    URI uri2 = new URI(this.a);
                    String host = uri2.getHost();
                    String host2 = uri.getHost();
                    String path = uri2.getPath();
                    String path2 = uri.getPath();
                    if (ku.a(host, host2) && ku.a(path, path2)) {
                        hj.a("Passback received");
                        this.d.b();
                        z = true;
                    }
                }
            } catch (URISyntaxException e) {
                hj.b(e.getMessage());
            }
        }
        return z;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        hj.a("JavascriptAdWebViewClient::onLoadResource: " + str);
        if (a(str)) {
            return;
        }
        this.c.f().onLoadResource(this.c, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        hj.a("JavascriptAdWebViewClient::onPageFinished: " + str);
        if (this.b) {
            return;
        }
        this.d.a();
        this.b = true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        hj.a("JavascriptAdWebViewClient::shouldOverrideUrlLoading: " + str);
        if (!a(str)) {
            return this.c.f().shouldOverrideUrlLoading(this.c, str);
        }
        hj.a("shouldOverrideUrlLoading: received passback url");
        return true;
    }
}
