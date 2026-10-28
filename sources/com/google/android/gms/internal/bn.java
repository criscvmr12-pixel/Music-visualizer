package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class bn {
    public final List a;
    public final long b;
    public final List c;
    public final List d;
    public final List e;
    public final String f;
    public final long g;
    public int h;
    public int i;

    public bn(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        if (hj.a(2)) {
            hj.d("Mediation Response JSON: " + jSONObject.toString(2));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            bm bmVar = new bm(jSONArray.getJSONObject(i2));
            arrayList.add(bmVar);
            if (i < 0 && a(bmVar)) {
                i = i2;
            }
        }
        this.h = i;
        this.i = jSONArray.length();
        this.a = Collections.unmodifiableList(arrayList);
        this.f = jSONObject.getString("qdata");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
        if (jSONObjectOptJSONObject == null) {
            this.b = -1L;
            this.c = null;
            this.d = null;
            this.e = null;
            this.g = -1L;
            return;
        }
        this.b = jSONObjectOptJSONObject.optLong("ad_network_timeout_millis", -1L);
        this.c = bu.a(jSONObjectOptJSONObject, "click_urls");
        this.d = bu.a(jSONObjectOptJSONObject, "imp_urls");
        this.e = bu.a(jSONObjectOptJSONObject, "nofill_urls");
        long jOptLong = jSONObjectOptJSONObject.optLong("refresh", -1L);
        this.g = jOptLong > 0 ? jOptLong * 1000 : -1L;
    }

    private boolean a(bm bmVar) {
        Iterator it = bmVar.c.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                return true;
            }
        }
        return false;
    }
}
