package com.google.android.gms.internal;

import android.content.Context;
import android.os.Parcel;
import android.util.DisplayMetrics;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class am implements SafeParcelable {
    public static final s CREATOR = new s();
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;
    public final int g;
    public final am[] h;

    public am() {
        this(2, "interstitial_mb", 0, 0, true, 0, 0, null);
    }

    am(int i, String str, int i2, int i3, boolean z, int i4, int i5, am[] amVarArr) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = i4;
        this.g = i5;
        this.h = amVarArr;
    }

    public am(Context context, com.google.android.gms.ads.e eVar) {
        this(context, new com.google.android.gms.ads.e[]{eVar});
    }

    public am(Context context, com.google.android.gms.ads.e[] eVarArr) {
        int i;
        com.google.android.gms.ads.e eVar = eVarArr[0];
        this.a = 2;
        this.e = false;
        this.f = eVar.b();
        this.c = eVar.a();
        boolean z = this.f == -1;
        boolean z2 = this.c == -2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z) {
            this.g = a(displayMetrics);
            i = (int) (this.g / displayMetrics.density);
        } else {
            int i2 = this.f;
            this.g = hi.a(displayMetrics, this.f);
            i = i2;
        }
        int iC = z2 ? c(displayMetrics) : this.c;
        this.d = hi.a(displayMetrics, iC);
        if (z || z2) {
            this.b = i + "x" + iC + "_as";
        } else {
            this.b = eVar.toString();
        }
        if (eVarArr.length <= 1) {
            this.h = null;
            return;
        }
        this.h = new am[eVarArr.length];
        for (int i3 = 0; i3 < eVarArr.length; i3++) {
            this.h[i3] = new am(context, eVarArr[i3]);
        }
    }

    public am(am amVar, am[] amVarArr) {
        this(2, amVar.b, amVar.c, amVar.d, amVar.e, amVar.f, amVar.g, amVarArr);
    }

    public static int a(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    public static int b(DisplayMetrics displayMetrics) {
        return (int) (c(displayMetrics) * displayMetrics.density);
    }

    private static int c(DisplayMetrics displayMetrics) {
        int i = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        return i <= 720 ? 50 : 90;
    }

    public com.google.android.gms.ads.e a() {
        return com.google.android.gms.ads.h.a(this.f, this.c, this.b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        s.a(this, parcel, i);
    }
}
