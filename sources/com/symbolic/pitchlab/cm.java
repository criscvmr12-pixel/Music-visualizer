package com.symbolic.pitchlab;

import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes.dex */
class cm implements GLSurfaceView.Renderer {
    final /* synthetic */ cj a;

    cm(cj cjVar) {
        this.a = cjVar;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        int numViews = PitchLabNative.getNumViews();
        if (numViews > 0) {
            cd.h(cd.q() % numViews);
        }
        cd.i(cd.r() | (1 << cd.q()));
        int iR = cd.r();
        int i = 0;
        int i2 = 0;
        while (i < numViews) {
            int i3 = ((1 << i) & iR) == 0 ? i2 + 1 : i2;
            i++;
            i2 = i3;
        }
        PitchLabNative.drawFrame(cd.v(), cd.q(), this.a.g, cd.m(), cd.n(), (i2 << 24) | cd.w());
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        PitchLabNative.surfaceChanged(i, i2);
        this.a.e = i;
        this.a.f = i2;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        PitchLabNative.surfaceCreated();
    }
}
