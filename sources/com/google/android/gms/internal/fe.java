package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class fe implements Parcelable {

    @Deprecated
    public static final Parcelable.Creator CREATOR = new iw();
    private String a;
    private String b;
    private String c;

    @Deprecated
    public fe() {
    }

    @Deprecated
    fe(Parcel parcel) {
        a(parcel);
    }

    @Deprecated
    private void a(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
    }

    @Override // android.os.Parcelable
    @Deprecated
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    @Deprecated
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
