package com.google.android.gms.internal;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
final class gw implements ThreadFactory {
    private final AtomicInteger a = new AtomicInteger(1);

    gw() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker #" + this.a.getAndIncrement());
    }
}
