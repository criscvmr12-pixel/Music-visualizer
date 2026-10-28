package com.google.android.gms.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class fg extends ff {
    private final Context a;

    public fg(Context context, dt dtVar, fd fdVar) {
        super(dtVar, fdVar);
        this.a = context;
    }

    @Override // com.google.android.gms.internal.ff
    public void c() {
    }

    @Override // com.google.android.gms.internal.ff
    public fr d() {
        return fv.a(this.a, new ap(), new bj(), new gi());
    }
}
