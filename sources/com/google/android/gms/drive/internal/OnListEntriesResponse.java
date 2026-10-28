package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public class OnListEntriesResponse implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new i();
    final int a;
    final DataHolder b;
    final boolean c;

    OnListEntriesResponse(int i, DataHolder dataHolder, boolean z) {
        this.a = i;
        this.b = dataHolder;
        this.c = z;
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
