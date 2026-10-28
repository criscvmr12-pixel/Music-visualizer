package android.support.v4.view;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private static final c b;
    private static final Object c;
    final Object a;

    static {
        if (Build.VERSION.SDK_INT >= 16) {
            b = new d();
        } else if (Build.VERSION.SDK_INT >= 14) {
            b = new b();
        } else {
            b = new e();
        }
        c = b.a();
    }

    Object a() {
        return this.a;
    }
}
