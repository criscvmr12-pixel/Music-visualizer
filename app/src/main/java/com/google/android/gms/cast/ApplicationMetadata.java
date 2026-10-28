package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jg;
import com.google.android.gms.internal.ku;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ApplicationMetadata implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new a();
    String a;
    String b;
    List c;
    List d;
    String e;
    Uri f;
    private final int g;

    private ApplicationMetadata() {
        this.g = 1;
        this.c = new ArrayList();
        this.d = new ArrayList();
    }

    ApplicationMetadata(int i, String str, String str2, List list, List list2, String str3, Uri uri) {
        this.g = i;
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = list2;
        this.e = str3;
        this.f = uri;
    }

    int a() {
        return this.g;
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Uri e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApplicationMetadata)) {
            return false;
        }
        ApplicationMetadata applicationMetadata = (ApplicationMetadata) obj;
        return jg.a(this.a, applicationMetadata.a) && jg.a(this.c, applicationMetadata.c) && jg.a(this.b, applicationMetadata.b) && jg.a(this.d, applicationMetadata.d) && jg.a(this.e, applicationMetadata.e) && jg.a(this.f, applicationMetadata.f);
    }

    public List f() {
        return this.c;
    }

    public int hashCode() {
        return ku.a(Integer.valueOf(this.g), this.a, this.b, this.c, this.d, this.e, this.f);
    }

    public String toString() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel, i);
    }
}
