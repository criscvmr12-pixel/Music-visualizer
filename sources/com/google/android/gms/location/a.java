package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class a implements Parcelable.Creator {
    static void a(ActivityRecognitionResult activityRecognitionResult, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.b(parcel, 1, activityRecognitionResult.a, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, activityRecognitionResult.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, activityRecognitionResult.b);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, activityRecognitionResult.c);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ActivityRecognitionResult createFromParcel(Parcel parcel) {
        long jI = 0;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iG = 0;
        ArrayList arrayListC = null;
        long jI2 = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    arrayListC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, DetectedActivity.CREATOR);
                    break;
                case 2:
                    jI2 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case 3:
                    jI = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
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
        return new ActivityRecognitionResult(iG, arrayListC, jI2, jI);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ActivityRecognitionResult[] newArray(int i) {
        return new ActivityRecognitionResult[i];
    }
}
