package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes.dex */
public final class nq {
    private final byte[] a;
    private final int b;
    private int c;

    private nq(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.c = i;
        this.b = i + i2;
    }

    public static nq a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static nq a(byte[] bArr, int i, int i2) {
        return new nq(bArr, i, i2);
    }

    public static int b(int i) {
        if (i >= 0) {
            return f(i);
        }
        return 10;
    }

    public static int b(int i, int i2) {
        return d(i) + b(i2);
    }

    public static int b(int i, String str) {
        return d(i) + b(str);
    }

    public static int b(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return bytes.length + f(bytes.length);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported.");
        }
    }

    public static int c(int i, long j) {
        return d(i) + c(j);
    }

    public static int c(long j) {
        return e(f(j));
    }

    public static int d(int i) {
        return f(nw.a(i, 0));
    }

    public static int e(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (Long.MIN_VALUE & j) == 0 ? 9 : 10;
    }

    public static int f(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return ((-268435456) & i) == 0 ? 4 : 5;
    }

    public static long f(long j) {
        return (j << 1) ^ (j >> 63);
    }

    public int a() {
        return this.b - this.c;
    }

    public void a(byte b) throws nr {
        if (this.c == this.b) {
            throw new nr(this.c, this.b);
        }
        byte[] bArr = this.a;
        int i = this.c;
        this.c = i + 1;
        bArr[i] = b;
    }

    public void a(int i) throws nr {
        if (i >= 0) {
            e(i);
        } else {
            d(i);
        }
    }

    public void a(int i, int i2) throws nr {
        c(i, 0);
        a(i2);
    }

    public void a(int i, long j) throws nr {
        c(i, 0);
        a(j);
    }

    public void a(int i, String str) throws nr, UnsupportedEncodingException {
        c(i, 2);
        a(str);
    }

    public void a(long j) throws nr {
        d(j);
    }

    public void a(String str) throws nr, UnsupportedEncodingException {
        byte[] bytes = str.getBytes("UTF-8");
        e(bytes.length);
        b(bytes);
    }

    public void b() {
        if (a() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public void b(int i, long j) throws nr {
        c(i, 0);
        b(j);
    }

    public void b(long j) throws nr {
        d(f(j));
    }

    public void b(byte[] bArr) throws nr {
        b(bArr, 0, bArr.length);
    }

    public void b(byte[] bArr, int i, int i2) throws nr {
        if (this.b - this.c < i2) {
            throw new nr(this.c, this.b);
        }
        System.arraycopy(bArr, i, this.a, this.c, i2);
        this.c += i2;
    }

    public void c(int i) throws nr {
        a((byte) i);
    }

    public void c(int i, int i2) throws nr {
        e(nw.a(i, i2));
    }

    public void d(long j) throws nr {
        while (((-128) & j) != 0) {
            c((((int) j) & 127) | 128);
            j >>>= 7;
        }
        c((int) j);
    }

    public void e(int i) throws nr {
        while ((i & (-128)) != 0) {
            c((i & 127) | 128);
            i >>>= 7;
        }
        c(i);
    }
}
