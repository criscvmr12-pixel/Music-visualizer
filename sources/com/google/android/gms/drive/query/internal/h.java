package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class h implements Parcelable.Creator {
    static void a(LogicalFilter logicalFilter, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, logicalFilter.c);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, (Parcelable) logicalFilter.a, i, false);
        com.google.android.gms.common.internal.safeparcel.c.b(parcel, 2, logicalFilter.b, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public LogicalFilter createFromParcel(Parcel parcel) {
        ArrayList arrayListC;
        Operator operator;
        int iG;
        ArrayList arrayList = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        Operator operator2 = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    Operator operator3 = (Operator) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, Operator.CREATOR);
                    iG = i;
                    arrayListC = arrayList;
                    operator = operator3;
                    break;
                case 2:
                    arrayListC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, FilterHolder.CREATOR);
                    operator = operator2;
                    iG = i;
                    break;
                case 1000:
                    ArrayList arrayList2 = arrayList;
                    operator = operator2;
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    arrayListC = arrayList2;
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    arrayListC = arrayList;
                    operator = operator2;
                    iG = i;
                    break;
            }
            i = iG;
            operator2 = operator;
            arrayList = arrayListC;
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new LogicalFilter(i, operator2, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public LogicalFilter[] newArray(int i) {
        return new LogicalFilter[i];
    }
}
