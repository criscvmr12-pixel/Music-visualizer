package com.symbolic.pitchlab;

import android.app.Dialog;
import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class aw {
    final /* synthetic */ ActivityOptions a;

    public aw(ActivityOptions activityOptions, Context context, Dialog dialog, int i, int i2) {
        this.a = activityOptions;
        EditText editText = (EditText) dialog.findViewById(R.id.instrument_custom_name_edit);
        Spinner spinner = (Spinner) dialog.findViewById(R.id.instrument_noteCountSpinner);
        spinner.setOnItemSelectedListener(null);
        editText.setFilters(activityOptions.a);
        int[] iArr = {R.id.instrument_layout1, R.id.instrument_layout2, R.id.instrument_layout3, R.id.instrument_layout4, R.id.instrument_layout5, R.id.instrument_layout6, R.id.instrument_layout7, R.id.instrument_layout8, R.id.instrument_layout9, R.id.instrument_layout10, R.id.instrument_layout11, R.id.instrument_layout12};
        int[] iArr2 = {R.id.instrument_note1, R.id.instrument_note2, R.id.instrument_note3, R.id.instrument_note4, R.id.instrument_note5, R.id.instrument_note6, R.id.instrument_note7, R.id.instrument_note8, R.id.instrument_note9, R.id.instrument_note10, R.id.instrument_note11, R.id.instrument_note12};
        int[] iArr3 = {R.id.instrument_octave1, R.id.instrument_octave2, R.id.instrument_octave3, R.id.instrument_octave4, R.id.instrument_octave5, R.id.instrument_octave6, R.id.instrument_octave7, R.id.instrument_octave8, R.id.instrument_octave9, R.id.instrument_octave10, R.id.instrument_octave11, R.id.instrument_octave12};
        String[] strArr = new String[11];
        for (int i3 = 0; i3 < strArr.length; i3++) {
            strArr[i3] = String.format("%d strings/notes", Integer.valueOf(i3 + 2));
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.spinner_item, strArr);
        arrayAdapter.setDropDownViewResource(R.layout.spinner_dropdown);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.spinner_item, by.a[i2]);
        arrayAdapter2.setDropDownViewResource(R.layout.spinner_dropdown);
        String[] strArr2 = new String[8];
        for (int i4 = 0; i4 < strArr2.length; i4++) {
            strArr2[i4] = Integer.toString(i4 + 0);
        }
        ArrayAdapter arrayAdapter3 = new ArrayAdapter(context, R.layout.spinner_item, strArr2);
        arrayAdapter3.setDropDownViewResource(R.layout.spinner_dropdown);
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (i6 >= iArr.length) {
                break;
            }
            Spinner spinner2 = (Spinner) dialog.findViewById(iArr2[i6]);
            Spinner spinner3 = (Spinner) dialog.findViewById(iArr3[i6]);
            spinner2.setAdapter((SpinnerAdapter) arrayAdapter2);
            spinner3.setAdapter((SpinnerAdapter) arrayAdapter3);
            i5 = i6 + 1;
        }
        ArrayList arrayList = new ArrayList();
        if (i >= 0) {
            cb cbVar = (cb) cd.h().get(i);
            editText.setText(cb.b(cbVar.a()));
            int[] iArrB = cbVar.b();
            for (int i7 : iArrB) {
                arrayList.add(0, Integer.valueOf(i7));
                if (arrayList.size() > 12) {
                    arrayList.remove(12);
                }
            }
            if (arrayList.size() < 2 || arrayList.size() > 12) {
                spinner.setSelection(0);
            } else {
                spinner.setSelection(arrayList.size() - 2);
            }
        } else {
            editText.setText("<name>");
            spinner.setSelection(0);
        }
        int iA = by.a("A4");
        while (arrayList.size() < 12) {
            arrayList.add(Integer.valueOf(iA));
        }
        int i8 = 0;
        while (true) {
            int i9 = i8;
            if (i9 >= arrayList.size()) {
                ActivityOptions.b(dialog, iArr, spinner.getSelectedItemPosition() + 2);
                spinner.setOnItemSelectedListener(new ax(this, dialog, iArr, spinner));
                ((Button) dialog.findViewById(R.id.instrument_custom_buttonSave)).setOnClickListener(new ay(this, editText, spinner, dialog, iArr2, iArr3));
                ((Button) dialog.findViewById(R.id.instrument_custom_buttonCancel)).setOnClickListener(new bb(this, dialog));
                return;
            }
            Spinner spinner4 = (Spinner) dialog.findViewById(iArr2[i9]);
            Spinner spinner5 = (Spinner) dialog.findViewById(iArr3[i9]);
            int iIntValue = ((Integer) arrayList.get(i9)).intValue();
            spinner4.setSelection(iIntValue % 12);
            spinner5.setSelection((iIntValue / 12) + 0);
            i8 = i9 + 1;
        }
    }
}
