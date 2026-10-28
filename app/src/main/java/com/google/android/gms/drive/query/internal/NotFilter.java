package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public class NotFilter implements SafeParcelable, com.google.android.gms.drive.query.a {
    public static final Parcelable.Creator CREATOR = new j();
    final FilterHolder a;
    final int b;

    NotFilter(int i, FilterHolder filterHolder) {
        this.b = i;
        this.a = filterHolder;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        j.a(this, parcel, i);
    }
}
