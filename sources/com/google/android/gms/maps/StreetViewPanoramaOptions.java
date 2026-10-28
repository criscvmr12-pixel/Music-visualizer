package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

/* JADX INFO: loaded from: classes.dex */
public final class StreetViewPanoramaOptions implements SafeParcelable {
    public static final b CREATOR = new b();
    private final int a;
    private StreetViewPanoramaCamera b;
    private String c;
    private LatLng d;
    private Integer e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;

    public StreetViewPanoramaOptions() {
        this.f = true;
        this.g = true;
        this.h = true;
        this.i = true;
        this.a = 1;
    }

    StreetViewPanoramaOptions(int i, StreetViewPanoramaCamera streetViewPanoramaCamera, String str, LatLng latLng, Integer num, byte b, byte b2, byte b3, byte b4, byte b5) {
        this.f = true;
        this.g = true;
        this.h = true;
        this.i = true;
        this.a = i;
        this.b = streetViewPanoramaCamera;
        this.d = latLng;
        this.e = num;
        this.c = str;
        this.f = com.google.android.gms.maps.a.a.a(b);
        this.g = com.google.android.gms.maps.a.a.a(b2);
        this.h = com.google.android.gms.maps.a.a.a(b3);
        this.i = com.google.android.gms.maps.a.a.a(b4);
        this.j = com.google.android.gms.maps.a.a.a(b5);
    }

    int a() {
        return this.a;
    }

    byte b() {
        return com.google.android.gms.maps.a.a.a(this.f);
    }

    byte c() {
        return com.google.android.gms.maps.a.a.a(this.g);
    }

    byte d() {
        return com.google.android.gms.maps.a.a.a(this.h);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    byte e() {
        return com.google.android.gms.maps.a.a.a(this.i);
    }

    byte f() {
        return com.google.android.gms.maps.a.a.a(this.j);
    }

    public StreetViewPanoramaCamera g() {
        return this.b;
    }

    public LatLng h() {
        return this.d;
    }

    public Integer i() {
        return this.e;
    }

    public String j() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        b.a(this, parcel, i);
    }
}
