package com.google.android.gms.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.al;

/* JADX INFO: loaded from: classes.dex */
public final class f extends ViewGroup {
    private final al a;

    public f(Context context) {
        super(context);
        this.a = new al(this);
    }

    public void a() {
        this.a.a();
    }

    public void a(b bVar) {
        this.a.a(bVar.a());
    }

    public void b() {
        this.a.f();
    }

    public void c() {
        this.a.g();
    }

    public a getAdListener() {
        return this.a.b();
    }

    public e getAdSize() {
        return this.a.c();
    }

    public String getAdUnitId() {
        return this.a.d();
    }

    public com.google.android.gms.ads.d.b getInAppPurchaseListener() {
        return this.a.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i5 = ((i3 - i) - measuredWidth) / 2;
        int i6 = ((i4 - i2) - measuredHeight) / 2;
        childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int iB;
        int iA = 0;
        View childAt = getChildAt(0);
        e adSize = getAdSize();
        if (childAt != null && childAt.getVisibility() != 8) {
            measureChild(childAt, i, i2);
            iB = childAt.getMeasuredWidth();
            iA = childAt.getMeasuredHeight();
        } else if (adSize != null) {
            Context context = getContext();
            iB = adSize.b(context);
            iA = adSize.a(context);
        } else {
            iB = 0;
        }
        setMeasuredDimension(View.resolveSize(Math.max(iB, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(iA, getSuggestedMinimumHeight()), i2));
    }

    public void setAdListener(a aVar) {
        this.a.a(aVar);
    }

    public void setAdSize(e eVar) {
        this.a.a(eVar);
    }

    public void setAdUnitId(String str) {
        this.a.a(str);
    }

    public void setInAppPurchaseListener(com.google.android.gms.ads.d.b bVar) {
        this.a.a(bVar);
    }
}
