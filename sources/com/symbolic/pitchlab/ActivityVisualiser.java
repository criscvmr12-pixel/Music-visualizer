package com.symbolic.pitchlab;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes.dex */
public class ActivityVisualiser extends Activity {
    private static Context f;
    private PowerManager.WakeLock a;
    private LinearLayout b;
    private cj c;
    private com.google.android.gms.ads.f d;
    private bo e;

    static long a(String str, long j) {
        long j2;
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
            try {
                j2 = Long.parseLong(randomAccessFile.readLine());
            } catch (IOException e) {
                j2 = j;
            }
            try {
                randomAccessFile.close();
                return j2;
            } catch (FileNotFoundException e2) {
                return j2;
            } catch (IOException e3) {
                return j2;
            }
        } catch (FileNotFoundException e4) {
            return j;
        }
    }

    private static cb a(String str) {
        cb cbVarA = cb.a(cb.c(), str);
        return cbVarA != null ? cbVarA : cb.a(cd.h(), str);
    }

    private void a() {
        b();
        try {
            this.e = bp.a(cd.c(), new bk(this));
            cd.j(0);
        } catch (Exception e) {
            this.e = null;
            cd.j(2);
        }
    }

    private void a(Configuration configuration) {
        if (this.d != null) {
            boolean z = configuration.orientation == 1;
            this.d.setVisibility(z ? 0 : 8);
            if (z) {
                this.d.c();
            } else {
                this.d.b();
            }
        }
    }

    private static ce b(String str) {
        ce ceVarA = ce.a(ce.c(), str);
        return ceVarA != null ? ceVarA : ce.a(cd.k(), str);
    }

    private void b() {
        if (this.e != null) {
            this.e.a();
            this.e = null;
        }
    }

    private void c() {
        int i = 8;
        int i2 = 0;
        cb cbVarA = a(cd.g());
        cb cbVar = cbVarA == null ? (cb) cb.c().get(0) : cbVarA;
        cd.a(cbVar.a());
        ce ceVarB = b(cd.j());
        ce ceVar = ceVarB == null ? (ce) ce.c().get(0) : ceVarB;
        cd.b(ceVar.a());
        switch (cd.d()) {
            case -1:
                i = 4;
                break;
            case 1:
                i = 16;
                break;
        }
        if (cd.t().equals("1.0.15")) {
            i2 = 1;
        } else if (cd.t().equals("1.0.16")) {
            i2 = 2;
        }
        PitchLabNative.setAnalysisParameters(cb.b(cbVar.a()), cbVar.b(), ceVar.b(), cd.e(), cd.o(), i, i2);
    }

    private void d() {
        cd.a(getApplicationContext());
        c();
        switch (cd.p()) {
            case 1:
                setRequestedOrientation(0);
                break;
            case 2:
                setRequestedOrientation(1);
                break;
            default:
                setRequestedOrientation(4);
                break;
        }
        float fE = cd.e();
        String str = fE != cd.f() ? String.valueOf("") + String.format("\nA4 Reference: %.1fhz", Float.valueOf(fE)) : "";
        cd.g().equals(((cb) cb.c().get(0)).a());
        String strJ = cd.j();
        if (!strJ.equals(((ce) ce.c().get(0)).a())) {
            str = ce.a(strJ) ? String.valueOf(str) + String.format("\nCustom Temperament: '%s'", ce.b(strJ)) : String.valueOf(str) + String.format("\nPreset Temperament: '%s'", strJ);
        }
        String strTrim = str.trim();
        if (strTrim.length() > 0) {
            Toast.makeText(getApplicationContext(), strTrim, 1).show();
        }
    }

    private void e() {
        cd.b(getApplicationContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        startActivity(new Intent(this, (Class<?>) ActivityOptions.class));
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a(configuration);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        PitchLabNative.a();
        f = getApplicationContext();
        super.onCreate(bundle);
        setContentView(R.layout.activity_visualiser);
        this.a = ((PowerManager) getSystemService("power")).newWakeLock(26, "DoNotDimScreen");
        try {
            AudioManager audioManager = (AudioManager) getSystemService("audio");
            int mode = audioManager.getMode();
            try {
                audioManager.setMode(2);
                audioManager.setMicrophoneMute(false);
                audioManager.setMode(mode);
            } catch (Throwable th) {
                audioManager.setMode(mode);
                throw th;
            }
        } catch (Exception e) {
        }
        this.b = (LinearLayout) findViewById(R.id.VisualiserLayout);
        this.c = new cj(f);
        this.b.addView(this.c, new LinearLayout.LayoutParams(-1, -1, 1.0f));
        this.c.setActivity(this);
        if ((a("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq", 0L) / 1000) * ((long) Runtime.getRuntime().availableProcessors()) >= 2000 && com.google.android.gms.common.g.a(f) == 0) {
            this.d = new com.google.android.gms.ads.f(this);
            this.d.setAdSize(com.google.android.gms.ads.e.g);
            this.d.setAdUnitId("ca-app-pub-1361322998704129/5393057496");
            this.b.addView(this.d, new LinearLayout.LayoutParams(-1, -2));
            this.d.a(bm.b());
        }
        this.c.setOnLongPressListener(new bi(this));
        d();
    }

    @Override // android.app.Activity
    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case 100:
                int numViews = PitchLabNative.getNumViews();
                CharSequence[] charSequenceArr = new CharSequence[numViews + 1];
                for (int i2 = 0; i2 < numViews; i2++) {
                    charSequenceArr[i2] = PitchLabNative.getViewName(i2);
                }
                charSequenceArr[numViews] = "Options";
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("PitchLab Views");
                builder.setSingleChoiceItems(charSequenceArr, -1, new bj(this, numViews));
                return builder.create();
            default:
                return null;
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        bm.a();
        if (this.d != null) {
            this.d.a();
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 82) {
            return super.onKeyDown(i, keyEvent);
        }
        f();
        return true;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        if (this.d != null) {
            this.d.b();
        }
        this.c.onPause();
        this.a.release();
        b();
        e();
        PitchLabNative.appPaused();
    }

    @Override // android.app.Activity
    protected void onPrepareDialog(int i, Dialog dialog) {
        switch (i) {
            case 100:
                int iQ = cd.q();
                ListView listView = ((AlertDialog) dialog).getListView();
                listView.setItemChecked(iQ, true);
                listView.setSelection(iQ);
                break;
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        d();
        a();
        this.a.acquire();
        this.c.onResume();
        a(getResources().getConfiguration());
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        PitchLabNative.appPaused();
    }
}
