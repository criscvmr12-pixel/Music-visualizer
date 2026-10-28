package com.google.android.gms.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class bu {
    public static List a(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            arrayList.add(jSONArrayOptJSONArray.getString(i));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static void a(Context context, String str, gj gjVar, String str2, boolean z, List list) {
        String str3 = z ? "1" : "0";
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strReplaceAll = ((String) it.next()).replaceAll("@gw_adlocid@", str2).replaceAll("@gw_adnetrefresh@", str3).replaceAll("@gw_qdata@", gjVar.o.f).replaceAll("@gw_sdkver@", str).replaceAll("@gw_sessid@", gn.a).replaceAll("@gw_seqnum@", gjVar.i);
            if (gjVar.l != null) {
                strReplaceAll = strReplaceAll.replaceAll("@gw_adnetid@", gjVar.l.b).replaceAll("@gw_allocid@", gjVar.l.d);
            }
            new hh(context, str, strReplaceAll).e();
        }
    }
}
