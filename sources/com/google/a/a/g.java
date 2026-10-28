package com.google.a.a;

import com.google.android.gms.internal.hj;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class g {
    protected void a() {
    }

    public void a(Map map) throws h {
        HashMap map2 = new HashMap();
        for (Field field : getClass().getFields()) {
            i iVar = (i) field.getAnnotation(i.class);
            if (iVar != null) {
                map2.put(iVar.a(), field);
            }
        }
        if (map2.isEmpty()) {
            hj.e("No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.");
        }
        for (Map.Entry entry : map.entrySet()) {
            Field field2 = (Field) map2.remove(entry.getKey());
            if (field2 != null) {
                try {
                    field2.set(this, entry.getValue());
                } catch (IllegalAccessException e) {
                    hj.e("Server option \"" + ((String) entry.getKey()) + "\" could not be set: Illegal Access");
                } catch (IllegalArgumentException e2) {
                    hj.e("Server option \"" + ((String) entry.getKey()) + "\" could not be set: Bad Type");
                }
            } else {
                hj.a("Unexpected server option: " + ((String) entry.getKey()) + " = \"" + ((String) entry.getValue()) + "\"");
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Field field3 : map2.values()) {
            if (((i) field3.getAnnotation(i.class)).b()) {
                hj.e("Required server option missing: " + ((i) field3.getAnnotation(i.class)).a());
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(((i) field3.getAnnotation(i.class)).a());
            }
        }
        if (sb.length() > 0) {
            throw new h("Required server option(s) missing: " + sb.toString());
        }
        a();
    }
}
