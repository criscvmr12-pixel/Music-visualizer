package com.google.android.gms.drive.internal;

import com.google.android.gms.internal.nq;
import com.google.android.gms.internal.nr;
import com.google.android.gms.internal.ns;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes.dex */
public final class d extends ns {
    public int a;
    public String b;
    public long c;
    public long d;

    public d() {
        a();
    }

    public d a() {
        this.a = 1;
        this.b = "";
        this.c = -1L;
        this.d = -1L;
        this.e = null;
        this.f = -1;
        return this;
    }

    @Override // com.google.android.gms.internal.ns, com.google.android.gms.internal.nt
    public void a(nq nqVar) throws nr, UnsupportedEncodingException {
        nqVar.a(1, this.a);
        nqVar.a(2, this.b);
        nqVar.b(3, this.c);
        nqVar.b(4, this.d);
        super.a(nqVar);
    }

    @Override // com.google.android.gms.internal.ns, com.google.android.gms.internal.nt
    protected int b() {
        return super.b() + nq.b(1, this.a) + nq.b(2, this.b) + nq.c(3, this.c) + nq.c(4, this.d);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.a != dVar.a) {
            return false;
        }
        if (this.b == null) {
            if (dVar.b != null) {
                return false;
            }
        } else if (!this.b.equals(dVar.b)) {
            return false;
        }
        if (this.c != dVar.c || this.d != dVar.d) {
            return false;
        }
        if (this.e == null || this.e.isEmpty()) {
            return dVar.e == null || dVar.e.isEmpty();
        }
        return this.e.equals(dVar.e);
    }

    public int hashCode() {
        int iHashCode = 0;
        int iHashCode2 = ((((((this.b == null ? 0 : this.b.hashCode()) + ((this.a + 527) * 31)) * 31) + ((int) (this.c ^ (this.c >>> 32)))) * 31) + ((int) (this.d ^ (this.d >>> 32)))) * 31;
        if (this.e != null && !this.e.isEmpty()) {
            iHashCode = this.e.hashCode();
        }
        return iHashCode2 + iHashCode;
    }
}
