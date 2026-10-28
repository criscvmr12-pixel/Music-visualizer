package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public class jp implements SafeParcelable {
    public static final mr CREATOR = new mr();
    final int a;
    private final String b;
    private final String c;

    jp(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        mr mrVar = CREATOR;
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof jp)) {
            return false;
        }
        jp jpVar = (jp) obj;
        return ku.a(this.b, jpVar.b) && ku.a(this.c, jpVar.c);
    }

    public int hashCode() {
        return ku.a(this.b, this.c);
    }

    public String toString() {
        return ku.a(this).a("mPlaceId", this.b).a("mTag", this.c).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        mr mrVar = CREATOR;
        mr.a(this, parcel, i);
    }
}
