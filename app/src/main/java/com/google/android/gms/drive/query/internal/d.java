package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class d implements Parcelable.Creator {
    static void a(FilterHolder filterHolder, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, (Parcelable) filterHolder.b, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, filterHolder.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, (Parcelable) filterHolder.c, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, (Parcelable) filterHolder.d, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, (Parcelable) filterHolder.e, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, (Parcelable) filterHolder.f, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, (Parcelable) filterHolder.g, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, (Parcelable) filterHolder.h, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public FilterHolder createFromParcel(Parcel parcel) {
        HasFilter hasFilter = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iG = 0;
        MatchAllFilter matchAllFilter = null;
        InFilter inFilter = null;
        NotFilter notFilter = null;
        LogicalFilter logicalFilter = null;
        FieldOnlyFilter fieldOnlyFilter = null;
        ComparisonFilter comparisonFilter = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    comparisonFilter = (ComparisonFilter) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, ComparisonFilter.CREATOR);
                    break;
                case 2:
                    fieldOnlyFilter = (FieldOnlyFilter) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, FieldOnlyFilter.CREATOR);
                    break;
                case 3:
                    logicalFilter = (LogicalFilter) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, LogicalFilter.CREATOR);
                    break;
                case 4:
                    notFilter = (NotFilter) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, NotFilter.CREATOR);
                    break;
                case 5:
                    inFilter = (InFilter) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, InFilter.CREATOR);
                    break;
                case 6:
                    matchAllFilter = (MatchAllFilter) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, MatchAllFilter.CREATOR);
                    break;
                case 7:
                    hasFilter = (HasFilter) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, HasFilter.CREATOR);
                    break;
                case 1000:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new FilterHolder(iG, comparisonFilter, fieldOnlyFilter, logicalFilter, notFilter, inFilter, matchAllFilter, hasFilter);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public FilterHolder[] newArray(int i) {
        return new FilterHolder[i];
    }
}
