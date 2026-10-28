package com.symbolic.pitchlab;

import android.app.Dialog;
import android.content.DialogInterface;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class az implements DialogInterface.OnClickListener {
    final /* synthetic */ ay a;
    private final /* synthetic */ List b;
    private final /* synthetic */ Dialog c;

    az(ay ayVar, List list, Dialog dialog) {
        this.a = ayVar;
        this.b = list;
        this.c = dialog;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        cd.a(this.b);
        dialogInterface.dismiss();
        this.c.dismiss();
        this.a.a.a.showDialog(116);
    }
}
