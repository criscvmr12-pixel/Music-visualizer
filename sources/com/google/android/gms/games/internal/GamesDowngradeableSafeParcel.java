package com.google.android.gms.games.internal;

import com.google.android.gms.internal.hb;
import com.google.android.gms.internal.lq;

/* JADX INFO: loaded from: classes.dex */
public abstract class GamesDowngradeableSafeParcel extends hb {
    protected static boolean b(Integer num) {
        if (num == null) {
            return false;
        }
        return lq.a(num.intValue());
    }
}
