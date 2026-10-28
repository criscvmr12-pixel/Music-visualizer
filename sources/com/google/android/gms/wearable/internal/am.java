package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public class am implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new i();
    public final int a;
    public final int b;
    public final m c;

    am(int i, int i2, m mVar) {
        this.a = i;
        this.b = i2;
        this.c = mVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        i.a(this, parcel, i);
    }
}
