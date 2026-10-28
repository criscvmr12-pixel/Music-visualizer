package android.support.v4.view;

import android.graphics.Paint;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class ah extends ag {
    ah() {
    }

    @Override // android.support.v4.view.ae
    long a() {
        return ap.a();
    }

    @Override // android.support.v4.view.ae, android.support.v4.view.am
    public void a(View view, int i, Paint paint) {
        ap.a(view, i, paint);
    }

    @Override // android.support.v4.view.ae, android.support.v4.view.am
    public void a(View view, Paint paint) {
        a(view, c(view), paint);
        view.invalidate();
    }

    @Override // android.support.v4.view.ae, android.support.v4.view.am
    public int c(View view) {
        return ap.a(view);
    }
}
