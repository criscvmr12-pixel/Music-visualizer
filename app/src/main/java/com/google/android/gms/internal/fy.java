package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Color;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class fy {
    private static final SimpleDateFormat a = new SimpleDateFormat("yyyyMMdd");

    public static dv a(Context context, dt dtVar, String str) {
        dv dvVar;
        List list;
        List list2;
        List list3;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("ad_base_url", null);
            String strOptString2 = jSONObject.optString("ad_url", null);
            String strOptString3 = jSONObject.optString("ad_size", null);
            String strOptString4 = jSONObject.optString("ad_html", null);
            long j = -1;
            String strOptString5 = jSONObject.optString("debug_dialog", null);
            long j2 = jSONObject.has("interstitial_timeout") ? (long) (jSONObject.getDouble("interstitial_timeout") * 1000.0d) : -1L;
            String strOptString6 = jSONObject.optString("orientation", null);
            int iB = -1;
            if ("portrait".equals(strOptString6)) {
                iB = gx.c();
            } else if ("landscape".equals(strOptString6)) {
                iB = gx.b();
            }
            if (TextUtils.isEmpty(strOptString4)) {
                if (TextUtils.isEmpty(strOptString2)) {
                    hj.e("Could not parse the mediation config: Missing required ad_html or ad_url field.");
                    return new dv(0);
                }
                dv dvVarA = fv.a(context, dtVar.k.b, strOptString2, (String) null, (ge) null);
                strOptString = dvVarA.b;
                strOptString4 = dvVarA.c;
                j = dvVarA.n;
                dvVar = dvVarA;
            } else {
                if (TextUtils.isEmpty(strOptString)) {
                    hj.e("Could not parse the mediation config: Missing required ad_base_url field");
                    return new dv(0);
                }
                dvVar = null;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("click_urls");
            List linkedList = dvVar == null ? null : dvVar.d;
            if (jSONArrayOptJSONArray != null) {
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    linkedList.add(jSONArrayOptJSONArray.getString(i));
                }
                list = linkedList;
            } else {
                list = linkedList;
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("impression_urls");
            List linkedList2 = dvVar == null ? null : dvVar.f;
            if (jSONArrayOptJSONArray2 != null) {
                if (linkedList2 == null) {
                    linkedList2 = new LinkedList();
                }
                for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                    linkedList2.add(jSONArrayOptJSONArray2.getString(i2));
                }
                list2 = linkedList2;
            } else {
                list2 = linkedList2;
            }
            JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("manual_impression_urls");
            List linkedList3 = dvVar == null ? null : dvVar.j;
            if (jSONArrayOptJSONArray3 != null) {
                if (linkedList3 == null) {
                    linkedList3 = new LinkedList();
                }
                for (int i3 = 0; i3 < jSONArrayOptJSONArray3.length(); i3++) {
                    linkedList3.add(jSONArrayOptJSONArray3.getString(i3));
                }
                list3 = linkedList3;
            } else {
                list3 = linkedList3;
            }
            if (dvVar != null) {
                if (dvVar.l != -1) {
                    iB = dvVar.l;
                }
                if (dvVar.g > 0) {
                    j2 = dvVar.g;
                }
            }
            String strOptString7 = jSONObject.optString("active_view");
            boolean zOptBoolean = jSONObject.optBoolean("ad_is_javascript", false);
            return new dv(strOptString, strOptString4, list, list2, j2, false, -1L, list3, -1L, iB, strOptString3, j, strOptString5, zOptBoolean, zOptBoolean ? jSONObject.optString("ad_passback_url", null) : null, strOptString7);
        } catch (JSONException e) {
            hj.e("Could not parse the mediation config: " + e.getMessage());
            return new dv(0);
        }
    }

    private static Integer a(boolean z) {
        return Integer.valueOf(z ? 1 : 0);
    }

    private static String a(int i) {
        return String.format(Locale.US, "#%06x", Integer.valueOf(16777215 & i));
    }

    public static String a(dt dtVar, gg ggVar, Location location, String str) {
        try {
            HashMap map = new HashMap();
            if (str != null && str.trim() != "") {
                map.put("eid", str);
            }
            if (dtVar.b != null) {
                map.put("ad_pos", dtVar.b);
            }
            a(map, dtVar.c);
            map.put("format", dtVar.d.b);
            if (dtVar.d.f == -1) {
                map.put("smart_w", "full");
            }
            if (dtVar.d.c == -2) {
                map.put("smart_h", "auto");
            }
            if (dtVar.d.h != null) {
                StringBuilder sb = new StringBuilder();
                for (am amVar : dtVar.d.h) {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    sb.append(amVar.f == -1 ? (int) (amVar.g / ggVar.q) : amVar.f);
                    sb.append("x");
                    sb.append(amVar.c == -2 ? (int) (amVar.d / ggVar.q) : amVar.c);
                }
                map.put("sz", sb);
            }
            map.put("slotname", dtVar.e);
            map.put("pn", dtVar.f.packageName);
            if (dtVar.g != null) {
                map.put("vc", Integer.valueOf(dtVar.g.versionCode));
            }
            map.put("ms", dtVar.h);
            map.put("seq_num", dtVar.i);
            map.put("session_id", dtVar.j);
            map.put("js", dtVar.k.b);
            a(map, ggVar);
            if (dtVar.c.a >= 2 && dtVar.c.k != null) {
                a(map, dtVar.c.k);
            }
            if (dtVar.a >= 2) {
                map.put("quality_signals", dtVar.l);
            }
            if (hj.a(2)) {
                hj.d("Ad Request JSON: " + gx.a(map).toString(2));
            }
            return gx.a(map).toString();
        } catch (JSONException e) {
            hj.e("Problem serializing ad request to JSON: " + e.getMessage());
            return null;
        }
    }

    private static void a(HashMap map, Location location) {
        HashMap map2 = new HashMap();
        Float fValueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
        Long lValueOf = Long.valueOf(location.getTime() * 1000);
        Long lValueOf2 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
        Long lValueOf3 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
        map2.put("radius", fValueOf);
        map2.put("lat", lValueOf2);
        map2.put("long", lValueOf3);
        map2.put("time", lValueOf);
        map.put("uule", map2);
    }

    private static void a(HashMap map, aj ajVar) {
        String strA = gr.a();
        if (strA != null) {
            map.put("abf", strA);
        }
        if (ajVar.b != -1) {
            map.put("cust_age", a.format(new Date(ajVar.b)));
        }
        if (ajVar.c != null) {
            map.put("extras", ajVar.c);
        }
        if (ajVar.d != -1) {
            map.put("cust_gender", Integer.valueOf(ajVar.d));
        }
        if (ajVar.e != null) {
            map.put("kw", ajVar.e);
        }
        if (ajVar.g != -1) {
            map.put("tag_for_child_directed_treatment", Integer.valueOf(ajVar.g));
        }
        if (ajVar.f) {
            map.put("adtest", "on");
        }
        if (ajVar.a >= 2) {
            if (ajVar.h) {
                map.put("d_imp_hdr", 1);
            }
            if (!TextUtils.isEmpty(ajVar.i)) {
                map.put("ppid", ajVar.i);
            }
            if (ajVar.j != null) {
                a(map, ajVar.j);
            }
        }
        if (ajVar.a < 3 || ajVar.l == null) {
            return;
        }
        map.put("url", ajVar.l);
    }

    private static void a(HashMap map, ax axVar) {
        String str;
        String str2 = null;
        if (Color.alpha(axVar.b) != 0) {
            map.put("acolor", a(axVar.b));
        }
        if (Color.alpha(axVar.c) != 0) {
            map.put("bgcolor", a(axVar.c));
        }
        if (Color.alpha(axVar.d) != 0 && Color.alpha(axVar.e) != 0) {
            map.put("gradientto", a(axVar.d));
            map.put("gradientfrom", a(axVar.e));
        }
        if (Color.alpha(axVar.f) != 0) {
            map.put("bcolor", a(axVar.f));
        }
        map.put("bthick", Integer.toString(axVar.g));
        switch (axVar.h) {
            case 0:
                str = "none";
                break;
            case 1:
                str = "dashed";
                break;
            case 2:
                str = "dotted";
                break;
            case 3:
                str = "solid";
                break;
            default:
                str = null;
                break;
        }
        if (str != null) {
            map.put("btype", str);
        }
        switch (axVar.i) {
            case 0:
                str2 = "light";
                break;
            case 1:
                str2 = "medium";
                break;
            case 2:
                str2 = "dark";
                break;
        }
        if (str2 != null) {
            map.put("callbuttoncolor", str2);
        }
        if (axVar.j != null) {
            map.put("channel", axVar.j);
        }
        if (Color.alpha(axVar.k) != 0) {
            map.put("dcolor", a(axVar.k));
        }
        if (axVar.l != null) {
            map.put("font", axVar.l);
        }
        if (Color.alpha(axVar.m) != 0) {
            map.put("hcolor", a(axVar.m));
        }
        map.put("headersize", Integer.toString(axVar.n));
        if (axVar.o != null) {
            map.put("q", axVar.o);
        }
    }

    private static void a(HashMap map, gg ggVar) {
        map.put("am", Integer.valueOf(ggVar.a));
        map.put("cog", a(ggVar.b));
        map.put("coh", a(ggVar.c));
        if (!TextUtils.isEmpty(ggVar.d)) {
            map.put("carrier", ggVar.d);
        }
        map.put("gl", ggVar.e);
        if (ggVar.f) {
            map.put("simulator", 1);
        }
        map.put("ma", a(ggVar.g));
        map.put("sp", a(ggVar.h));
        map.put("hl", ggVar.i);
        if (!TextUtils.isEmpty(ggVar.j)) {
            map.put("mv", ggVar.j);
        }
        map.put("muv", Integer.valueOf(ggVar.k));
        if (ggVar.l != -2) {
            map.put("cnt", Integer.valueOf(ggVar.l));
        }
        map.put("gnt", Integer.valueOf(ggVar.m));
        map.put("pt", Integer.valueOf(ggVar.n));
        map.put("rm", Integer.valueOf(ggVar.o));
        map.put("riv", Integer.valueOf(ggVar.p));
        map.put("u_sd", Float.valueOf(ggVar.q));
        map.put("sh", Integer.valueOf(ggVar.s));
        map.put("sw", Integer.valueOf(ggVar.r));
        Bundle bundle = new Bundle();
        bundle.putInt("active_network_state", ggVar.w);
        bundle.putBoolean("active_network_metered", ggVar.v);
        map.put("connectivity", bundle);
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("is_charging", ggVar.u);
        bundle2.putDouble("battery_level", ggVar.t);
        map.put("battery", bundle2);
    }
}
