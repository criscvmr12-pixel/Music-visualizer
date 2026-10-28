package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class kq extends hz implements SafeParcelable, com.google.android.gms.plus.a.a.b {
    public static final na CREATOR = new na();
    private static final HashMap a = new HashMap();
    private final Set b;
    private final int c;
    private String d;
    private ko e;
    private String f;
    private ko g;
    private String h;

    static {
        a.put("id", hz.a.d("id", 2));
        a.put("result", hz.a.a("result", 4, ko.class));
        a.put("startDate", hz.a.d("startDate", 5));
        a.put("target", hz.a.a("target", 6, ko.class));
        a.put("type", hz.a.d("type", 7));
    }

    public kq() {
        this.c = 1;
        this.b = new HashSet();
    }

    kq(Set set, int i, String str, ko koVar, String str2, ko koVar2, String str3) {
        this.b = set;
        this.c = i;
        this.d = str;
        this.e = koVar;
        this.f = str2;
        this.g = koVar2;
        this.h = str3;
    }

    @Override // com.google.android.gms.internal.hz
    protected Object a(String str) {
        return null;
    }

    @Override // com.google.android.gms.internal.hz
    protected boolean a(hz.a aVar) {
        return this.b.contains(Integer.valueOf(aVar.g()));
    }

    @Override // com.google.android.gms.internal.hz
    protected Object b(hz.a aVar) {
        switch (aVar.g()) {
            case 2:
                return this.d;
            case 3:
            default:
                throw new IllegalStateException("Unknown safe parcelable id=" + aVar.g());
            case 4:
                return this.e;
            case 5:
                return this.f;
            case 6:
                return this.g;
            case 7:
                return this.h;
        }
    }

    @Override // com.google.android.gms.internal.hz
    public HashMap b() {
        return a;
    }

    @Override // com.google.android.gms.internal.hz
    protected boolean b(String str) {
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        na naVar = CREATOR;
        return 0;
    }

    Set e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof kq)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        kq kqVar = (kq) obj;
        for (hz.a aVar : a.values()) {
            if (a(aVar)) {
                if (kqVar.a(aVar) && b(aVar).equals(kqVar.b(aVar))) {
                }
                return false;
            }
            if (kqVar.a(aVar)) {
                return false;
            }
        }
        return true;
    }

    int f() {
        return this.c;
    }

    public String g() {
        return this.d;
    }

    ko h() {
        return this.e;
    }

    public int hashCode() {
        int iHashCode = 0;
        Iterator it = a.values().iterator();
        while (true) {
            int i = iHashCode;
            if (!it.hasNext()) {
                return i;
            }
            hz.a aVar = (hz.a) it.next();
            if (a(aVar)) {
                iHashCode = b(aVar).hashCode() + i + aVar.g();
            } else {
                iHashCode = i;
            }
        }
    }

    public String i() {
        return this.f;
    }

    ko j() {
        return this.g;
    }

    public String k() {
        return this.h;
    }

    @Override // com.google.android.gms.common.data.d
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public kq a() {
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        na naVar = CREATOR;
        na.a(this, parcel, i);
    }
}
