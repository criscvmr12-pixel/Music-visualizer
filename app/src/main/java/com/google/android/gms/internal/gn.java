package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class gn {
    private static final gn c = new gn();
    public static final String a = c.b;
    private final Object d = new Object();
    private BigInteger f = BigInteger.ONE;
    private final HashSet g = new HashSet();
    private final HashMap h = new HashMap();
    private boolean i = false;
    public final String b = gx.d();
    private final go e = new go(this.b);

    private gn() {
    }

    public static Bundle a(Context context, gp gpVar, String str) {
        return c.b(context, gpVar, str);
    }

    public static gn a() {
        return c;
    }

    public static void a(HashSet hashSet) {
        c.b(hashSet);
    }

    public static String b() {
        return c.c();
    }

    public static go d() {
        return c.e();
    }

    public static boolean f() {
        return c.g();
    }

    public void a(gl glVar) {
        synchronized (this.d) {
            this.g.add(glVar);
        }
    }

    public void a(String str, gq gqVar) {
        synchronized (this.d) {
            this.h.put(str, gqVar);
        }
    }

    public Bundle b(Context context, gp gpVar, String str) {
        Bundle bundle;
        synchronized (this.d) {
            bundle = new Bundle();
            bundle.putBundle("app", this.e.a(context, str));
            Bundle bundle2 = new Bundle();
            for (String str2 : this.h.keySet()) {
                bundle2.putBundle(str2, ((gq) this.h.get(str2)).a());
            }
            bundle.putBundle("slots", bundle2);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                arrayList.add(((gl) it.next()).d());
            }
            bundle.putParcelableArrayList("ads", arrayList);
            gpVar.a(this.g);
            this.g.clear();
        }
        return bundle;
    }

    public void b(HashSet hashSet) {
        synchronized (this.d) {
            this.g.addAll(hashSet);
        }
    }

    public String c() {
        String string;
        synchronized (this.d) {
            string = this.f.toString();
            this.f = this.f.add(BigInteger.ONE);
        }
        return string;
    }

    public go e() {
        go goVar;
        synchronized (this.d) {
            goVar = this.e;
        }
        return goVar;
    }

    public boolean g() {
        boolean z;
        synchronized (this.d) {
            z = this.i;
            this.i = true;
        }
        return z;
    }
}
