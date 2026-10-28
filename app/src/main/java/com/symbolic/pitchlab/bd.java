package com.symbolic.pitchlab;

import android.app.AlertDialog;
import android.app.Dialog;
import android.view.View;
import android.widget.EditText;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class bd implements View.OnClickListener {
    final /* synthetic */ bc a;
    private final /* synthetic */ EditText b;
    private final /* synthetic */ cs[] c;
    private final /* synthetic */ Dialog d;

    bd(bc bcVar, EditText editText, cs[] csVarArr, Dialog dialog) {
        this.a = bcVar;
        this.b = editText;
        this.c = csVarArr;
        this.d = dialog;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str = "!" + this.b.getText().toString();
        List listK = cd.k();
        boolean z = ce.a(listK, str) != null;
        float[] fArr = new float[12];
        for (int i = 0; i < 12; i++) {
            fArr[i] = this.c[i].b();
        }
        List listA = ce.a(listK, new ce(str, fArr));
        if (!z) {
            cd.b(listA);
            this.d.dismiss();
            this.a.a.showDialog(111);
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.d.getOwnerActivity());
        builder.setTitle("Overwrite Temperament?");
        builder.setMessage(String.format("Overwrite custom temperament '%s'? This operation cannot be undone.", ce.b(str)));
        builder.setPositiveButton("OK", new be(this, listA, this.d));
        builder.setNegativeButton("Cancel", new bf(this));
        builder.setCancelable(false);
        builder.create().show();
    }
}
