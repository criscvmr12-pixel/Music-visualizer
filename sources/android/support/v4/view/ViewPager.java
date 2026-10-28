package android.support.v4.view;

import android.R;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    private boolean A;
    private boolean B;
    private int C;
    private int D;
    private int E;
    private float F;
    private float G;
    private float H;
    private float I;
    private int J;
    private VelocityTracker K;
    private int L;
    private int M;
    private int N;
    private int O;
    private boolean P;
    private android.support.v4.widget.f Q;
    private android.support.v4.widget.f R;
    private boolean S;
    private boolean T;
    private boolean U;
    private int V;
    private az W;
    private az Z;
    private ay aa;
    private ba ab;
    private Method ac;
    private int ad;
    private ArrayList ae;
    private final Runnable ag;
    private int ah;
    private int b;
    private final ArrayList e;
    private final aw f;
    private final Rect g;
    private x h;
    private int i;
    private int j;
    private Parcelable k;
    private ClassLoader l;
    private Scroller m;
    private bb n;
    private int o;
    private Drawable p;
    private int q;
    private int r;
    private float s;
    private float t;
    private int u;
    private int v;
    private boolean w;
    private boolean x;
    private boolean y;
    private int z;
    private static final int[] a = {R.attr.layout_gravity};
    private static final Comparator c = new at();
    private static final Interpolator d = new au();
    private static final bd af = new bd();

    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = android.support.v4.b.a.a(new bc());
        int a;
        Parcelable b;
        ClassLoader c;

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.a = parcel.readInt();
            this.b = parcel.readParcelable(classLoader);
            this.c = classLoader;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeParcelable(this.b, i);
        }
    }

    private int a(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.N || Math.abs(i2) <= this.L) {
            i = (int) ((i >= this.i ? 0.4f : 0.6f) + i + f);
        } else if (i2 <= 0) {
            i++;
        }
        if (this.e.size() > 0) {
            return Math.max(((aw) this.e.get(0)).b, Math.min(i, ((aw) this.e.get(this.e.size() - 1)).b));
        }
        return i;
    }

    private Rect a(Rect rect, View view) {
        Rect rect2 = rect == null ? new Rect() : rect;
        if (view == null) {
            rect2.set(0, 0, 0, 0);
            return rect2;
        }
        rect2.left = view.getLeft();
        rect2.right = view.getRight();
        rect2.top = view.getTop();
        rect2.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect2.left += viewGroup.getLeft();
            rect2.right += viewGroup.getRight();
            rect2.top += viewGroup.getTop();
            rect2.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect2;
    }

    private void a(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.e.isEmpty()) {
            aw awVarB = b(this.i);
            int iMin = (int) ((awVarB != null ? Math.min(awVarB.e, this.t) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
            if (iMin != getScrollX()) {
                a(false);
                scrollTo(iMin, getScrollY());
                return;
            }
            return;
        }
        int paddingLeft = (int) ((((i - getPaddingLeft()) - getPaddingRight()) + i3) * (getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)));
        scrollTo(paddingLeft, getScrollY());
        if (this.m.isFinished()) {
            return;
        }
        this.m.startScroll(paddingLeft, 0, (int) (b(this.i).e * i), 0, this.m.getDuration() - this.m.timePassed());
    }

    private void a(int i, boolean z, int i2, boolean z2) {
        int iMax;
        aw awVarB = b(i);
        if (awVarB != null) {
            iMax = (int) (Math.max(this.s, Math.min(awVarB.e, this.t)) * getClientWidth());
        } else {
            iMax = 0;
        }
        if (z) {
            a(iMax, 0, i2);
            if (z2 && this.W != null) {
                this.W.a(i);
            }
            if (!z2 || this.Z == null) {
                return;
            }
            this.Z.a(i);
            return;
        }
        if (z2 && this.W != null) {
            this.W.a(i);
        }
        if (z2 && this.Z != null) {
            this.Z.a(i);
        }
        a(false);
        scrollTo(iMax, 0);
        d(iMax);
    }

    private void a(aw awVar, int i, aw awVar2) {
        aw awVar3;
        aw awVar4;
        int iA = this.h.a();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? this.o / clientWidth : 0.0f;
        if (awVar2 != null) {
            int i2 = awVar2.b;
            if (i2 < awVar.b) {
                float fA = awVar2.e + awVar2.d + f;
                int i3 = i2 + 1;
                int i4 = 0;
                while (i3 <= awVar.b && i4 < this.e.size()) {
                    Object obj = this.e.get(i4);
                    while (true) {
                        awVar4 = (aw) obj;
                        if (i3 <= awVar4.b || i4 >= this.e.size() - 1) {
                            break;
                        }
                        i4++;
                        obj = this.e.get(i4);
                    }
                    while (i3 < awVar4.b) {
                        fA += this.h.a(i3) + f;
                        i3++;
                    }
                    awVar4.e = fA;
                    fA += awVar4.d + f;
                    i3++;
                }
            } else if (i2 > awVar.b) {
                int size = this.e.size() - 1;
                float fA2 = awVar2.e;
                int i5 = i2 - 1;
                while (i5 >= awVar.b && size >= 0) {
                    Object obj2 = this.e.get(size);
                    while (true) {
                        awVar3 = (aw) obj2;
                        if (i5 >= awVar3.b || size <= 0) {
                            break;
                        }
                        size--;
                        obj2 = this.e.get(size);
                    }
                    while (i5 > awVar3.b) {
                        fA2 -= this.h.a(i5) + f;
                        i5--;
                    }
                    fA2 -= awVar3.d + f;
                    awVar3.e = fA2;
                    i5--;
                }
            }
        }
        int size2 = this.e.size();
        float f2 = awVar.e;
        int i6 = awVar.b - 1;
        this.s = awVar.b == 0 ? awVar.e : -3.4028235E38f;
        this.t = awVar.b == iA + (-1) ? (awVar.e + awVar.d) - 1.0f : Float.MAX_VALUE;
        for (int i7 = i - 1; i7 >= 0; i7--) {
            aw awVar5 = (aw) this.e.get(i7);
            float fA3 = f2;
            while (i6 > awVar5.b) {
                fA3 -= this.h.a(i6) + f;
                i6--;
            }
            f2 = fA3 - (awVar5.d + f);
            awVar5.e = f2;
            if (awVar5.b == 0) {
                this.s = f2;
            }
            i6--;
        }
        float f3 = awVar.e + awVar.d + f;
        int i8 = awVar.b + 1;
        for (int i9 = i + 1; i9 < size2; i9++) {
            aw awVar6 = (aw) this.e.get(i9);
            float fA4 = f3;
            while (i8 < awVar6.b) {
                fA4 = this.h.a(i8) + f + fA4;
                i8++;
            }
            if (awVar6.b == iA - 1) {
                this.t = (awVar6.d + fA4) - 1.0f;
            }
            awVar6.e = fA4;
            f3 = fA4 + awVar6.d + f;
            i8++;
        }
        this.T = false;
    }

    private void a(MotionEvent motionEvent) {
        int iB = s.b(motionEvent);
        if (s.b(motionEvent, iB) == this.J) {
            int i = iB == 0 ? 1 : 0;
            this.F = s.c(motionEvent, i);
            this.J = s.b(motionEvent, i);
            if (this.K != null) {
                this.K.clear();
            }
        }
    }

    private void a(boolean z) {
        boolean z2 = this.ah == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            this.m.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.m.getCurrX();
            int currY = this.m.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
            }
        }
        this.y = false;
        boolean z3 = z2;
        for (int i = 0; i < this.e.size(); i++) {
            aw awVar = (aw) this.e.get(i);
            if (awVar.c) {
                awVar.c = false;
                z3 = true;
            }
        }
        if (z3) {
            if (z) {
                ad.a(this, this.ag);
            } else {
                this.ag.run();
            }
        }
    }

    private boolean a(float f, float f2) {
        return (f < ((float) this.D) && f2 > 0.0f) || (f > ((float) (getWidth() - this.D)) && f2 < 0.0f);
    }

    private void b(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ad.a(getChildAt(i), z ? 2 : 0, null);
        }
    }

    private boolean b(float f) {
        boolean z;
        float f2;
        boolean z2 = true;
        boolean zA = false;
        float f3 = this.F - f;
        this.F = f;
        float scrollX = getScrollX() + f3;
        int clientWidth = getClientWidth();
        float f4 = clientWidth * this.s;
        float f5 = clientWidth * this.t;
        aw awVar = (aw) this.e.get(0);
        aw awVar2 = (aw) this.e.get(this.e.size() - 1);
        if (awVar.b != 0) {
            f4 = awVar.e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (awVar2.b != this.h.a() - 1) {
            f2 = awVar2.e * clientWidth;
            z2 = false;
        } else {
            f2 = f5;
        }
        if (scrollX < f4) {
            if (z) {
                zA = this.Q.a(Math.abs(f4 - scrollX) / clientWidth);
            }
        } else if (scrollX > f2) {
            zA = z2 ? this.R.a(Math.abs(scrollX - f2) / clientWidth) : false;
            f4 = f2;
        } else {
            f4 = scrollX;
        }
        this.F += f4 - ((int) f4);
        scrollTo((int) f4, getScrollY());
        d((int) f4);
        return zA;
    }

    private void c(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean d(int i) {
        if (this.e.size() == 0) {
            this.U = false;
            a(0, 0.0f, 0);
            if (this.U) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        aw awVarH = h();
        int clientWidth = getClientWidth();
        int i2 = this.o + clientWidth;
        float f = this.o / clientWidth;
        int i3 = awVarH.b;
        float f2 = ((i / clientWidth) - awVarH.e) / (awVarH.d + f);
        this.U = false;
        a(i3, f2, (int) (i2 * f2));
        if (this.U) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private void f() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= getChildCount()) {
                return;
            }
            if (!((ax) getChildAt(i2).getLayoutParams()).a) {
                removeViewAt(i2);
                i2--;
            }
            i = i2 + 1;
        }
    }

    private void g() {
        if (this.ad != 0) {
            if (this.ae == null) {
                this.ae = new ArrayList();
            } else {
                this.ae.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.ae.add(getChildAt(i));
            }
            Collections.sort(this.ae, af);
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private aw h() {
        int i;
        aw awVar;
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f = clientWidth > 0 ? this.o / clientWidth : 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        aw awVar2 = null;
        while (i3 < this.e.size()) {
            aw awVar3 = (aw) this.e.get(i3);
            if (z || awVar3.b == i2 + 1) {
                i = i3;
                awVar = awVar3;
            } else {
                aw awVar4 = this.f;
                awVar4.e = f2 + f3 + f;
                awVar4.b = i2 + 1;
                awVar4.d = this.h.a(awVar4.b);
                i = i3 - 1;
                awVar = awVar4;
            }
            float f4 = awVar.e;
            float f5 = awVar.d + f4 + f;
            if (!z && scrollX < f4) {
                return awVar2;
            }
            if (scrollX < f5 || i == this.e.size() - 1) {
                return awVar;
            }
            f3 = f4;
            i2 = awVar.b;
            z = false;
            f2 = awVar.d;
            awVar2 = awVar;
            i3 = i + 1;
        }
        return awVar2;
    }

    private void i() {
        this.A = false;
        this.B = false;
        if (this.K != null) {
            this.K.recycle();
            this.K = null;
        }
    }

    private void setScrollState(int i) {
        if (this.ah == i) {
            return;
        }
        this.ah = i;
        if (this.ab != null) {
            b(i != 0);
        }
        if (this.W != null) {
            this.W.b(i);
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.x != z) {
            this.x = z;
        }
    }

    float a(float f) {
        return (float) Math.sin((float) (((double) (f - 0.5f)) * 0.4712389167638204d));
    }

    aw a(int i, int i2) {
        aw awVar = new aw();
        awVar.b = i;
        awVar.a = this.h.a((ViewGroup) this, i);
        awVar.d = this.h.a(i);
        if (i2 < 0 || i2 >= this.e.size()) {
            this.e.add(awVar);
        } else {
            this.e.add(i2, awVar);
        }
        return awVar;
    }

    aw a(View view) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.e.size()) {
                return null;
            }
            aw awVar = (aw) this.e.get(i2);
            if (this.h.a(view, awVar.a)) {
                return awVar;
            }
            i = i2 + 1;
        }
    }

    void a() {
        int i;
        boolean z;
        int iMax;
        boolean z2;
        int iA = this.h.a();
        this.b = iA;
        boolean z3 = this.e.size() < (this.z * 2) + 1 && this.e.size() < iA;
        boolean z4 = false;
        int i2 = this.i;
        boolean z5 = z3;
        int i3 = 0;
        while (i3 < this.e.size()) {
            aw awVar = (aw) this.e.get(i3);
            int iA2 = this.h.a(awVar.a);
            if (iA2 == -1) {
                i = i3;
                z = z4;
                iMax = i2;
                z2 = z5;
            } else if (iA2 == -2) {
                this.e.remove(i3);
                int i4 = i3 - 1;
                if (!z4) {
                    this.h.a((ViewGroup) this);
                    z4 = true;
                }
                this.h.a((ViewGroup) this, awVar.b, awVar.a);
                if (this.i == awVar.b) {
                    i = i4;
                    z = z4;
                    iMax = Math.max(0, Math.min(this.i, iA - 1));
                    z2 = true;
                } else {
                    i = i4;
                    z = z4;
                    iMax = i2;
                    z2 = true;
                }
            } else if (awVar.b != iA2) {
                if (awVar.b == this.i) {
                    i2 = iA2;
                }
                awVar.b = iA2;
                i = i3;
                z = z4;
                iMax = i2;
                z2 = true;
            } else {
                i = i3;
                z = z4;
                iMax = i2;
                z2 = z5;
            }
            z5 = z2;
            i2 = iMax;
            z4 = z;
            i3 = i + 1;
        }
        if (z4) {
            this.h.b((ViewGroup) this);
        }
        Collections.sort(this.e, c);
        if (z5) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                ax axVar = (ax) getChildAt(i5).getLayoutParams();
                if (!axVar.a) {
                    axVar.c = 0.0f;
                }
            }
            a(i2, false, true);
            requestLayout();
        }
    }

    void a(int i) {
        aw awVar;
        int i2;
        String hexString;
        int i3;
        aw awVar2;
        aw awVarA;
        if (this.i != i) {
            int i4 = this.i < i ? 66 : 17;
            aw awVarB = b(this.i);
            this.i = i;
            awVar = awVarB;
            i2 = i4;
        } else {
            awVar = null;
            i2 = 2;
        }
        if (this.h == null) {
            g();
            return;
        }
        if (this.y) {
            g();
            return;
        }
        if (getWindowToken() != null) {
            this.h.a((ViewGroup) this);
            int i5 = this.z;
            int iMax = Math.max(0, this.i - i5);
            int iA = this.h.a();
            int iMin = Math.min(iA - 1, i5 + this.i);
            if (iA != this.b) {
                try {
                    hexString = getResources().getResourceName(getId());
                } catch (Resources.NotFoundException e) {
                    hexString = Integer.toHexString(getId());
                }
                throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.b + ", found: " + iA + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.h.getClass());
            }
            int i6 = 0;
            while (true) {
                i3 = i6;
                if (i3 < this.e.size()) {
                    awVar2 = (aw) this.e.get(i3);
                    if (awVar2.b >= this.i) {
                        if (awVar2.b != this.i) {
                            break;
                        } else {
                            break;
                        }
                    }
                    i6 = i3 + 1;
                }
                awVar2 = null;
                break;
            }
            aw awVarA2 = (awVar2 != null || iA <= 0) ? awVar2 : a(this.i, i3);
            if (awVarA2 != null) {
                int i7 = i3 - 1;
                aw awVar3 = i7 >= 0 ? (aw) this.e.get(i7) : null;
                int clientWidth = getClientWidth();
                float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - awVarA2.d) + (getPaddingLeft() / clientWidth);
                float f = 0.0f;
                int i8 = i3;
                int i9 = i7;
                for (int i10 = this.i - 1; i10 >= 0; i10--) {
                    if (f >= paddingLeft && i10 < iMax) {
                        if (awVar3 == null) {
                            break;
                        }
                        if (i10 == awVar3.b && !awVar3.c) {
                            this.e.remove(i9);
                            this.h.a((ViewGroup) this, i10, awVar3.a);
                            i9--;
                            i8--;
                            awVar3 = i9 >= 0 ? (aw) this.e.get(i9) : null;
                        }
                    } else if (awVar3 == null || i10 != awVar3.b) {
                        f += a(i10, i9 + 1).d;
                        i8++;
                        awVar3 = i9 >= 0 ? (aw) this.e.get(i9) : null;
                    } else {
                        f += awVar3.d;
                        i9--;
                        awVar3 = i9 >= 0 ? (aw) this.e.get(i9) : null;
                    }
                }
                float f2 = awVarA2.d;
                int i11 = i8 + 1;
                if (f2 < 2.0f) {
                    aw awVar4 = i11 < this.e.size() ? (aw) this.e.get(i11) : null;
                    float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                    aw awVar5 = awVar4;
                    int i12 = i11;
                    int i13 = this.i + 1;
                    while (i13 < iA) {
                        if (f2 >= paddingRight && i13 > iMin) {
                            if (awVar5 == null) {
                                break;
                            }
                            if (i13 == awVar5.b && !awVar5.c) {
                                this.e.remove(i12);
                                this.h.a((ViewGroup) this, i13, awVar5.a);
                                awVar5 = i12 < this.e.size() ? (aw) this.e.get(i12) : null;
                            }
                        } else if (awVar5 == null || i13 != awVar5.b) {
                            aw awVarA3 = a(i13, i12);
                            i12++;
                            f2 += awVarA3.d;
                            awVar5 = i12 < this.e.size() ? (aw) this.e.get(i12) : null;
                        } else {
                            f2 += awVar5.d;
                            i12++;
                            awVar5 = i12 < this.e.size() ? (aw) this.e.get(i12) : null;
                        }
                        i13++;
                        awVar5 = awVar5;
                        f2 = f2;
                    }
                }
                a(awVarA2, i8, awVar);
            }
            this.h.b((ViewGroup) this, this.i, awVarA2 != null ? awVarA2.a : null);
            this.h.b((ViewGroup) this);
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                ax axVar = (ax) childAt.getLayoutParams();
                axVar.f = i14;
                if (!axVar.a && axVar.c == 0.0f && (awVarA = a(childAt)) != null) {
                    axVar.c = awVarA.d;
                    axVar.e = awVarA.b;
                }
            }
            g();
            if (hasFocus()) {
                View viewFindFocus = findFocus();
                aw awVarB2 = viewFindFocus != null ? b(viewFindFocus) : null;
                if (awVarB2 == null || awVarB2.b != this.i) {
                    for (int i15 = 0; i15 < getChildCount(); i15++) {
                        View childAt2 = getChildAt(i15);
                        aw awVarA4 = a(childAt2);
                        if (awVarA4 != null && awVarA4.b == this.i && childAt2.requestFocus(i2)) {
                            return;
                        }
                    }
                }
            }
        }
    }

    protected void a(int i, float f, int i2) {
        int measuredWidth;
        int i3;
        int i4;
        if (this.V > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            int i5 = 0;
            while (i5 < childCount) {
                View childAt = getChildAt(i5);
                ax axVar = (ax) childAt.getLayoutParams();
                if (axVar.a) {
                    switch (axVar.b & 7) {
                        case 1:
                            measuredWidth = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            int i6 = paddingRight;
                            i3 = paddingLeft;
                            i4 = i6;
                            break;
                        case 2:
                        case 4:
                        default:
                            measuredWidth = paddingLeft;
                            int i7 = paddingRight;
                            i3 = paddingLeft;
                            i4 = i7;
                            break;
                        case 3:
                            int width2 = childAt.getWidth() + paddingLeft;
                            int i8 = paddingLeft;
                            i4 = paddingRight;
                            i3 = width2;
                            measuredWidth = i8;
                            break;
                        case 5:
                            measuredWidth = (width - paddingRight) - childAt.getMeasuredWidth();
                            int measuredWidth2 = paddingRight + childAt.getMeasuredWidth();
                            i3 = paddingLeft;
                            i4 = measuredWidth2;
                            break;
                    }
                    int left = (measuredWidth + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                } else {
                    int i9 = paddingRight;
                    i3 = paddingLeft;
                    i4 = i9;
                }
                i5++;
                int i10 = i4;
                paddingLeft = i3;
                paddingRight = i10;
            }
        }
        if (this.W != null) {
            this.W.a(i, f, i2);
        }
        if (this.Z != null) {
            this.Z.a(i, f, i2);
        }
        if (this.ab != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = getChildAt(i11);
                if (!((ax) childAt2.getLayoutParams()).a) {
                    this.ab.a(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.U = true;
    }

    void a(int i, int i2, int i3) {
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int i4 = i - scrollX;
        int i5 = i2 - scrollY;
        if (i4 == 0 && i5 == 0) {
            a(false);
            b();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i6 = clientWidth / 2;
        float fA = (i6 * a(Math.min(1.0f, (Math.abs(i4) * 1.0f) / clientWidth))) + i6;
        int iAbs2 = Math.abs(i3);
        if (iAbs2 > 0) {
            iAbs = Math.round(1000.0f * Math.abs(fA / iAbs2)) * 4;
        } else {
            iAbs = (int) (((Math.abs(i4) / ((clientWidth * this.h.a(this.i)) + this.o)) + 1.0f) * 100.0f);
        }
        this.m.startScroll(scrollX, scrollY, i4, i5, Math.min(iAbs, 600));
        ad.b(this);
    }

    public void a(int i, boolean z) {
        this.y = false;
        a(i, z, false);
    }

    void a(int i, boolean z, boolean z2) {
        a(i, z, z2, 0);
    }

    void a(int i, boolean z, boolean z2, int i2) {
        if (this.h == null || this.h.a() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.i == i && this.e.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.h.a()) {
            i = this.h.a() - 1;
        }
        int i3 = this.z;
        if (i > this.i + i3 || i < this.i - i3) {
            for (int i4 = 0; i4 < this.e.size(); i4++) {
                ((aw) this.e.get(i4)).c = true;
            }
        }
        boolean z3 = this.i != i;
        if (!this.S) {
            a(i);
            a(i, z, i2, z3);
            return;
        }
        this.i = i;
        if (z3 && this.W != null) {
            this.W.a(i);
        }
        if (z3 && this.Z != null) {
            this.Z.a(i);
        }
        requestLayout();
    }

    public boolean a(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        switch (keyEvent.getKeyCode()) {
            case 21:
                return c(17);
            case 22:
                return c(66);
            case 61:
                if (Build.VERSION.SDK_INT < 11) {
                    return false;
                }
                if (l.a(keyEvent)) {
                    return c(2);
                }
                if (l.a(keyEvent, 1)) {
                    return c(1);
                }
                return false;
            default:
                return false;
        }
    }

    protected boolean a(View view, boolean z, int i, int i2, int i3) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i2 + scrollX >= childAt.getLeft() && i2 + scrollX < childAt.getRight() && i3 + scrollY >= childAt.getTop() && i3 + scrollY < childAt.getBottom() && a(childAt, true, i, (i2 + scrollX) - childAt.getLeft(), (i3 + scrollY) - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && ad.a(view, -i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i, int i2) {
        aw awVarA;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (awVarA = a(childAt)) != null && awVarA.b == this.i) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if (((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) || arrayList == null) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList arrayList) {
        aw awVarA;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (awVarA = a(childAt)) != null && awVarA.b == this.i) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParamsGenerateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : layoutParams;
        ax axVar = (ax) layoutParamsGenerateLayoutParams;
        axVar.a |= view instanceof av;
        if (!this.w) {
            super.addView(view, i, layoutParamsGenerateLayoutParams);
        } else {
            if (axVar != null && axVar.a) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            axVar.d = true;
            addViewInLayout(view, i, layoutParamsGenerateLayoutParams);
        }
    }

    aw b(int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.e.size()) {
                return null;
            }
            aw awVar = (aw) this.e.get(i3);
            if (awVar.b == i) {
                return awVar;
            }
            i2 = i3 + 1;
        }
    }

    aw b(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return a(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    void b() {
        a(this.i);
    }

    boolean c() {
        if (this.i <= 0) {
            return false;
        }
        a(this.i - 1, true);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00db  */
    /* JADX WARN: Code duplicated, block: B:44:0x00de  */
    public boolean c(int i) {
        View view;
        boolean z;
        boolean zC;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            view = null;
        } else if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    z = false;
                    break;
                }
                if (parent == this) {
                    z = true;
                    break;
                }
                parent = parent.getParent();
            }
            if (z) {
                view = viewFindFocus;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(viewFindFocus.getClass().getSimpleName());
                for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb.append(" => ").append(parent2.getClass().getSimpleName());
                }
                Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
                view = null;
            }
        } else {
            view = viewFindFocus;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        if (viewFindNextFocus == null || viewFindNextFocus == view) {
            if (i == 17 || i == 1) {
                zC = c();
            } else if (i == 66 || i == 2) {
                zC = d();
            } else {
                zC = false;
            }
        } else if (i == 17) {
            zC = (view == null || a(this.g, viewFindNextFocus).left < a(this.g, view).left) ? viewFindNextFocus.requestFocus() : c();
        } else if (i == 66) {
            zC = (view == null || a(this.g, viewFindNextFocus).left > a(this.g, view).left) ? viewFindNextFocus.requestFocus() : d();
        } else {
            zC = false;
        }
        if (zC) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return zC;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.h == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.s));
        }
        if (i > 0) {
            return scrollX < ((int) (((float) clientWidth) * this.t));
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof ax) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.m.isFinished() || !this.m.computeScrollOffset()) {
            a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.m.getCurrX();
        int currY = this.m.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!d(currX)) {
                this.m.abortAnimation();
                scrollTo(0, currY);
            }
        }
        ad.b(this);
    }

    boolean d() {
        if (this.h == null || this.i >= this.h.a() - 1) {
            return false;
        }
        a(this.i + 1, true);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || a(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        aw awVarA;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (awVarA = a(childAt)) != null && awVarA.b == this.i && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        boolean zA = false;
        int iA = ad.a(this);
        if (iA == 0 || (iA == 1 && this.h != null && this.h.a() > 1)) {
            if (!this.Q.a()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.s * width);
                this.Q.a(height, width);
                zA = false | this.Q.a(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.R.a()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.t + 1.0f)) * width2);
                this.R.a(height2, width2);
                zA |= this.R.a(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.Q.b();
            this.R.b();
        }
        if (zA) {
            ad.b(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ax();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ax(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public x getAdapter() {
        return this.h;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        if (this.ad == 2) {
            i2 = (i - 1) - i2;
        }
        return ((ax) ((View) this.ae.get(i2)).getLayoutParams()).f;
    }

    public int getCurrentItem() {
        return this.i;
    }

    public int getOffscreenPageLimit() {
        return this.z;
    }

    public int getPageMargin() {
        return this.o;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.S = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.ag);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (this.o <= 0 || this.p == null || this.e.size() <= 0 || this.h == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f2 = this.o / width;
        aw awVar = (aw) this.e.get(0);
        float f3 = awVar.e;
        int size = this.e.size();
        int i = awVar.b;
        int i2 = ((aw) this.e.get(size - 1)).b;
        int i3 = 0;
        for (int i4 = i; i4 < i2; i4++) {
            while (i4 > awVar.b && i3 < size) {
                i3++;
                awVar = (aw) this.e.get(i3);
            }
            if (i4 == awVar.b) {
                f = (awVar.e + awVar.d) * width;
                f3 = awVar.e + awVar.d + f2;
            } else {
                float fA = this.h.a(i4);
                f = (f3 + fA) * width;
                f3 += fA + f2;
            }
            if (this.o + f > scrollX) {
                this.p.setBounds((int) f, this.q, (int) (this.o + f + 0.5f), this.r);
                this.p.draw(canvas);
            }
            if (f > scrollX + width) {
                return;
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            this.A = false;
            this.B = false;
            this.J = -1;
            if (this.K == null) {
                return false;
            }
            this.K.recycle();
            this.K = null;
            return false;
        }
        if (action != 0) {
            if (this.A) {
                return true;
            }
            if (this.B) {
                return false;
            }
        }
        switch (action) {
            case 0:
                float x = motionEvent.getX();
                this.H = x;
                this.F = x;
                float y = motionEvent.getY();
                this.I = y;
                this.G = y;
                this.J = s.b(motionEvent, 0);
                this.B = false;
                this.m.computeScrollOffset();
                if (this.ah == 2 && Math.abs(this.m.getFinalX() - this.m.getCurrX()) > this.O) {
                    this.m.abortAnimation();
                    this.y = false;
                    b();
                    this.A = true;
                    c(true);
                    setScrollState(1);
                } else {
                    a(false);
                    this.A = false;
                }
                break;
            case 2:
                int i = this.J;
                if (i != -1) {
                    int iA = s.a(motionEvent, i);
                    float fC = s.c(motionEvent, iA);
                    float f = fC - this.F;
                    float fAbs = Math.abs(f);
                    float fD = s.d(motionEvent, iA);
                    float fAbs2 = Math.abs(fD - this.I);
                    if (f != 0.0f && !a(this.F, f) && a(this, false, (int) f, (int) fC, (int) fD)) {
                        this.F = fC;
                        this.G = fD;
                        this.B = true;
                        return false;
                    }
                    if (fAbs > this.E && 0.5f * fAbs > fAbs2) {
                        this.A = true;
                        c(true);
                        setScrollState(1);
                        this.F = f > 0.0f ? this.H + this.E : this.H - this.E;
                        this.G = fD;
                        setScrollingCacheEnabled(true);
                    } else if (fAbs2 > this.E) {
                        this.B = true;
                    }
                    if (this.A && b(fC)) {
                        ad.b(this);
                    }
                }
                break;
            case 6:
                a(motionEvent);
                break;
        }
        if (this.K == null) {
            this.K = VelocityTracker.obtain();
        }
        this.K.addMovement(motionEvent);
        return this.A;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0141  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        aw awVarA;
        int i5;
        int i6;
        int iMax;
        int measuredHeight;
        int i7;
        int i8;
        int childCount = getChildCount();
        int i9 = i3 - i;
        int i10 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i11 = 0;
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                ax axVar = (ax) childAt.getLayoutParams();
                if (axVar.a) {
                    int i13 = axVar.b & 7;
                    int i14 = axVar.b & 112;
                    switch (i13) {
                        case 1:
                            iMax = Math.max((i9 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            break;
                        case 2:
                        case 4:
                        default:
                            iMax = paddingLeft;
                            break;
                        case 3:
                            iMax = paddingLeft;
                            paddingLeft = childAt.getMeasuredWidth() + paddingLeft;
                            break;
                        case 5:
                            int measuredWidth = (i9 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                            iMax = measuredWidth;
                            break;
                    }
                    switch (i14) {
                        case 16:
                            measuredHeight = Math.max((i10 - childAt.getMeasuredHeight()) / 2, paddingTop);
                            int i15 = paddingBottom;
                            i7 = paddingTop;
                            i8 = i15;
                            break;
                        case 48:
                            int measuredHeight2 = childAt.getMeasuredHeight() + paddingTop;
                            int i16 = paddingTop;
                            i8 = paddingBottom;
                            i7 = measuredHeight2;
                            measuredHeight = i16;
                            break;
                        case 80:
                            measuredHeight = (i10 - paddingBottom) - childAt.getMeasuredHeight();
                            int measuredHeight3 = paddingBottom + childAt.getMeasuredHeight();
                            i7 = paddingTop;
                            i8 = measuredHeight3;
                            break;
                        default:
                            measuredHeight = paddingTop;
                            int i17 = paddingBottom;
                            i7 = paddingTop;
                            i8 = i17;
                            break;
                    }
                    int i18 = iMax + scrollX;
                    childAt.layout(i18, measuredHeight, childAt.getMeasuredWidth() + i18, childAt.getMeasuredHeight() + measuredHeight);
                    i5 = i11 + 1;
                    i6 = i7;
                    paddingBottom = i8;
                } else {
                    i5 = i11;
                    i6 = paddingTop;
                }
            } else {
                i5 = i11;
                i6 = paddingTop;
            }
            i12++;
            paddingLeft = paddingLeft;
            paddingRight = paddingRight;
            paddingTop = i6;
            i11 = i5;
        }
        int i19 = (i9 - paddingLeft) - paddingRight;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt2 = getChildAt(i20);
            if (childAt2.getVisibility() != 8) {
                ax axVar2 = (ax) childAt2.getLayoutParams();
                if (!axVar2.a && (awVarA = a(childAt2)) != null) {
                    int i21 = ((int) (awVarA.e * i19)) + paddingLeft;
                    if (axVar2.d) {
                        axVar2.d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (axVar2.c * i19), 1073741824), View.MeasureSpec.makeMeasureSpec((i10 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i21, paddingTop, childAt2.getMeasuredWidth() + i21, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.q = paddingTop;
        this.r = i10 - paddingBottom;
        this.V = i11;
        if (this.S) {
            a(this.i, false, 0, false);
        }
        this.S = false;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x010a A[PHI: r1
  0x010a: PHI (r1v18 int) = (r1v17 int), (r1v20 int) binds: [B:28:0x0088, B:30:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        ax axVar;
        ax axVar2;
        int i3;
        int i4;
        int i5;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.D = Math.min(measuredWidth / 10, this.C);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8 && (axVar2 = (ax) childAt.getLayoutParams()) != null && axVar2.a) {
                int i7 = axVar2.b & 7;
                int i8 = axVar2.b & 112;
                int i9 = Integer.MIN_VALUE;
                int i10 = Integer.MIN_VALUE;
                boolean z = i8 == 48 || i8 == 80;
                boolean z2 = i7 == 3 || i7 == 5;
                if (z) {
                    i9 = 1073741824;
                } else if (z2) {
                    i10 = 1073741824;
                }
                if (axVar2.width != -2) {
                    i3 = 1073741824;
                    i4 = axVar2.width != -1 ? axVar2.width : paddingLeft;
                } else {
                    i3 = i9;
                    i4 = paddingLeft;
                }
                if (axVar2.height != -2) {
                    i10 = 1073741824;
                    if (axVar2.height != -1) {
                        i5 = axVar2.height;
                    } else {
                        i5 = measuredHeight;
                    }
                } else {
                    i5 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, i3), View.MeasureSpec.makeMeasureSpec(i5, i10));
                if (z) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z2) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
        }
        this.u = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.v = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.w = true;
        b();
        this.w = false;
        int childCount2 = getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            View childAt2 = getChildAt(i11);
            if (childAt2.getVisibility() != 8 && ((axVar = (ax) childAt2.getLayoutParams()) == null || !axVar.a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (axVar.c * paddingLeft), 1073741824), this.v);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        aw awVarA;
        int i3 = -1;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = 1;
            i2 = 0;
        } else {
            i2 = childCount - 1;
            childCount = -1;
        }
        while (i2 != childCount) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (awVarA = a(childAt)) != null && awVarA.b == this.i && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (this.h != null) {
            this.h.a(savedState.b, savedState.c);
            a(savedState.a, false, true);
        } else {
            this.j = savedState.a;
            this.k = savedState.b;
            this.l = savedState.c;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.i;
        if (this.h != null) {
            savedState.b = this.h.b();
        }
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            a(i, i3, this.o, this.o);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zC = false;
        if (this.P) {
            return true;
        }
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        if (this.h == null || this.h.a() == 0) {
            return false;
        }
        if (this.K == null) {
            this.K = VelocityTracker.obtain();
        }
        this.K.addMovement(motionEvent);
        switch (motionEvent.getAction() & 255) {
            case 0:
                this.m.abortAnimation();
                this.y = false;
                b();
                float x = motionEvent.getX();
                this.H = x;
                this.F = x;
                float y = motionEvent.getY();
                this.I = y;
                this.G = y;
                this.J = s.b(motionEvent, 0);
                break;
            case 1:
                if (this.A) {
                    VelocityTracker velocityTracker = this.K;
                    velocityTracker.computeCurrentVelocity(1000, this.M);
                    int iA = (int) y.a(velocityTracker, this.J);
                    this.y = true;
                    int clientWidth = getClientWidth();
                    int scrollX = getScrollX();
                    aw awVarH = h();
                    a(a(awVarH.b, ((scrollX / clientWidth) - awVarH.e) / awVarH.d, iA, (int) (s.c(motionEvent, s.a(motionEvent, this.J)) - this.H)), true, true, iA);
                    this.J = -1;
                    i();
                    zC = this.R.c() | this.Q.c();
                }
                break;
            case 2:
                if (!this.A) {
                    int iA2 = s.a(motionEvent, this.J);
                    float fC = s.c(motionEvent, iA2);
                    float fAbs = Math.abs(fC - this.F);
                    float fD = s.d(motionEvent, iA2);
                    float fAbs2 = Math.abs(fD - this.G);
                    if (fAbs > this.E && fAbs > fAbs2) {
                        this.A = true;
                        c(true);
                        this.F = fC - this.H > 0.0f ? this.H + this.E : this.H - this.E;
                        this.G = fD;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
                if (this.A) {
                    zC = false | b(s.c(motionEvent, s.a(motionEvent, this.J)));
                }
                break;
            case 3:
                if (this.A) {
                    a(this.i, true, 0, false);
                    this.J = -1;
                    i();
                    zC = this.R.c() | this.Q.c();
                }
                break;
            case 5:
                int iB = s.b(motionEvent);
                this.F = s.c(motionEvent, iB);
                this.J = s.b(motionEvent, iB);
                break;
            case 6:
                a(motionEvent);
                this.F = s.c(motionEvent, s.a(motionEvent, this.J));
                break;
        }
        if (zC) {
            ad.b(this);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.w) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(x xVar) {
        if (this.h != null) {
            this.h.b(this.n);
            this.h.a((ViewGroup) this);
            for (int i = 0; i < this.e.size(); i++) {
                aw awVar = (aw) this.e.get(i);
                this.h.a((ViewGroup) this, awVar.b, awVar.a);
            }
            this.h.b((ViewGroup) this);
            this.e.clear();
            f();
            this.i = 0;
            scrollTo(0, 0);
        }
        x xVar2 = this.h;
        this.h = xVar;
        this.b = 0;
        if (this.h != null) {
            if (this.n == null) {
                this.n = new bb(this, null);
            }
            this.h.a((DataSetObserver) this.n);
            this.y = false;
            boolean z = this.S;
            this.S = true;
            this.b = this.h.a();
            if (this.j >= 0) {
                this.h.a(this.k, this.l);
                a(this.j, false, true);
                this.j = -1;
                this.k = null;
                this.l = null;
            } else if (z) {
                requestLayout();
            } else {
                b();
            }
        }
        if (this.aa == null || xVar2 == xVar) {
            return;
        }
        this.aa.a(xVar2, xVar);
    }

    void setChildrenDrawingOrderEnabledCompat(boolean z) {
        if (Build.VERSION.SDK_INT >= 7) {
            if (this.ac == null) {
                try {
                    this.ac = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
                } catch (NoSuchMethodException e) {
                    Log.e("ViewPager", "Can't find setChildrenDrawingOrderEnabled", e);
                }
            }
            try {
                this.ac.invoke(this, Boolean.valueOf(z));
            } catch (Exception e2) {
                Log.e("ViewPager", "Error changing children drawing order", e2);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.y = false;
        a(i, !this.S, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.z) {
            this.z = i;
            b();
        }
    }

    void setOnAdapterChangeListener(ay ayVar) {
        this.aa = ayVar;
    }

    public void setOnPageChangeListener(az azVar) {
        this.W = azVar;
    }

    public void setPageMargin(int i) {
        int i2 = this.o;
        this.o = i;
        int width = getWidth();
        a(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.p = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.p;
    }
}
