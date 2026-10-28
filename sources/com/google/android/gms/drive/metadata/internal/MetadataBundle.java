package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ku;
import com.google.android.gms.internal.ky;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class MetadataBundle implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new j();
    final int a;
    final Bundle b;

    MetadataBundle(int i, Bundle bundle) {
        this.a = i;
        this.b = (Bundle) ky.a(bundle);
        this.b.setClassLoader(getClass().getClassLoader());
        ArrayList arrayList = new ArrayList();
        for (String str : this.b.keySet()) {
            if (g.a(str) == null) {
                arrayList.add(str);
                Log.w("MetadataBundle", "Ignored unknown metadata field in bundle: " + str);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.b.remove((String) it.next());
        }
    }

    public Set a() {
        HashSet hashSet = new HashSet();
        Iterator<String> it = this.b.keySet().iterator();
        while (it.hasNext()) {
            hashSet.add(g.a(it.next()));
        }
        return hashSet;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetadataBundle)) {
            return false;
        }
        MetadataBundle metadataBundle = (MetadataBundle) obj;
        Set<String> setKeySet = this.b.keySet();
        if (!setKeySet.equals(metadataBundle.b.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            if (!ku.a(this.b.get(str), metadataBundle.b.get(str))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int iHashCode = 1;
        Iterator<String> it = this.b.keySet().iterator();
        while (true) {
            int i = iHashCode;
            if (!it.hasNext()) {
                return i;
            }
            iHashCode = this.b.get(it.next()).hashCode() + (i * 31);
        }
    }

    public String toString() {
        return "MetadataBundle [values=" + this.b + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        j.a(this, parcel, i);
    }
}
