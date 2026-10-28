package com.symbolic.pitchlab;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class ActivityWelcome extends Activity {
    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        cd.b(getApplicationContext());
        startActivity(new Intent(this, (Class<?>) ActivityVisualiser.class));
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_crashlogs);
        cd.a(getApplicationContext());
    }

    @Override // android.app.Activity
    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case 100:
                Dialog dialogA = bz.a(this, bz.b());
                dialogA.setOnDismissListener(new bl(this));
                return dialogA;
            default:
                return null;
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onPrepareDialog(int i, Dialog dialog) {
        switch (i) {
            case 100:
                bz.a(this, dialog);
                break;
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (cd.u()) {
            a();
        } else {
            cd.a(true);
            showDialog(100);
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
    }
}
