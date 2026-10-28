package com.symbolic.pitchlab;

import android.app.AlertDialog;
import android.app.Dialog;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class ay implements View.OnClickListener {
    final /* synthetic */ aw a;
    private final /* synthetic */ EditText b;
    private final /* synthetic */ Spinner c;
    private final /* synthetic */ Dialog d;
    private final /* synthetic */ int[] e;
    private final /* synthetic */ int[] f;

    ay(aw awVar, EditText editText, Spinner spinner, Dialog dialog, int[] iArr, int[] iArr2) {
        this.a = awVar;
        this.b = editText;
        this.c = spinner;
        this.d = dialog;
        this.e = iArr;
        this.f = iArr2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str = "!" + this.b.getText().toString();
        List listH = cd.h();
        boolean z = cb.a(listH, str) != null;
        int[] iArr = new int[this.c.getSelectedItemPosition() + 2];
        for (int i = 0; i < iArr.length; i++) {
            iArr[(iArr.length - i) - 1] = ((Spinner) this.d.findViewById(this.e[i])).getSelectedItemPosition() + ((((Spinner) this.d.findViewById(this.f[i])).getSelectedItemPosition() + 0) * 12);
        }
        List listA = cb.a(listH, new cb(str, by.a(iArr, 0)));
        if (!z) {
            cd.a(listA);
            this.d.dismiss();
            this.a.a.showDialog(116);
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.d.getOwnerActivity());
        builder.setTitle("Overwrite Instrument?");
        builder.setMessage(String.format("Overwrite custom instrument '%s'? This operation cannot be undone.", cb.b(str)));
        builder.setPositiveButton("OK", new az(this, listA, this.d));
        builder.setNegativeButton("Cancel", new ba(this));
        builder.setCancelable(false);
        builder.create().show();
    }
}
