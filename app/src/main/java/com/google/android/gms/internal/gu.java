package com.google.android.gms.internal;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class gu {
    private static final ThreadFactory a = new gw();
    private static final ThreadPoolExecutor b = new ThreadPoolExecutor(0, 10, 65, TimeUnit.SECONDS, new SynchronousQueue(true), a);

    public static int a() {
        return b.getPoolSize();
    }

    public static void a(Runnable runnable) {
        try {
            b.execute(new gv(runnable));
        } catch (RejectedExecutionException e) {
            hj.c("Too many background threads already running. Aborting task.  Current pool size: " + a(), e);
        }
    }
}
