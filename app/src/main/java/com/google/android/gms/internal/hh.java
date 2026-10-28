package com.google.android.gms.internal;

import android.content.Context;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class hh extends gs {
    private final String a;
    private final Context b;
    private final String c;

    public hh(Context context, String str, String str2) {
        this.b = context;
        this.a = str;
        this.c = str2;
    }

    @Override // com.google.android.gms.internal.gs
    public void a() {
        try {
            hj.d("Pinging URL: " + this.c);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.c).openConnection();
            try {
                gx.a(this.b, this.a, true, httpURLConnection);
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode >= 300) {
                    hj.e("Received non-success response code " + responseCode + " from pinging URL: " + this.c);
                }
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (IOException e) {
            hj.e("Error while pinging URL: " + this.c + ". " + e.getMessage());
        } catch (IndexOutOfBoundsException e2) {
            hj.e("Error while parsing ping URL: " + this.c + ". " + e2.getMessage());
        }
    }

    @Override // com.google.android.gms.internal.gs
    public void b() {
    }
}
