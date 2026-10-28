package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public class b implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new n();
    final int a;
    public final c b;
    public final IntentFilter[] c;

    b(int i, IBinder iBinder, IntentFilter[] intentFilterArr) {
        this.a = i;
        if (iBinder != null) {
            this.b = d.a(iBinder);
        } else {
            this.b = null;
        }
        this.c = intentFilterArr;
    }

    IBinder a() {
        if (this.b == null) {
            return null;
        }
        return this.b.asBinder();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        n.a(this, parcel, i);
    }
}
