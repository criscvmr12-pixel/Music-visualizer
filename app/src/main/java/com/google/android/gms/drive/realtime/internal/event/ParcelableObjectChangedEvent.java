package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public class ParcelableObjectChangedEvent implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new c();
    final int a;
    final String b;
    final String c;
    final boolean d;
    final String e;
    final String f;
    final int g;
    final int h;

    ParcelableObjectChangedEvent(int i, String str, String str2, boolean z, String str3, String str4, int i2, int i3) {
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = str3;
        this.f = str4;
        this.a = i;
        this.g = i2;
        this.h = i3;
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
