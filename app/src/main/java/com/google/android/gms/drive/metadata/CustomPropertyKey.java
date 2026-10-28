package com.google.android.gms.drive.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ky;

/* JADX INFO: loaded from: classes.dex */
public class CustomPropertyKey implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new h();
    final int a;
    final String b;
    final int c;

    CustomPropertyKey(int i, String str, int i2) {
        boolean z = true;
        this.a = i;
        ky.a(str, "key");
        if (i2 != 0 && i2 != 1) {
            z = false;
        }
        ky.a(z, "visibility must be either PUBLIC or PRIVATE");
        this.b = str;
        this.c = i2;
    }

    public String a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CustomPropertyKey)) {
            return false;
        }
        CustomPropertyKey customPropertyKey = (CustomPropertyKey) obj;
        return customPropertyKey.a().equals(this.b) && customPropertyKey.b() == this.c;
    }

    public int hashCode() {
        return (this.b + this.c).hashCode();
    }

    public String toString() {
        return "CustomPropertyKey(" + this.b + "," + this.c + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.a(this, parcel, i);
    }
}
