package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public class ParcelableEventList implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new b();
    final int a;
    final ParcelableEvent[] b;
    final DataHolder c;
    final boolean d;
    final ParcelableObjectChangedEvent[] e;

    ParcelableEventList(int i, ParcelableEvent[] parcelableEventArr, DataHolder dataHolder, boolean z, ParcelableObjectChangedEvent[] parcelableObjectChangedEventArr) {
        this.a = i;
        this.b = parcelableEventArr;
        this.c = dataHolder;
        this.d = z;
        this.e = parcelableObjectChangedEventArr;
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
