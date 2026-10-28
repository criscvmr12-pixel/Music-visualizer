package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

/* JADX INFO: loaded from: classes.dex */
public class OpenFileIntentSenderRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new q();
    final int a;
    final String b;
    final String[] c;
    final DriveId d;

    OpenFileIntentSenderRequest(int i, String str, String[] strArr, DriveId driveId) {
        this.a = i;
        this.b = str;
        this.c = strArr;
        this.d = driveId;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        q.a(this, parcel, i);
    }
}
