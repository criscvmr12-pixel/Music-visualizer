package android.support.v4.view;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class ar {
    public static void a(View view) {
        view.postInvalidateOnAnimation();
    }

    public static void a(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        view.postInvalidate(i, i2, i3, i4);
    }

    public static void a(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }
}
