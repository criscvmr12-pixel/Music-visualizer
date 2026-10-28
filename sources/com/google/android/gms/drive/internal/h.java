package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.FileConflictEvent;

/* JADX INFO: loaded from: classes.dex */
public class h implements Parcelable.Creator {
    static void a(OnEventResponse onEventResponse, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, onEventResponse.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, onEventResponse.b);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, (Parcelable) onEventResponse.c, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, (Parcelable) onEventResponse.d, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public OnEventResponse createFromParcel(Parcel parcel) {
        FileConflictEvent fileConflictEvent;
        ChangeEvent changeEvent;
        int iG;
        int iG2;
        FileConflictEvent fileConflictEvent2 = null;
        int i = 0;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        ChangeEvent changeEvent2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    FileConflictEvent fileConflictEvent3 = fileConflictEvent2;
                    changeEvent = changeEvent2;
                    iG = i;
                    iG2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    fileConflictEvent = fileConflictEvent3;
                    break;
                case 2:
                    iG2 = i2;
                    ChangeEvent changeEvent3 = changeEvent2;
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    fileConflictEvent = fileConflictEvent2;
                    changeEvent = changeEvent3;
                    break;
                case 3:
                    iG = i;
                    iG2 = i2;
                    FileConflictEvent fileConflictEvent4 = fileConflictEvent2;
                    changeEvent = (ChangeEvent) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, ChangeEvent.CREATOR);
                    fileConflictEvent = fileConflictEvent4;
                    break;
                case 4:
                    fileConflictEvent = (FileConflictEvent) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, FileConflictEvent.CREATOR);
                    changeEvent = changeEvent2;
                    iG = i;
                    iG2 = i2;
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    fileConflictEvent = fileConflictEvent2;
                    changeEvent = changeEvent2;
                    iG = i;
                    iG2 = i2;
                    break;
            }
            i2 = iG2;
            i = iG;
            changeEvent2 = changeEvent;
            fileConflictEvent2 = fileConflictEvent;
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new OnEventResponse(i2, i, changeEvent2, fileConflictEvent2);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public OnEventResponse[] newArray(int i) {
        return new OnEventResponse[i];
    }
}
