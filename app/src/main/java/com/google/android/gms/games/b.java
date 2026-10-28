package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class b implements Parcelable.Creator {
    static void a(GameEntity gameEntity, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, gameEntity.a_(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, gameEntity.c(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, gameEntity.d(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, gameEntity.e(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, gameEntity.f(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, gameEntity.g(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, (Parcelable) gameEntity.h(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, (Parcelable) gameEntity.j(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, (Parcelable) gameEntity.l(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 10, gameEntity.n());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 11, gameEntity.q());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 12, gameEntity.r(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 13, gameEntity.s());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 14, gameEntity.t());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 15, gameEntity.u());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 17, gameEntity.w());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 16, gameEntity.v());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, gameEntity.y());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 19, gameEntity.k(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 18, gameEntity.i(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 21, gameEntity.o());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 20, gameEntity.m(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 23, gameEntity.x());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 22, gameEntity.p());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public GameEntity createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iG = 0;
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        String strO4 = null;
        String strO5 = null;
        String strO6 = null;
        Uri uri = null;
        Uri uri2 = null;
        Uri uri3 = null;
        boolean zC = false;
        boolean zC2 = false;
        String strO7 = null;
        int iG2 = 0;
        int iG3 = 0;
        int iG4 = 0;
        boolean zC3 = false;
        boolean zC4 = false;
        String strO8 = null;
        String strO9 = null;
        String strO10 = null;
        boolean zC5 = false;
        boolean zC6 = false;
        boolean zC7 = false;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 2:
                    strO2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 3:
                    strO3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 4:
                    strO4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 5:
                    strO5 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 6:
                    strO6 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 7:
                    uri = (Uri) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, Uri.CREATOR);
                    break;
                case 8:
                    uri2 = (Uri) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, Uri.CREATOR);
                    break;
                case 9:
                    uri3 = (Uri) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, Uri.CREATOR);
                    break;
                case 10:
                    zC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case com.google.android.gms.c.MapAttrs_uiZoomGestures /* 11 */:
                    zC2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case com.google.android.gms.c.MapAttrs_useViewLifecycle /* 12 */:
                    strO7 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case com.google.android.gms.c.MapAttrs_zOrderOnTop /* 13 */:
                    iG2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 14:
                    iG3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 15:
                    iG4 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case 16:
                    zC3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case 17:
                    zC4 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case 18:
                    strO8 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 19:
                    strO9 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 20:
                    strO10 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    break;
                case 21:
                    zC5 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case 22:
                    zC6 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case 23:
                    zC7 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
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
        return new GameEntity(iG, strO, strO2, strO3, strO4, strO5, strO6, uri, uri2, uri3, zC, zC2, strO7, iG2, iG3, iG4, zC3, zC4, strO8, strO9, strO10, zC5, zC6, zC7);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public GameEntity[] newArray(int i) {
        return new GameEntity[i];
    }
}
