package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public class z implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new a();
    public final int a;
    public final int b;
    public final ai c;

    z(int i, int i2, ai aiVar) {
        this.a = i;
        this.b = i2;
        this.c = aiVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel, i);
    }
}
