package com.google.android.gms.internal;

import android.view.View;
import android.webkit.WebChromeClient;

/* JADX INFO: loaded from: classes.dex */
public final class iu extends il {
    public iu(hl hlVar) {
        super(hlVar);
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        a(view, i, customViewCallback);
    }
}
