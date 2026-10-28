package com.google.android.gms.internal;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;

/* JADX INFO: loaded from: classes.dex */
class oi implements ComponentCallbacks {
    final /* synthetic */ oh a;

    oi(oh ohVar) {
        this.a = ohVar;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        if (this.a.b == null || this.a.b.i == null || this.a.b.i.b == null) {
            return;
        }
        this.a.b.i.b.a();
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }
}
