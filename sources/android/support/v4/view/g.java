package android.support.v4.view;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class g {
    static final h a;

    static {
        if (Build.VERSION.SDK_INT >= 17) {
            a = new j();
        } else {
            a = new i();
        }
    }

    public static int a(int i, int i2) {
        return a.a(i, i2);
    }
}
