package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class i implements Parcelable.Creator {
    static void a(ValuesRemovedDetails valuesRemovedDetails, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, valuesRemovedDetails.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, valuesRemovedDetails.b);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, valuesRemovedDetails.c);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, valuesRemovedDetails.d);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, valuesRemovedDetails.e, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, valuesRemovedDetails.f);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ValuesRemovedDetails createFromParcel(Parcel parcel) {
        int iG = 0;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        String strO = null;
        int iG2 = 0;
        int iG3 = 0;
        int iG4 = 0;
        int iG5 = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    iG5 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 2:
                    iG4 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 3:
                    iG3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 4:
                    iG2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 5:
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 6:
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
        return new ValuesRemovedDetails(iG5, iG4, iG3, iG2, strO, iG);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ValuesRemovedDetails[] newArray(int i) {
        return new ValuesRemovedDetails[i];
    }
}
