package com.google.android.gms.internal;

import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
final class cu {
    public final int a;
    public final ViewGroup.LayoutParams b;
    public final ViewGroup c;

    public cu(hl hlVar) throws cs {
        this.b = hlVar.getLayoutParams();
        ViewParent parent = hlVar.getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new cs("Could not get the parent of the WebView for an overlay.");
        }
        this.c = (ViewGroup) parent;
        this.a = this.c.indexOfChild(hlVar);
        this.c.removeView(hlVar);
        hlVar.a(true);
    }
}
