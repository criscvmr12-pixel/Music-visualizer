package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.metadata.CustomPropertyKey;

/* JADX INFO: loaded from: classes.dex */
public class e implements Parcelable.Creator {
    static void a(CustomProperty customProperty, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, customProperty.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, (Parcelable) customProperty.b, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, customProperty.c, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public CustomProperty createFromParcel(Parcel parcel) {
        String strO;
        CustomPropertyKey customPropertyKey;
        int iG;
        String str = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        CustomPropertyKey customPropertyKey2 = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case 1:
                    String str2 = str;
                    customPropertyKey = customPropertyKey2;
                    iG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    strO = str2;
                    break;
                case 2:
                    CustomPropertyKey customPropertyKey3 = (CustomPropertyKey) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, CustomPropertyKey.CREATOR);
                    iG = i;
                    strO = str;
                    customPropertyKey = customPropertyKey3;
                    break;
                case 3:
                    strO = com.google.android.gms.common.internal.safeparcel.a.o(parcel, iA);
                    customPropertyKey = customPropertyKey2;
                    iG = i;
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    strO = str;
                    customPropertyKey = customPropertyKey2;
                    iG = i;
                    break;
            }
            i = iG;
            customPropertyKey2 = customPropertyKey;
            str = strO;
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new CustomProperty(i, customPropertyKey2, str);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public CustomProperty[] newArray(int i) {
        return new CustomProperty[i];
    }
}
