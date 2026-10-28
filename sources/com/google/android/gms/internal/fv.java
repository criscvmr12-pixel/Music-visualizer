package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class fv extends ft {
    private static final Object a = new Object();
    private static fv b;
    private final Context c;
    private final gh d;
    private final bi e;
    private final ap f;

    fv(Context context, ap apVar, bi biVar, gh ghVar) {
        this.c = context;
        this.d = ghVar;
        this.e = biVar;
        this.f = apVar;
    }

    private static dv a(Context context, ap apVar, bi biVar, gh ghVar, dt dtVar) {
        String string;
        hj.a("Starting ad request from service.");
        biVar.a();
        gg ggVar = new gg(context);
        if (ggVar.l == -1) {
            hj.a("Device is offline.");
            return new dv(2);
        }
        ga gaVar = new ga(dtVar.f.packageName);
        if (dtVar.c.c != null && (string = dtVar.c.c.getString("_ad")) != null) {
            return fy.a(context, dtVar, string);
        }
        Location locationA = biVar.a(250L);
        String strA = apVar.a();
        String strA2 = fy.a(dtVar, ggVar, locationA, apVar.b());
        if (strA2 == null) {
            return new dv(0);
        }
        hi.a.post(new fw(context, dtVar, gaVar, a(strA2), strA));
        ge geVarB = gaVar.b();
        if (geVarB == null || TextUtils.isEmpty(geVarB.c())) {
            return new dv(gaVar.a());
        }
        return a(context, dtVar.k.b, geVarB.c(), geVarB.e() ? ghVar.a(dtVar.g.packageName) : null, geVarB);
    }

    public static dv a(Context context, String str, String str2, String str3, ge geVar) {
        try {
            gd gdVar = new gd();
            URL url = new URL(str2);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            URL url2 = url;
            int i = 0;
            while (true) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url2.openConnection();
                try {
                    gx.a(context, str, false, httpURLConnection);
                    if (!TextUtils.isEmpty(str3)) {
                        httpURLConnection.addRequestProperty("x-afma-drt-cookie", str3);
                    }
                    if (geVar != null && !TextUtils.isEmpty(geVar.b())) {
                        httpURLConnection.setDoOutput(true);
                        byte[] bytes = geVar.b().getBytes();
                        httpURLConnection.setFixedLengthStreamingMode(bytes.length);
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                        bufferedOutputStream.write(bytes);
                        bufferedOutputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    if (responseCode >= 200 && responseCode < 300) {
                        String string = url2.toString();
                        String strA = gx.a(new InputStreamReader(httpURLConnection.getInputStream()));
                        a(string, headerFields, strA, responseCode);
                        gdVar.a(string, headerFields, strA);
                        dv dvVarA = gdVar.a(jElapsedRealtime);
                        httpURLConnection.disconnect();
                        return dvVarA;
                    }
                    a(url2.toString(), headerFields, (String) null, responseCode);
                    if (responseCode < 300 || responseCode >= 400) {
                        hj.e("Received error HTTP response code: " + responseCode);
                        dv dvVar = new dv(0);
                        httpURLConnection.disconnect();
                        return dvVar;
                    }
                    String headerField = httpURLConnection.getHeaderField("Location");
                    if (TextUtils.isEmpty(headerField)) {
                        hj.e("No location header to follow redirect.");
                        dv dvVar2 = new dv(0);
                        httpURLConnection.disconnect();
                        return dvVar2;
                    }
                    url2 = new URL(headerField);
                    i++;
                    if (i > 5) {
                        hj.e("Too many redirects.");
                        dv dvVar3 = new dv(0);
                        httpURLConnection.disconnect();
                        return dvVar3;
                    }
                    gdVar.a(headerFields);
                    httpURLConnection.disconnect();
                } catch (Throwable th) {
                    httpURLConnection.disconnect();
                    throw th;
                }
            }
        } catch (IOException e) {
            hj.e("Error while connecting to ad server: " + e.getMessage());
            return new dv(2);
        }
    }

    public static fv a(Context context, ap apVar, bi biVar, gh ghVar) {
        fv fvVar;
        synchronized (a) {
            if (b == null) {
                b = new fv(context.getApplicationContext(), apVar, biVar, ghVar);
            }
            fvVar = b;
        }
        return fvVar;
    }

    private static hp a(String str) {
        return new fx(str);
    }

    private static void a(String str, Map map, String str2, int i) {
        if (hj.a(2)) {
            hj.d("Http Response: {\n  URL:\n    " + str + "\n  Headers:");
            if (map != null) {
                for (String str3 : map.keySet()) {
                    hj.d("    " + str3 + ":");
                    Iterator it = ((List) map.get(str3)).iterator();
                    while (it.hasNext()) {
                        hj.d("      " + ((String) it.next()));
                    }
                }
            }
            hj.d("  Body:");
            if (str2 != null) {
                for (int i2 = 0; i2 < Math.min(str2.length(), 100000); i2 += 1000) {
                    hj.d(str2.substring(i2, Math.min(str2.length(), i2 + 1000)));
                }
            } else {
                hj.d("    null");
            }
            hj.d("  Response Code:\n    " + i + "\n}");
        }
    }

    @Override // com.google.android.gms.internal.fr
    public dv a(dt dtVar) {
        return a(this.c, this.f, this.e, this.d, dtVar);
    }
}
