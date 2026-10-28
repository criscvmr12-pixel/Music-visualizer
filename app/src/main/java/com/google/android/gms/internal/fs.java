package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public class fs implements SafeParcelable {
    public static final jd CREATOR = new jd();
    final int a;
    final fj b;
    final long c;
    final int d;
    public final String e;
    final fh f;

    fs(int i, fj fjVar, long j, int i2, String str, fh fhVar) {
        this.a = i;
        this.b = fjVar;
        this.c = j;
        this.d = i2;
        this.e = str;
        this.f = fhVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        jd jdVar = CREATOR;
        return 0;
    }

    public String toString() {
        return String.format("UsageInfo[documentId=%s, timestamp=%d, usageType=%d]", this.b, Long.valueOf(this.c), Integer.valueOf(this.d));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        jd jdVar = CREATOR;
        jd.a(this, parcel, i);
    }
}
