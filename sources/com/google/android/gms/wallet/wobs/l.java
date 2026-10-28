package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class l implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new q();
    long a;
    long b;
    private final int c;

    l() {
        this.c = 1;
    }

    l(int i, long j, long j2) {
        this.c = i;
        this.a = j;
        this.b = j2;
    }

    public int a() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        q.a(this, parcel, i);
    }
}
