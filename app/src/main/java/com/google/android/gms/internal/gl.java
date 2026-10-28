package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public class gl {
    private final gn a;
    private final LinkedList b;
    private final Object c;
    private final String d;
    private final String e;
    private long f;
    private long g;
    private boolean h;
    private long i;
    private long j;
    private long k;
    private long l;

    public gl(gn gnVar, String str, String str2) {
        this.c = new Object();
        this.f = -1L;
        this.g = -1L;
        this.h = false;
        this.i = -1L;
        this.j = 0L;
        this.k = -1L;
        this.l = -1L;
        this.a = gnVar;
        this.d = str;
        this.e = str2;
        this.b = new LinkedList();
    }

    public gl(String str, String str2) {
        this(gn.a(), str, str2);
    }

    public void a() {
        synchronized (this.c) {
            if (this.l != -1 && this.g == -1) {
                this.g = SystemClock.elapsedRealtime();
                this.a.a(this);
            }
            gn gnVar = this.a;
            gn.d().c();
        }
    }

    public void a(long j) {
        synchronized (this.c) {
            this.l = j;
            if (this.l != -1) {
                this.a.a(this);
            }
        }
    }

    public void a(aj ajVar) {
        synchronized (this.c) {
            this.k = SystemClock.elapsedRealtime();
            gn gnVar = this.a;
            gn.d().a(ajVar, this.k);
        }
    }

    public void a(boolean z) {
        synchronized (this.c) {
            if (this.l != -1) {
                this.i = SystemClock.elapsedRealtime();
                if (!z) {
                    this.g = this.i;
                    this.a.a(this);
                }
            }
        }
    }

    public void b() {
        synchronized (this.c) {
            if (this.l != -1) {
                gm gmVar = new gm();
                gmVar.c();
                this.b.add(gmVar);
                this.j++;
                gn gnVar = this.a;
                gn.d().b();
                this.a.a(this);
            }
        }
    }

    public void b(long j) {
        synchronized (this.c) {
            if (this.l != -1) {
                this.f = j;
                this.a.a(this);
            }
        }
    }

    public void b(boolean z) {
        synchronized (this.c) {
            if (this.l != -1) {
                this.h = z;
                this.a.a(this);
            }
        }
    }

    public void c() {
        synchronized (this.c) {
            if (this.l != -1 && !this.b.isEmpty()) {
                gm gmVar = (gm) this.b.getLast();
                if (gmVar.a() == -1) {
                    gmVar.b();
                    this.a.a(this);
                }
            }
        }
    }

    public Bundle d() {
        Bundle bundle;
        synchronized (this.c) {
            bundle = new Bundle();
            bundle.putString("seqnum", this.d);
            bundle.putString("slotid", this.e);
            bundle.putBoolean("ismediation", this.h);
            bundle.putLong("treq", this.k);
            bundle.putLong("tresponse", this.l);
            bundle.putLong("timp", this.g);
            bundle.putLong("tload", this.i);
            bundle.putLong("pcc", this.j);
            bundle.putLong("tfetch", this.f);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                arrayList.add(((gm) it.next()).d());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }
}
