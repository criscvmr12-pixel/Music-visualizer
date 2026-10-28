package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class a implements Parcelable.Creator {
    static void a(ParcelableEvent parcelableEvent, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, parcelableEvent.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, parcelableEvent.b, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, parcelableEvent.c, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, parcelableEvent.d);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, parcelableEvent.e, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, parcelableEvent.f, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, (Parcelable) parcelableEvent.g, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, (Parcelable) parcelableEvent.h, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, (Parcelable) parcelableEvent.i, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 10, (Parcelable) parcelableEvent.j, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 11, (Parcelable) parcelableEvent.k, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 12, (Parcelable) parcelableEvent.l, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 13, (Parcelable) parcelableEvent.m, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ParcelableEvent createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iG = 0;
        String strO = null;
        String strO2 = null;
        boolean zC = false;
        String strO3 = null;
        String strO4 = null;
        TextInsertedDetails textInsertedDetails = null;
        TextDeletedDetails textDeletedDetails = null;
        ValuesAddedDetails valuesAddedDetails = null;
        ValuesRemovedDetails valuesRemovedDetails = null;
        ValuesSetDetails valuesSetDetails = null;
        ValueChangedDetails valueChangedDetails = null;
        ReferenceShiftedDetails referenceShiftedDetails = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 2:
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 3:
                    strO2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 4:
                    zC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case 5:
                    strO3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 6:
                    strO4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 7:
                    textInsertedDetails = (TextInsertedDetails) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, TextInsertedDetails.CREATOR);
                    break;
                case 8:
                    textDeletedDetails = (TextDeletedDetails) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, TextDeletedDetails.CREATOR);
                    break;
                case 9:
                    valuesAddedDetails = (ValuesAddedDetails) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, ValuesAddedDetails.CREATOR);
                    break;
                case 10:
                    valuesRemovedDetails = (ValuesRemovedDetails) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, ValuesRemovedDetails.CREATOR);
                    break;
                case com.google.android.gms.c.MapAttrs_uiZoomGestures /* 11 */:
                    valuesSetDetails = (ValuesSetDetails) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, ValuesSetDetails.CREATOR);
                    break;
                case com.google.android.gms.c.MapAttrs_useViewLifecycle /* 12 */:
                    valueChangedDetails = (ValueChangedDetails) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, ValueChangedDetails.CREATOR);
                    break;
                case com.google.android.gms.c.MapAttrs_zOrderOnTop /* 13 */:
                    referenceShiftedDetails = (ReferenceShiftedDetails) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, ReferenceShiftedDetails.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new ParcelableEvent(iG, strO, strO2, zC, strO3, strO4, textInsertedDetails, textDeletedDetails, valuesAddedDetails, valuesRemovedDetails, valuesSetDetails, valueChangedDetails, referenceShiftedDetails);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ParcelableEvent[] newArray(int i) {
        return new ParcelableEvent[i];
    }
}
