package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class kf extends Handler {
    final /* synthetic */ ke a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf(ke keVar, Looper looper) {
        super(looper);
        this.a = keVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message.what != 1) {
            Log.wtf("GmsClientEvents", "Don't know how to handle this message.");
            return;
        }
        synchronized (this.a.c) {
            if (this.a.b.n() && this.a.b.g() && this.a.c.contains(message.obj)) {
                ((com.google.android.gms.common.api.c) message.obj).a(this.a.b.l());
            }
        }
    }
}
