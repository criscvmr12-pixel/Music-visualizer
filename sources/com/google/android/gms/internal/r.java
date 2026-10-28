package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class r {
    public static final r a = new r();

    private r() {
    }

    public static r a() {
        return a;
    }

    public aj a(Context context, ai aiVar) {
        Date dateA = aiVar.a();
        long time = dateA != null ? dateA.getTime() : -1L;
        String strB = aiVar.b();
        int iC = aiVar.c();
        Set setD = aiVar.d();
        List listUnmodifiableList = !setD.isEmpty() ? Collections.unmodifiableList(new ArrayList(setD)) : null;
        boolean zA = aiVar.a(context);
        int iK = aiVar.k();
        Location locationE = aiVar.e();
        Bundle bundleA = aiVar.a(com.google.a.a.a.a.class);
        boolean zF = aiVar.f();
        String strG = aiVar.g();
        com.google.android.gms.ads.e.a aVarH = aiVar.h();
        return new aj(4, time, bundleA, iC, listUnmodifiableList, zA, iK, zF, strG, aVarH != null ? new ax(aVarH) : null, locationE, strB, aiVar.j());
    }
}
