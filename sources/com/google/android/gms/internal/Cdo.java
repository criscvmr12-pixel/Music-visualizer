package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.do, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class Cdo extends ea {
    private String a;
    private Context b;
    private String c;
    private ArrayList d;

    public Cdo(String str, ArrayList arrayList, Context context, String str2) {
        this.c = str;
        this.d = arrayList;
        this.a = str2;
        this.b = context;
    }

    private void b() {
        try {
            this.b.getClassLoader().loadClass("com.google.ads.conversiontracking.IAPConversionReporter").getDeclaredMethod("reportWithProductId", Context.class, String.class, String.class, Boolean.TYPE).invoke(null, this.b, this.c, "", true);
        } catch (ClassNotFoundException e) {
            hj.e("Google Conversion Tracking SDK 1.2.0 or above is required to report a conversion.");
        } catch (NoSuchMethodException e2) {
            hj.e("Google Conversion Tracking SDK 1.2.0 or above is required to report a conversion.");
        } catch (Exception e3) {
            hj.c("Fail to report a conversion.", e3);
        }
    }

    protected int a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        return i == 4 ? 3 : 0;
    }

    @Override // com.google.android.gms.internal.dz
    public String a() {
        return this.c;
    }

    protected String a(String str, HashMap map) {
        String str2;
        String packageName = this.b.getPackageName();
        try {
            str2 = this.b.getPackageManager().getPackageInfo(packageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            hj.c("Error to retrieve app version", e);
            str2 = "";
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - gn.d().a();
        for (String str3 : map.keySet()) {
            str = str.replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", str3), String.format("$1%s$2", map.get(str3)));
        }
        return str.replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", "sessionid"), String.format("$1%s$2", gn.a)).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", "appid"), String.format("$1%s$2", packageName)).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", "osversion"), String.format("$1%s$2", String.valueOf(Build.VERSION.SDK_INT))).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", "sdkversion"), String.format("$1%s$2", this.a)).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", "appversion"), String.format("$1%s$2", str2)).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", "timestamp"), String.format("$1%s$2", String.valueOf(jElapsedRealtime))).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", "[^@]+"), String.format("$1%s$2", "")).replaceAll("@@", "@");
    }

    @Override // com.google.android.gms.internal.dz
    public void b(int i) {
        if (i == 1) {
            b();
        }
        HashMap map = new HashMap();
        map.put("status", String.valueOf(i));
        map.put("sku", this.c);
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            new hh(this.b, this.a, a((String) it.next(), map)).e();
        }
    }

    @Override // com.google.android.gms.internal.dz
    public void c(int i) {
        if (i == 0) {
            b();
        }
        HashMap map = new HashMap();
        map.put("google_play_status", String.valueOf(i));
        map.put("sku", this.c);
        map.put("status", String.valueOf(a(i)));
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            new hh(this.b, this.a, a((String) it.next(), map)).e();
        }
    }
}
