package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public class fn implements SafeParcelable {
    public static final ja CREATOR = new ja();
    final int a;
    public final int b;
    final Bundle c;

    fn(int i, int i2, Bundle bundle) {
        this.a = i;
        this.b = i2;
        this.c = bundle;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        ja jaVar = CREATOR;
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ja jaVar = CREATOR;
        ja.a(this, parcel, i);
    }
}
