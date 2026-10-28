package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public final class jz extends km {
    private js a;

    public jz(js jsVar) {
        this.a = jsVar;
    }

    @Override // com.google.android.gms.internal.kl
    public void a(int i, IBinder iBinder, Bundle bundle) {
        ky.a("onPostInitComplete can be called only once per call to getServiceFromBroker", this.a);
        this.a.a(i, iBinder, bundle);
        this.a = null;
    }
}
