package android.support.v4.widget;

import android.support.v4.view.ad;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class n implements Runnable {
    final View a;
    final /* synthetic */ SlidingPaneLayout b;

    n(SlidingPaneLayout slidingPaneLayout, View view) {
        this.b = slidingPaneLayout;
        this.a = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.a.getParent() == this.b) {
            ad.a(this.a, 0, null);
            this.b.d(this.a);
        }
        this.b.u.remove(this);
    }
}
