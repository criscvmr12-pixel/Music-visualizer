package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.internal.ku;

/* JADX INFO: loaded from: classes.dex */
final class f {
    public final Uri a;

    public f(Uri uri) {
        this.a = uri;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return ku.a(((f) obj).a, this.a);
    }

    public int hashCode() {
        return ku.a(this.a);
    }
}
