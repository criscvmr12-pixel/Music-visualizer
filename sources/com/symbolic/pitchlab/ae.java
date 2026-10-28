package com.symbolic.pitchlab;

import android.content.DialogInterface;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class ae implements DialogInterface.OnClickListener {
    final /* synthetic */ ActivityOptions a;

    ae(ActivityOptions activityOptions) {
        this.a = activityOptions;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        List listH = cd.h();
        listH.remove(cd.i());
        cd.a(listH);
        this.a.showDialog(116);
    }
}
