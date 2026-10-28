package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class ax implements SafeParcelable {
    public static final ao CREATOR = new ao();
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final String j;
    public final int k;
    public final String l;
    public final int m;
    public final int n;
    public final String o;

    ax(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, String str, int i10, String str2, int i11, int i12, String str3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
        this.j = str;
        this.k = i10;
        this.l = str2;
        this.m = i11;
        this.n = i12;
        this.o = str3;
    }

    public ax(com.google.android.gms.ads.e.a aVar) {
        this.a = 1;
        this.b = aVar.a();
        this.c = aVar.b();
        this.d = aVar.c();
        this.e = aVar.d();
        this.f = aVar.e();
        this.g = aVar.f();
        this.h = aVar.g();
        this.i = aVar.h();
        this.j = aVar.i();
        this.k = aVar.j();
        this.l = aVar.k();
        this.m = aVar.l();
        this.n = aVar.m();
        this.o = aVar.n();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ao.a(this, parcel, i);
    }
}
