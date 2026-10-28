package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public class OnListParentsResponse implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new j();
    final int a;
    final DataHolder b;

    OnListParentsResponse(int i, DataHolder dataHolder) {
        this.a = i;
        this.b = dataHolder;
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
