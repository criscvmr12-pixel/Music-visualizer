package com.google.android.gms.a;

import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
class c implements a {
    private IBinder a;

    c(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.a;
    }
}
