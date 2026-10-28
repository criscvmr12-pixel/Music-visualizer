package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class SetResourceParentsRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new t();
    final int a;
    final DriveId b;
    final List c;

    SetResourceParentsRequest(int i, DriveId driveId, List list) {
        this.a = i;
        this.b = driveId;
        this.c = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        t.a(this, parcel, i);
    }
}
