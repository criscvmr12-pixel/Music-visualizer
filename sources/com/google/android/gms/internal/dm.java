package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class dm extends gs implements ServiceConnection {
    private final Object a = new Object();
    private boolean b = false;
    private Context c;
    private ek d;
    private dl e;
    private ds f;
    private List g;
    private dx h;

    public dm(Context context, ek ekVar, dx dxVar) {
        this.g = null;
        this.c = context;
        this.d = ekVar;
        this.h = dxVar;
        this.e = new dl(context);
        this.f = ds.a(this.c);
        this.g = this.f.a(10L);
    }

    private void a(long j) {
        do {
            if (!b(j)) {
                hj.e("Timeout waiting for pending transaction to be processed.");
            }
        } while (!this.b);
    }

    private void a(dq dqVar, String str, String str2) {
        Intent intent = new Intent();
        intent.putExtra("RESPONSE_CODE", 0);
        intent.putExtra("INAPP_PURCHASE_DATA", str);
        intent.putExtra("INAPP_DATA_SIGNATURE", str2);
        hi.a.post(new dn(this, dqVar, intent));
    }

    private boolean b(long j) {
        long jElapsedRealtime = 60000 - (SystemClock.elapsedRealtime() - j);
        if (jElapsedRealtime <= 0) {
            return false;
        }
        try {
            this.a.wait(jElapsedRealtime);
        } catch (InterruptedException e) {
            hj.e("waitWithTimeout_lock interrupted");
        }
        return true;
    }

    private void c() {
        if (this.g.isEmpty()) {
            return;
        }
        HashMap map = new HashMap();
        for (dq dqVar : this.g) {
            map.put(dqVar.c, dqVar);
        }
        String str = null;
        while (true) {
            Bundle bundleB = this.e.b(this.c.getPackageName(), str);
            if (bundleB == null || dw.a(bundleB) != 0) {
                break;
            }
            ArrayList<String> stringArrayList = bundleB.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
            ArrayList<String> stringArrayList2 = bundleB.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            ArrayList<String> stringArrayList3 = bundleB.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            String string = bundleB.getString("INAPP_CONTINUATION_TOKEN");
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= stringArrayList.size()) {
                    break;
                }
                if (map.containsKey(stringArrayList.get(i2))) {
                    String str2 = stringArrayList.get(i2);
                    String str3 = stringArrayList2.get(i2);
                    String str4 = stringArrayList3.get(i2);
                    dq dqVar2 = (dq) map.get(str2);
                    if (dqVar2.b.equals(dw.a(str3))) {
                        a(dqVar2, str3, str4);
                        map.remove(str2);
                    }
                }
                i = i2 + 1;
            }
            if (string == null || map.isEmpty()) {
                break;
            } else {
                str = string;
            }
        }
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            this.f.a((dq) map.get((String) it.next()));
        }
    }

    @Override // com.google.android.gms.internal.gs
    public void a() {
        synchronized (this.a) {
            Context context = this.c;
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            Context context2 = this.c;
            context.bindService(intent, this, 1);
            a(SystemClock.elapsedRealtime());
            this.c.unbindService(this);
            this.e.a();
        }
    }

    @Override // com.google.android.gms.internal.gs
    public void b() {
        synchronized (this.a) {
            this.c.unbindService(this);
            this.e.a();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.a) {
            this.e.a(iBinder);
            c();
            this.b = true;
            this.a.notify();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        hj.c("In-app billing service disconnected.");
        this.e.a();
    }
}
