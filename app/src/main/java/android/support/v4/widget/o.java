package android.support.v4.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class o extends ViewGroup.MarginLayoutParams {
    private static final int[] e = {R.attr.layout_weight};
    public float a;
    boolean b;
    boolean c;
    Paint d;

    public o() {
        super(-1, -1);
        this.a = 0.0f;
    }

    public o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e);
        this.a = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public o(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0.0f;
    }

    public o(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.a = 0.0f;
    }
}
