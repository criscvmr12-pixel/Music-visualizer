package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ku;

/* JADX INFO: loaded from: classes.dex */
public class b implements SafeParcelable {
    public static final e CREATOR = new e();
    int a;
    int b;
    long c;
    private final int d;

    b(int i, int i2, int i3, long j) {
        this.d = i;
        this.a = i2;
        this.b = i3;
        this.c = j;
    }

    private String a(int i) {
        switch (i) {
            case 0:
                return "STATUS_SUCCESSFUL";
            case 1:
            default:
                return "STATUS_UNKNOWN";
            case 2:
                return "STATUS_TIMED_OUT_ON_SCAN";
            case 3:
                return "STATUS_NO_INFO_IN_DATABASE";
            case 4:
                return "STATUS_INVALID_SCAN";
            case 5:
                return "STATUS_UNABLE_TO_QUERY_DATABASE";
            case 6:
                return "STATUS_SCANS_DISABLED_IN_SETTINGS";
            case 7:
                return "STATUS_LOCATION_DISABLED_IN_SETTINGS";
            case 8:
                return "STATUS_IN_PROGRESS";
        }
    }

    int a() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c;
    }

    public int hashCode() {
        return ku.a(Integer.valueOf(this.a), Integer.valueOf(this.b), Long.valueOf(this.c));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LocationStatus[cell status: ").append(a(this.a));
        sb.append(", wifi status: ").append(a(this.b));
        sb.append(", elapsed realtime ns: ").append(this.c);
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        e.a(this, parcel, i);
    }
}
