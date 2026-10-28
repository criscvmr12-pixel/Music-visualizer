package com.google.android.gms.identity.intents;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class UserAddressRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new a();
    List a;
    private final int b;

    UserAddressRequest() {
        this.b = 1;
    }

    UserAddressRequest(int i, List list) {
        this.b = i;
        this.a = list;
    }

    public int a() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel, i);
    }
}
