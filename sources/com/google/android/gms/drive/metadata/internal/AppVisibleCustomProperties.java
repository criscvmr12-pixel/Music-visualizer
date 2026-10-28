package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ky;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AppVisibleCustomProperties implements SafeParcelable, Iterable {
    public static final Parcelable.Creator CREATOR = new c();
    public static final AppVisibleCustomProperties a = new b().a();
    final int b;
    final List c;

    AppVisibleCustomProperties(int i, Collection collection) {
        this.b = i;
        ky.a(collection);
        this.c = new ArrayList(collection);
    }

    private AppVisibleCustomProperties(Collection collection) {
        this(1, collection);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.c.iterator();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        c.a(this, parcel, i);
    }
}
