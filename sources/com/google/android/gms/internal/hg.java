package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebSettings;

/* JADX INFO: loaded from: classes.dex */
public final class hg {
    public static String a(Context context) {
        return WebSettings.getDefaultUserAgent(context);
    }

    public static void a(Context context, WebSettings webSettings) {
        hf.a(context, webSettings);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
    }
}
