package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.CameraPosition;

/* JADX INFO: loaded from: classes.dex */
public final class GoogleMapOptions implements SafeParcelable {
    public static final a CREATOR = new a();
    private final int a;
    private Boolean b;
    private Boolean c;
    private int d;
    private CameraPosition e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;
    private Boolean k;

    public GoogleMapOptions() {
        this.d = -1;
        this.a = 1;
    }

    GoogleMapOptions(int i, byte b, byte b2, int i2, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8) {
        this.d = -1;
        this.a = i;
        this.b = com.google.android.gms.maps.a.a.a(b);
        this.c = com.google.android.gms.maps.a.a.a(b2);
        this.d = i2;
        this.e = cameraPosition;
        this.f = com.google.android.gms.maps.a.a.a(b3);
        this.g = com.google.android.gms.maps.a.a.a(b4);
        this.h = com.google.android.gms.maps.a.a.a(b5);
        this.i = com.google.android.gms.maps.a.a.a(b6);
        this.j = com.google.android.gms.maps.a.a.a(b7);
        this.k = com.google.android.gms.maps.a.a.a(b8);
    }

    int a() {
        return this.a;
    }

    byte b() {
        return com.google.android.gms.maps.a.a.a(this.b);
    }

    byte c() {
        return com.google.android.gms.maps.a.a.a(this.c);
    }

    byte d() {
        return com.google.android.gms.maps.a.a.a(this.f);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    byte e() {
        return com.google.android.gms.maps.a.a.a(this.g);
    }

    byte f() {
        return com.google.android.gms.maps.a.a.a(this.h);
    }

    byte g() {
        return com.google.android.gms.maps.a.a.a(this.i);
    }

    byte h() {
        return com.google.android.gms.maps.a.a.a(this.j);
    }

    byte i() {
        return com.google.android.gms.maps.a.a.a(this.k);
    }

    public int j() {
        return this.d;
    }

    public CameraPosition k() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (com.google.android.gms.maps.a.b.a()) {
            c.a(this, parcel, i);
        } else {
            a.a(this, parcel, i);
        }
    }
}
