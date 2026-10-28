package com.google.android.gms.games.snapshot;

import android.os.Parcelable;
import com.google.android.gms.common.data.d;
import com.google.android.gms.drive.Contents;

/* JADX INFO: loaded from: classes.dex */
public interface Snapshot extends Parcelable, d {
    SnapshotMetadata b();

    Contents c();
}
