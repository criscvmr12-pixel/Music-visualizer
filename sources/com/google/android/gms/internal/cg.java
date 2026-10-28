package com.google.android.gms.internal;

import java.util.Date;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class cg implements com.google.android.gms.ads.c.a {
    private final Date a;
    private final int b;
    private final Set c;
    private final boolean d;
    private final int e;

    public cg(Date date, int i, Set set, boolean z, int i2) {
        this.a = date;
        this.b = i;
        this.c = set;
        this.d = z;
        this.e = i2;
    }

    @Override // com.google.android.gms.ads.c.a
    public Date a() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.c.a
    public int b() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.c.a
    public Set c() {
        return this.c;
    }

    @Override // com.google.android.gms.ads.c.a
    public boolean d() {
        return this.d;
    }
}
