package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class dt implements SafeParcelable {
    public static final fo CREATOR = new fo();
    public final int a;
    public final Bundle b;
    public final aj c;
    public final am d;
    public final String e;
    public final ApplicationInfo f;
    public final PackageInfo g;
    public final String h;
    public final String i;
    public final String j;
    public final ew k;
    public final Bundle l;

    dt(int i, Bundle bundle, aj ajVar, am amVar, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, ew ewVar, Bundle bundle2) {
        this.a = i;
        this.b = bundle;
        this.c = ajVar;
        this.d = amVar;
        this.e = str;
        this.f = applicationInfo;
        this.g = packageInfo;
        this.h = str2;
        this.i = str3;
        this.j = str4;
        this.k = ewVar;
        this.l = bundle2;
    }

    public dt(Bundle bundle, aj ajVar, am amVar, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, ew ewVar, Bundle bundle2) {
        this(2, bundle, ajVar, amVar, str, applicationInfo, packageInfo, str2, str3, str4, ewVar, bundle2);
    }

    public dt(fm fmVar, String str) {
        this(fmVar.a, fmVar.b, fmVar.c, fmVar.d, fmVar.e, fmVar.f, str, fmVar.g, fmVar.h, fmVar.j, fmVar.i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        fo.a(this, parcel, i);
    }
}
