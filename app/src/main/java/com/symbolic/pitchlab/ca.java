package com.symbolic.pitchlab;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
class ca implements DialogInterface.OnClickListener {
    ca() {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
