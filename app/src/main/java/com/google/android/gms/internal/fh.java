package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public class fh implements SafeParcelable {
    public static final ix CREATOR = new ix();
    final int a;
    final fl[] b;
    public final String c;
    public final boolean d;

    fh(int i, fl[] flVarArr, String str, boolean z) {
        this.a = i;
        this.b = flVarArr;
        this.c = str;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        ix ixVar = CREATOR;
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ix ixVar = CREATOR;
        ix.a(this, parcel, i);
    }
}
