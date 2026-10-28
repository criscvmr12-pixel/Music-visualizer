package com.symbolic.pitchlab;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewParent;
import android.widget.Checkable;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import android.widget.ListView;

/* JADX INFO: loaded from: classes.dex */
public class UICheckableLinearLayout extends LinearLayout implements Checkable {
    private CheckedTextView a;
    private final Drawable b;
    private final Drawable c;
    private boolean d;

    public UICheckableLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = a(context, android.R.attr.listChoiceIndicatorMultiple);
        this.c = a(context, android.R.attr.listChoiceIndicatorSingle);
        this.d = false;
    }

    private Drawable a(Context context, int i) {
        Drawable drawable = null;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        if (typedArrayObtainStyledAttributes != null && typedArrayObtainStyledAttributes.length() > 0) {
            drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        }
        typedArrayObtainStyledAttributes.recycle();
        return drawable;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a != null) {
            ViewParent parent = getParent();
            if (parent instanceof ListView) {
                switch (((ListView) parent).getChoiceMode()) {
                    case 1:
                        this.a.setCheckMarkDrawable(this.c);
                        break;
                    case 2:
                        this.a.setCheckMarkDrawable(this.b);
                        break;
                    default:
                        this.a.setCheckMarkDrawable((Drawable) null);
                        break;
                }
            }
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.a = (CheckedTextView) findViewById(android.R.id.text1);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.d = z;
        if (this.a != null) {
            this.a.setChecked(this.d);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.d);
    }
}
