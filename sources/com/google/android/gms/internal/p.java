package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class p extends com.google.android.gms.a.e {
    private static final p a = new p();

    private p() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    public static z a(Context context, am amVar, String str, bv bvVar) {
        z zVarB;
        if (com.google.android.gms.common.g.a(context) == 0 && (zVarB = a.b(context, amVar, str, bvVar)) != null) {
            return zVarB;
        }
        hj.a("Using AdManager from the client jar.");
        return new oh(context, amVar, str, bvVar, new ew(5077000, 5077000, true));
    }

    private z b(Context context, am amVar, String str, bv bvVar) {
        try {
            return aa.a(((ac) a(context)).a(com.google.android.gms.a.d.a(context), amVar, str, bvVar, 5077000));
        } catch (RemoteException e) {
            hj.c("Could not create remote AdManager.", e);
            return null;
        } catch (com.google.android.gms.a.f e2) {
            hj.c("Could not create remote AdManager.", e2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.a.e
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ac a(IBinder iBinder) {
        return ad.a(iBinder);
    }
}
