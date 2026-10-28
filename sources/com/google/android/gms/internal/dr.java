package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public final class dr extends ei implements ServiceConnection {
    private boolean a;
    private Context b;
    private int c;
    private Intent d;
    private dl e;
    private dq f;
    private String g;

    public dr(Context context, String str, boolean z, int i, Intent intent, dq dqVar) {
        this.a = false;
        this.g = str;
        this.c = i;
        this.d = intent;
        this.a = z;
        this.b = context;
        this.f = dqVar;
    }

    @Override // com.google.android.gms.internal.eh
    public boolean a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.eh
    public String b() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.eh
    public Intent c() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.eh
    public int d() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.eh
    public void e() {
        int iA = dw.a(this.d);
        if (this.c == -1 && iA == 0) {
            this.e = new dl(this.b);
            Context context = this.b;
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            Context context2 = this.b;
            context.bindService(intent, this, 1);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        hj.c("In-app billing service connected.");
        this.e.a(iBinder);
        String strB = dw.b(dw.b(this.d));
        if (strB == null) {
            return;
        }
        if (this.e.a(this.b.getPackageName(), strB) == 0) {
            ds.a(this.b).a(this.f);
        }
        this.b.unbindService(this);
        this.e.a();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        hj.c("In-app billing service disconnected.");
        this.e.a();
    }
}
