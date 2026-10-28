package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class dk implements Parcelable.Creator {
    static void a(cr crVar, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, crVar.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, crVar.a(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, crVar.b(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, crVar.c(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, crVar.d(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public cr createFromParcel(Parcel parcel) {
        IBinder iBinderP = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iG = 0;
        IBinder iBinderP2 = null;
        IBinder iBinderP3 = null;
        IBinder iBinderP4 = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 2:
                    iBinderP4 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, iA);
                    break;
                case 3:
                    iBinderP3 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, iA);
                    break;
                case 4:
                    iBinderP2 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, iA);
                    break;
                case 5:
                    iBinderP = com.google.android.gms.common.internal.safeparcel.a.p(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new cr(iG, iBinderP4, iBinderP3, iBinderP2, iBinderP);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public cr[] newArray(int i) {
        return new cr[i];
    }
}
