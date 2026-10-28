package com.google.android.gms.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public class dp extends eg implements ServiceConnection {
    private final Activity a;
    private final ds b;
    private Context c;
    private ek d;
    private dz e;
    private dl f;
    private dq g;
    private dx h;
    private String i;

    public static void a(Context context, boolean z, cr crVar) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.purchase.InAppPurchaseActivity");
        intent.putExtra("com.google.android.gms.ads.internal.purchase.useClientJar", z);
        cr.a(intent, crVar);
        context.startActivity(intent);
    }

    private void a(String str, boolean z, int i, Intent intent) {
        try {
            this.d.a(new dr(this.c, str, z, i, intent, this.g));
        } catch (RemoteException e) {
            hj.e("Fail to invoke PlayStorePurchaseListener.");
        }
    }

    @Override // com.google.android.gms.internal.ef
    public void a() {
        cr crVarA = cr.a(this.a.getIntent());
        this.d = crVarA.b;
        this.h = crVarA.c;
        this.e = crVarA.d;
        this.f = new dl(this.a.getApplicationContext());
        this.c = crVarA.e;
        Activity activity = this.a;
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        this.a.getApplicationContext();
        activity.bindService(intent, this, 1);
    }

    @Override // com.google.android.gms.internal.ef
    public void a(int i, int i2, Intent intent) {
        try {
            if (i == 1001) {
                int iA = dw.a(intent);
                if (i2 != -1 || iA != 0) {
                    this.b.a(this.g);
                    a(this.e.a(), false, i2, intent);
                } else if (this.h.a(this.i, i2, intent)) {
                    a(this.e.a(), true, i2, intent);
                } else {
                    a(this.e.a(), false, i2, intent);
                }
                this.e.c(iA);
            }
        } catch (RemoteException e) {
            hj.e("Fail to process purchase result.");
        } finally {
            this.i = null;
            this.a.finish();
        }
    }

    @Override // com.google.android.gms.internal.ef
    public void b() {
        this.a.unbindService(this);
        this.f.a();
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f.a(iBinder);
        try {
            this.i = this.h.a();
            Bundle bundleA = this.f.a(this.a.getPackageName(), this.e.a(), this.i);
            PendingIntent pendingIntent = (PendingIntent) bundleA.getParcelable("BUY_INTENT");
            if (pendingIntent == null) {
                int iA = dw.a(bundleA);
                this.e.c(iA);
                a(this.e.a(), false, iA, null);
                this.a.finish();
            } else {
                this.g = new dq(this.e.a(), this.i);
                this.b.b(this.g);
                Integer num = 0;
                Integer num2 = 0;
                Integer num3 = 0;
                this.a.startIntentSenderForResult(pendingIntent.getIntentSender(), 1001, new Intent(), num.intValue(), num2.intValue(), num3.intValue());
            }
        } catch (IntentSender.SendIntentException | RemoteException e) {
            hj.c("Error when connecting in-app billing service", e);
            this.a.finish();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        hj.c("In-app billing service disconnected.");
        this.f.a();
    }
}
