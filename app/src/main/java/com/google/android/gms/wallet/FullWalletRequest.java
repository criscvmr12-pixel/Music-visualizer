package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class FullWalletRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new g();
    String a;
    String b;
    Cart c;
    private final int d;

    FullWalletRequest() {
        this.d = 1;
    }

    FullWalletRequest(int i, String str, String str2, Cart cart) {
        this.d = i;
        this.a = str;
        this.b = str2;
        this.c = cart;
    }

    public int a() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        g.a(this, parcel, i);
    }
}
