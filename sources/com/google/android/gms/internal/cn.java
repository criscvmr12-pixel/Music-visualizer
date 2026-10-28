package com.google.android.gms.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class cn {
    public static boolean a(Context context, cf cfVar, db dbVar) {
        if (cfVar == null) {
            hj.e("No intent data for launcher overlay.");
            return false;
        }
        Intent intent = new Intent();
        if (TextUtils.isEmpty(cfVar.c)) {
            hj.e("Open GMSG did not contain a URL.");
            return false;
        }
        if (TextUtils.isEmpty(cfVar.d)) {
            intent.setData(Uri.parse(cfVar.c));
        } else {
            intent.setDataAndType(Uri.parse(cfVar.c), cfVar.d);
        }
        intent.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(cfVar.e)) {
            intent.setPackage(cfVar.e);
        }
        if (!TextUtils.isEmpty(cfVar.f)) {
            String[] strArrSplit = cfVar.f.split("/", 2);
            if (strArrSplit.length < 2) {
                hj.e("Could not parse component name from open GMSG: " + cfVar.f);
                return false;
            }
            intent.setClassName(strArrSplit[0], strArrSplit[1]);
        }
        try {
            hj.d("Launching an intent: " + intent);
            context.startActivity(intent);
            dbVar.q();
            return true;
        } catch (ActivityNotFoundException e) {
            hj.e(e.getMessage());
            return false;
        }
    }
}
