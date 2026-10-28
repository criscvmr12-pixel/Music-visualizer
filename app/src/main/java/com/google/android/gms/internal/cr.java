package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class cr implements SafeParcelable {
    public static final dk CREATOR = new dk();
    public final int a;
    public final ek b;
    public final dx c;
    public final dz d;
    public final Context e;

    cr(int i, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4) {
        this.a = i;
        this.b = (ek) com.google.android.gms.a.d.a(com.google.android.gms.a.b.a(iBinder));
        this.c = (dx) com.google.android.gms.a.d.a(com.google.android.gms.a.b.a(iBinder2));
        this.d = (dz) com.google.android.gms.a.d.a(com.google.android.gms.a.b.a(iBinder3));
        this.e = (Context) com.google.android.gms.a.d.a(com.google.android.gms.a.b.a(iBinder4));
    }

    public cr(dz dzVar, ek ekVar, dx dxVar, Context context) {
        this.a = 1;
        this.d = dzVar;
        this.b = ekVar;
        this.c = dxVar;
        this.e = context;
    }

    public static cr a(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
            bundleExtra.setClassLoader(cr.class.getClassLoader());
            return (cr) bundleExtra.getParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
        } catch (Exception e) {
            return null;
        }
    }

    public static void a(Intent intent, cr crVar) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", crVar);
        intent.putExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", bundle);
    }

    IBinder a() {
        return com.google.android.gms.a.d.a(this.b).asBinder();
    }

    IBinder b() {
        return com.google.android.gms.a.d.a(this.c).asBinder();
    }

    IBinder c() {
        return com.google.android.gms.a.d.a(this.d).asBinder();
    }

    IBinder d() {
        return com.google.android.gms.a.d.a(this.e).asBinder();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        dk.a(this, parcel, i);
    }
}
