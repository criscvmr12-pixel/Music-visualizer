package com.symbolic.pitchlab;

import android.app.Dialog;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
class bc {
    final /* synthetic */ ActivityOptions a;

    public bc(ActivityOptions activityOptions, Dialog dialog, int i, int i2) {
        float[] fArr;
        this.a = activityOptions;
        EditText editText = (EditText) dialog.findViewById(R.id.temperament_custom_name_edit);
        int[][] iArr = {new int[]{R.id.temperament_custom_C_big_down, R.id.temperament_custom_C_small_down, R.id.temperament_custom_C_text, R.id.temperament_custom_C_small_up, R.id.temperament_custom_C_big_up}, new int[]{R.id.temperament_custom_Cs_big_down, R.id.temperament_custom_Cs_small_down, R.id.temperament_custom_Cs_text, R.id.temperament_custom_Cs_small_up, R.id.temperament_custom_Cs_big_up}, new int[]{R.id.temperament_custom_D_big_down, R.id.temperament_custom_D_small_down, R.id.temperament_custom_D_text, R.id.temperament_custom_D_small_up, R.id.temperament_custom_D_big_up}, new int[]{R.id.temperament_custom_Ds_big_down, R.id.temperament_custom_Ds_small_down, R.id.temperament_custom_Ds_text, R.id.temperament_custom_Ds_small_up, R.id.temperament_custom_Ds_big_up}, new int[]{R.id.temperament_custom_E_big_down, R.id.temperament_custom_E_small_down, R.id.temperament_custom_E_text, R.id.temperament_custom_E_small_up, R.id.temperament_custom_E_big_up}, new int[]{R.id.temperament_custom_F_big_down, R.id.temperament_custom_F_small_down, R.id.temperament_custom_F_text, R.id.temperament_custom_F_small_up, R.id.temperament_custom_F_big_up}, new int[]{R.id.temperament_custom_Fs_big_down, R.id.temperament_custom_Fs_small_down, R.id.temperament_custom_Fs_text, R.id.temperament_custom_Fs_small_up, R.id.temperament_custom_Fs_big_up}, new int[]{R.id.temperament_custom_G_big_down, R.id.temperament_custom_G_small_down, R.id.temperament_custom_G_text, R.id.temperament_custom_G_small_up, R.id.temperament_custom_G_big_up}, new int[]{R.id.temperament_custom_Gs_big_down, R.id.temperament_custom_Gs_small_down, R.id.temperament_custom_Gs_text, R.id.temperament_custom_Gs_small_up, R.id.temperament_custom_Gs_big_up}, new int[]{R.id.temperament_custom_A_big_down, R.id.temperament_custom_A_small_down, R.id.temperament_custom_A_text, R.id.temperament_custom_A_small_up, R.id.temperament_custom_A_big_up}, new int[]{R.id.temperament_custom_As_big_down, R.id.temperament_custom_As_small_down, R.id.temperament_custom_As_text, R.id.temperament_custom_As_small_up, R.id.temperament_custom_As_big_up}, new int[]{R.id.temperament_custom_B_big_down, R.id.temperament_custom_B_small_down, R.id.temperament_custom_B_text, R.id.temperament_custom_B_small_up, R.id.temperament_custom_B_big_up}};
        int[] iArr2 = {R.id.temperament_custom_C_name, R.id.temperament_custom_Cs_name, R.id.temperament_custom_D_name, R.id.temperament_custom_Ds_name, R.id.temperament_custom_E_name, R.id.temperament_custom_F_name, R.id.temperament_custom_Fs_name, R.id.temperament_custom_G_name, R.id.temperament_custom_Gs_name, R.id.temperament_custom_A_name, R.id.temperament_custom_As_name, R.id.temperament_custom_B_name};
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= 12) {
                break;
            }
            ((TextView) dialog.findViewById(iArr2[i4])).setText(by.a[i2][i4]);
            i3 = i4 + 1;
        }
        float[] fArr2 = new float[12];
        if (i >= 0) {
            ce ceVar = (ce) cd.k().get(i);
            float[] fArrB = ceVar.b();
            editText.setText(ce.b(ceVar.a()));
            fArr = fArrB;
        } else {
            editText.setText("<name>");
            fArr = fArr2;
        }
        cs[] csVarArr = new cs[12];
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (i6 >= 12) {
                ((Button) dialog.findViewById(R.id.temperament_custom_buttonSave)).setOnClickListener(new bd(this, editText, csVarArr, dialog));
                ((Button) dialog.findViewById(R.id.temperament_custom_buttonReset)).setOnClickListener(new bg(this, csVarArr));
                ((Button) dialog.findViewById(R.id.temperament_custom_buttonCancel)).setOnClickListener(new bh(this, dialog));
                return;
            }
            csVarArr[i6] = new cs(dialog, fArr[i6], 0.0f, -35.0f, 35.0f, 1.0f, 0.1f, iArr[i6][0], iArr[i6][1], iArr[i6][2], iArr[i6][3], iArr[i6][4]);
            i5 = i6 + 1;
        }
    }
}
