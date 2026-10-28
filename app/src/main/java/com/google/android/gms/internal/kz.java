package com.google.android.gms.internal;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class kz {
    private final LinkedHashMap a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;

    private int c(Object obj, Object obj2) {
        int iA = a(obj, obj2);
        if (iA < 0) {
            throw new IllegalStateException("Negative size: " + obj + "=" + obj2);
        }
        return iA;
    }

    protected int a(Object obj, Object obj2) {
        return 1;
    }

    public final Object a(Object obj) {
        Object objPut;
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            Object obj2 = this.a.get(obj);
            if (obj2 != null) {
                this.g++;
                return obj2;
            }
            this.h++;
            Object objB = b(obj);
            if (objB == null) {
                return null;
            }
            synchronized (this) {
                this.e++;
                objPut = this.a.put(obj, objB);
                if (objPut != null) {
                    this.a.put(obj, objPut);
                } else {
                    this.b += c(obj, objB);
                }
            }
            if (objPut != null) {
                a(false, obj, objB, objPut);
                return objPut;
            }
            a(this.c);
            return objB;
        }
    }

    public final void a() {
        a(-1);
    }

    public void a(int i) {
        Object key;
        Object value;
        while (true) {
            synchronized (this) {
                if (this.b < 0 || (this.a.isEmpty() && this.b != 0)) {
                    break;
                }
                if (this.b <= i || this.a.isEmpty()) {
                    return;
                }
                Map.Entry entry = (Map.Entry) this.a.entrySet().iterator().next();
                key = entry.getKey();
                value = entry.getValue();
                this.a.remove(key);
                this.b -= c(key, value);
                this.f++;
            }
            a(true, key, value, null);
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }

    protected void a(boolean z, Object obj, Object obj2, Object obj3) {
    }

    protected Object b(Object obj) {
        return null;
    }

    public final Object b(Object obj, Object obj2) {
        Object objPut;
        if (obj == null || obj2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.d++;
            this.b += c(obj, obj2);
            objPut = this.a.put(obj, obj2);
            if (objPut != null) {
                this.b -= c(obj, objPut);
            }
        }
        if (objPut != null) {
            a(false, obj, objPut, obj2);
        }
        a(this.c);
        return objPut;
    }

    public final synchronized String toString() {
        String str;
        synchronized (this) {
            int i = this.g + this.h;
            str = String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.c), Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(i != 0 ? (this.g * 100) / i : 0));
        }
        return str;
    }
}
