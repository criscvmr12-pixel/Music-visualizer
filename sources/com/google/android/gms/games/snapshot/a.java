package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.Contents;

/* JADX INFO: loaded from: classes.dex */
public class a implements Parcelable.Creator {
    static void a(SnapshotEntity snapshotEntity, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, (Parcelable) snapshotEntity.b(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, snapshotEntity.d());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, (Parcelable) snapshotEntity.c(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public SnapshotEntity createFromParcel(Parcel parcel) {
        Contents contents;
        SnapshotMetadataEntity snapshotMetadataEntity;
        int iG;
        Contents contents2 = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        SnapshotMetadataEntity snapshotMetadataEntity2 = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    SnapshotMetadataEntity snapshotMetadataEntity3 = (SnapshotMetadataEntity) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, SnapshotMetadataEntity.CREATOR);
                    iG = i;
                    contents = contents2;
                    snapshotMetadataEntity = snapshotMetadataEntity3;
                    break;
                case 2:
                    contents = (Contents) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, Contents.CREATOR);
                    snapshotMetadataEntity = snapshotMetadataEntity2;
                    iG = i;
                    break;
                case 1000:
                    Contents contents3 = contents2;
                    snapshotMetadataEntity = snapshotMetadataEntity2;
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    contents = contents3;
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    contents = contents2;
                    snapshotMetadataEntity = snapshotMetadataEntity2;
                    iG = i;
                    break;
            }
            i = iG;
            snapshotMetadataEntity2 = snapshotMetadataEntity;
            contents2 = contents;
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new SnapshotEntity(i, snapshotMetadataEntity2, contents2);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public SnapshotEntity[] newArray(int i) {
        return new SnapshotEntity[i];
    }
}
