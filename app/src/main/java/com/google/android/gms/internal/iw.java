package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
final class iw implements Parcelable.Creator {
    iw() {
    }

    @Override // android.os.Parcelable.Creator
    @Deprecated
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public fe createFromParcel(Parcel parcel) {
        return new fe(parcel);
    }

    @Override // android.os.Parcelable.Creator
    @Deprecated
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public fe[] newArray(int i) {
        return new fe[i];
    }
}
