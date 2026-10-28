package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

/* JADX INFO: loaded from: classes.dex */
class hm extends MutableContextWrapper {
    private Activity a;
    private Context b;

    public hm(Context context) {
        super(context);
        setBaseContext(context);
    }

    public Context a() {
        return this.a;
    }

    @Override // android.content.MutableContextWrapper
    public void setBaseContext(Context context) {
        this.b = context.getApplicationContext();
        this.a = context instanceof Activity ? (Activity) context : null;
        super.setBaseContext(this.b);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        if (this.a != null) {
            this.a.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            this.b.startActivity(intent);
        }
    }
}
