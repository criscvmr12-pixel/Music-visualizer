package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ko extends hz implements SafeParcelable, com.google.android.gms.plus.a.a.a {
    public static final mz CREATOR = new mz();
    private static final HashMap a = new HashMap();
    private String A;
    private String B;
    private String C;
    private String D;
    private ko E;
    private String F;
    private String G;
    private String H;
    private String I;
    private ko J;
    private double K;
    private ko L;
    private double M;
    private String N;
    private ko O;
    private List P;
    private String Q;
    private String R;
    private String S;
    private String T;
    private ko U;
    private String V;
    private String W;
    private String X;
    private ko Y;
    private String Z;
    private String aa;
    private String ab;
    private String ac;
    private String ad;
    private String ae;
    private final Set b;
    private final int c;
    private ko d;
    private List e;
    private ko f;
    private String g;
    private String h;
    private String i;
    private List j;
    private int k;
    private List l;
    private ko m;
    private List n;
    private String o;
    private String p;
    private ko q;
    private String r;
    private String s;
    private String t;
    private List u;
    private String v;
    private String w;
    private String x;
    private String y;
    private String z;

    static {
        a.put("about", hz.a.a("about", 2, ko.class));
        a.put("additionalName", hz.a.e("additionalName", 3));
        a.put("address", hz.a.a("address", 4, ko.class));
        a.put("addressCountry", hz.a.d("addressCountry", 5));
        a.put("addressLocality", hz.a.d("addressLocality", 6));
        a.put("addressRegion", hz.a.d("addressRegion", 7));
        a.put("associated_media", hz.a.b("associated_media", 8, ko.class));
        a.put("attendeeCount", hz.a.a("attendeeCount", 9));
        a.put("attendees", hz.a.b("attendees", 10, ko.class));
        a.put("audio", hz.a.a("audio", 11, ko.class));
        a.put("author", hz.a.b("author", 12, ko.class));
        a.put("bestRating", hz.a.d("bestRating", 13));
        a.put("birthDate", hz.a.d("birthDate", 14));
        a.put("byArtist", hz.a.a("byArtist", 15, ko.class));
        a.put("caption", hz.a.d("caption", 16));
        a.put("contentSize", hz.a.d("contentSize", 17));
        a.put("contentUrl", hz.a.d("contentUrl", 18));
        a.put("contributor", hz.a.b("contributor", 19, ko.class));
        a.put("dateCreated", hz.a.d("dateCreated", 20));
        a.put("dateModified", hz.a.d("dateModified", 21));
        a.put("datePublished", hz.a.d("datePublished", 22));
        a.put("description", hz.a.d("description", 23));
        a.put("duration", hz.a.d("duration", 24));
        a.put("embedUrl", hz.a.d("embedUrl", 25));
        a.put("endDate", hz.a.d("endDate", 26));
        a.put("familyName", hz.a.d("familyName", 27));
        a.put("gender", hz.a.d("gender", 28));
        a.put("geo", hz.a.a("geo", 29, ko.class));
        a.put("givenName", hz.a.d("givenName", 30));
        a.put("height", hz.a.d("height", 31));
        a.put("id", hz.a.d("id", 32));
        a.put("image", hz.a.d("image", 33));
        a.put("inAlbum", hz.a.a("inAlbum", 34, ko.class));
        a.put("latitude", hz.a.b("latitude", 36));
        a.put("location", hz.a.a("location", 37, ko.class));
        a.put("longitude", hz.a.b("longitude", 38));
        a.put("name", hz.a.d("name", 39));
        a.put("partOfTVSeries", hz.a.a("partOfTVSeries", 40, ko.class));
        a.put("performers", hz.a.b("performers", 41, ko.class));
        a.put("playerType", hz.a.d("playerType", 42));
        a.put("postOfficeBoxNumber", hz.a.d("postOfficeBoxNumber", 43));
        a.put("postalCode", hz.a.d("postalCode", 44));
        a.put("ratingValue", hz.a.d("ratingValue", 45));
        a.put("reviewRating", hz.a.a("reviewRating", 46, ko.class));
        a.put("startDate", hz.a.d("startDate", 47));
        a.put("streetAddress", hz.a.d("streetAddress", 48));
        a.put("text", hz.a.d("text", 49));
        a.put("thumbnail", hz.a.a("thumbnail", 50, ko.class));
        a.put("thumbnailUrl", hz.a.d("thumbnailUrl", 51));
        a.put("tickerSymbol", hz.a.d("tickerSymbol", 52));
        a.put("type", hz.a.d("type", 53));
        a.put("url", hz.a.d("url", 54));
        a.put("width", hz.a.d("width", 55));
        a.put("worstRating", hz.a.d("worstRating", 56));
    }

    public ko() {
        this.c = 1;
        this.b = new HashSet();
    }

    ko(Set set, int i, ko koVar, List list, ko koVar2, String str, String str2, String str3, List list2, int i2, List list3, ko koVar3, List list4, String str4, String str5, ko koVar4, String str6, String str7, String str8, List list5, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, ko koVar5, String str18, String str19, String str20, String str21, ko koVar6, double d, ko koVar7, double d2, String str22, ko koVar8, List list6, String str23, String str24, String str25, String str26, ko koVar9, String str27, String str28, String str29, ko koVar10, String str30, String str31, String str32, String str33, String str34, String str35) {
        this.b = set;
        this.c = i;
        this.d = koVar;
        this.e = list;
        this.f = koVar2;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = list2;
        this.k = i2;
        this.l = list3;
        this.m = koVar3;
        this.n = list4;
        this.o = str4;
        this.p = str5;
        this.q = koVar4;
        this.r = str6;
        this.s = str7;
        this.t = str8;
        this.u = list5;
        this.v = str9;
        this.w = str10;
        this.x = str11;
        this.y = str12;
        this.z = str13;
        this.A = str14;
        this.B = str15;
        this.C = str16;
        this.D = str17;
        this.E = koVar5;
        this.F = str18;
        this.G = str19;
        this.H = str20;
        this.I = str21;
        this.J = koVar6;
        this.K = d;
        this.L = koVar7;
        this.M = d2;
        this.N = str22;
        this.O = koVar8;
        this.P = list6;
        this.Q = str23;
        this.R = str24;
        this.S = str25;
        this.T = str26;
        this.U = koVar9;
        this.V = str27;
        this.W = str28;
        this.X = str29;
        this.Y = koVar10;
        this.Z = str30;
        this.aa = str31;
        this.ab = str32;
        this.ac = str33;
        this.ad = str34;
        this.ae = str35;
    }

    public String A() {
        return this.x;
    }

    public String B() {
        return this.y;
    }

    public String C() {
        return this.z;
    }

    public String D() {
        return this.A;
    }

    public String E() {
        return this.B;
    }

    public String F() {
        return this.C;
    }

    public String G() {
        return this.D;
    }

    ko H() {
        return this.E;
    }

    public String I() {
        return this.F;
    }

    public String J() {
        return this.G;
    }

    public String K() {
        return this.H;
    }

    public String L() {
        return this.I;
    }

    ko M() {
        return this.J;
    }

    public double N() {
        return this.K;
    }

    ko O() {
        return this.L;
    }

    public double P() {
        return this.M;
    }

    public String Q() {
        return this.N;
    }

    ko R() {
        return this.O;
    }

    List S() {
        return this.P;
    }

    public String T() {
        return this.Q;
    }

    public String U() {
        return this.R;
    }

    public String V() {
        return this.S;
    }

    public String W() {
        return this.T;
    }

    ko X() {
        return this.U;
    }

    public String Y() {
        return this.V;
    }

    public String Z() {
        return this.W;
    }

    @Override // com.google.android.gms.internal.hz
    protected Object a(String str) {
        return null;
    }

    @Override // com.google.android.gms.internal.hz
    protected boolean a(hz.a aVar) {
        return this.b.contains(Integer.valueOf(aVar.g()));
    }

    public String aa() {
        return this.X;
    }

    ko ab() {
        return this.Y;
    }

    public String ac() {
        return this.Z;
    }

    public String ad() {
        return this.aa;
    }

    public String ae() {
        return this.ab;
    }

    public String af() {
        return this.ac;
    }

    public String ag() {
        return this.ad;
    }

    public String ah() {
        return this.ae;
    }

    @Override // com.google.android.gms.common.data.d
    /* JADX INFO: renamed from: ai, reason: merged with bridge method [inline-methods] */
    public ko a() {
        return this;
    }

    @Override // com.google.android.gms.internal.hz
    protected Object b(hz.a aVar) {
        switch (aVar.g()) {
            case 2:
                return this.d;
            case 3:
                return this.e;
            case 4:
                return this.f;
            case 5:
                return this.g;
            case 6:
                return this.h;
            case 7:
                return this.i;
            case 8:
                return this.j;
            case 9:
                return Integer.valueOf(this.k);
            case 10:
                return this.l;
            case com.google.android.gms.c.MapAttrs_uiZoomGestures /* 11 */:
                return this.m;
            case com.google.android.gms.c.MapAttrs_useViewLifecycle /* 12 */:
                return this.n;
            case com.google.android.gms.c.MapAttrs_zOrderOnTop /* 13 */:
                return this.o;
            case 14:
                return this.p;
            case 15:
                return this.q;
            case 16:
                return this.r;
            case 17:
                return this.s;
            case 18:
                return this.t;
            case 19:
                return this.u;
            case 20:
                return this.v;
            case 21:
                return this.w;
            case 22:
                return this.x;
            case 23:
                return this.y;
            case 24:
                return this.z;
            case 25:
                return this.A;
            case 26:
                return this.B;
            case 27:
                return this.C;
            case 28:
                return this.D;
            case 29:
                return this.E;
            case 30:
                return this.F;
            case 31:
                return this.G;
            case 32:
                return this.H;
            case 33:
                return this.I;
            case 34:
                return this.J;
            case 35:
            default:
                throw new IllegalStateException("Unknown safe parcelable id=" + aVar.g());
            case 36:
                return Double.valueOf(this.K);
            case 37:
                return this.L;
            case 38:
                return Double.valueOf(this.M);
            case 39:
                return this.N;
            case 40:
                return this.O;
            case 41:
                return this.P;
            case 42:
                return this.Q;
            case 43:
                return this.R;
            case 44:
                return this.S;
            case 45:
                return this.T;
            case 46:
                return this.U;
            case 47:
                return this.V;
            case 48:
                return this.W;
            case 49:
                return this.X;
            case 50:
                return this.Y;
            case 51:
                return this.Z;
            case 52:
                return this.aa;
            case 53:
                return this.ab;
            case 54:
                return this.ac;
            case 55:
                return this.ad;
            case 56:
                return this.ae;
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
        mz mzVar = CREATOR;
        return 0;
    }

    Set e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ko)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ko koVar = (ko) obj;
        for (hz.a aVar : a.values()) {
            if (a(aVar)) {
                if (koVar.a(aVar) && b(aVar).equals(koVar.b(aVar))) {
                }
                return false;
            }
            if (koVar.a(aVar)) {
                return false;
            }
        }
        return true;
    }

    int f() {
        return this.c;
    }

    ko g() {
        return this.d;
    }

    public List h() {
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

    ko i() {
        return this.f;
    }

    public String j() {
        return this.g;
    }

    public String k() {
        return this.h;
    }

    public String l() {
        return this.i;
    }

    List m() {
        return this.j;
    }

    public int n() {
        return this.k;
    }

    List o() {
        return this.l;
    }

    ko p() {
        return this.m;
    }

    List q() {
        return this.n;
    }

    public String r() {
        return this.o;
    }

    public String s() {
        return this.p;
    }

    ko t() {
        return this.q;
    }

    public String u() {
        return this.r;
    }

    public String v() {
        return this.s;
    }

    public String w() {
        return this.t;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        mz mzVar = CREATOR;
        mz.a(this, parcel, i);
    }

    List x() {
        return this.u;
    }

    public String y() {
        return this.v;
    }

    public String z() {
        return this.w;
    }
}
