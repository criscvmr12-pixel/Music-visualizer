package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class ak {
    private Date e;
    private String f;
    private Location h;
    private String j;
    private final HashSet a = new HashSet();
    private final Bundle b = new Bundle();
    private final HashMap c = new HashMap();
    private final HashSet d = new HashSet();
    private int g = -1;
    private boolean i = false;
    private int k = -1;

    public void a(int i) {
        this.g = i;
    }

    public void a(Class cls, Bundle bundle) {
        this.b.putBundle(cls.getName(), bundle);
    }

    public void a(String str) {
        this.a.add(str);
    }

    public void a(Date date) {
        this.e = date;
    }

    public void a(boolean z) {
        this.k = z ? 1 : 0;
    }

    public void b(String str) {
        this.d.add(str);
    }
}
