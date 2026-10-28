package android.support.v4.widget;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.ad;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class SlidingPaneLayout extends ViewGroup {
    static final r a;
    private int b;
    private int c;
    private Drawable d;
    private Drawable e;
    private final int f;
    private boolean g;
    private View h;
    private float i;
    private float j;
    private int k;
    private boolean l;
    private int m;
    private float n;
    private float o;
    private p p;
    private final v q;
    private boolean r;
    private boolean s;
    private final Rect t;
    private final ArrayList u;

    class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new q();
        boolean a;

        private SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt() != 0;
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a ? 1 : 0);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 17) {
            a = new u();
        } else if (i >= 16) {
            a = new t();
        } else {
            a = new s();
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0030  */
    private void a(float f) {
        boolean z;
        boolean zF = f();
        o oVar = (o) this.h.getLayoutParams();
        if (!oVar.c) {
            z = false;
        } else if ((zF ? oVar.rightMargin : oVar.leftMargin) <= 0) {
            z = true;
        } else {
            z = false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != this.h) {
                int i2 = (int) ((1.0f - this.j) * this.m);
                this.j = f;
                int i3 = i2 - ((int) ((1.0f - f) * this.m));
                if (zF) {
                    i3 = -i3;
                }
                childAt.offsetLeftAndRight(i3);
                if (z) {
                    a(childAt, zF ? this.j - 1.0f : 1.0f - this.j, this.c);
                }
            }
        }
    }

    private void a(View view, float f, int i) {
        o oVar = (o) view.getLayoutParams();
        if (f <= 0.0f || i == 0) {
            if (ad.c(view) != 0) {
                if (oVar.d != null) {
                    oVar.d.setColorFilter(null);
                }
                n nVar = new n(this, view);
                this.u.add(nVar);
                ad.a(this, nVar);
                return;
            }
            return;
        }
        int i2 = (((int) ((((-16777216) & i) >>> 24) * f)) << 24) | (16777215 & i);
        if (oVar.d == null) {
            oVar.d = new Paint();
        }
        oVar.d.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_OVER));
        if (ad.c(view) != 2) {
            ad.a(view, 2, oVar.d);
        }
        d(view);
    }

    private boolean a(View view, int i) {
        if (!this.s && !a(0.0f, i)) {
            return false;
        }
        this.r = false;
        return true;
    }

    private boolean b(View view, int i) {
        if (!this.s && !a(1.0f, i)) {
            return false;
        }
        this.r = true;
        return true;
    }

    private static boolean c(View view) {
        Drawable background;
        if (ad.e(view)) {
            return true;
        }
        return Build.VERSION.SDK_INT < 18 && (background = view.getBackground()) != null && background.getOpacity() == -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(View view) {
        a.a(this, view);
    }

    private boolean f() {
        return ad.d(this) == 1;
    }

    void a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    void a(View view) {
        int bottom;
        int top;
        int right;
        int left;
        boolean zF = f();
        int width = zF ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = zF ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view == null || !c(view)) {
            bottom = 0;
            top = 0;
            right = 0;
            left = 0;
        } else {
            left = view.getLeft();
            right = view.getRight();
            top = view.getTop();
            bottom = view.getBottom();
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt == view) {
                return;
            }
            childAt.setVisibility((Math.max(zF ? paddingLeft : width, childAt.getLeft()) < left || Math.max(paddingTop, childAt.getTop()) < top || Math.min(zF ? width : paddingLeft, childAt.getRight()) > right || Math.min(height, childAt.getBottom()) > bottom) ? 0 : 4);
        }
    }

    boolean a(float f, int i) {
        int paddingLeft;
        if (!this.g) {
            return false;
        }
        boolean zF = f();
        o oVar = (o) this.h.getLayoutParams();
        if (zF) {
            paddingLeft = (int) (getWidth() - (((oVar.rightMargin + getPaddingRight()) + (this.k * f)) + this.h.getWidth()));
        } else {
            paddingLeft = (int) (oVar.leftMargin + getPaddingLeft() + (this.k * f));
        }
        if (!this.q.a(this.h, paddingLeft, this.h.getTop())) {
            return false;
        }
        a();
        ad.b(this);
        return true;
    }

    public boolean b() {
        return b(this.h, 0);
    }

    boolean b(View view) {
        if (view == null) {
            return false;
        }
        return this.g && ((o) view.getLayoutParams()).c && this.i > 0.0f;
    }

    public boolean c() {
        return a(this.h, 0);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof o) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.q.a(true)) {
            if (this.g) {
                ad.b(this);
            } else {
                this.q.f();
            }
        }
    }

    public boolean d() {
        return !this.g || this.i == 1.0f;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int left;
        int right;
        super.draw(canvas);
        Drawable drawable = f() ? this.e : this.d;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || drawable == null) {
            return;
        }
        int top = childAt.getTop();
        int bottom = childAt.getBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (f()) {
            right = childAt.getRight();
            left = right + intrinsicWidth;
        } else {
            left = childAt.getLeft();
            right = left - intrinsicWidth;
        }
        drawable.setBounds(right, top, left, bottom);
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        boolean zDrawChild;
        o oVar = (o) view.getLayoutParams();
        int iSave = canvas.save(2);
        if (this.g && !oVar.b && this.h != null) {
            canvas.getClipBounds(this.t);
            if (f()) {
                this.t.left = Math.max(this.t.left, this.h.getRight());
            } else {
                this.t.right = Math.min(this.t.right, this.h.getLeft());
            }
            canvas.clipRect(this.t);
        }
        if (Build.VERSION.SDK_INT >= 11) {
            zDrawChild = super.drawChild(canvas, view, j);
        } else if (!oVar.c || this.i <= 0.0f) {
            if (view.isDrawingCacheEnabled()) {
                view.setDrawingCacheEnabled(false);
            }
            zDrawChild = super.drawChild(canvas, view, j);
        } else {
            if (!view.isDrawingCacheEnabled()) {
                view.setDrawingCacheEnabled(true);
            }
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null) {
                canvas.drawBitmap(drawingCache, view.getLeft(), view.getTop(), oVar.d);
                zDrawChild = false;
            } else {
                Log.e("SlidingPaneLayout", "drawChild: child view " + view + " returned null drawing cache");
                zDrawChild = super.drawChild(canvas, view, j);
            }
        }
        canvas.restoreToCount(iSave);
        return zDrawChild;
    }

    public boolean e() {
        return this.g;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new o();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new o(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new o((ViewGroup.MarginLayoutParams) layoutParams) : new o(layoutParams);
    }

    public int getCoveredFadeColor() {
        return this.c;
    }

    public int getParallaxDistance() {
        return this.m;
    }

    public int getSliderFadeColor() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.s = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.s = true;
        int size = this.u.size();
        for (int i = 0; i < size; i++) {
            ((n) this.u.get(i)).run();
        }
        this.u.clear();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int iA = android.support.v4.view.s.a(motionEvent);
        if (!this.g && iA == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.r = !this.q.b(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.g || (this.l && iA != 0)) {
            this.q.e();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (iA == 3 || iA == 1) {
            this.q.e();
            return false;
        }
        switch (iA) {
            case 0:
                this.l = false;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.n = x;
                this.o = y;
                z = this.q.b(this.h, (int) x, (int) y) && b(this.h);
                break;
            case 1:
            default:
                z = false;
                break;
            case 2:
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                float fAbs = Math.abs(x2 - this.n);
                float fAbs2 = Math.abs(y2 - this.o);
                if (fAbs > this.q.d() && fAbs2 > fAbs) {
                    this.q.e();
                    this.l = true;
                    return false;
                }
                z = false;
                break;
                break;
        }
        return this.q.a(motionEvent) || z;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int width;
        int i9;
        boolean zF = f();
        if (zF) {
            this.q.a(2);
        } else {
            this.q.a(1);
        }
        int i10 = i3 - i;
        int paddingRight = zF ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = zF ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.s) {
            this.i = (this.g && this.r) ? 1.0f : 0.0f;
        }
        int i11 = 0;
        int i12 = paddingRight;
        while (i11 < childCount) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 8) {
                width = paddingRight;
                i9 = i12;
            } else {
                o oVar = (o) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (oVar.b) {
                    int iMin = (Math.min(paddingRight, (i10 - paddingLeft) - this.f) - i12) - (oVar.leftMargin + oVar.rightMargin);
                    this.k = iMin;
                    int i13 = zF ? oVar.rightMargin : oVar.leftMargin;
                    oVar.c = ((i12 + i13) + iMin) + (measuredWidth / 2) > i10 - paddingLeft;
                    int i14 = (int) (iMin * this.i);
                    i6 = i12 + i13 + i14;
                    this.i = i14 / this.k;
                    i5 = 0;
                } else if (!this.g || this.m == 0) {
                    i5 = 0;
                    i6 = paddingRight;
                } else {
                    i5 = (int) ((1.0f - this.i) * this.m);
                    i6 = paddingRight;
                }
                if (zF) {
                    i8 = (i10 - i6) + i5;
                    i7 = i8 - measuredWidth;
                } else {
                    i7 = i6 - i5;
                    i8 = i7 + measuredWidth;
                }
                childAt.layout(i7, paddingTop, i8, childAt.getMeasuredHeight() + paddingTop);
                width = childAt.getWidth() + paddingRight;
                i9 = i6;
            }
            i11++;
            paddingRight = width;
            i12 = i9;
        }
        if (this.s) {
            if (this.g) {
                if (this.m != 0) {
                    a(this.i);
                }
                if (((o) this.h.getLayoutParams()).c) {
                    a(this.h, this.i, this.b);
                }
            } else {
                for (int i15 = 0; i15 < childCount; i15++) {
                    a(getChildAt(i15), 0.0f, this.b);
                }
            }
            a(this.h);
        }
        this.s = false;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x026d  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d3 A[PHI: r3
  0x00d3: PHI (r3v12 float) = (r3v11 float), (r3v14 float) binds: [B:35:0x00c5, B:37:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:51:0x0109  */
    /* JADX WARN: Code duplicated, block: B:54:0x0111  */
    /* JADX WARN: Code duplicated, block: B:56:0x011e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0123  */
    /* JADX WARN: Code duplicated, block: B:59:0x012c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0135  */
    /* JADX WARN: Code duplicated, block: B:62:0x013a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0141  */
    /* JADX WARN: Code duplicated, block: B:64:0x014a  */
    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int paddingTop;
        int paddingTop2;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int i6;
        int iMakeMeasureSpec3;
        int iMakeMeasureSpec4;
        int measuredHeight;
        int i7;
        boolean z;
        int i8;
        int i9;
        boolean z2;
        float f;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
            }
            if (mode != Integer.MIN_VALUE && mode == 0) {
                i3 = mode2;
                i4 = 300;
                i5 = size2;
            } else {
                i3 = mode2;
                i4 = size;
                i5 = size2;
            }
        } else if (mode2 != 0) {
            i3 = mode2;
            i4 = size;
            i5 = size2;
        } else {
            if (!isInEditMode()) {
                throw new IllegalStateException("Height must not be UNSPECIFIED");
            }
            if (mode2 == 0) {
                i3 = Integer.MIN_VALUE;
                i4 = size;
                i5 = 300;
            } else {
                i3 = mode2;
                i4 = size;
                i5 = size2;
            }
        }
        switch (i3) {
            case Integer.MIN_VALUE:
                paddingTop = 0;
                paddingTop2 = (i5 - getPaddingTop()) - getPaddingBottom();
                break;
            case 1073741824:
                paddingTop = (i5 - getPaddingTop()) - getPaddingBottom();
                paddingTop2 = paddingTop;
                break;
            default:
                paddingTop = 0;
                paddingTop2 = -1;
                break;
        }
        boolean z3 = false;
        int paddingLeft = (i4 - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        this.h = null;
        int i10 = 0;
        int i11 = paddingLeft;
        int iMin = paddingTop;
        float f2 = 0.0f;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            o oVar = (o) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                oVar.c = false;
                i8 = i11;
                f = f2;
                i9 = iMin;
                z2 = z3;
            } else if (oVar.a > 0.0f) {
                f2 += oVar.a;
                if (oVar.width == 0) {
                    i8 = i11;
                    f = f2;
                    i9 = iMin;
                    z2 = z3;
                } else {
                    i6 = oVar.leftMargin + oVar.rightMargin;
                    if (oVar.width == -2) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i6, Integer.MIN_VALUE);
                    } else if (oVar.width == -1) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i6, 1073741824);
                    } else {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(oVar.width, 1073741824);
                    }
                    if (oVar.height == -2) {
                        iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingTop2, Integer.MIN_VALUE);
                    } else if (oVar.height == -1) {
                        iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingTop2, 1073741824);
                    } else {
                        iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(oVar.height, 1073741824);
                    }
                    childAt.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
                    int measuredWidth = childAt.getMeasuredWidth();
                    measuredHeight = childAt.getMeasuredHeight();
                    if (i3 == Integer.MIN_VALUE && measuredHeight > iMin) {
                        iMin = Math.min(measuredHeight, paddingTop2);
                    }
                    i7 = i11 - measuredWidth;
                    if (i7 < 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    oVar.b = z;
                    boolean z4 = z | z3;
                    if (oVar.b) {
                        this.h = childAt;
                    }
                    i8 = i7;
                    i9 = iMin;
                    float f3 = f2;
                    z2 = z4;
                    f = f3;
                }
            } else {
                i6 = oVar.leftMargin + oVar.rightMargin;
                if (oVar.width == -2) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i6, Integer.MIN_VALUE);
                } else if (oVar.width == -1) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i6, 1073741824);
                } else {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(oVar.width, 1073741824);
                }
                if (oVar.height == -2) {
                    iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingTop2, Integer.MIN_VALUE);
                } else if (oVar.height == -1) {
                    iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingTop2, 1073741824);
                } else {
                    iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(oVar.height, 1073741824);
                }
                childAt.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
                int measuredWidth2 = childAt.getMeasuredWidth();
                measuredHeight = childAt.getMeasuredHeight();
                if (i3 == Integer.MIN_VALUE) {
                    iMin = Math.min(measuredHeight, paddingTop2);
                }
                i7 = i11 - measuredWidth2;
                if (i7 < 0) {
                    z = true;
                } else {
                    z = false;
                }
                oVar.b = z;
                boolean z5 = z | z3;
                if (oVar.b) {
                    this.h = childAt;
                }
                i8 = i7;
                i9 = iMin;
                float f4 = f2;
                z2 = z5;
                f = f4;
            }
            i10++;
            z3 = z2;
            iMin = i9;
            f2 = f;
            i11 = i8;
        }
        if (z3 || f2 > 0.0f) {
            int i12 = paddingLeft - this.f;
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt2 = getChildAt(i13);
                if (childAt2.getVisibility() != 8) {
                    o oVar2 = (o) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != 8) {
                        boolean z6 = oVar2.width == 0 && oVar2.a > 0.0f;
                        int measuredWidth3 = z6 ? 0 : childAt2.getMeasuredWidth();
                        if (!z3 || childAt2 == this.h) {
                            if (oVar2.a > 0.0f) {
                                if (oVar2.width != 0) {
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                                } else if (oVar2.height == -2) {
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingTop2, Integer.MIN_VALUE);
                                } else {
                                    iMakeMeasureSpec = oVar2.height == -1 ? View.MeasureSpec.makeMeasureSpec(paddingTop2, 1073741824) : View.MeasureSpec.makeMeasureSpec(oVar2.height, 1073741824);
                                }
                                if (z3) {
                                    int i14 = paddingLeft - (oVar2.rightMargin + oVar2.leftMargin);
                                    int iMakeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
                                    if (measuredWidth3 != i14) {
                                        childAt2.measure(iMakeMeasureSpec5, iMakeMeasureSpec);
                                    }
                                } else {
                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(((int) ((oVar2.a * Math.max(0, i11)) / f2)) + measuredWidth3, 1073741824), iMakeMeasureSpec);
                                }
                            }
                        } else if (oVar2.width < 0 && (measuredWidth3 > i12 || oVar2.a > 0.0f)) {
                            if (!z6) {
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                            } else if (oVar2.height == -2) {
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingTop2, Integer.MIN_VALUE);
                            } else {
                                iMakeMeasureSpec2 = oVar2.height == -1 ? View.MeasureSpec.makeMeasureSpec(paddingTop2, 1073741824) : View.MeasureSpec.makeMeasureSpec(oVar2.height, 1073741824);
                            }
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), iMakeMeasureSpec2);
                        }
                    }
                }
            }
        }
        setMeasuredDimension(i4, getPaddingTop() + iMin + getPaddingBottom());
        this.g = z3;
        if (this.q.a() == 0 || z3) {
            return;
        }
        this.q.f();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.a) {
            b();
        } else {
            c();
        }
        this.r = savedState.a;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = e() ? d() : this.r;
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.s = true;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.g) {
            return super.onTouchEvent(motionEvent);
        }
        this.q.b(motionEvent);
        switch (motionEvent.getAction() & 255) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.n = x;
                this.o = y;
                return true;
            case 1:
                if (!b(this.h)) {
                    return true;
                }
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                float f = x2 - this.n;
                float f2 = y2 - this.o;
                int iD = this.q.d();
                if ((f * f) + (f2 * f2) >= iD * iD || !this.q.b(this.h, (int) x2, (int) y2)) {
                    return true;
                }
                a(this.h, 0);
                return true;
            default:
                return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.g) {
            return;
        }
        this.r = view == this.h;
    }

    public void setCoveredFadeColor(int i) {
        this.c = i;
    }

    public void setPanelSlideListener(p pVar) {
        this.p = pVar;
    }

    public void setParallaxDistance(int i) {
        this.m = i;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.d = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.e = drawable;
    }

    @Deprecated
    public void setShadowResource(int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(getResources().getDrawable(i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(getResources().getDrawable(i));
    }

    public void setSliderFadeColor(int i) {
        this.b = i;
    }
}
