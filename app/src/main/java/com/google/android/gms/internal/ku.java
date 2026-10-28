package com.google.android.gms.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ku {
    public static int a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static kw a(Object obj) {
        return new kw(obj);
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
