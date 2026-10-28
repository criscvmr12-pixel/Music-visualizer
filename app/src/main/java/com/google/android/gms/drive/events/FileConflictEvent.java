package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class FileConflictEvent implements SafeParcelable, DriveEvent {
    public static final Parcelable.Creator CREATOR = new b();
    final int a;
    final DriveId b;
    final String c;
    final ParcelFileDescriptor d;
    final ParcelFileDescriptor e;
    final MetadataBundle f;
    final ArrayList g;
    private boolean h = false;
    private boolean i = false;
    private boolean j = false;

    FileConflictEvent(int i, DriveId driveId, String str, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2, MetadataBundle metadataBundle, ArrayList arrayList) {
        this.a = i;
        this.b = driveId;
        this.c = str;
        this.d = parcelFileDescriptor;
        this.e = parcelFileDescriptor2;
        this.f = metadataBundle;
        this.g = arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return String.format("FileConflictEvent [id=%s]", this.b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        b.a(this, parcel, i);
    }
}
