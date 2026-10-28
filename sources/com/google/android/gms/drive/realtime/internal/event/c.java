package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class c implements Parcelable.Creator {
    static void a(ParcelableObjectChangedEvent parcelableObjectChangedEvent, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, parcelableObjectChangedEvent.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, parcelableObjectChangedEvent.b, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, parcelableObjectChangedEvent.c, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, parcelableObjectChangedEvent.d);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, parcelableObjectChangedEvent.e, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, parcelableObjectChangedEvent.f, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, parcelableObjectChangedEvent.g);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, parcelableObjectChangedEvent.h);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ParcelableObjectChangedEvent createFromParcel(Parcel parcel) {
        String strO = null;
        int iG = 0;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iG2 = 0;
        String strO2 = null;
        boolean zC = false;
        String strO3 = null;
        String strO4 = null;
        int iG3 = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    iG3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 2:
                    strO4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 3:
                    strO3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 4:
                    zC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case 5:
                    strO2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 6:
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 7:
                    iG2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 8:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new ParcelableObjectChangedEvent(iG3, strO4, strO3, zC, strO2, strO, iG2, iG);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ParcelableObjectChangedEvent[] newArray(int i) {
        return new ParcelableObjectChangedEvent[i];
    }
}
