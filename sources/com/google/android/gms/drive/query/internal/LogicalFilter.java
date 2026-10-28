package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LogicalFilter implements SafeParcelable, com.google.android.gms.drive.query.a {
    public static final Parcelable.Creator CREATOR = new h();
    final Operator a;
    final List b;
    final int c;

    LogicalFilter(int i, Operator operator, List list) {
        this.c = i;
        this.a = operator;
        this.b = list;
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
