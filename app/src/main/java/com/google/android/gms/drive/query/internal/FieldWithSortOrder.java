package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public class FieldWithSortOrder implements SafeParcelable {
    public static final c CREATOR = new c();
    final String a;
    final boolean b;
    final int c;

    FieldWithSortOrder(int i, String str, boolean z) {
        this.c = i;
        this.a = str;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        c.a(this, parcel, i);
    }
}
