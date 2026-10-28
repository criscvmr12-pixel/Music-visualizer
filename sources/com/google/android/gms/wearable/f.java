package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class f implements Parcelable.Creator {
    static void a(PutDataRequest putDataRequest, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, putDataRequest.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, (Parcelable) putDataRequest.a(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, putDataRequest.c(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, putDataRequest.b(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public PutDataRequest createFromParcel(Parcel parcel) {
        byte[] bArrR;
        Bundle bundleQ;
        Uri uri;
        int iG;
        byte[] bArr = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        Bundle bundle = null;
        Uri uri2 = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    byte[] bArr2 = bArr;
                    bundleQ = bundle;
                    uri = uri2;
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    bArrR = bArr2;
                    break;
                case 2:
                    iG = i;
                    Bundle bundle2 = bundle;
                    uri = (Uri) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, Uri.CREATOR);
                    bArrR = bArr;
                    bundleQ = bundle2;
                    break;
                case 3:
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    bArrR = bArr;
                    bundleQ = bundle;
                    uri = uri2;
                    iG = i;
                    break;
                case 4:
                    uri = uri2;
                    iG = i;
                    byte[] bArr3 = bArr;
                    bundleQ = com.google.android.gms.common.internal.safeparcel.a.q(parcel, iA);
                    bArrR = bArr3;
                    break;
                case 5:
                    bArrR = com.google.android.gms.common.internal.safeparcel.a.r(parcel, iA);
                    bundleQ = bundle;
                    uri = uri2;
                    iG = i;
                    break;
            }
            i = iG;
            uri2 = uri;
            bundle = bundleQ;
            bArr = bArrR;
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new PutDataRequest(i, uri2, bundle, bArr);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public PutDataRequest[] newArray(int i) {
        return new PutDataRequest[i];
    }
}
