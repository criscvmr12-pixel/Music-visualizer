package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
class hd implements DialogInterface.OnClickListener {
    final /* synthetic */ String a;
    final /* synthetic */ hc b;

    hd(hc hcVar, String str) {
        this.b = hcVar;
        this.a = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.b.a.startActivity(Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", this.a), "Share via"));
    }
}
