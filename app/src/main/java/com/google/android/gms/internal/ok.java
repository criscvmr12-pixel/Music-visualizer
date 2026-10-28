package com.google.android.gms.internal;

import android.content.Context;
import android.view.MotionEvent;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class ok implements jq, Runnable {
    private final List a = new Vector();
    private final CountDownLatch b = new CountDownLatch(1);
    private final AtomicReference c = new AtomicReference();
    private ol d;

    public ok(ol olVar) {
        this.d = olVar;
        if (hi.b()) {
            gu.a(this);
        } else {
            run();
        }
    }

    private void a() {
        try {
            this.b.await();
        } catch (InterruptedException e) {
            hj.c("Interrupted during GADSignals creation.", e);
        }
    }

    private void b() {
        if (this.a.isEmpty()) {
            return;
        }
        for (Object[] objArr : this.a) {
            if (objArr.length == 1) {
                ((jq) this.c.get()).a((MotionEvent) objArr[0]);
            } else if (objArr.length == 3) {
                ((jq) this.c.get()).a(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
    }

    @Override // com.google.android.gms.internal.jq
    public String a(Context context) {
        a();
        b();
        return ((jq) this.c.get()).a(context);
    }

    @Override // com.google.android.gms.internal.jq
    public String a(Context context, String str) {
        a();
        b();
        return ((jq) this.c.get()).a(context, str);
    }

    @Override // com.google.android.gms.internal.jq
    public void a(int i, int i2, int i3) {
        jq jqVar = (jq) this.c.get();
        if (jqVar == null) {
            this.a.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        } else {
            b();
            jqVar.a(i, i2, i3);
        }
    }

    @Override // com.google.android.gms.internal.jq
    public void a(MotionEvent motionEvent) {
        jq jqVar = (jq) this.c.get();
        if (jqVar == null) {
            this.a.add(new Object[]{motionEvent});
        } else {
            b();
            jqVar.a(motionEvent);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.c.set(mw.a(this.d.e.b, this.d.c));
        } finally {
            this.b.countDown();
            this.d = null;
        }
    }
}
