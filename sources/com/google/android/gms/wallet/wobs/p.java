package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class p implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new s();
    String a;
    String b;
    l c;
    n d;
    n e;
    private final int f;

    p() {
        this.f = 1;
    }

    p(int i, String str, String str2, l lVar, n nVar, n nVar2) {
        this.f = i;
        this.a = str;
        this.b = str2;
        this.c = lVar;
        this.d = nVar;
        this.e = nVar2;
    }

    public int a() {
        return this.f;
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
