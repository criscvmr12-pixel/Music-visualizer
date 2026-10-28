package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: loaded from: classes.dex */
public class i implements Parcelable.Creator {
    static void a(OnListEntriesResponse onListEntriesResponse, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, onListEntriesResponse.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, (Parcelable) onListEntriesResponse.b, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, onListEntriesResponse.c);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public OnListEntriesResponse createFromParcel(Parcel parcel) {
        boolean zC;
        DataHolder dataHolder;
        int iG;
        boolean z = false;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        DataHolder dataHolder2 = null;
        int i = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    boolean z2 = z;
                    dataHolder = dataHolder2;
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    zC = z2;
                    break;
                case 2:
                    DataHolder dataHolder3 = (DataHolder) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, DataHolder.CREATOR);
                    iG = i;
                    zC = z;
                    dataHolder = dataHolder3;
                    break;
                case 3:
                    zC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    dataHolder = dataHolder2;
                    iG = i;
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    zC = z;
                    dataHolder = dataHolder2;
                    iG = i;
                    break;
            }
            i = iG;
            dataHolder2 = dataHolder;
            z = zC;
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new OnListEntriesResponse(i, dataHolder2, z);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public OnListEntriesResponse[] newArray(int i) {
        return new OnListEntriesResponse[i];
    }
}
