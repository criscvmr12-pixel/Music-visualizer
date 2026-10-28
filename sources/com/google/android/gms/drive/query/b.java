package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.query.internal.LogicalFilter;

/* JADX INFO: loaded from: classes.dex */
public class b implements Parcelable.Creator {
    static void a(Query query, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, query.d);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, (Parcelable) query.a, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, query.b, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, (Parcelable) query.c, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Query createFromParcel(Parcel parcel) {
        SortOrder sortOrder;
        String strO;
        LogicalFilter logicalFilter;
        int iG;
        SortOrder sortOrder2 = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        String str = null;
        LogicalFilter logicalFilter2 = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    iG = i;
                    String str2 = str;
                    logicalFilter = (LogicalFilter) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, LogicalFilter.CREATOR);
                    sortOrder = sortOrder2;
                    strO = str2;
                    break;
                case 3:
                    logicalFilter = logicalFilter2;
                    iG = i;
                    SortOrder sortOrder3 = sortOrder2;
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    sortOrder = sortOrder3;
                    break;
                case 4:
                    sortOrder = (SortOrder) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, SortOrder.CREATOR);
                    strO = str;
                    logicalFilter = logicalFilter2;
                    iG = i;
                    break;
                case 1000:
                    SortOrder sortOrder4 = sortOrder2;
                    strO = str;
                    logicalFilter = logicalFilter2;
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    sortOrder = sortOrder4;
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    sortOrder = sortOrder2;
                    strO = str;
                    logicalFilter = logicalFilter2;
                    iG = i;
                    break;
            }
            i = iG;
            logicalFilter2 = logicalFilter;
            str = strO;
            sortOrder2 = sortOrder;
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new Query(i, logicalFilter2, str, sortOrder2);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Query[] newArray(int i) {
        return new Query[i];
    }
}
