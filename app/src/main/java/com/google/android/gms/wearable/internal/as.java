package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class as implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new l();
    public final int a;
    public final int b;
    public final long c;
    public final List d;

    as(int i, int i2, long j, List list) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        l.a(this, parcel, i);
    }
}
