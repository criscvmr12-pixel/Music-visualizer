package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ku;
import com.google.android.gms.internal.ky;

/* JADX INFO: loaded from: classes.dex */
public final class LatLngBounds implements SafeParcelable {
    public static final e CREATOR = new e();
    public final LatLng a;
    public final LatLng b;
    private final int c;

    LatLngBounds(int i, LatLng latLng, LatLng latLng2) {
        ky.a(latLng, "null southwest");
        ky.a(latLng2, "null northeast");
        ky.b(latLng2.a >= latLng.a, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(latLng.a), Double.valueOf(latLng2.a));
        this.c = i;
        this.a = latLng;
        this.b = latLng2;
    }

    int a() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.a.equals(latLngBounds.a) && this.b.equals(latLngBounds.b);
    }

    public int hashCode() {
        return ku.a(this.a, this.b);
    }

    public String toString() {
        return ku.a(this).a("southwest", this.a).a("northeast", this.b).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (com.google.android.gms.maps.a.b.a()) {
            w.a(this, parcel, i);
        } else {
            e.a(this, parcel, i);
        }
    }
}
