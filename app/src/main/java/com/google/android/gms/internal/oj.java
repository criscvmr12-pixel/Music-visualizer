package com.google.android.gms.internal;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ViewSwitcher;

/* JADX INFO: loaded from: classes.dex */
final class oj extends ViewSwitcher {
    private final hc a;

    public oj(Context context) {
        super(context);
        this.a = new hc(context);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.a.a(motionEvent);
        return false;
    }
}
