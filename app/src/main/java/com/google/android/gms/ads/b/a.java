package com.google.android.gms.ads.b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.e;
import com.google.android.gms.common.f;
import com.google.android.gms.common.g;
import com.google.android.gms.common.i;
import com.google.android.gms.internal.ky;
import com.google.android.gms.internal.od;
import com.google.android.gms.internal.oe;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    static b a(Context context, i iVar) {
        try {
            try {
                od odVarA = oe.a(iVar.a());
                b bVar = new b(odVarA.a(), odVarA.a(true));
                try {
                    context.unbindService(iVar);
                } catch (IllegalArgumentException e) {
                    Log.i("AdvertisingIdClient", "getAdvertisingIdInfo unbindService failed.", e);
                }
                return bVar;
            } catch (RemoteException e2) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                throw new IOException("Remote exception");
            } catch (InterruptedException e3) {
                throw new IOException("Interrupted exception");
            }
        } catch (Throwable th) {
            try {
                context.unbindService(iVar);
            } catch (IllegalArgumentException e4) {
                Log.i("AdvertisingIdClient", "getAdvertisingIdInfo unbindService failed.", e4);
            }
            throw th;
        }
    }

    static i a(Context context) throws e, f, IOException {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            try {
                g.b(context);
                i iVar = new i();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (context.bindService(intent, iVar, 1)) {
                    return iVar;
                }
                throw new IOException("Connection failure");
            } catch (e e) {
                throw new IOException(e);
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new e(9);
        }
    }

    public static b b(Context context) {
        ky.c("Calling this from your main thread can lead to deadlock");
        return a(context, a(context));
    }
}
