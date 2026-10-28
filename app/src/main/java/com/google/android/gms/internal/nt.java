package com.google.android.gms.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class nt {
    protected volatile int f = -1;

    public static final void a(nt ntVar, byte[] bArr, int i, int i2) {
        try {
            nq nqVarA = nq.a(bArr, i, i2);
            ntVar.a(nqVarA);
            nqVarA.b();
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public static final byte[] a(nt ntVar) {
        byte[] bArr = new byte[ntVar.c()];
        a(ntVar, bArr, 0, bArr.length);
        return bArr;
    }

    public void a(nq nqVar) {
    }

    protected int b() {
        return 0;
    }

    public int c() {
        int iB = b();
        this.f = iB;
        return iB;
    }

    public String toString() {
        return nu.a(this);
    }
}
