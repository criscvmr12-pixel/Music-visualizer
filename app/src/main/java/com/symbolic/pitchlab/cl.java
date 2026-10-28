package com.symbolic.pitchlab;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
class cl implements GestureDetector.OnGestureListener {
    final /* synthetic */ cj a;

    cl(cj cjVar) {
        this.a = cjVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (cj.c() || Math.abs((int) (motionEvent2.getX() - motionEvent.getX())) <= this.a.e / 10 || Math.abs(f) <= Math.abs(f2) || Math.signum(this.a.g) != Math.signum(f)) {
            return false;
        }
        this.a.b((int) f);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        if (this.a.k != null) {
            this.a.k.onClick(this.a);
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (cj.c()) {
            return true;
        }
        this.a.a(-((int) f));
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        if (this.a.j == null) {
            return true;
        }
        this.a.j.onClick(this.a);
        return true;
    }
}
