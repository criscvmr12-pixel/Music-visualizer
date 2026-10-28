package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class ju extends Handler {
    final /* synthetic */ js a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju(js jsVar, Looper looper) {
        super(looper);
        this.a = jsVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message.what == 1 && !this.a.h()) {
            jw jwVar = (jw) message.obj;
            jwVar.a();
            jwVar.c();
            return;
        }
        if (message.what == 3) {
            this.a.k.a(new com.google.android.gms.common.a(((Integer) message.obj).intValue(), null));
            return;
        }
        if (message.what == 4) {
            this.a.a(1);
            this.a.f = null;
            this.a.k.a(((Integer) message.obj).intValue());
        } else if (message.what == 2 && !this.a.g()) {
            jw jwVar2 = (jw) message.obj;
            jwVar2.a();
            jwVar2.c();
        } else if (message.what == 2 || message.what == 1) {
            ((jw) message.obj).b();
        } else {
            Log.wtf("GmsClient", "Don't know how to handle this message.");
        }
    }
}
