package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.Contents;

/* JADX INFO: loaded from: classes.dex */
public class z implements Parcelable.Creator {
    static void a(CloseContentsRequest closeContentsRequest, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, closeContentsRequest.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, (Parcelable) closeContentsRequest.b, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, closeContentsRequest.c, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public CloseContentsRequest createFromParcel(Parcel parcel) {
        Boolean boolD;
        Contents contents;
        int iG;
        Boolean bool = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        Contents contents2 = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    Boolean bool2 = bool;
                    contents = contents2;
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    boolD = bool2;
                    break;
                case 2:
                    Contents contents3 = (Contents) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, Contents.CREATOR);
                    iG = i;
                    boolD = bool;
                    contents = contents3;
                    break;
                case 3:
                    boolD = com.google.android.gms.common.internal.safeparcel.a.d(parcel, iA);
                    contents = contents2;
                    iG = i;
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    boolD = bool;
                    contents = contents2;
                    iG = i;
                    break;
            }
            i = iG;
            contents2 = contents;
            bool = boolD;
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new CloseContentsRequest(i, contents2, bool);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public CloseContentsRequest[] newArray(int i) {
        return new CloseContentsRequest[i];
    }
}
