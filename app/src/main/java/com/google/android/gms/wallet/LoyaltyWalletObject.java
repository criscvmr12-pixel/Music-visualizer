package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ln;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class LoyaltyWalletObject implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new j();
    String a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;
    String h;
    String i;
    String j;
    int k;
    ArrayList l;
    com.google.android.gms.wallet.wobs.l m;
    ArrayList n;
    String o;
    String p;
    ArrayList q;
    boolean r;
    ArrayList s;
    ArrayList t;
    ArrayList u;
    com.google.android.gms.wallet.wobs.f v;
    private final int w;

    LoyaltyWalletObject() {
        this.w = 4;
        this.l = ln.a();
        this.n = ln.a();
        this.q = ln.a();
        this.s = ln.a();
        this.t = ln.a();
        this.u = ln.a();
    }

    LoyaltyWalletObject(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i2, ArrayList arrayList, com.google.android.gms.wallet.wobs.l lVar, ArrayList arrayList2, String str11, String str12, ArrayList arrayList3, boolean z, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, com.google.android.gms.wallet.wobs.f fVar) {
        this.w = i;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = i2;
        this.l = arrayList;
        this.m = lVar;
        this.n = arrayList2;
        this.o = str11;
        this.p = str12;
        this.q = arrayList3;
        this.r = z;
        this.s = arrayList4;
        this.t = arrayList5;
        this.u = arrayList6;
        this.v = fVar;
    }

    public int a() {
        return this.w;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        j.a(this, parcel, i);
    }
}
