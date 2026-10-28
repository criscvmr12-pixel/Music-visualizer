package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import java.math.BigInteger;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class gr {
    private static final Object a = new Object();
    private static String b;

    public static String a() {
        String str;
        synchronized (a) {
            str = b;
        }
        return str;
    }

    public static String a(Context context, String str, String str2) {
        String str3;
        synchronized (a) {
            if (b == null && !TextUtils.isEmpty(str)) {
                b(context, str, str2);
            }
            str3 = b;
        }
        return str3;
    }

    private static void b(Context context, String str, String str2) {
        try {
            ClassLoader classLoader = context.createPackageContext(str2, 3).getClassLoader();
            Class<?> cls = Class.forName("com.google.ads.mediation.MediationAdapter", false, classLoader);
            BigInteger bigInteger = new BigInteger(new byte[1]);
            String[] strArrSplit = str.split(",");
            BigInteger bit = bigInteger;
            for (int i = 0; i < strArrSplit.length; i++) {
                if (gx.a(classLoader, cls, strArrSplit[i])) {
                    bit = bit.setBit(i);
                }
            }
            b = String.format(Locale.US, "%X", bit);
        } catch (Throwable th) {
            b = "err";
        }
    }
}
