package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class aj implements SafeParcelable {
    public static final q CREATOR = new q();
    public final int a;
    public final long b;
    public final Bundle c;
    public final int d;
    public final List e;
    public final boolean f;
    public final int g;
    public final boolean h;
    public final String i;
    public final ax j;
    public final Location k;
    public final String l;
    public final Bundle m;

    public aj(int i, long j, Bundle bundle, int i2, List list, boolean z, int i3, boolean z2, String str, ax axVar, Location location, String str2, Bundle bundle2) {
        this.a = i;
        this.b = j;
        this.c = bundle;
        this.d = i2;
        this.e = list;
        this.f = z;
        this.g = i3;
        this.h = z2;
        this.i = str;
        this.j = axVar;
        this.k = location;
        this.l = str2;
        this.m = bundle2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        q.a(this, parcel, i);
    }
}
