package com.google.android.gms.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class hl extends WebView implements DownloadListener {
    private final hn a;
    private final hm b;
    private final Object c;
    private final nh d;
    private final ew e;
    private cp f;
    private am g;
    private boolean h;
    private boolean i;
    private boolean j;
    private final WindowManager k;

    private hl(hm hmVar, am amVar, boolean z, boolean z2, nh nhVar, ew ewVar) {
        super(hmVar);
        this.c = new Object();
        this.b = hmVar;
        this.g = amVar;
        this.h = z;
        this.d = nhVar;
        this.e = ewVar;
        this.k = (WindowManager) getContext().getSystemService("window");
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        gx.a(hmVar, ewVar.b, settings);
        if (Build.VERSION.SDK_INT >= 17) {
            hg.a(getContext(), settings);
        } else if (Build.VERSION.SDK_INT >= 11) {
            hf.a(getContext(), settings);
        }
        setDownloadListener(this);
        if (Build.VERSION.SDK_INT >= 11) {
            this.a = new it(this, z2);
        } else {
            this.a = new hn(this, z2);
        }
        setWebViewClient(this.a);
        if (Build.VERSION.SDK_INT >= 14) {
            setWebChromeClient(new iu(this));
        } else if (Build.VERSION.SDK_INT >= 11) {
            setWebChromeClient(new il(this));
        }
        l();
    }

    public static hl a(Context context, am amVar, boolean z, boolean z2, nh nhVar, ew ewVar) {
        return new hl(new hm(context), amVar, z, z2, nhVar, ewVar);
    }

    private void l() {
        synchronized (this.c) {
            if (this.h || this.g.e) {
                if (Build.VERSION.SDK_INT < 14) {
                    hj.a("Disabling hardware acceleration on an overlay.");
                    m();
                } else {
                    hj.a("Enabling hardware acceleration on an overlay.");
                    n();
                }
            } else if (Build.VERSION.SDK_INT < 18) {
                hj.a("Disabling hardware acceleration on an AdView.");
                m();
            } else {
                hj.a("Enabling hardware acceleration on an AdView.");
                n();
            }
        }
    }

    private void m() {
        synchronized (this.c) {
            if (!this.i && Build.VERSION.SDK_INT >= 11) {
                hf.a((View) this);
            }
            this.i = true;
        }
    }

    private void n() {
        synchronized (this.c) {
            if (this.i && Build.VERSION.SDK_INT >= 11) {
                hf.b((View) this);
            }
            this.i = false;
        }
    }

    public void a() {
        if (f().a()) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Display defaultDisplay = this.k.getDefaultDisplay();
            defaultDisplay.getMetrics(displayMetrics);
            int iC = gx.c(getContext());
            float f = 160.0f / displayMetrics.densityDpi;
            try {
                b("onScreenInfoChanged", new JSONObject().put("width", (int) (displayMetrics.widthPixels * f)).put("height", (int) ((displayMetrics.heightPixels - iC) * f)).put("density", displayMetrics.density).put("rotation", defaultDisplay.getRotation()));
            } catch (JSONException e) {
                hj.b("Error occured while obtaining screen information.", e);
            }
        }
    }

    public void a(Context context, am amVar) {
        synchronized (this.c) {
            this.b.setBaseContext(context);
            this.f = null;
            this.g = amVar;
            this.h = false;
            gx.b(this);
            loadUrl("about:blank");
            this.a.b();
        }
    }

    public void a(am amVar) {
        synchronized (this.c) {
            this.g = amVar;
            requestLayout();
        }
    }

    public void a(cp cpVar) {
        synchronized (this.c) {
            this.f = cpVar;
        }
    }

    protected void a(String str) {
        synchronized (this.c) {
            if (k()) {
                hj.e("The webview is destroyed. Ignoring action.");
            } else {
                loadUrl(str);
            }
        }
    }

    public void a(String str, Map map) {
        try {
            b(str, gx.a(map));
        } catch (JSONException e) {
            hj.e("Could not convert parameters to JSON.");
        }
    }

    public void a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("javascript:" + str + "(");
        sb.append(string);
        sb.append(");");
        a(sb.toString());
    }

    public void a(boolean z) {
        synchronized (this.c) {
            this.h = z;
            l();
        }
    }

    public void b() {
        HashMap map = new HashMap(1);
        map.put("version", this.e.b);
        a("onhide", map);
    }

    public void b(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("javascript:AFMA_ReceiveMessage('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(string);
        sb.append(");");
        hj.d("Dispatching AFMA event: " + ((Object) sb));
        a(sb.toString());
    }

    public void c() {
        HashMap map = new HashMap(1);
        map.put("version", this.e.b);
        a("onshow", map);
    }

    public cp d() {
        cp cpVar;
        synchronized (this.c) {
            cpVar = this.f;
        }
        return cpVar;
    }

    @Override // android.webkit.WebView
    public void destroy() {
        synchronized (this.c) {
            super.destroy();
            this.j = true;
        }
    }

    public am e() {
        am amVar;
        synchronized (this.c) {
            amVar = this.g;
        }
        return amVar;
    }

    public hn f() {
        return this.a;
    }

    public nh g() {
        return this.d;
    }

    public ew h() {
        return this.e;
    }

    public boolean i() {
        boolean z;
        synchronized (this.c) {
            z = this.h;
        }
        return z;
    }

    public Context j() {
        return this.b.a();
    }

    public boolean k() {
        boolean z;
        synchronized (this.c) {
            z = this.j;
        }
        return z;
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            getContext().startActivity(intent);
        } catch (ActivityNotFoundException e) {
            hj.a("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
        }
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        synchronized (this.c) {
            if (isInEditMode() || this.h) {
                super.onMeasure(i, i2);
                return;
            }
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            int i3 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
            int i4 = (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) ? size2 : Integer.MAX_VALUE;
            if (this.g.g > i3 || this.g.d > i4) {
                float f = this.b.getResources().getDisplayMetrics().density;
                hj.e("Not enough space to show ad. Needs " + ((int) (this.g.g / f)) + "x" + ((int) (this.g.d / f)) + " dp, but only has " + ((int) (size / f)) + "x" + ((int) (size2 / f)) + " dp.");
                if (getVisibility() != 8) {
                    setVisibility(4);
                }
                setMeasuredDimension(0, 0);
            } else {
                if (getVisibility() != 8) {
                    setVisibility(0);
                }
                setMeasuredDimension(this.g.g, this.g.d);
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.d != null) {
            this.d.a(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setContext(Context context) {
        this.b.setBaseContext(context);
    }
}
