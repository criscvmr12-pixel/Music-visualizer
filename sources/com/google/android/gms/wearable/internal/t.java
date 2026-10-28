package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class t implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new w();
    public final int a;
    public final int b;
    public final List c;

    t(int i, int i2, List list) {
        this.a = i;
        this.b = i2;
        this.c = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        w.a(this, parcel, i);
    }
}
