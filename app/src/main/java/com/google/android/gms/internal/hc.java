package com.google.android.gms.internal;

import android.app.AlertDialog;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class hc {
    private final Context a;
    private String b;
    private final float c;
    private float d;
    private float e;
    private float f;
    private int g;

    public hc(Context context) {
        this.g = 0;
        this.a = context;
        this.c = context.getResources().getDisplayMetrics().density;
    }

    public hc(Context context, String str) {
        this(context);
        this.b = str;
    }

    private void a() {
        String strTrim;
        if (TextUtils.isEmpty(this.b)) {
            strTrim = "No debug information";
        } else {
            Uri uriBuild = new Uri.Builder().encodedQuery(this.b).build();
            StringBuilder sb = new StringBuilder();
            Map mapA = gx.a(uriBuild);
            for (String str : mapA.keySet()) {
                sb.append(str).append(" = ").append((String) mapA.get(str)).append("\n\n");
            }
            strTrim = sb.toString().trim();
            if (TextUtils.isEmpty(strTrim)) {
                strTrim = "No debug information";
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.a);
        builder.setMessage(strTrim);
        builder.setTitle("Ad Information");
        builder.setPositiveButton("Share", new hd(this, strTrim));
        builder.setNegativeButton("Close", new he(this));
        builder.create().show();
    }

    private void a(int i, float f, float f2) {
        if (i == 0) {
            this.g = 0;
            this.d = f;
            this.e = f2;
            this.f = f2;
            return;
        }
        if (this.g != -1) {
            if (i != 2) {
                if (i == 1 && this.g == 4) {
                    a();
                    return;
                }
                return;
            }
            if (f2 > this.e) {
                this.e = f2;
            } else if (f2 < this.f) {
                this.f = f2;
            }
            if (this.e - this.f > 30.0f * this.c) {
                this.g = -1;
                return;
            }
            if (this.g == 0 || this.g == 2) {
                if (f - this.d >= 50.0f * this.c) {
                    this.d = f;
                    this.g++;
                }
            } else if ((this.g == 1 || this.g == 3) && f - this.d <= (-50.0f) * this.c) {
                this.d = f;
                this.g++;
            }
            if (this.g == 1 || this.g == 3) {
                if (f > this.d) {
                    this.d = f;
                }
            } else {
                if (this.g != 2 || f >= this.d) {
                    return;
                }
                this.d = f;
            }
        }
    }

    public void a(MotionEvent motionEvent) {
        int historySize = motionEvent.getHistorySize();
        for (int i = 0; i < historySize; i++) {
            a(motionEvent.getActionMasked(), motionEvent.getHistoricalX(0, i), motionEvent.getHistoricalY(0, i));
        }
        a(motionEvent.getActionMasked(), motionEvent.getX(), motionEvent.getY());
    }

    public void a(String str) {
        this.b = str;
    }
}
