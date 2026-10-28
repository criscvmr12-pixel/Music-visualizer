package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.internal.LogicalFilter;

/* JADX INFO: loaded from: classes.dex */
public class Query implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new b();
    final LogicalFilter a;
    final String b;
    final SortOrder c;
    final int d;

    Query(int i, LogicalFilter logicalFilter, String str, SortOrder sortOrder) {
        this.d = i;
        this.a = logicalFilter;
        this.b = str;
        this.c = sortOrder;
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
