package android.support.v13.app;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
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
    private FragmentManager c;
    private int d;
    private TabHost.OnTabChangeListener e;
    private c f;
    private boolean g;

    class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new b();
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

    private FragmentTransaction a(String str, FragmentTransaction fragmentTransaction) {
        c cVar = null;
        int i = 0;
        while (i < this.a.size()) {
            c cVar2 = (c) this.a.get(i);
            if (!cVar2.a.equals(str)) {
                cVar2 = cVar;
            }
            i++;
            cVar = cVar2;
        }
        if (cVar == null) {
            throw new IllegalStateException("No tab known for tag " + str);
        }
        if (this.f != cVar) {
            if (fragmentTransaction == null) {
                fragmentTransaction = this.c.beginTransaction();
            }
            if (this.f != null && this.f.d != null) {
                fragmentTransaction.detach(this.f.d);
            }
            if (cVar != null) {
                if (cVar.d == null) {
                    cVar.d = Fragment.instantiate(this.b, cVar.b.getName(), cVar.c);
                    fragmentTransaction.add(this.d, cVar.d, cVar.a);
                } else {
                    fragmentTransaction.attach(cVar.d);
                }
            }
            this.f = cVar;
        }
        return fragmentTransaction;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        FragmentTransaction fragmentTransactionBeginTransaction = null;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.a.size()) {
                break;
            }
            c cVar = (c) this.a.get(i2);
            cVar.d = this.c.findFragmentByTag(cVar.a);
            if (cVar.d != null && !cVar.d.isDetached()) {
                if (cVar.a.equals(currentTabTag)) {
                    this.f = cVar;
                } else {
                    if (fragmentTransactionBeginTransaction == null) {
                        fragmentTransactionBeginTransaction = this.c.beginTransaction();
                    }
                    fragmentTransactionBeginTransaction.detach(cVar.d);
                }
            }
            i = i2 + 1;
        }
        this.g = true;
        FragmentTransaction fragmentTransactionA = a(currentTabTag, fragmentTransactionBeginTransaction);
        if (fragmentTransactionA != null) {
            fragmentTransactionA.commit();
            this.c.executePendingTransactions();
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
        FragmentTransaction fragmentTransactionA;
        if (this.g && (fragmentTransactionA = a(str, null)) != null) {
            fragmentTransactionA.commit();
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
