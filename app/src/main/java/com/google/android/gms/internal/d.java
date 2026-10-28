package com.google.android.gms.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class d implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private static final long m = TimeUnit.MILLISECONDS.toNanos(100);
    private final Object a;
    private final WeakReference b;
    private WeakReference c;
    private final WeakReference d;
    private final b e;
    private final Context f;
    private final k g;
    private boolean h;
    private final WindowManager i;
    private final PowerManager j;
    private final KeyguardManager k;
    private j l;
    private boolean n;
    private boolean o;
    private long p;
    private boolean q;
    private BroadcastReceiver r;
    private HashSet s;

    public d(am amVar, gj gjVar) {
        this(amVar, gjVar, gjVar.b.h(), gjVar.b, new m(gjVar.b.getContext(), gjVar.b.h()));
    }

    public d(am amVar, gj gjVar, ew ewVar, View view, k kVar) {
        this.a = new Object();
        this.n = false;
        this.o = false;
        this.p = Long.MIN_VALUE;
        this.s = new HashSet();
        this.b = new WeakReference(gjVar);
        this.d = new WeakReference(view);
        this.c = new WeakReference(null);
        this.q = true;
        this.e = new b(Integer.toString(gjVar.hashCode()), ewVar, amVar.b, gjVar.j);
        this.g = kVar;
        this.i = (WindowManager) view.getContext().getSystemService("window");
        this.j = (PowerManager) view.getContext().getApplicationContext().getSystemService("power");
        this.k = (KeyguardManager) view.getContext().getSystemService("keyguard");
        this.f = view.getContext().getApplicationContext();
        a(kVar);
        this.g.a(new e(this));
        b(this.g);
        hj.c("Tracking ad unit: " + this.e.d());
    }

    protected int a(int i, DisplayMetrics displayMetrics) {
        return (int) (i / displayMetrics.density);
    }

    protected JSONObject a(View view) throws JSONException {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        view.getLocationInWindow(new int[2]);
        JSONObject jSONObjectH = h();
        DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
        Rect rect = new Rect();
        rect.left = iArr[0];
        rect.top = iArr[1];
        rect.right = rect.left + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        Rect rect2 = new Rect();
        rect2.right = this.i.getDefaultDisplay().getWidth();
        rect2.bottom = this.i.getDefaultDisplay().getHeight();
        Rect rect3 = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect3, null);
        Rect rect4 = new Rect();
        view.getLocalVisibleRect(rect4);
        jSONObjectH.put("viewBox", new JSONObject().put("top", a(rect2.top, displayMetrics)).put("bottom", a(rect2.bottom, displayMetrics)).put("left", a(rect2.left, displayMetrics)).put("right", a(rect2.right, displayMetrics))).put("adBox", new JSONObject().put("top", a(rect.top, displayMetrics)).put("bottom", a(rect.bottom, displayMetrics)).put("left", a(rect.left, displayMetrics)).put("right", a(rect.right, displayMetrics))).put("globalVisibleBox", new JSONObject().put("top", a(rect3.top, displayMetrics)).put("bottom", a(rect3.bottom, displayMetrics)).put("left", a(rect3.left, displayMetrics)).put("right", a(rect3.right, displayMetrics))).put("localVisibleBox", new JSONObject().put("top", a(rect4.top, displayMetrics)).put("bottom", a(rect4.bottom, displayMetrics)).put("left", a(rect4.left, displayMetrics)).put("right", a(rect4.right, displayMetrics))).put("screenDensity", displayMetrics.density).put("isVisible", a(view, globalVisibleRect)).put("isStopped", this.o).put("isPaused", this.n);
        return jSONObjectH;
    }

    protected void a() {
        synchronized (this.a) {
            if (this.r != null) {
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            this.r = new f(this);
            this.f.registerReceiver(this.r, intentFilter);
        }
    }

    public void a(a aVar) {
        this.s.add(aVar);
    }

    protected void a(hl hlVar, Map map) {
        b(false);
    }

    public void a(j jVar) {
        synchronized (this.a) {
            this.l = jVar;
        }
    }

    protected void a(k kVar) {
        kVar.a("http://googleads.g.doubleclick.net/mads/static/sdk/native/sdk-core-v40.html");
    }

    protected void a(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        this.g.a("AFMA_updateActiveView", jSONObject2);
    }

    protected void a(boolean z) {
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(this, z);
        }
    }

    protected boolean a(View view, boolean z) {
        return view.getVisibility() == 0 && z && view.isShown() && this.j.isScreenOn() && !this.k.inKeyguardRestrictedInputMode();
    }

    protected void b() {
        synchronized (this.a) {
            if (this.r != null) {
                this.f.unregisterReceiver(this.r);
                this.r = null;
            }
        }
    }

    protected void b(k kVar) {
        kVar.a("/updateActiveView", new g(this));
        kVar.a("/activeViewPingSent", new h(this));
        kVar.a("/visibilityChanged", new i(this));
        kVar.a("/viewabilityChanged", as.a);
    }

    protected void b(boolean z) {
        synchronized (this.a) {
            if (this.h && this.q) {
                long jNanoTime = System.nanoTime();
                if (!z || this.p + m <= jNanoTime) {
                    this.p = jNanoTime;
                    gj gjVar = (gj) this.b.get();
                    View view = (View) this.d.get();
                    if (view == null || gjVar == null) {
                        c();
                        return;
                    }
                    try {
                        a(a(view));
                    } catch (JSONException e) {
                        hj.b("Active view update failed.", e);
                    }
                    f();
                    d();
                }
            }
        }
    }

    public void c() {
        synchronized (this.a) {
            if (this.q) {
                g();
                b();
                try {
                    a(i());
                } catch (JSONException e) {
                    hj.b("JSON Failure while processing active view data.", e);
                }
                this.q = false;
                d();
                hj.c("Untracked ad unit: " + this.e.d());
            }
        }
    }

    protected void c(k kVar) {
        kVar.b("/viewabilityChanged");
        kVar.b("/visibilityChanged");
        kVar.b("/activeViewPingSent");
        kVar.b("/updateActiveView");
    }

    protected void d() {
        if (this.l != null) {
            this.l.a(this);
        }
    }

    public boolean e() {
        boolean z;
        synchronized (this.a) {
            z = this.q;
        }
        return z;
    }

    protected void f() {
        View view = (View) this.d.get();
        if (view == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.c.get();
        ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
        if (viewTreeObserver2 != viewTreeObserver) {
            this.c = new WeakReference(viewTreeObserver2);
            viewTreeObserver2.addOnScrollChangedListener(this);
            viewTreeObserver2.addOnGlobalLayoutListener(this);
        }
    }

    protected void g() {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.c.get();
        if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this);
        viewTreeObserver.removeGlobalOnLayoutListener(this);
    }

    protected JSONObject h() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("afmaVersion", this.e.b()).put("activeViewJSON", this.e.c()).put("timestamp", TimeUnit.NANOSECONDS.toMillis(System.nanoTime())).put("adFormat", this.e.a()).put("hashCode", this.e.d());
        return jSONObject;
    }

    protected JSONObject i() throws JSONException {
        JSONObject jSONObjectH = h();
        jSONObjectH.put("doneReasonCode", "u");
        return jSONObjectH;
    }

    public void j() {
        synchronized (this.a) {
            this.o = true;
            b(false);
            this.g.a();
        }
    }

    public void k() {
        synchronized (this.a) {
            this.n = true;
            b(false);
            this.g.a();
        }
    }

    public void l() {
        synchronized (this.a) {
            this.g.b();
            this.n = false;
            b(false);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        b(false);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        b(true);
    }
}
