package com.google.android.gms.internal;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.AsyncTask;
import android.view.View;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
public final class fb extends AsyncTask {
    final /* synthetic */ fa a;
    private final WebView b;
    private Bitmap c;

    public fb(fa faVar, WebView webView) {
        this.a = faVar;
        this.b = webView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public synchronized Boolean doInBackground(Void... voidArr) {
        boolean zValueOf;
        int width = this.c.getWidth();
        int height = this.c.getHeight();
        if (width == 0 || height == 0) {
            zValueOf = false;
        } else {
            int i = 0;
            for (int i2 = 0; i2 < width; i2 += 10) {
                for (int i3 = 0; i3 < height; i3 += 10) {
                    if (this.c.getPixel(i2, i3) != 0) {
                        i++;
                    }
                }
            }
            zValueOf = Boolean.valueOf(((double) i) / (((double) (width * height)) / 100.0d) > 0.1d);
        }
        return zValueOf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Boolean bool) {
        fa.c(this.a);
        if (bool.booleanValue() || this.a.c() || this.a.f <= 0) {
            this.a.c = bool.booleanValue();
            this.a.g.a(this.a.a);
        } else if (this.a.f > 0) {
            if (hj.a(2)) {
                hj.a("Ad not detected, scheduling another run.");
            }
            this.a.d.postDelayed(this.a, this.a.e);
        }
    }

    @Override // android.os.AsyncTask
    protected synchronized void onPreExecute() {
        this.c = Bitmap.createBitmap(this.a.i, this.a.h, Bitmap.Config.ARGB_8888);
        this.b.setVisibility(0);
        this.b.measure(View.MeasureSpec.makeMeasureSpec(this.a.i, 0), View.MeasureSpec.makeMeasureSpec(this.a.h, 0));
        this.b.layout(0, 0, this.a.i, this.a.h);
        this.b.draw(new Canvas(this.c));
        this.b.invalidate();
    }
}
