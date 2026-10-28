package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.images.WebImage;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class a implements Parcelable.Creator {
    static void a(ApplicationMetadata applicationMetadata, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, applicationMetadata.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, applicationMetadata.b(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, applicationMetadata.c(), false);
        com.google.android.gms.common.internal.safeparcel.c.b(parcel, 4, applicationMetadata.f(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, applicationMetadata.d, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, applicationMetadata.d(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, (Parcelable) applicationMetadata.e(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ApplicationMetadata createFromParcel(Parcel parcel) {
        Uri uri = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iG = 0;
        String strO = null;
        ArrayList arrayListB = null;
        ArrayList arrayListC = null;
        String strO2 = null;
        String strO3 = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 2:
                    strO3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 3:
                    strO2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 4:
                    arrayListC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, WebImage.CREATOR);
                    break;
                case 5:
                    arrayListB = com.google.android.gms.common.internal.safeparcel.a.B(parcel, iA);
                    break;
                case 6:
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 7:
                    uri = (Uri) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, Uri.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new ApplicationMetadata(iG, strO3, strO2, arrayListC, arrayListB, strO, uri);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ApplicationMetadata[] newArray(int i) {
        return new ApplicationMetadata[i];
    }
}
