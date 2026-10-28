package com.symbolic.pitchlab;

import android.content.DialogInterface;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class ac implements DialogInterface.OnClickListener {
    final /* synthetic */ ActivityOptions a;

    ac(ActivityOptions activityOptions) {
        this.a = activityOptions;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        List listK = cd.k();
        listK.remove(cd.l());
        cd.b(listK);
        this.a.showDialog(111);
    }
}
