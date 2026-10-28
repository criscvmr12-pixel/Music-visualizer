package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ky;

/* JADX INFO: loaded from: classes.dex */
public class DataItemAssetParcelable implements SafeParcelable, com.google.android.gms.wearable.b {
    public static final Parcelable.Creator CREATOR = new o();
    final int a;
    private final String b;
    private final String c;

    DataItemAssetParcelable(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public DataItemAssetParcelable(com.google.android.gms.wearable.b bVar) {
        this.a = 1;
        this.b = (String) ky.a((Object) bVar.b());
        this.c = (String) ky.a((Object) bVar.c());
    }

    @Override // com.google.android.gms.wearable.b
    public String b() {
        return this.b;
    }

    @Override // com.google.android.gms.wearable.b
    public String c() {
        return this.c;
    }

    @Override // com.google.android.gms.common.data.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public com.google.android.gms.wearable.b a() {
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DataItemAssetParcelable[");
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        if (this.b == null) {
            sb.append(",noid");
        } else {
            sb.append(",");
            sb.append(this.b);
        }
        sb.append(", key=");
        sb.append(this.c);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.a(this, parcel, i);
    }
}
