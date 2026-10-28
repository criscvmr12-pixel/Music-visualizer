package com.google.android.gms.drive.query.internal;

import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class e {
    static com.google.android.gms.drive.metadata.a a(MetadataBundle metadataBundle) {
        Set setA = metadataBundle.a();
        if (setA.size() != 1) {
            throw new IllegalArgumentException("bundle should have exactly 1 populated field");
        }
        return (com.google.android.gms.drive.metadata.a) setA.iterator().next();
    }
}
