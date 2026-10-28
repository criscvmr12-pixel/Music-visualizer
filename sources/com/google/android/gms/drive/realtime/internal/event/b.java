package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: loaded from: classes.dex */
public class b implements Parcelable.Creator {
    static void a(ParcelableEventList parcelableEventList, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, parcelableEventList.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, (Parcelable[]) parcelableEventList.b, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, (Parcelable) parcelableEventList.c, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, parcelableEventList.d);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, (Parcelable[]) parcelableEventList.e, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ParcelableEventList createFromParcel(Parcel parcel) {
        boolean zC = false;
        ParcelableObjectChangedEvent[] parcelableObjectChangedEventArr = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        DataHolder dataHolder = null;
        ParcelableEvent[] parcelableEventArr = null;
        int iG = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 2:
                    parcelableEventArr = (ParcelableEvent[]) com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA, ParcelableEvent.CREATOR);
                    break;
                case 3:
                    dataHolder = (DataHolder) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, DataHolder.CREATOR);
                    break;
                case 4:
                    zC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case 5:
                    parcelableObjectChangedEventArr = (ParcelableObjectChangedEvent[]) com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA, ParcelableObjectChangedEvent.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new ParcelableEventList(iG, parcelableEventArr, dataHolder, zC, parcelableObjectChangedEventArr);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ParcelableEventList[] newArray(int i) {
        return new ParcelableEventList[i];
    }
}
