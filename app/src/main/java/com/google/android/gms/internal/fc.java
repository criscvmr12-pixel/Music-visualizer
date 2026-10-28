package com.google.android.gms.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class fc {
    public static gs a(Context context, dt dtVar, fd fdVar) {
        return dtVar.k.e ? b(context, dtVar, fdVar) : c(context, dtVar, fdVar);
    }

    private static gs b(Context context, dt dtVar, fd fdVar) {
        hj.a("Fetching ad response from local ad request service.");
        fg fgVar = new fg(context, dtVar, fdVar);
        fgVar.e();
        return fgVar;
    }

    private static gs c(Context context, dt dtVar, fd fdVar) {
        hj.a("Fetching ad response from remote ad request service.");
        if (com.google.android.gms.common.g.a(context) == 0) {
            return new fi(context, dtVar, fdVar);
        }
        hj.e("Failed to connect to remote ad request service.");
        return null;
    }
}
