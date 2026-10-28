package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class jn implements SafeParcelable {
    public static final mq CREATOR = new mq();
    final int a;
    final List b;
    final List c;
    final List d;
    private final String e;
    private final boolean f;
    private final String g;
    private final Set h;
    private final Set i;
    private final Set j;

    jn(int i, List list, String str, boolean z, List list2, String str2, List list3) {
        this.a = i;
        this.b = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.e = str == null ? "" : str;
        this.f = z;
        this.c = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.g = str2 == null ? "" : str2;
        this.d = list3 == null ? Collections.emptyList() : Collections.unmodifiableList(list3);
        this.h = a(this.b);
        this.i = a(this.c);
        this.j = a(this.d);
    }

    private static Set a(List list) {
        return list.isEmpty() ? Collections.emptySet() : Collections.unmodifiableSet(new HashSet(list));
    }

    @Deprecated
    public String a() {
        return this.e;
    }

    public boolean b() {
        return this.f;
    }

    public String c() {
        return this.g;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        mq mqVar = CREATOR;
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jn)) {
            return false;
        }
        jn jnVar = (jn) obj;
        return this.h.equals(jnVar.h) && this.f == jnVar.f && this.g.equals(jnVar.g) && this.i.equals(jnVar.i) && this.j.equals(jnVar.j);
    }

    public int hashCode() {
        return ku.a(this.h, Boolean.valueOf(this.f), this.i, this.g, this.j);
    }

    public String toString() {
        return ku.a(this).a("types", this.h).a("placeIds", this.j).a("requireOpenNow", Boolean.valueOf(this.f)).a("userAccountName", this.g).a("requestedUserDataTypes", this.i).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        mq mqVar = CREATOR;
        mq.a(this, parcel, i);
    }
}
