package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class WalletFragmentOptions implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new b();
    final int a;
    private int b;
    private int c;
    private WalletFragmentStyle d;
    private int e;

    private WalletFragmentOptions() {
        this.a = 1;
    }

    WalletFragmentOptions(int i, int i2, int i3, WalletFragmentStyle walletFragmentStyle, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = walletFragmentStyle;
        this.e = i4;
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public WalletFragmentStyle c() {
        return this.d;
    }

    public int d() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        b.a(this, parcel, i);
    }
}
