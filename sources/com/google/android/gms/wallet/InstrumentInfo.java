package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class InstrumentInfo implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new h();
    private final int a;
    private String b;
    private String c;

    InstrumentInfo(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public int a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.a(this, parcel, i);
    }
}
