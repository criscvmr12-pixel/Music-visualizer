package android.support.v4.widget;

import android.R;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.ad;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {
    private static final int[] a = {R.attr.layout_gravity};
    private final a b;
    private int c;
    private int d;
    private float e;
    private Paint f;
    private final v g;
    private final v h;
    private final e i;
    private final e j;
    private int k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private boolean p;
    private boolean q;
    private b r;
    private float s;
    private float t;
    private Drawable u;
    private Drawable v;

    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new d();
        int a;
        int b;
        int c;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = 0;
            this.b = 0;
            this.c = 0;
            this.a = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.a = 0;
            this.b = 0;
            this.c = 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
        }
    }

    static String b(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        return (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    private boolean d() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((c) getChildAt(i).getLayoutParams()).c) {
                return true;
            }
        }
        return false;
    }

    private boolean e() {
        return f() != null;
    }

    private View f() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (g(childAt) && j(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    private static boolean k(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    public int a(View view) {
        int iE = e(view);
        if (iE == 3) {
            return this.n;
        }
        if (iE == 5) {
            return this.o;
        }
        return 0;
    }

    View a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (((c) childAt.getLayoutParams()).d) {
                return childAt;
            }
        }
        return null;
    }

    View a(int i) {
        int iA = android.support.v4.view.g.a(i, ad.d(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((e(childAt) & 7) == iA) {
                return childAt;
            }
        }
        return null;
    }

    public void a(int i, int i2) {
        int iA = android.support.v4.view.g.a(i2, ad.d(this));
        if (iA == 3) {
            this.n = i;
        } else if (iA == 5) {
            this.o = i;
        }
        if (i != 0) {
            (iA == 3 ? this.g : this.h).e();
        }
        switch (i) {
            case 1:
                View viewA = a(iA);
                if (viewA != null) {
                    i(viewA);
                }
                break;
            case 2:
                View viewA2 = a(iA);
                if (viewA2 != null) {
                    h(viewA2);
                }
                break;
        }
    }

    void a(int i, int i2, View view) {
        int i3 = 1;
        int iA = this.g.a();
        int iA2 = this.h.a();
        if (iA != 1 && iA2 != 1) {
            i3 = (iA == 2 || iA2 == 2) ? 2 : 0;
        }
        if (view != null && i2 == 0) {
            c cVar = (c) view.getLayoutParams();
            if (cVar.b == 0.0f) {
                b(view);
            } else if (cVar.b == 1.0f) {
                c(view);
            }
        }
        if (i3 != this.k) {
            this.k = i3;
            if (this.r != null) {
                this.r.a(i3);
            }
        }
    }

    void a(View view, float f) {
        if (this.r != null) {
            this.r.a(view, f);
        }
    }

    void a(boolean z) {
        int childCount = getChildCount();
        boolean zA = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            c cVar = (c) childAt.getLayoutParams();
            if (g(childAt) && (!z || cVar.c)) {
                zA = a(childAt, 3) ? zA | this.g.a(childAt, -childAt.getWidth(), childAt.getTop()) : zA | this.h.a(childAt, getWidth(), childAt.getTop());
                cVar.c = false;
            }
        }
        this.i.a();
        this.j.a();
        if (zA) {
            invalidate();
        }
    }

    boolean a(View view, int i) {
        return (e(view) & i) == i;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (i > 0 || (i < 0 && getChildCount() > 0)) {
            ad.b(view, 4);
            ad.a(view, this.b);
        } else {
            ad.b(view, 1);
        }
        super.addView(view, i, layoutParams);
    }

    public void b() {
        a(false);
    }

    void b(View view) {
        View rootView;
        c cVar = (c) view.getLayoutParams();
        if (cVar.d) {
            cVar.d = false;
            if (this.r != null) {
                this.r.b(view);
            }
            View childAt = getChildAt(0);
            if (childAt != null) {
                ad.b(childAt, 1);
            }
            ad.b(view, 4);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    void b(View view, float f) {
        c cVar = (c) view.getLayoutParams();
        if (f == cVar.b) {
            return;
        }
        cVar.b = f;
        a(view, f);
    }

    void c(View view) {
        c cVar = (c) view.getLayoutParams();
        if (cVar.d) {
            return;
        }
        cVar.d = true;
        if (this.r != null) {
            this.r.a(view);
        }
        View childAt = getChildAt(0);
        if (childAt != null) {
            ad.b(childAt, 4);
        }
        ad.b(view, 1);
        sendAccessibilityEvent(32);
        view.requestFocus();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof c) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i = 0; i < childCount; i++) {
            fMax = Math.max(fMax, ((c) getChildAt(i).getLayoutParams()).b);
        }
        this.e = fMax;
        if (this.g.a(true) || this.h.a(true)) {
            ad.b(this);
        }
    }

    float d(View view) {
        return ((c) view.getLayoutParams()).b;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        int left;
        int height = getHeight();
        boolean zF = f(view);
        int i = 0;
        int width = getWidth();
        int iSave = canvas.save();
        if (zF) {
            int childCount = getChildCount();
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = getChildAt(i2);
                if (childAt == view || childAt.getVisibility() != 0 || !k(childAt) || !g(childAt)) {
                    left = width;
                } else if (childAt.getHeight() < height) {
                    left = width;
                } else if (a(childAt, 3)) {
                    int right = childAt.getRight();
                    if (right <= i) {
                        right = i;
                    }
                    i = right;
                    left = width;
                } else {
                    left = childAt.getLeft();
                    if (left >= width) {
                        left = width;
                    }
                }
                i2++;
                width = left;
            }
            canvas.clipRect(i, 0, width, getHeight());
        }
        int i3 = width;
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        if (this.e > 0.0f && zF) {
            this.f.setColor((((int) (((this.d & (-16777216)) >>> 24) * this.e)) << 24) | (this.d & 16777215));
            canvas.drawRect(i, 0.0f, i3, getHeight(), this.f);
        } else if (this.u != null && a(view, 3)) {
            int intrinsicWidth = this.u.getIntrinsicWidth();
            int right2 = view.getRight();
            float fMax = Math.max(0.0f, Math.min(right2 / this.g.b(), 1.0f));
            this.u.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.u.setAlpha((int) (255.0f * fMax));
            this.u.draw(canvas);
        } else if (this.v != null && a(view, 5)) {
            int intrinsicWidth2 = this.v.getIntrinsicWidth();
            int left2 = view.getLeft();
            float fMax2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.h.b(), 1.0f));
            this.v.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.v.setAlpha((int) (255.0f * fMax2));
            this.v.draw(canvas);
        }
        return zDrawChild;
    }

    int e(View view) {
        return android.support.v4.view.g.a(((c) view.getLayoutParams()).a, ad.d(this));
    }

    boolean f(View view) {
        return ((c) view.getLayoutParams()).a == 0;
    }

    boolean g(View view) {
        return (android.support.v4.view.g.a(((c) view.getLayoutParams()).a, ad.d(view)) & 7) != 0;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof c) {
            return new c((c) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    public void h(View view) {
        if (!g(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        if (this.m) {
            c cVar = (c) view.getLayoutParams();
            cVar.b = 1.0f;
            cVar.d = true;
        } else if (a(view, 3)) {
            this.g.a(view, 0, view.getTop());
        } else {
            this.h.a(view, getWidth() - view.getWidth(), view.getTop());
        }
        invalidate();
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
    	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    public void i(View view) {
        if (!g(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        if (this.m) {
            c cVar = (c) view.getLayoutParams();
            cVar.b = 0.0f;
            cVar.d = false;
        } else if (a(view, 3)) {
            this.g.a(view, -view.getWidth(), view.getTop());
        } else {
            this.h.a(view, getWidth(), view.getTop());
        }
        invalidate();
    }

    public boolean j(View view) {
        if (g(view)) {
            return ((c) view.getLayoutParams()).b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.m = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.m = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x0016  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int iA = android.support.v4.view.s.a(motionEvent);
        boolean zA = this.g.a(motionEvent) | this.h.a(motionEvent);
        switch (iA) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.s = x;
                this.t = y;
                z = this.e > 0.0f && f(this.g.d((int) x, (int) y));
                this.p = false;
                this.q = false;
                break;
            case 1:
            case 3:
                a(true);
                this.p = false;
                this.q = false;
                z = false;
                break;
            case 2:
                if (!this.g.d(3)) {
                    z = false;
                } else {
                    this.i.a();
                    this.j.a();
                    z = false;
                }
                break;
            default:
                z = false;
                break;
        }
        return zA || z || d() || this.q;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !e()) {
            return super.onKeyDown(i, keyEvent);
        }
        android.support.v4.view.l.b(keyEvent);
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View viewF = f();
        if (viewF != null && a(viewF) == 0) {
            b();
        }
        return viewF != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        float f;
        this.l = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (f(childAt)) {
                    childAt.layout(cVar.leftMargin, cVar.topMargin, cVar.leftMargin + childAt.getMeasuredWidth(), cVar.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a(childAt, 3)) {
                        i5 = ((int) (measuredWidth * cVar.b)) + (-measuredWidth);
                        f = (measuredWidth + i5) / measuredWidth;
                    } else {
                        i5 = i6 - ((int) (measuredWidth * cVar.b));
                        f = (i6 - i5) / measuredWidth;
                    }
                    boolean z2 = f != cVar.b;
                    switch (cVar.a & 112) {
                        case 16:
                            int i8 = i4 - i2;
                            int i9 = (i8 - measuredHeight) / 2;
                            if (i9 < cVar.topMargin) {
                                i9 = cVar.topMargin;
                            } else if (i9 + measuredHeight > i8 - cVar.bottomMargin) {
                                i9 = (i8 - cVar.bottomMargin) - measuredHeight;
                            }
                            childAt.layout(i5, i9, measuredWidth + i5, measuredHeight + i9);
                            break;
                        case 80:
                            int i10 = i4 - i2;
                            childAt.layout(i5, (i10 - cVar.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i10 - cVar.bottomMargin);
                            break;
                        default:
                            childAt.layout(i5, cVar.topMargin, measuredWidth + i5, measuredHeight + cVar.topMargin);
                            break;
                    }
                    if (z2) {
                        b(childAt, f);
                    }
                    int i11 = cVar.b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i11) {
                        childAt.setVisibility(i11);
                    }
                }
            }
        }
        this.l = false;
        this.m = false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0046 A[PHI: r2
  0x0046: PHI (r2v14 int) = (r2v2 int), (r2v0 int) binds: [B:17:0x0044, B:4:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3 = 300;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824 && mode2 == 1073741824) {
            i3 = size2;
        } else {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode != Integer.MIN_VALUE && mode == 0) {
                size = 300;
            }
            if (mode2 == Integer.MIN_VALUE || mode2 != 0) {
                i3 = size2;
            }
        }
        setMeasuredDimension(size, i3);
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (f(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - cVar.leftMargin) - cVar.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((i3 - cVar.topMargin) - cVar.bottomMargin, 1073741824));
                } else {
                    if (!g(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i4 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    int iE = e(childAt) & 7;
                    if ((0 & iE) != 0) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + b(iE) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    childAt.measure(getChildMeasureSpec(i, this.c + cVar.leftMargin + cVar.rightMargin, cVar.width), getChildMeasureSpec(i2, cVar.topMargin + cVar.bottomMargin, cVar.height));
                }
            }
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View viewA;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.a != 0 && (viewA = a(savedState.a)) != null) {
            h(viewA);
        }
        a(savedState.b, 3);
        a(savedState.c, 5);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (g(childAt)) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.d) {
                    savedState.a = cVar.a;
                    break;
                }
            }
        }
        savedState.b = this.n;
        savedState.c = this.o;
        return savedState;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View viewA;
        this.g.b(motionEvent);
        this.h.b(motionEvent);
        switch (motionEvent.getAction() & 255) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.s = x;
                this.t = y;
                this.p = false;
                this.q = false;
                return true;
            case 1:
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                View viewD = this.g.d((int) x2, (int) y2);
                if (viewD == null || !f(viewD)) {
                    z = true;
                } else {
                    float f = x2 - this.s;
                    float f2 = y2 - this.t;
                    int iD = this.g.d();
                    z = (f * f) + (f2 * f2) >= ((float) (iD * iD)) || (viewA = a()) == null || a(viewA) == 2;
                }
                a(z);
                this.p = false;
                return true;
            case 2:
            default:
                return true;
            case 3:
                a(true);
                this.p = false;
                this.q = false;
                return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.p = z;
        if (z) {
            a(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.l) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawerListener(b bVar) {
        this.r = bVar;
    }

    public void setDrawerLockMode(int i) {
        a(i, 3);
        a(i, 5);
    }

    public void setScrimColor(int i) {
        this.d = i;
        invalidate();
    }
}
