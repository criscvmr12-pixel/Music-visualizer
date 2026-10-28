package com.google.android.gms.common.images;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.jj;
import com.google.android.gms.internal.jk;
import com.google.android.gms.internal.jm;
import com.google.android.gms.internal.jo;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    final f a;
    protected int b;
    protected int c;

    private Drawable a(Context context, jk jkVar, int i) {
        Resources resources = context.getResources();
        if (this.c <= 0) {
            return resources.getDrawable(i);
        }
        jm jmVar = new jm(i, this.c);
        Drawable drawable = (Drawable) jkVar.a(jmVar);
        if (drawable != null) {
            return drawable;
        }
        Drawable drawable2 = resources.getDrawable(i);
        if ((this.c & 1) != 0) {
            drawable2 = a(resources, drawable2);
        }
        jkVar.b(jmVar, drawable2);
        return drawable2;
    }

    protected Drawable a(Resources resources, Drawable drawable) {
        return jj.a(resources, drawable);
    }

    void a(Context context, Bitmap bitmap, boolean z) {
        jo.a(bitmap);
        if ((this.c & 1) != 0) {
            bitmap = jj.a(bitmap);
        }
        a(new BitmapDrawable(context.getResources(), bitmap), z, false, true);
    }

    void a(Context context, jk jkVar, boolean z) {
        a(this.b != 0 ? a(context, jkVar, this.b) : null, z, false, false);
    }

    protected abstract void a(Drawable drawable, boolean z, boolean z2, boolean z3);
}
