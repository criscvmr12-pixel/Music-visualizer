package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.ku;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class g extends e {
    private WeakReference d;

    @Override // com.google.android.gms.common.images.e
    protected void a(Drawable drawable, boolean z, boolean z2, boolean z3) {
        a aVar;
        if (z2 || (aVar = (a) this.d.get()) == null) {
            return;
        }
        aVar.a(this.a.a, drawable, z3);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        g gVar = (g) obj;
        a aVar = (a) this.d.get();
        a aVar2 = (a) gVar.d.get();
        return aVar2 != null && aVar != null && ku.a(aVar2, aVar) && ku.a(gVar.a, this.a);
    }

    public int hashCode() {
        return ku.a(this.a);
    }
}
