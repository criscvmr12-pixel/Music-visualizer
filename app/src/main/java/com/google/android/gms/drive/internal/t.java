package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveId;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class t implements Parcelable.Creator {
    static void a(SetResourceParentsRequest setResourceParentsRequest, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, setResourceParentsRequest.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, (Parcelable) setResourceParentsRequest.b, i, false);
        com.google.android.gms.common.internal.safeparcel.c.b(parcel, 3, setResourceParentsRequest.c, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public SetResourceParentsRequest createFromParcel(Parcel parcel) {
        ArrayList arrayListC;
        DriveId driveId;
        int iG;
        ArrayList arrayList = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        DriveId driveId2 = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    ArrayList arrayList2 = arrayList;
                    driveId = driveId2;
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    arrayListC = arrayList2;
                    break;
                case 2:
                    DriveId driveId3 = (DriveId) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, DriveId.CREATOR);
                    iG = i;
                    arrayListC = arrayList;
                    driveId = driveId3;
                    break;
                case 3:
                    arrayListC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, DriveId.CREATOR);
                    driveId = driveId2;
                    iG = i;
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    arrayListC = arrayList;
                    driveId = driveId2;
                    iG = i;
                    break;
            }
            i = iG;
            driveId2 = driveId;
            arrayList = arrayListC;
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new SetResourceParentsRequest(i, driveId2, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public SetResourceParentsRequest[] newArray(int i) {
        return new SetResourceParentsRequest[i];
    }
}
