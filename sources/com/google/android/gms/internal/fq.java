package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public class fq implements SafeParcelable {
    public static final jc CREATOR = new jc();
    final int a;
    public final String b;
    public final String c;
    public final boolean d;
    public final int e;
    public final boolean f;
    public final String g;
    public final fn[] h;
    final int[] i;
    public final String j;

    fq(int i, String str, String str2, boolean z, int i2, boolean z2, String str3, fn[] fnVarArr, int[] iArr, String str4) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = i2;
        this.f = z2;
        this.g = str3;
        this.h = fnVarArr;
        this.i = iArr;
        this.j = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        jc jcVar = CREATOR;
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof fq)) {
            return false;
        }
        fq fqVar = (fq) obj;
        return this.b.equals(fqVar.b) && this.c.equals(fqVar.c) && this.d == fqVar.d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        jc jcVar = CREATOR;
        jc.a(this, parcel, i);
    }
}
