package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.Query;

/* JADX INFO: loaded from: classes.dex */
public class QueryRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new r();
    final int a;
    final Query b;

    QueryRequest(int i, Query query) {
        this.a = i;
        this.b = query;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        r.a(this, parcel, i);
    }
}
