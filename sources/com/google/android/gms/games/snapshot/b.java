package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class b implements Parcelable.Creator {
    static void a(SnapshotMetadataChange snapshotMetadataChange, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, snapshotMetadataChange.b(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, snapshotMetadataChange.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, snapshotMetadataChange.c(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, (Parcelable) snapshotMetadataChange.e(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, (Parcelable) snapshotMetadataChange.d(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public SnapshotMetadataChange createFromParcel(Parcel parcel) {
        Uri uri = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iG = 0;
        com.google.android.gms.common.data.a aVar = null;
        Long lJ = null;
        String strO = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 2:
                    lJ = com.google.android.gms.common.internal.safeparcel.a.j(parcel, iA);
                    break;
                case 4:
                    uri = (Uri) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, Uri.CREATOR);
                    break;
                case 5:
                    aVar = (com.google.android.gms.common.data.a) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, com.google.android.gms.common.data.a.CREATOR);
                    break;
                case 1000:
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
        return new SnapshotMetadataChange(iG, strO, lJ, aVar, uri);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public SnapshotMetadataChange[] newArray(int i) {
        return new SnapshotMetadataChange[i];
    }
}
