package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class dc extends com.google.android.gms.a.e {
    private static final dc a = new dc();

    private dc() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public static de a(Activity activity) {
        de deVarC;
        try {
            if (b(activity)) {
                hj.a("Using AdOverlay from the client jar.");
                deVarC = new cp(activity);
            } else {
                deVarC = a.c(activity);
            }
            return deVarC;
        } catch (dd e) {
            hj.e(e.getMessage());
            return null;
        }
    }

    private static boolean b(Activity activity) throws dd {
        Intent intent = activity.getIntent();
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            return intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        throw new dd("Ad overlay requires the useClientJar flag in intent extras.");
    }

    private de c(Activity activity) {
        try {
            return df.a(((dh) a((Context) activity)).a(com.google.android.gms.a.d.a(activity)));
        } catch (RemoteException e) {
            hj.c("Could not create remote AdOverlay.", e);
            return null;
        } catch (com.google.android.gms.a.f e2) {
            hj.c("Could not create remote AdOverlay.", e2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.a.e
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public dh a(IBinder iBinder) {
        return di.a(iBinder);
    }
}
