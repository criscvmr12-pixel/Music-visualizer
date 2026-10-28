package com.google.android.gms.drive.metadata;

import com.google.android.gms.internal.ky;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class f implements a {
    private final String a;
    private final Set b;
    private final Set c;
    private final int d;

    protected f(String str, int i) {
        this.a = (String) ky.a(str, "fieldName");
        this.b = Collections.singleton(str);
        this.c = Collections.emptySet();
        this.d = i;
    }

    protected f(String str, Collection collection, Collection collection2, int i) {
        this.a = (String) ky.a(str, "fieldName");
        this.b = Collections.unmodifiableSet(new HashSet(collection));
        this.c = Collections.unmodifiableSet(new HashSet(collection2));
        this.d = i;
    }

    @Override // com.google.android.gms.drive.metadata.a
    public final String a() {
        return this.a;
    }

    public String toString() {
        return this.a;
    }
}
