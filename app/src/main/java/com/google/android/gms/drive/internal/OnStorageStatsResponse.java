package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.StorageStats;

/* JADX INFO: loaded from: classes.dex */
public class OnStorageStatsResponse implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new n();
    final int a;
    StorageStats b;

    OnStorageStatsResponse(int i, StorageStats storageStats) {
        this.a = i;
        this.b = storageStats;
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
