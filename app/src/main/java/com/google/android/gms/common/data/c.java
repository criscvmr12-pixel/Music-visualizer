package com.google.android.gms.common.data;

import com.google.android.gms.internal.ky;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class c {
    private final String[] a;
    private final ArrayList b;
    private final String c;
    private final HashMap d;
    private boolean e;
    private String f;

    private c(String[] strArr, String str) {
        this.a = (String[]) ky.a(strArr);
        this.b = new ArrayList();
        this.c = str;
        this.d = new HashMap();
        this.e = false;
        this.f = null;
    }

    /* synthetic */ c(String[] strArr, String str, b bVar) {
        this(strArr, str);
    }
}
