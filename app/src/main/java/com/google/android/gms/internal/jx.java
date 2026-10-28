package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class jx implements SafeParcelable {
    final int d;
    final String e;
    final int f;
    public static final jx a = a("test_type", 1);
    public static final jx b = a("saved_offers", 4);
    public static final Set c = Collections.unmodifiableSet(new HashSet(Arrays.asList(a, b)));
    public static final mv CREATOR = new mv();

    jx(int i, String str, int i2) {
        ky.a(str);
        this.d = i;
        this.e = str;
        this.f = i2;
    }

    private static jx a(String str, int i) {
        return new jx(0, str, i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        mv mvVar = CREATOR;
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jx)) {
            return false;
        }
        jx jxVar = (jx) obj;
        return this.e.equals(jxVar.e) && this.f == jxVar.f;
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public String toString() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        mv mvVar = CREATOR;
        mv.a(this, parcel, i);
    }
}
