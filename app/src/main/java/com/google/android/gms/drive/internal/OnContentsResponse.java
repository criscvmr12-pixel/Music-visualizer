package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;

/* JADX INFO: loaded from: classes.dex */
public class OnContentsResponse implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new e();
    final int a;
    final Contents b;

    OnContentsResponse(int i, Contents contents) {
        this.a = i;
        this.b = contents;
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
