package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class h implements Parcelable.Creator {
    static void a(WebImage webImage, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, webImage.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, (Parcelable) webImage.b(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, webImage.c());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, webImage.d());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public WebImage createFromParcel(Parcel parcel) {
        int iG;
        int iG2;
        Uri uri;
        int iG3;
        int i = 0;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        Uri uri2 = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    int i4 = i;
                    iG2 = i2;
                    uri = uri2;
                    iG3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    iG = i4;
                    break;
                case 2:
                    iG3 = i3;
                    int i5 = i2;
                    uri = (Uri) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, Uri.CREATOR);
                    iG = i;
                    iG2 = i5;
                    break;
                case 3:
                    uri = uri2;
                    iG3 = i3;
                    int i6 = i;
                    iG2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    iG = i6;
                    break;
                case 4:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    iG2 = i2;
                    uri = uri2;
                    iG3 = i3;
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    iG = i;
                    iG2 = i2;
                    uri = uri2;
                    iG3 = i3;
                    break;
            }
            i3 = iG3;
            uri2 = uri;
            i2 = iG2;
            i = iG;
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new WebImage(i3, uri2, i2, i);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public WebImage[] newArray(int i) {
        return new WebImage[i];
    }
}
