package android.support.v4.app;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.TabHost;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {
    private final ArrayList a;
    private Context b;
    private l c;
    private int d;
    private TabHost.OnTabChangeListener e;
    private u f;
    private boolean g;

    class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new t();
        String a;

        private SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readString();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a);
        }
    }

    private v a(String str, v vVar) {
        u uVar = null;
        int i = 0;
        while (i < this.a.size()) {
            u uVar2 = (u) this.a.get(i);
            if (!uVar2.a.equals(str)) {
                uVar2 = uVar;
            }
            i++;
            uVar = uVar2;
        }
        if (uVar == null) {
            throw new IllegalStateException("No tab known for tag " + str);
        }
        if (this.f != uVar) {
            if (vVar == null) {
                vVar = this.c.a();
            }
            if (this.f != null && this.f.d != null) {
                vVar.a(this.f.d);
            }
            if (uVar != null) {
                if (uVar.d == null) {
                    uVar.d = Fragment.a(this.b, uVar.b.getName(), uVar.c);
                    vVar.a(this.d, uVar.d, uVar.a);
                } else {
                    vVar.b(uVar.d);
                }
            }
            this.f = uVar;
        }
        return vVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        v vVarA = null;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.a.size()) {
                break;
            }
            u uVar = (u) this.a.get(i2);
            uVar.d = this.c.a(uVar.a);
            if (uVar.d != null && !uVar.d.d()) {
                if (uVar.a.equals(currentTabTag)) {
                    this.f = uVar;
                } else {
                    if (vVarA == null) {
                        vVarA = this.c.a();
                    }
                    vVarA.a(uVar.d);
                }
            }
            i = i2 + 1;
        }
        this.g = true;
        v vVarA2 = a(currentTabTag, vVarA);
        if (vVarA2 != null) {
            vVarA2.a();
            this.c.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.g = false;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.a);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = getCurrentTabTag();
        return savedState;
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    public void onTabChanged(String str) {
        v vVarA;
        if (this.g && (vVarA = a(str, null)) != null) {
            vVarA.a();
        }
        if (this.e != null) {
            this.e.onTabChanged(str);
        }
    }

    @Override // android.widget.TabHost
    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.e = onTabChangeListener;
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }
}
