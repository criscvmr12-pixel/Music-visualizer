package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kw {
    private final List a;
    private final Object b;

    private kw(Object obj) {
        this.b = ky.a(obj);
        this.a = new ArrayList();
    }

    public kw a(String str, Object obj) {
        this.a.add(((String) ky.a((Object) str)) + "=" + String.valueOf(obj));
        return this;
    }

    public String toString() {
        StringBuilder sbAppend = new StringBuilder(100).append(this.b.getClass().getSimpleName()).append('{');
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            sbAppend.append((String) this.a.get(i));
            if (i < size - 1) {
                sbAppend.append(", ");
            }
        }
        return sbAppend.append('}').toString();
    }
}
