package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public final class u {
    private final com.google.android.gms.ads.e[] a;
    private final String b;

    public u(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, com.google.android.gms.c.AdsAttrs);
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(1);
        boolean z = !TextUtils.isEmpty(string);
        boolean z2 = TextUtils.isEmpty(string2) ? false : true;
        if (z && !z2) {
            this.a = a(string);
        } else {
            if (z || !z2) {
                if (!z || !z2) {
                    throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
                }
                throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
            }
            this.a = a(string2);
        }
        this.b = typedArrayObtainAttributes.getString(2);
        if (TextUtils.isEmpty(this.b)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    private static com.google.android.gms.ads.e[] a(String str) {
        String[] strArrSplit = str.split("\\s*,\\s*");
        com.google.android.gms.ads.e[] eVarArr = new com.google.android.gms.ads.e[strArrSplit.length];
        for (int i = 0; i < strArrSplit.length; i++) {
            String strTrim = strArrSplit[i].trim();
            if (strTrim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] strArrSplit2 = strTrim.split("[xX]");
                strArrSplit2[0] = strArrSplit2[0].trim();
                strArrSplit2[1] = strArrSplit2[1].trim();
                try {
                    eVarArr[i] = new com.google.android.gms.ads.e("FULL_WIDTH".equals(strArrSplit2[0]) ? -1 : Integer.parseInt(strArrSplit2[0]), "AUTO_HEIGHT".equals(strArrSplit2[1]) ? -2 : Integer.parseInt(strArrSplit2[1]));
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": " + strTrim);
                }
            } else if ("BANNER".equals(strTrim)) {
                eVarArr[i] = com.google.android.gms.ads.e.a;
            } else if ("LARGE_BANNER".equals(strTrim)) {
                eVarArr[i] = com.google.android.gms.ads.e.c;
            } else if ("FULL_BANNER".equals(strTrim)) {
                eVarArr[i] = com.google.android.gms.ads.e.b;
            } else if ("LEADERBOARD".equals(strTrim)) {
                eVarArr[i] = com.google.android.gms.ads.e.d;
            } else if ("MEDIUM_RECTANGLE".equals(strTrim)) {
                eVarArr[i] = com.google.android.gms.ads.e.e;
            } else if ("SMART_BANNER".equals(strTrim)) {
                eVarArr[i] = com.google.android.gms.ads.e.g;
            } else {
                if (!"WIDE_SKYSCRAPER".equals(strTrim)) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": " + strTrim);
                }
                eVarArr[i] = com.google.android.gms.ads.e.f;
            }
        }
        if (eVarArr.length == 0) {
            throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": " + str);
        }
        return eVarArr;
    }

    public String a() {
        return this.b;
    }

    public com.google.android.gms.ads.e[] a(boolean z) {
        if (z || this.a.length == 1) {
            return this.a;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }
}
