package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.internal.lt;
import com.google.android.gms.internal.me;
import com.google.android.gms.internal.ml;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    private static Map a = new HashMap();

    static {
        a(lt.a);
        a(lt.y);
        a(lt.r);
        a(lt.w);
        a(lt.z);
        a(lt.l);
        a(lt.m);
        a(lt.j);
        a(lt.o);
        a(lt.u);
        a(lt.b);
        a(lt.t);
        a(lt.d);
        a(lt.k);
        a(lt.e);
        a(lt.f);
        a(lt.g);
        a(lt.q);
        a(lt.n);
        a(lt.s);
        a(lt.v);
        a(lt.A);
        a(lt.B);
        a(lt.i);
        a(lt.h);
        a(lt.x);
        a(lt.p);
        a(lt.c);
        a(lt.C);
        a(me.a);
        a(me.c);
        a(me.d);
        a(me.e);
        a(me.b);
        a(ml.a);
        a(ml.b);
    }

    public static com.google.android.gms.drive.metadata.a a(String str) {
        return (com.google.android.gms.drive.metadata.a) a.get(str);
    }

    private static void a(com.google.android.gms.drive.metadata.a aVar) {
        if (a.containsKey(aVar.a())) {
            throw new IllegalArgumentException("Duplicate field name registered: " + aVar.a());
        }
        a.put(aVar.a(), aVar);
    }
}
