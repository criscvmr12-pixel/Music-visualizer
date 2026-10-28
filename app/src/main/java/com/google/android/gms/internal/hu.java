package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public class hu implements SafeParcelable {
    public static final lb CREATOR = new lb();
    private final int a;
    private final hw b;

    hu(int i, hw hwVar) {
        this.a = i;
        this.b = hwVar;
    }

    private hu(hw hwVar) {
        this.a = 1;
        this.b = hwVar;
    }

    public static hu a(le leVar) {
        if (leVar instanceof hw) {
            return new hu((hw) leVar);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    int a() {
        return this.a;
    }

    hw b() {
        return this.b;
    }

    public le c() {
        if (this.b != null) {
            return this.b;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        lb lbVar = CREATOR;
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        lb lbVar = CREATOR;
        lb.a(this, parcel, i);
    }
}
