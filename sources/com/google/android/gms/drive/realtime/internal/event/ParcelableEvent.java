package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public class ParcelableEvent implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new a();
    final int a;
    final String b;
    final String c;
    final boolean d;
    final String e;
    final String f;
    final TextInsertedDetails g;
    final TextDeletedDetails h;
    final ValuesAddedDetails i;
    final ValuesRemovedDetails j;
    final ValuesSetDetails k;
    final ValueChangedDetails l;
    final ReferenceShiftedDetails m;

    ParcelableEvent(int i, String str, String str2, boolean z, String str3, String str4, TextInsertedDetails textInsertedDetails, TextDeletedDetails textDeletedDetails, ValuesAddedDetails valuesAddedDetails, ValuesRemovedDetails valuesRemovedDetails, ValuesSetDetails valuesSetDetails, ValueChangedDetails valueChangedDetails, ReferenceShiftedDetails referenceShiftedDetails) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = str3;
        this.f = str4;
        this.g = textInsertedDetails;
        this.h = textDeletedDetails;
        this.i = valuesAddedDetails;
        this.j = valuesRemovedDetails;
        this.k = valuesSetDetails;
        this.l = valueChangedDetails;
        this.m = referenceShiftedDetails;
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
