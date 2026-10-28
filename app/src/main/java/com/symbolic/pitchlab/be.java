package com.symbolic.pitchlab;

import android.app.Dialog;
import android.content.DialogInterface;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class be implements DialogInterface.OnClickListener {
    final /* synthetic */ bd a;
    private final /* synthetic */ List b;
    private final /* synthetic */ Dialog c;

    be(bd bdVar, List list, Dialog dialog) {
        this.a = bdVar;
        this.b = list;
        this.c = dialog;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        cd.b(this.b);
        dialogInterface.dismiss();
        this.c.dismiss();
        this.a.a.a.showDialog(111);
    }
}
