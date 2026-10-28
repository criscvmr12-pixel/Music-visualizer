package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ln;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new i();
    String a;
    String b;
    ArrayList c;
    private final int d;

    d() {
        this.d = 1;
        this.c = ln.a();
    }

    d(int i, String str, String str2, ArrayList arrayList) {
        this.d = i;
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public int a() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        i.a(this, parcel, i);
    }
}
