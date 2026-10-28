package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public class dl {
    private Object a;
    private final Context b;

    public dl(Context context) {
        this.b = context;
    }

    public int a(String str, String str2) {
        try {
            Class<?> clsLoadClass = this.b.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
            return ((Integer) clsLoadClass.getDeclaredMethod("consumePurchase", Integer.TYPE, String.class, String.class).invoke(clsLoadClass.cast(this.a), 3, str, str2)).intValue();
        } catch (Exception e) {
            hj.c("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", e);
            return 5;
        }
    }

    public Bundle a(String str, String str2, String str3) {
        try {
            Class<?> clsLoadClass = this.b.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
            return (Bundle) clsLoadClass.getDeclaredMethod("getBuyIntent", Integer.TYPE, String.class, String.class, String.class, String.class).invoke(clsLoadClass.cast(this.a), 3, str, str2, "inapp", str3);
        } catch (Exception e) {
            hj.c("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", e);
            return null;
        }
    }

    public void a() {
        this.a = null;
    }

    public void a(IBinder iBinder) {
        try {
            this.a = this.b.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService$Stub").getDeclaredMethod("asInterface", IBinder.class).invoke(null, iBinder);
        } catch (Exception e) {
            hj.e("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.");
        }
    }

    public Bundle b(String str, String str2) {
        try {
            Class<?> clsLoadClass = this.b.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
            return (Bundle) clsLoadClass.getDeclaredMethod("getPurchases", Integer.TYPE, String.class, String.class, String.class).invoke(clsLoadClass.cast(this.a), 3, str, "inapp", str2);
        } catch (Exception e) {
            hj.c("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", e);
            return null;
        }
    }
}
