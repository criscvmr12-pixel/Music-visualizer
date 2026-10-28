package com.symbolic.pitchlab;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.RadioButton;

/* JADX INFO: loaded from: classes.dex */
public class UIRadioButton extends RadioButton {
    public UIRadioButton(Context context) {
        super(context);
    }

    public UIRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public UIRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        String string = getText().toString();
        paint.setAntiAlias(true);
        float fMeasureText = paint.measureText("x");
        paint.setTextSize(getTextSize());
        paint.setTextAlign(Paint.Align.CENTER);
        int i = -1;
        if (!isEnabled()) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-12566464, -12566464});
            gradientDrawable.setBounds(0, 0, getWidth(), getHeight());
            gradientDrawable.draw(canvas);
            i = -8355712;
        } else if (isChecked()) {
            GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-2302756, -15658735});
            gradientDrawable2.setBounds(0, 0, getWidth(), getHeight());
            gradientDrawable2.draw(canvas);
        } else {
            GradientDrawable gradientDrawable3 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-7303024, -16777216});
            gradientDrawable3.setBounds(0, 0, getWidth(), getHeight());
            gradientDrawable3.draw(canvas);
            i = -5592406;
        }
        float width = getWidth() / 2;
        float height = fMeasureText + (getHeight() / 2);
        paint.setColor(i);
        canvas.drawText(string, width + 0.0f, height + 0.0f, paint);
        Paint paint2 = new Paint();
        paint2.setColor(-16777216);
        paint2.setStyle(Paint.Style.STROKE);
        canvas.drawRect(new Rect(0, 0, getWidth(), getHeight()), paint2);
    }
}
