package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class ci implements SafeParcelable {
    public static final cv CREATOR = new cv();
    public final int a;
    public final cf b;
    public final og c;
    public final cw d;
    public final hl e;
    public final ar f;
    public final String g;
    public final boolean h;
    public final String i;
    public final db j;
    public final int k;
    public final int l;
    public final String m;
    public final ew n;
    public final bd o;
    public final String p;
    public final w q;

    ci(int i, cf cfVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i2, int i3, String str3, ew ewVar, IBinder iBinder6, String str4, w wVar) {
        this.a = i;
        this.b = cfVar;
        this.c = (og) com.google.android.gms.a.d.a(com.google.android.gms.a.b.a(iBinder));
        this.d = (cw) com.google.android.gms.a.d.a(com.google.android.gms.a.b.a(iBinder2));
        this.e = (hl) com.google.android.gms.a.d.a(com.google.android.gms.a.b.a(iBinder3));
        this.f = (ar) com.google.android.gms.a.d.a(com.google.android.gms.a.b.a(iBinder4));
        this.g = str;
        this.h = z;
        this.i = str2;
        this.j = (db) com.google.android.gms.a.d.a(com.google.android.gms.a.b.a(iBinder5));
        this.k = i2;
        this.l = i3;
        this.m = str3;
        this.n = ewVar;
        this.o = (bd) com.google.android.gms.a.d.a(com.google.android.gms.a.b.a(iBinder6));
        this.p = str4;
        this.q = wVar;
    }

    public ci(cf cfVar, og ogVar, cw cwVar, db dbVar, ew ewVar) {
        this.a = 4;
        this.b = cfVar;
        this.c = ogVar;
        this.d = cwVar;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = null;
        this.j = dbVar;
        this.k = -1;
        this.l = 4;
        this.m = null;
        this.n = ewVar;
        this.o = null;
        this.p = null;
        this.q = null;
    }

    public ci(og ogVar, cw cwVar, ar arVar, db dbVar, hl hlVar, boolean z, int i, String str, ew ewVar, bd bdVar) {
        this.a = 4;
        this.b = null;
        this.c = ogVar;
        this.d = cwVar;
        this.e = hlVar;
        this.f = arVar;
        this.g = null;
        this.h = z;
        this.i = null;
        this.j = dbVar;
        this.k = i;
        this.l = 3;
        this.m = str;
        this.n = ewVar;
        this.o = bdVar;
        this.p = null;
        this.q = null;
    }

    public ci(og ogVar, cw cwVar, ar arVar, db dbVar, hl hlVar, boolean z, int i, String str, String str2, ew ewVar, bd bdVar) {
        this.a = 4;
        this.b = null;
        this.c = ogVar;
        this.d = cwVar;
        this.e = hlVar;
        this.f = arVar;
        this.g = str2;
        this.h = z;
        this.i = str;
        this.j = dbVar;
        this.k = i;
        this.l = 3;
        this.m = null;
        this.n = ewVar;
        this.o = bdVar;
        this.p = null;
        this.q = null;
    }

    public ci(og ogVar, cw cwVar, db dbVar, hl hlVar, int i, ew ewVar, String str, w wVar) {
        this.a = 4;
        this.b = null;
        this.c = ogVar;
        this.d = cwVar;
        this.e = hlVar;
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = null;
        this.j = dbVar;
        this.k = i;
        this.l = 1;
        this.m = null;
        this.n = ewVar;
        this.o = null;
        this.p = str;
        this.q = wVar;
    }

    public ci(og ogVar, cw cwVar, db dbVar, hl hlVar, boolean z, int i, ew ewVar) {
        this.a = 4;
        this.b = null;
        this.c = ogVar;
        this.d = cwVar;
        this.e = hlVar;
        this.f = null;
        this.g = null;
        this.h = z;
        this.i = null;
        this.j = dbVar;
        this.k = i;
        this.l = 2;
        this.m = null;
        this.n = ewVar;
        this.o = null;
        this.p = null;
        this.q = null;
    }

    public static ci a(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(ci.class.getClassLoader());
            return (ci) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e) {
            return null;
        }
    }

    public static void a(Intent intent, ci ciVar) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", ciVar);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    IBinder a() {
        return com.google.android.gms.a.d.a(this.c).asBinder();
    }

    IBinder b() {
        return com.google.android.gms.a.d.a(this.d).asBinder();
    }

    IBinder c() {
        return com.google.android.gms.a.d.a(this.e).asBinder();
    }

    IBinder d() {
        return com.google.android.gms.a.d.a(this.f).asBinder();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    IBinder e() {
        return com.google.android.gms.a.d.a(this.o).asBinder();
    }

    IBinder f() {
        return com.google.android.gms.a.d.a(this.j).asBinder();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        cv.a(this, parcel, i);
    }
}
