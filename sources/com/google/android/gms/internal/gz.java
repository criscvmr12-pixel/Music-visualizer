package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gz {

    public final class a implements SafeParcelable {
        public static final kx CREATOR = new kx();
        private final int a;
        private final String b;
        private final List c = new ArrayList();
        private final int d;
        private final String e;

        a(int i, String str, List list, int i2, String str2) {
            this.a = i;
            this.b = str;
            this.c.addAll(list);
            this.d = i2;
            this.e = str2;
        }

        public String a() {
            return this.b;
        }

        public int b() {
            return this.d;
        }

        public String c() {
            return this.e;
        }

        public List d() {
            return new ArrayList(this.c);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public int e() {
            return this.a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            kx.a(this, parcel, i);
        }
    }
}
