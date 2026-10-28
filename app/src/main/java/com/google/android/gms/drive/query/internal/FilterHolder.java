package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public class FilterHolder implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new d();
    final int a;
    final ComparisonFilter b;
    final FieldOnlyFilter c;
    final LogicalFilter d;
    final NotFilter e;
    final InFilter f;
    final MatchAllFilter g;
    final HasFilter h;
    private final com.google.android.gms.drive.query.a i;

    FilterHolder(int i, ComparisonFilter comparisonFilter, FieldOnlyFilter fieldOnlyFilter, LogicalFilter logicalFilter, NotFilter notFilter, InFilter inFilter, MatchAllFilter matchAllFilter, HasFilter hasFilter) {
        this.a = i;
        this.b = comparisonFilter;
        this.c = fieldOnlyFilter;
        this.d = logicalFilter;
        this.e = notFilter;
        this.f = inFilter;
        this.g = matchAllFilter;
        this.h = hasFilter;
        if (this.b != null) {
            this.i = this.b;
            return;
        }
        if (this.c != null) {
            this.i = this.c;
            return;
        }
        if (this.d != null) {
            this.i = this.d;
            return;
        }
        if (this.e != null) {
            this.i = this.e;
            return;
        }
        if (this.f != null) {
            this.i = this.f;
        } else if (this.g != null) {
            this.i = this.g;
        } else {
            if (this.h == null) {
                throw new IllegalArgumentException("At least one filter must be set.");
            }
            this.i = this.h;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        d.a(this, parcel, i);
    }
}
