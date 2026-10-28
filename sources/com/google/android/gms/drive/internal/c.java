package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveId;

/* JADX INFO: loaded from: classes.dex */
public class c implements Parcelable.Creator {
    static void a(LoadRealtimeRequest loadRealtimeRequest, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, loadRealtimeRequest.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, (Parcelable) loadRealtimeRequest.b, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, loadRealtimeRequest.c);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public LoadRealtimeRequest createFromParcel(Parcel parcel) {
        boolean zC;
        DriveId driveId;
        int iG;
        boolean z = false;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        DriveId driveId2 = null;
        int i = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    boolean z2 = z;
                    driveId = driveId2;
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    zC = z2;
                    break;
                case 2:
                    DriveId driveId3 = (DriveId) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, DriveId.CREATOR);
                    iG = i;
                    zC = z;
                    driveId = driveId3;
                    break;
                case 3:
                    zC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    driveId = driveId2;
                    iG = i;
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    zC = z;
                    driveId = driveId2;
                    iG = i;
                    break;
            }
            i = iG;
            driveId2 = driveId;
            z = zC;
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new LoadRealtimeRequest(i, driveId2, z);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public LoadRealtimeRequest[] newArray(int i) {
        return new LoadRealtimeRequest[i];
    }
}
