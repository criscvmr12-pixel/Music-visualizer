package com.symbolic.pitchlab;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
class ba implements DialogInterface.OnClickListener {
    final /* synthetic */ ay a;

    ba(ay ayVar) {
        this.a = ayVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
