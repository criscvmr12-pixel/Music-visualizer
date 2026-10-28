package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* JADX INFO: loaded from: classes.dex */
public class ComparisonFilter implements SafeParcelable, com.google.android.gms.drive.query.a {
    public static final a CREATOR = new a();
    final Operator a;
    final MetadataBundle b;
    final int c;
    final com.google.android.gms.drive.metadata.a d;

    ComparisonFilter(int i, Operator operator, MetadataBundle metadataBundle) {
        this.c = i;
        this.a = operator;
        this.b = metadataBundle;
        this.d = e.a(metadataBundle);
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
