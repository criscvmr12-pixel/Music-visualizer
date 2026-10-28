package com.google.android.gms.internal;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes.dex */
class ob implements ny {
    private nq a;
    private byte[] b;
    private final int c;

    public ob(int i) {
        this.c = i;
        a();
    }

    @Override // com.google.android.gms.internal.ny
    public void a() {
        this.b = new byte[this.c];
        this.a = nq.a(this.b);
    }

    @Override // com.google.android.gms.internal.ny
    public void a(int i, long j) throws nr {
        this.a.a(i, j);
    }

    @Override // com.google.android.gms.internal.ny
    public void a(int i, String str) throws nr, UnsupportedEncodingException {
        this.a.a(i, str);
    }

    @Override // com.google.android.gms.internal.ny
    public byte[] b() throws IOException {
        int iA = this.a.a();
        if (iA < 0) {
            throw new IOException();
        }
        if (iA == 0) {
            return this.b;
        }
        byte[] bArr = new byte[this.b.length - iA];
        System.arraycopy(this.b, 0, bArr, 0, bArr.length);
        return bArr;
    }
}
