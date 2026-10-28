package android.support.v4.view;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
class ae implements am {
    WeakHashMap a = null;

    ae() {
    }

    @Override // android.support.v4.view.am
    public int a(View view) {
        return 2;
    }

    long a() {
        return 10L;
    }

    @Override // android.support.v4.view.am
    public void a(View view, int i, int i2, int i3, int i4) {
        view.invalidate(i, i2, i3, i4);
    }

    @Override // android.support.v4.view.am
    public void a(View view, int i, Paint paint) {
    }

    @Override // android.support.v4.view.am
    public void a(View view, Paint paint) {
    }

    @Override // android.support.v4.view.am
    public void a(View view, a aVar) {
    }

    @Override // android.support.v4.view.am
    public void a(View view, Runnable runnable) {
        view.postDelayed(runnable, a());
    }

    @Override // android.support.v4.view.am
    public boolean a(View view, int i) {
        return false;
    }

    @Override // android.support.v4.view.am
    public void b(View view) {
        view.invalidate();
    }

    @Override // android.support.v4.view.am
    public void b(View view, int i) {
    }

    @Override // android.support.v4.view.am
    public int c(View view) {
        return 0;
    }

    @Override // android.support.v4.view.am
    public int d(View view) {
        return 0;
    }

    @Override // android.support.v4.view.am
    public boolean e(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }
}
