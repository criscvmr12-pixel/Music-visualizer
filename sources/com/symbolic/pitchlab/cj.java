package com.symbolic.pitchlab;

import android.app.Activity;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public class cj extends GLSurfaceView {
    private TimerTask a;
    private boolean b;
    private Activity c;
    private View d;
    private int e;
    private int f;
    private int g;
    private GestureDetector h;
    private cm i;
    private View.OnClickListener j;
    private View.OnClickListener k;

    public cj(Context context) {
        super(context);
        this.a = new ck(this);
        this.b = false;
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        a(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        this.g += i;
    }

    private void a(Context context) {
        if (isInEditMode()) {
            return;
        }
        this.i = new cm(this);
        setRenderer(this.i);
        this.h = new GestureDetector(context, new cl(this));
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (!this.b && this.g != 0) {
            int iSignum = this.g / 10;
            int iMin = Math.min(this.e / 32, Math.abs(this.g));
            if (Math.abs(iSignum) < iMin) {
                iSignum = Integer.signum(this.g) * iMin;
            }
            this.g -= iSignum;
        }
        postDelayed(this.a, 10L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        int numViews;
        if (i == 0 || (numViews = PitchLabNative.getNumViews()) <= 0) {
            return;
        }
        int iQ = cd.q();
        if (i > 0) {
            iQ--;
            this.g -= this.e;
            while (iQ < 0) {
                iQ += numViews;
            }
        } else if (i < 0) {
            iQ = (iQ + 1) % numViews;
            this.g += this.e;
        }
        cd.h(iQ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c() {
        return cd.v() != 0;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = this.b;
        switch (motionEvent.getAction()) {
            case 0:
                this.b = true;
                break;
            case 1:
                this.b = false;
                break;
        }
        if (!this.h.onTouchEvent(motionEvent) && z && !this.b && Math.abs(this.g) > this.e / 2) {
            b(this.g);
        }
        return true;
    }

    public void setActivity(Activity activity) {
        this.c = activity;
        this.d = this.c.getWindow().findViewById(android.R.id.content);
    }

    public void setOnLongPressListener(View.OnClickListener onClickListener) {
        this.k = onClickListener;
    }

    public void setOnSingleTapListener(View.OnClickListener onClickListener) {
        this.j = onClickListener;
    }
}
