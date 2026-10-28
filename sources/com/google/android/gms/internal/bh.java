package com.google.android.gms.internal;

import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bh implements bc {
    private static int a(DisplayMetrics displayMetrics, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 == null) {
            return i;
        }
        try {
            return hi.a(displayMetrics, Integer.parseInt(str2));
        } catch (NumberFormatException e) {
            hj.e("Could not parse " + str + " in a video GMSG: " + str2);
            return i;
        }
    }

    @Override // com.google.android.gms.internal.bc
    public void a(hl hlVar, Map map) {
        String str = (String) map.get("action");
        if (str == null) {
            hj.e("Action missing from video GMSG.");
            return;
        }
        cp cpVarD = hlVar.d();
        if (cpVarD == null) {
            hj.e("Could not get ad overlay for a video GMSG.");
            return;
        }
        boolean zEqualsIgnoreCase = "new".equalsIgnoreCase(str);
        boolean zEqualsIgnoreCase2 = "position".equalsIgnoreCase(str);
        if (zEqualsIgnoreCase || zEqualsIgnoreCase2) {
            DisplayMetrics displayMetrics = hlVar.getContext().getResources().getDisplayMetrics();
            int iA = a(displayMetrics, map, "x", 0);
            int iA2 = a(displayMetrics, map, "y", 0);
            int iA3 = a(displayMetrics, map, "w", -1);
            int iA4 = a(displayMetrics, map, "h", -1);
            if (zEqualsIgnoreCase && cpVarD.b() == null) {
                cpVarD.b(iA, iA2, iA3, iA4);
                return;
            } else {
                cpVarD.a(iA, iA2, iA3, iA4);
                return;
            }
        }
        cx cxVarB = cpVarD.b();
        if (cxVarB == null) {
            cx.a(hlVar, "no_video_view", (String) null);
            return;
        }
        if ("click".equalsIgnoreCase(str)) {
            DisplayMetrics displayMetrics2 = hlVar.getContext().getResources().getDisplayMetrics();
            int iA5 = a(displayMetrics2, map, "x", 0);
            int iA6 = a(displayMetrics2, map, "y", 0);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, iA5, iA6, 0);
            cxVarB.a(motionEventObtain);
            motionEventObtain.recycle();
            return;
        }
        if ("controls".equalsIgnoreCase(str)) {
            String str2 = (String) map.get("enabled");
            if (str2 == null) {
                hj.e("Enabled parameter missing from controls video GMSG.");
                return;
            } else {
                cxVarB.a(Boolean.parseBoolean(str2));
                return;
            }
        }
        if ("currentTime".equalsIgnoreCase(str)) {
            String str3 = (String) map.get("time");
            if (str3 == null) {
                hj.e("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                cxVarB.a((int) (Float.parseFloat(str3) * 1000.0f));
                return;
            } catch (NumberFormatException e) {
                hj.e("Could not parse time parameter from currentTime video GMSG: " + str3);
                return;
            }
        }
        if ("hide".equalsIgnoreCase(str)) {
            cxVarB.setVisibility(4);
            return;
        }
        if ("load".equalsIgnoreCase(str)) {
            cxVarB.b();
            return;
        }
        if ("pause".equalsIgnoreCase(str)) {
            cxVarB.c();
            return;
        }
        if ("play".equalsIgnoreCase(str)) {
            cxVarB.d();
            return;
        }
        if ("show".equalsIgnoreCase(str)) {
            cxVarB.setVisibility(0);
        } else if ("src".equalsIgnoreCase(str)) {
            cxVarB.a((String) map.get("src"));
        } else {
            hj.e("Unknown video action: " + str);
        }
    }
}
