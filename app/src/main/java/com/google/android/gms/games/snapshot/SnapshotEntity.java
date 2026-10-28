package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.internal.ku;

/* JADX INFO: loaded from: classes.dex */
public final class SnapshotEntity implements SafeParcelable, Snapshot {
    private final int b;
    private final SnapshotMetadataEntity c;
    private Contents d;
    private static final Object a = new Object();
    public static final a CREATOR = new a();

    SnapshotEntity(int i, SnapshotMetadata snapshotMetadata, Contents contents) {
        this.b = i;
        this.c = new SnapshotMetadataEntity(snapshotMetadata);
        this.d = contents;
    }

    static int a(Snapshot snapshot) {
        return ku.a(snapshot.b(), snapshot.c());
    }

    static boolean a(Snapshot snapshot, Object obj) {
        if (!(obj instanceof Snapshot)) {
            return false;
        }
        if (snapshot == obj) {
            return true;
        }
        Snapshot snapshot2 = (Snapshot) obj;
        return ku.a(snapshot2.b(), snapshot.b()) && ku.a(snapshot2.c(), snapshot.c());
    }

    static String b(Snapshot snapshot) {
        return ku.a(snapshot).a("Metadata", snapshot.b()).a("HasContents", Boolean.valueOf(snapshot.c() != null)).toString();
    }

    @Override // com.google.android.gms.games.snapshot.Snapshot
    public SnapshotMetadata b() {
        return this.c;
    }

    @Override // com.google.android.gms.games.snapshot.Snapshot
    public Contents c() {
        return this.d;
    }

    public int d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.common.data.d
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Snapshot a() {
        return this;
    }

    public boolean equals(Object obj) {
        return a(this, obj);
    }

    public int hashCode() {
        return a(this);
    }

    public String toString() {
        return b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel, i);
    }
}
