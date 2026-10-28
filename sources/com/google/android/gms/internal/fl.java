package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public class fl implements SafeParcelable {
    final int b;
    public final String c;
    final fq d;
    public final int e;
    public final byte[] f;
    public static final int a = Integer.parseInt("-1");
    public static final iz CREATOR = new iz();

    fl(int i, String str, fq fqVar, int i2, byte[] bArr) {
        ky.b(i2 == a || jb.a(i2) != null, "Invalid section type " + i2);
        this.b = i;
        this.c = str;
        this.d = fqVar;
        this.e = i2;
        this.f = bArr;
        String strA = a();
        if (strA != null) {
            throw new IllegalArgumentException(strA);
        }
    }

    public String a() {
        if (this.e != a && jb.a(this.e) == null) {
            return "Invalid section type " + this.e;
        }
        if (this.c == null || this.f == null) {
            return null;
        }
        return "Both content and blobContent set";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        iz izVar = CREATOR;
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        iz izVar = CREATOR;
        iz.a(this, parcel, i);
    }
}
