package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class b implements Parcelable.Creator {
    static void a(FileConflictEvent fileConflictEvent, Parcel parcel, int i) {
        int iA = c.a(parcel);
        c.a(parcel, 1, fileConflictEvent.a);
        c.a(parcel, 2, (Parcelable) fileConflictEvent.b, i, false);
        c.a(parcel, 3, fileConflictEvent.c, false);
        c.a(parcel, 4, (Parcelable) fileConflictEvent.d, i, false);
        c.a(parcel, 5, (Parcelable) fileConflictEvent.e, i, false);
        c.a(parcel, 6, (Parcelable) fileConflictEvent.f, i, false);
        c.a(parcel, 7, (List) fileConflictEvent.g, false);
        c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public FileConflictEvent createFromParcel(Parcel parcel) {
        ArrayList arrayListB = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iG = 0;
        MetadataBundle metadataBundle = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        String strO = null;
        DriveId driveId = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 2:
                    driveId = (DriveId) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, DriveId.CREATOR);
                    break;
                case 3:
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 4:
                    parcelFileDescriptor2 = (ParcelFileDescriptor) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, ParcelFileDescriptor.CREATOR);
                    break;
                case 5:
                    parcelFileDescriptor = (ParcelFileDescriptor) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, ParcelFileDescriptor.CREATOR);
                    break;
                case 6:
                    metadataBundle = (MetadataBundle) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, MetadataBundle.CREATOR);
                    break;
                case 7:
                    arrayListB = com.google.android.gms.common.internal.safeparcel.a.B(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new FileConflictEvent(iG, driveId, strO, parcelFileDescriptor2, parcelFileDescriptor, metadataBundle, arrayListB);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public FileConflictEvent[] newArray(int i) {
        return new FileConflictEvent[i];
    }
}
