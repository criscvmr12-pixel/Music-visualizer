package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.internal.ky;

/* JADX INFO: loaded from: classes.dex */
public class CustomProperty implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new e();
    final int a;
    final CustomPropertyKey b;
    final String c;

    CustomProperty(int i, CustomPropertyKey customPropertyKey, String str) {
        this.a = i;
        ky.a(customPropertyKey, "key");
        this.b = customPropertyKey;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        e.a(this, parcel, i);
    }
}
