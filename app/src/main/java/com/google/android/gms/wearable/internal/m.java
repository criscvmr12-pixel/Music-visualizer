package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class m implements SafeParcelable, com.google.android.gms.wearable.a {
    public static final Parcelable.Creator CREATOR = new q();
    final int a;
    private final Uri b;
    private final Map c;
    private byte[] d;

    m(int i, Uri uri, Bundle bundle, byte[] bArr) {
        this.a = i;
        this.b = uri;
        HashMap map = new HashMap();
        bundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        for (String str : bundle.keySet()) {
            map.put(str, (DataItemAssetParcelable) bundle.getParcelable(str));
        }
        this.c = map;
        this.d = bArr;
    }

    public String a(boolean z) {
        StringBuilder sb = new StringBuilder("DataItemParcelable[");
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(",dataSz=" + (this.d == null ? "null" : Integer.valueOf(this.d.length)));
        sb.append(", numAssets=" + this.c.size());
        sb.append(", uri=" + this.b);
        if (!z) {
            sb.append("]");
            return sb.toString();
        }
        sb.append("]\n  assets: ");
        for (String str : this.c.keySet()) {
            sb.append("\n    " + str + ": " + this.c.get(str));
        }
        sb.append("\n  ]");
        return sb.toString();
    }

    @Override // com.google.android.gms.common.data.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m a() {
        return this;
    }

    public Uri c() {
        return this.b;
    }

    public byte[] d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        for (Map.Entry entry : this.c.entrySet()) {
            bundle.putParcelable((String) entry.getKey(), new DataItemAssetParcelable((com.google.android.gms.wearable.b) entry.getValue()));
        }
        return bundle;
    }

    public String toString() {
        return a(Log.isLoggable("DataItem", 3));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        q.a(this, parcel, i);
    }
}
