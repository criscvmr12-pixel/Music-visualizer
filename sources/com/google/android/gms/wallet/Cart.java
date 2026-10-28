package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class Cart implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new b();
    String a;
    String b;
    ArrayList c;
    private final int d;

    Cart() {
        this.d = 1;
        this.c = new ArrayList();
    }

    Cart(int i, String str, String str2, ArrayList arrayList) {
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
        b.a(this, parcel, i);
    }
}
