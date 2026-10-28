package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class jr implements SafeParcelable {
    public static final ms CREATOR = new ms();
    static final long a = TimeUnit.HOURS.toMillis(1);
    final int b;
    private final jn c;
    private final long d;
    private final int e;

    public jr(int i, jn jnVar, long j, int i2) {
        this.b = i;
        this.c = jnVar;
        this.d = j;
        this.e = i2;
    }

    public jn a() {
        return this.c;
    }

    public long b() {
        return this.d;
    }

    public int c() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        ms msVar = CREATOR;
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jr)) {
            return false;
        }
        jr jrVar = (jr) obj;
        return ku.a(this.c, jrVar.c) && this.d == jrVar.d && this.e == jrVar.e;
    }

    public int hashCode() {
        return ku.a(this.c, Long.valueOf(this.d), Integer.valueOf(this.e));
    }

    public String toString() {
        return ku.a(this).a("filter", this.c).a("interval", Long.valueOf(this.d)).a("priority", Integer.valueOf(this.e)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ms msVar = CREATOR;
        ms.a(this, parcel, i);
    }
}
