package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public class kb implements SafeParcelable {
    public static final my CREATOR = new my();
    public final int a;
    public final String b;
    public final String c;

    public kb(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        my myVar = CREATOR;
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof kb)) {
            return false;
        }
        kb kbVar = (kb) obj;
        return this.c.equals(kbVar.c) && this.b.equals(kbVar.b);
    }

    public int hashCode() {
        return ku.a(this.b, this.c);
    }

    public String toString() {
        return ku.a(this).a("clientPackageName", this.b).a("locale", this.c).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        my myVar = CREATOR;
        my.a(this, parcel, i);
    }
}
