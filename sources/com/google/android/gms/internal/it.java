package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public class it extends hn {
    public it(hl hlVar, boolean z) {
        super(hlVar, z);
    }

    protected WebResourceResponse a(Context context, String str, String str2) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
        try {
            gx.a(context, str, true, httpURLConnection);
            httpURLConnection.connect();
            return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(gx.a(new InputStreamReader(httpURLConnection.getInputStream())).getBytes("UTF-8")));
        } finally {
            httpURLConnection.disconnect();
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebResourceResponse webResourceResponseA;
        try {
            if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
                webResourceResponseA = super.shouldInterceptRequest(webView, str);
            } else if (webView instanceof hl) {
                hl hlVar = (hl) webView;
                hlVar.f().c();
                if (hlVar.e().e) {
                    hj.d("shouldInterceptRequest(http://media.admob.com/mraid/v1/mraid_app_interstitial.js)");
                    webResourceResponseA = a(hlVar.getContext(), this.a.h().b, "http://media.admob.com/mraid/v1/mraid_app_interstitial.js");
                } else if (hlVar.i()) {
                    hj.d("shouldInterceptRequest(http://media.admob.com/mraid/v1/mraid_app_expanded_banner.js)");
                    webResourceResponseA = a(hlVar.getContext(), this.a.h().b, "http://media.admob.com/mraid/v1/mraid_app_expanded_banner.js");
                } else {
                    hj.d("shouldInterceptRequest(http://media.admob.com/mraid/v1/mraid_app_banner.js)");
                    webResourceResponseA = a(hlVar.getContext(), this.a.h().b, "http://media.admob.com/mraid/v1/mraid_app_banner.js");
                }
            } else {
                hj.e("Tried to intercept request from a WebView that wasn't an AdWebView.");
                webResourceResponseA = super.shouldInterceptRequest(webView, str);
            }
            return webResourceResponseA;
        } catch (IOException e) {
            hj.e("Could not fetching MRAID JS. " + e.getMessage());
            return super.shouldInterceptRequest(webView, str);
        }
    }
}
