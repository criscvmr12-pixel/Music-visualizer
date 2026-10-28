package com.symbolic.pitchlab;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.InputFilter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ActivityOptions extends Activity {
    private static final int[] b = {44100, 22050, 11025, 8000};
    private static final int[] c = {1, 0, -1};
    private static final String[] d = {"1.0.15", "Latest"};
    private static final int[] e = {R.id.debug_spinnerAudioInput, R.id.debug_spinnerVisualizations, R.id.debug_spinnerTextures};
    private static final String[] f = {"5 cents", "10 cents", "15 cents"};
    private static final float[] g = {5.0f, 10.0f, 15.0f};
    private static final String[] h = {"dynamic", "landscape", "portrait"};
    InputFilter[] a = {new j(this)};
    private int i;
    private cs j;

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i, Dialog dialog, int i2) {
        if (((Spinner) dialog.findViewById(i2)).getSelectedItemPosition() != 0) {
            return i;
        }
        return 0;
    }

    private Dialog a(int i, int i2, String str, boolean z) {
        Dialog dialogG = g();
        dialogG.setContentView(i);
        dialogG.getWindow().setLayout(-2, z ? -1 : -2);
        dialogG.setTitle(str);
        dialogG.setCancelable(true);
        dialogG.setOwnerActivity(this);
        ListView listView = (ListView) dialogG.findViewById(i2);
        listView.setItemsCanFocus(false);
        listView.setDivider(new ColorDrawable(-10461088));
        listView.setDividerHeight(1);
        return dialogG;
    }

    private static String a(int i) {
        return String.format("%dkhz", Integer.valueOf(i / 1000));
    }

    private void a(Dialog dialog, int i) {
        Spinner spinner = (Spinner) dialog.findViewById(i);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.spinner_item, new String[]{"ON", "OFF"});
        arrayAdapter.setDropDownViewResource(R.layout.spinner_dropdown);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
    }

    private void a(boolean z, Dialog dialog, int i) {
        ((Spinner) dialog.findViewById(i)).setSelection(z ? 1 : 0);
    }

    private static String b(int i) {
        switch (i) {
            case -1:
                return "Low";
            case 0:
                return "Medium";
            case 1:
                return "High";
            default:
                return "<unknown>";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Dialog dialog, int[] iArr, int i) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            ((LinearLayout) dialog.findViewById(iArr[i2])).setVisibility(i2 < i ? 0 : 8);
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(int i) {
        try {
            bp.a(i, new ap(this)).a();
            return true;
        } catch (Exception e2) {
            return false;
        }
    }

    private boolean e() {
        int iL = cd.l();
        return iL >= 0 && iL < cd.k().size();
    }

    private boolean f() {
        int i = cd.i();
        return i >= 0 && i < cd.h().size();
    }

    private Dialog g() {
        return new Dialog(this, R.style.CustomDialog);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_options);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cr("Support"));
        arrayList.add(new co("Help & Information", "Show quick-start guide, contact information, software licenses and release notes.", new u(this)));
        arrayList.add(new cr("Instrument"));
        arrayList.add(new co("Preset Instrument", "Choose from a list of preset instrument tunings.", new af(this)));
        arrayList.add(new co("Custom Instrument", "Create, edit or load your own custom instrument tunings.", new aq(this)));
        arrayList.add(new cr("Tuning"));
        arrayList.add(new co("A4 Frequency (hz)", "Set the A4 tuning reference frequency.", new ar(this)));
        arrayList.add(new co("Preset Temperament", "Choose from a list of preset temperaments.", new as(this)));
        arrayList.add(new co("Custom Temperament", "Create, edit or load your own custom temperaments.", new at(this)));
        arrayList.add(new cr("Display"));
        arrayList.add(new co("Display Settings", "Adjust display related options and settings.", new au(this)));
        arrayList.add(new cr("Input"));
        arrayList.add(new co("Sample Rate", "Select a valid input sample rate for your device (a higher sample rate should result in improved frequency accuracy at the expense of reduced battery life).", new av(this)));
        arrayList.add(new co("Analysis Rate", "Choose the signal processing analysis rate (a higher analysis rate should result in improved temporal accuracy at the expense of reduced battery life).", new k(this)));
        arrayList.add(new cr("Miscellaneous"));
        arrayList.add(new co("Compatibility", "Adjust feature usage to enhance application compatibility.", new l(this)));
        arrayList.add(new co("Debugging", "Temporarily disable application functions to diagnose compatibility issues.", new m(this)));
        arrayList.add(new co("Factory Reset", "Reset all settings to factory default values (custom instruments and temperaments will *NOT* be deleted).", new n(this)));
        cq cqVar = new cq(getApplicationContext(), R.layout.item_option, arrayList);
        ListView listView = (ListView) findViewById(R.id.optionListView);
        listView.setAdapter((ListAdapter) cqVar);
        listView.setOnItemClickListener(new o(this, cqVar, listView));
    }

    @Override // android.app.Activity
    protected Dialog onCreateDialog(int i) {
        int i2 = 0;
        switch (i) {
            case 100:
                return a(R.layout.option_sample_rate, R.id.sample_select_list, "Sample Rate", false);
            case 101:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Audio setup failed!");
                builder.setMessage("");
                builder.setPositiveButton("OK", new p(this));
                builder.setCancelable(false);
                return builder.create();
            case 102:
                return a(R.layout.option_analysis_rate, R.id.analysis_select_list, "Analysis Rate", false);
            case 103:
                Dialog dialogG = g();
                dialogG.setContentView(R.layout.option_a4_ref);
                dialogG.getWindow().setLayout(-1, -2);
                dialogG.setTitle("A4 Frequency (hz)");
                dialogG.setCancelable(true);
                dialogG.setOwnerActivity(this);
                float f2 = cd.f();
                this.j = new cs(dialogG, cd.e(), f2, f2 / 2.0f, 2.0f * f2, 1.0f, 0.1f, R.id.a4_big_down, R.id.a4_small_down, R.id.a4_textHz, R.id.a4_small_up, R.id.a4_big_up);
                ((Button) dialogG.findViewById(R.id.a4_buttonOk)).setOnClickListener(new q(this, dialogG));
                ((Button) dialogG.findViewById(R.id.a4_buttonReset)).setOnClickListener(new ViewOnClickListenerC0001r(this));
                ((Button) dialogG.findViewById(R.id.a4_buttonCancel)).setOnClickListener(new s(this, dialogG));
                return dialogG;
            case 104:
                AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
                builder2.setTitle("Factory Reset?");
                builder2.setMessage("Are you sure you want to reset to factory default settings? (custom instruments and temperaments will *NOT* be deleted)");
                builder2.setPositiveButton("OK", new t(this));
                builder2.setNegativeButton("Cancel", new v(this));
                builder2.setCancelable(true);
                return builder2.create();
            case 105:
            default:
                return null;
            case 106:
                return bz.a(this, bz.b());
            case 107:
                Dialog dialogG2 = g();
                dialogG2.setContentView(R.layout.option_compatibility);
                dialogG2.getWindow().setLayout(-1, -2);
                dialogG2.setTitle("Compatibility");
                dialogG2.setCancelable(true);
                dialogG2.setOwnerActivity(this);
                Spinner spinner = (Spinner) dialogG2.findViewById(R.id.compatibility_spinnerSpectrogram);
                ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.spinner_item, new String[]{"RGBA-5551", "RGBA-8888"});
                arrayAdapter.setDropDownViewResource(R.layout.spinner_dropdown);
                spinner.setAdapter((SpinnerAdapter) arrayAdapter);
                Spinner spinner2 = (Spinner) dialogG2.findViewById(R.id.compatibility_spinnerAudioSetup);
                ArrayAdapter arrayAdapter2 = new ArrayAdapter(this, R.layout.spinner_item, bp.a());
                arrayAdapter2.setDropDownViewResource(R.layout.spinner_dropdown);
                spinner2.setAdapter((SpinnerAdapter) arrayAdapter2);
                Spinner spinner3 = (Spinner) dialogG2.findViewById(R.id.compatibility_spinnerAudioAnalysis);
                ArrayAdapter arrayAdapter3 = new ArrayAdapter(this, R.layout.spinner_item, d);
                arrayAdapter3.setDropDownViewResource(R.layout.spinner_dropdown);
                spinner3.setAdapter((SpinnerAdapter) arrayAdapter3);
                ((Button) dialogG2.findViewById(R.id.compatibility_buttonOk)).setOnClickListener(new w(this, dialogG2, spinner, spinner2, spinner3));
                ((Button) dialogG2.findViewById(R.id.compatibility_buttonCancel)).setOnClickListener(new x(this, dialogG2));
                return dialogG2;
            case 108:
                Dialog dialogG3 = g();
                dialogG3.setContentView(R.layout.option_debugging);
                dialogG3.getWindow().setLayout(-1, -2);
                dialogG3.setTitle("Debugging");
                dialogG3.setCancelable(true);
                dialogG3.setOwnerActivity(this);
                while (i2 < e.length) {
                    a(dialogG3, e[i2]);
                    i2++;
                }
                ((Button) dialogG3.findViewById(R.id.debug_buttonOk)).setOnClickListener(new y(this, dialogG3));
                ((Button) dialogG3.findViewById(R.id.debug_buttonCancel)).setOnClickListener(new z(this, dialogG3));
                return dialogG3;
            case 109:
                Dialog dialogG4 = g();
                dialogG4.setContentView(R.layout.option_display);
                dialogG4.getWindow().setLayout(-1, -2);
                dialogG4.setTitle("Display Options");
                dialogG4.setCancelable(true);
                dialogG4.setOwnerActivity(this);
                Spinner spinner4 = (Spinner) dialogG4.findViewById(R.id.display_spinnerNoteNames);
                int numNoteNames = PitchLabNative.getNumNoteNames();
                String[] strArr = new String[numNoteNames];
                while (i2 < numNoteNames) {
                    strArr[i2] = PitchLabNative.getNoteNameTitle(i2);
                    i2++;
                }
                ArrayAdapter arrayAdapter4 = new ArrayAdapter(this, R.layout.spinner_item, strArr);
                arrayAdapter4.setDropDownViewResource(R.layout.spinner_dropdown);
                spinner4.setAdapter((SpinnerAdapter) arrayAdapter4);
                Spinner spinner5 = (Spinner) dialogG4.findViewById(R.id.display_spinnerInTuneThreshold);
                ArrayAdapter arrayAdapter5 = new ArrayAdapter(this, R.layout.spinner_item, f);
                arrayAdapter5.setDropDownViewResource(R.layout.spinner_dropdown);
                spinner5.setAdapter((SpinnerAdapter) arrayAdapter5);
                Spinner spinner6 = (Spinner) dialogG4.findViewById(R.id.display_spinnerScreenOrientation);
                ArrayAdapter arrayAdapter6 = new ArrayAdapter(this, R.layout.spinner_item, h);
                arrayAdapter6.setDropDownViewResource(R.layout.spinner_dropdown);
                spinner6.setAdapter((SpinnerAdapter) arrayAdapter6);
                ((Button) dialogG4.findViewById(R.id.display_buttonOk)).setOnClickListener(new aa(this, dialogG4, spinner4, spinner5, spinner6));
                ((Button) dialogG4.findViewById(R.id.display_buttonCancel)).setOnClickListener(new ab(this, dialogG4));
                return dialogG4;
            case 110:
                return a(R.layout.temperament_preset_select, R.id.temperament_preset_select_list, "Preset Temperament", true);
            case 111:
                return a(R.layout.temperament_custom_select, R.id.temperament_custom_select_list, "Custom Temperament", true);
            case 112:
                Dialog dialogG5 = g();
                dialogG5.setContentView(R.layout.temperament_custom_edit);
                dialogG5.getWindow().setLayout(-1, -1);
                dialogG5.setTitle("New Temperament");
                dialogG5.setCancelable(true);
                dialogG5.setOwnerActivity(this);
                return dialogG5;
            case 113:
                Dialog dialogG6 = g();
                dialogG6.setContentView(R.layout.temperament_custom_edit);
                dialogG6.getWindow().setLayout(-1, -1);
                dialogG6.setTitle("Edit Temperament");
                dialogG6.setCancelable(true);
                dialogG6.setOwnerActivity(this);
                return dialogG6;
            case 114:
                AlertDialog.Builder builder3 = new AlertDialog.Builder(this);
                builder3.setTitle("Delete Temperament?");
                builder3.setMessage("");
                builder3.setPositiveButton("OK", new ac(this));
                builder3.setNegativeButton("Cancel", new ad(this));
                builder3.setCancelable(false);
                return builder3.create();
            case 115:
                return a(R.layout.instrument_preset_select, R.id.instrument_preset_select_list, "Preset Instrument", true);
            case 116:
                return a(R.layout.instrument_custom_select, R.id.instrument_custom_select_list, "Custom Instrument", true);
            case 117:
                Dialog dialogG7 = g();
                dialogG7.setContentView(R.layout.instrument_custom_edit);
                dialogG7.getWindow().setLayout(-1, -1);
                dialogG7.setTitle("New Instrument");
                dialogG7.setCancelable(true);
                dialogG7.setOwnerActivity(this);
                return dialogG7;
            case 118:
                Dialog dialogG8 = g();
                dialogG8.setContentView(R.layout.instrument_custom_edit);
                dialogG8.getWindow().setLayout(-1, -1);
                dialogG8.setTitle("Edit Instrument");
                dialogG8.setCancelable(true);
                dialogG8.setOwnerActivity(this);
                return dialogG8;
            case 119:
                AlertDialog.Builder builder4 = new AlertDialog.Builder(this);
                builder4.setTitle("Delete Instrument?");
                builder4.setMessage("");
                builder4.setPositiveButton("OK", new ae(this));
                builder4.setNegativeButton("Cancel", new ag(this));
                builder4.setCancelable(false);
                return builder4.create();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        cd.b(getApplicationContext());
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0111  */
    /* JADX WARN: Code duplicated, block: B:41:0x0135 A[LOOP:3: B:30:0x010e->B:41:0x0135, LOOP_END] */
    @Override // android.app.Activity
    protected void onPrepareDialog(int i, Dialog dialog) {
        String[] strArr;
        String strT;
        Spinner spinner;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        switch (i) {
            case 100:
                ArrayList arrayList = new ArrayList();
                for (int i9 = 0; i9 < b.length; i9++) {
                    arrayList.add(new ch(a(b[i9]), false, null));
                    if (b[i9] == cd.c()) {
                        i3 = i9;
                    }
                }
                ListView listView = (ListView) dialog.findViewById(R.id.sample_select_list);
                listView.setAdapter((ListAdapter) new ci(getApplicationContext(), R.layout.item_checkable, arrayList));
                listView.setItemChecked(i3, true);
                listView.setSelection(i3);
                listView.setOnItemClickListener(new ah(this, dialog));
                break;
            case 101:
                ((AlertDialog) dialog).setMessage(String.format("Audio setup for %s has failed, please select a sample rate that is supported by your device (some devices only support 8khz)", a(this.i)));
                break;
            case 102:
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < c.length; i10++) {
                    arrayList2.add(new ch(b(c[i10]), false, null));
                    if (c[i10] == cd.d()) {
                        i4 = i10;
                    }
                }
                ListView listView2 = (ListView) dialog.findViewById(R.id.analysis_select_list);
                listView2.setAdapter((ListAdapter) new ci(getApplicationContext(), R.layout.item_checkable, arrayList2));
                listView2.setItemChecked(i4, true);
                listView2.setSelection(i4);
                listView2.setOnItemClickListener(new ai(this, dialog));
                break;
            case 103:
                this.j.a(cd.e());
                break;
            case 106:
                bz.a(this, dialog);
                break;
            case 107:
                Spinner spinner2 = (Spinner) dialog.findViewById(R.id.compatibility_spinnerSpectrogram);
                switch (cd.m()) {
                    case 4:
                        spinner2.setSelection(0);
                        break;
                    case 5:
                        spinner2.setSelection(1);
                        break;
                }
                String[] strArrA = bp.a();
                String strS = cd.s();
                Spinner spinner3 = (Spinner) dialog.findViewById(R.id.compatibility_spinnerAudioSetup);
                spinner3.setSelection(strArrA.length - 1);
                for (int i11 = 0; i11 < strArrA.length; i11++) {
                    if (strArrA[i11].equals(strS)) {
                        spinner3.setSelection(i11);
                        strArr = d;
                        strT = cd.t();
                        spinner = (Spinner) dialog.findViewById(R.id.compatibility_spinnerAudioAnalysis);
                        spinner.setSelection(d.length - 1);
                        for (int i12 = 0; i12 < strArr.length; i12++) {
                            if (strArr[i12].equals(strT)) {
                                spinner.setSelection(i12);
                            }
                        }
                    }
                    break;
                }
                strArr = d;
                strT = cd.t();
                spinner = (Spinner) dialog.findViewById(R.id.compatibility_spinnerAudioAnalysis);
                spinner.setSelection(d.length - 1);
                while (i12 < strArr.length) {
                    if (strArr[i12].equals(strT)) {
                        spinner.setSelection(i12);
                    }
                    break;
                }
                break;
            case 108:
                for (int i13 = 0; i13 < e.length; i13++) {
                    a((cd.w() & (1 << i13)) != 0, dialog, e[i13]);
                }
                break;
            case 109:
                ((Spinner) dialog.findViewById(R.id.display_spinnerNoteNames)).setSelection(cd.n());
                Spinner spinner4 = (Spinner) dialog.findViewById(R.id.display_spinnerInTuneThreshold);
                for (int i14 = 0; i14 < g.length && i5 < 0; i14++) {
                    if (cd.o() == g[i14]) {
                        i5 = i14;
                    }
                }
                spinner4.setSelection(i5);
                ((Spinner) dialog.findViewById(R.id.display_spinnerScreenOrientation)).setSelection(cd.p());
                break;
            case 110:
                List listC = ce.c();
                ArrayList arrayList3 = new ArrayList();
                for (int i15 = 0; i15 < listC.size(); i15++) {
                    String strA = ((ce) listC.get(i15)).a();
                    arrayList3.add(new ch(strA, false, null));
                    if (strA.compareTo(cd.j()) == 0) {
                        i6 = i15;
                    }
                }
                ListView listView3 = (ListView) dialog.findViewById(R.id.temperament_preset_select_list);
                listView3.setAdapter((ListAdapter) new ci(getApplicationContext(), R.layout.item_checkable, arrayList3));
                listView3.setItemChecked(i6, true);
                listView3.setSelection(i6);
                listView3.setOnItemClickListener(new aj(this, dialog, listC));
                break;
            case 111:
                List listK = cd.k();
                ArrayList arrayList4 = new ArrayList();
                for (int i16 = 0; i16 < listK.size(); i16++) {
                    String strA2 = ((ce) listK.get(i16)).a();
                    arrayList4.add(new ch(ce.b(strA2), false, null));
                    if (strA2.compareTo(cd.j()) == 0) {
                        i7 = i16;
                    }
                }
                ListView listView4 = (ListView) dialog.findViewById(R.id.temperament_custom_select_list);
                RadioGroup radioGroup = (RadioGroup) dialog.findViewById(R.id.temperament_custom_select_buttonGroup);
                listView4.setAdapter((ListAdapter) new ci(getApplicationContext(), R.layout.item_checkable, arrayList4));
                listView4.setItemChecked(i7, true);
                listView4.setSelection(i7);
                listView4.setOnItemClickListener(new ak(this, dialog, listK, radioGroup));
                RadioButton radioButton = (RadioButton) dialog.findViewById(R.id.temperament_custom_select_buttonLoad);
                RadioButton radioButton2 = (RadioButton) dialog.findViewById(R.id.temperament_custom_select_buttonNew);
                RadioButton radioButton3 = (RadioButton) dialog.findViewById(R.id.temperament_custom_select_buttonEdit);
                RadioButton radioButton4 = (RadioButton) dialog.findViewById(R.id.temperament_custom_select_buttonDelete);
                if (arrayList4.size() == 0) {
                    radioButton.setEnabled(false);
                    radioButton2.setEnabled(true);
                    radioButton3.setEnabled(false);
                    radioButton4.setEnabled(false);
                    radioGroup.clearCheck();
                } else {
                    radioButton.setEnabled(true);
                    radioButton2.setEnabled(cd.k().size() < 100);
                    radioButton3.setEnabled(true);
                    radioButton4.setEnabled(true);
                    radioGroup.check(R.id.temperament_custom_select_buttonLoad);
                }
                radioButton2.setOnClickListener(new al(this, dialog));
                break;
            case 112:
                new bc(this, dialog, -1, cd.n());
                break;
            case 113:
                if (e()) {
                    new bc(this, dialog, cd.l(), cd.n());
                }
                break;
            case 114:
                if (e()) {
                    ((AlertDialog) dialog).setMessage(String.format("Delete custom temperament '%s'? This operation cannot be undone.", ce.b(((ce) cd.k().get(cd.l())).a())));
                }
                break;
            case 115:
                List listC2 = cb.c();
                ArrayList arrayList5 = new ArrayList();
                for (int i17 = 0; i17 < listC2.size(); i17++) {
                    String strA3 = ((cb) listC2.get(i17)).a();
                    arrayList5.add(new ch(strA3, false, null));
                    if (strA3.compareTo(cd.g()) == 0) {
                        i8 = i17;
                    }
                }
                ListView listView5 = (ListView) dialog.findViewById(R.id.instrument_preset_select_list);
                listView5.setAdapter((ListAdapter) new ci(getApplicationContext(), R.layout.item_checkable, arrayList5));
                listView5.setItemChecked(i8, true);
                listView5.setSelection(i8);
                listView5.setOnItemClickListener(new am(this, dialog, listC2));
                break;
            case 116:
                List listH = cd.h();
                ArrayList arrayList6 = new ArrayList();
                for (int i18 = 0; i18 < listH.size(); i18++) {
                    String strA4 = ((cb) listH.get(i18)).a();
                    arrayList6.add(new ch(cb.b(strA4), false, null));
                    if (strA4.compareTo(cd.g()) == 0) {
                        i2 = i18;
                    }
                }
                ListView listView6 = (ListView) dialog.findViewById(R.id.instrument_custom_select_list);
                RadioGroup radioGroup2 = (RadioGroup) dialog.findViewById(R.id.instrument_custom_select_buttonGroup);
                listView6.setAdapter((ListAdapter) new ci(getApplicationContext(), R.layout.item_checkable, arrayList6));
                listView6.setItemChecked(i2, true);
                listView6.setSelection(i2);
                listView6.setOnItemClickListener(new an(this, dialog, listH, radioGroup2));
                RadioButton radioButton5 = (RadioButton) dialog.findViewById(R.id.instrument_custom_select_buttonLoad);
                RadioButton radioButton6 = (RadioButton) dialog.findViewById(R.id.instrument_custom_select_buttonNew);
                RadioButton radioButton7 = (RadioButton) dialog.findViewById(R.id.instrument_custom_select_buttonEdit);
                RadioButton radioButton8 = (RadioButton) dialog.findViewById(R.id.instrument_custom_select_buttonDelete);
                if (arrayList6.size() == 0) {
                    radioButton5.setEnabled(false);
                    radioButton6.setEnabled(true);
                    radioButton7.setEnabled(false);
                    radioButton8.setEnabled(false);
                    radioGroup2.clearCheck();
                } else {
                    radioButton5.setEnabled(true);
                    radioButton6.setEnabled(cd.h().size() < 100);
                    radioButton7.setEnabled(true);
                    radioButton8.setEnabled(true);
                    radioGroup2.check(R.id.instrument_custom_select_buttonLoad);
                }
                radioButton6.setOnClickListener(new ao(this, dialog));
                break;
            case 117:
                new aw(this, this, dialog, -1, cd.n());
                break;
            case 118:
                if (f()) {
                    new aw(this, this, dialog, cd.i(), cd.n());
                }
                break;
            case 119:
                if (f()) {
                    ((AlertDialog) dialog).setMessage(String.format("Delete custom instrument '%s'? This operation cannot be undone.", cb.b(((cb) cd.h().get(cd.i())).a())));
                }
                break;
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        cd.a(getApplicationContext());
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
    }
}
