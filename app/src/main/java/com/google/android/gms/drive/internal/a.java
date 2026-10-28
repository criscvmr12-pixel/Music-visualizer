package com.google.android.gms.drive.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveId;

/* JADX INFO: loaded from: classes.dex */
public class a implements Parcelable.Creator {
    static void a(AddEventListenerRequest addEventListenerRequest, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, addEventListenerRequest.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, (Parcelable) addEventListenerRequest.b, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, addEventListenerRequest.c);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, (Parcelable) addEventListenerRequest.d, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public AddEventListenerRequest createFromParcel(Parcel parcel) {
        PendingIntent pendingIntent;
        int iG;
        DriveId driveId;
        int iG2;
        PendingIntent pendingIntent2 = null;
        int i = 0;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        DriveId driveId2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    PendingIntent pendingIntent3 = pendingIntent2;
                    iG = i;
                    driveId = driveId2;
                    iG2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    pendingIntent = pendingIntent3;
                    break;
                case 2:
                    iG2 = i2;
                    int i3 = i;
                    driveId = (DriveId) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, DriveId.CREATOR);
                    pendingIntent = pendingIntent2;
                    iG = i3;
                    break;
                case 3:
                    driveId = driveId2;
                    iG2 = i2;
                    PendingIntent pendingIntent4 = pendingIntent2;
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    pendingIntent = pendingIntent4;
                    break;
                case 4:
                    pendingIntent = (PendingIntent) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, PendingIntent.CREATOR);
                    iG = i;
                    driveId = driveId2;
                    iG2 = i2;
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    pendingIntent = pendingIntent2;
                    iG = i;
                    driveId = driveId2;
                    iG2 = i2;
                    break;
            }
            i2 = iG2;
            driveId2 = driveId;
            i = iG;
            pendingIntent2 = pendingIntent;
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new AddEventListenerRequest(i2, driveId2, i, pendingIntent2);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public AddEventListenerRequest[] newArray(int i) {
        return new AddEventListenerRequest[i];
    }
}
