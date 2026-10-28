package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class hw implements SafeParcelable, le {
    public static final lc CREATOR = new lc();
    private final int a;
    private final HashMap b;
    private final HashMap c;
    private final ArrayList d;

    public final class a implements SafeParcelable {
        public static final ld CREATOR = new ld();
        final int a;
        final String b;
        final int c;

        a(int i, String str, int i2) {
            this.a = i;
            this.b = str;
            this.c = i2;
        }

        a(String str, int i) {
            this.a = 1;
            this.b = str;
            this.c = i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            ld ldVar = CREATOR;
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            ld ldVar = CREATOR;
            ld.a(this, parcel, i);
        }
    }

    public hw() {
        this.a = 1;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = null;
    }

    hw(int i, ArrayList arrayList) {
        this.a = i;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = null;
        a(arrayList);
    }

    private void a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            a(aVar.b, aVar.c);
        }
    }

    int a() {
        return this.a;
    }

    public hw a(String str, int i) {
        this.b.put(str, Integer.valueOf(i));
        this.c.put(Integer.valueOf(i), str);
        return this;
    }

    @Override // com.google.android.gms.internal.le
    public String a(Integer num) {
        String str = (String) this.c.get(num);
        return (str == null && this.b.containsKey("gms_unknown")) ? "gms_unknown" : str;
    }

    ArrayList b() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.b.keySet()) {
            arrayList.add(new a(str, ((Integer) this.b.get(str)).intValue()));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.le
    public int c() {
        return 7;
    }

    @Override // com.google.android.gms.internal.le
    public int d() {
        return 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        lc lcVar = CREATOR;
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        lc lcVar = CREATOR;
        lc.a(this, parcel, i);
    }
}
