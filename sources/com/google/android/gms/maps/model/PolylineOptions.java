package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PolylineOptions implements SafeParcelable {
    public static final i CREATOR = new i();
    private final int a;
    private final List b;
    private float c;
    private int d;
    private float e;
    private boolean f;
    private boolean g;

    public PolylineOptions() {
        this.c = 10.0f;
        this.d = -16777216;
        this.e = 0.0f;
        this.f = true;
        this.g = false;
        this.a = 1;
        this.b = new ArrayList();
    }

    PolylineOptions(int i, List list, float f, int i2, float f2, boolean z, boolean z2) {
        this.c = 10.0f;
        this.d = -16777216;
        this.e = 0.0f;
        this.f = true;
        this.g = false;
        this.a = i;
        this.b = list;
        this.c = f;
        this.d = i2;
        this.e = f2;
        this.f = z;
        this.g = z2;
    }

    int a() {
        return this.a;
    }

    public List b() {
        return this.b;
    }

    public float c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float e() {
        return this.e;
    }

    public boolean f() {
        return this.f;
    }

    public boolean g() {
        return this.g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (com.google.android.gms.maps.a.b.a()) {
            aa.a(this, parcel, i);
        } else {
            i.a(this, parcel, i);
        }
    }
}
