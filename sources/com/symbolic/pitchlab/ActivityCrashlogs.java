package com.symbolic.pitchlab;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes.dex */
public class ActivityCrashlogs extends Activity {
    private static String a = "Press <Email> to send the crash report to the PitchLab developer via email.";
    private static String b = "Press <Later> to save the crash report so you can deal with it later (you will see this dialog next time you run PitchLab).";
    private static String c = "Press <Delete> to delete the crash report (you will not see this dialog again unless a new crash report is generated).";
    private List d;
    private boolean e = false;
    private boolean f = false;
    private Handler g = new Handler();

    public static String a() {
        String strD = d();
        new File(strD).mkdirs();
        return strD;
    }

    private static void a(List list, String str) {
        try {
            for (File file : new File(str).listFiles()) {
                String str2 = String.valueOf(str) + "/" + file.getName();
                if (file.isDirectory()) {
                    a(list, str2);
                } else {
                    list.add(str2);
                }
            }
        } catch (Exception e) {
        }
    }

    private static String b() {
        return String.valueOf(cd.b()) + "/crashlogs";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Activity activity) {
        try {
            String str = activity.getPackageManager().getPackageInfo(activity.getPackageName(), 0).versionName;
            Intent intent = new Intent("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.EMAIL", new String[]{bz.a()});
            intent.putExtra("android.intent.extra.SUBJECT", "PitchLab crash report (" + str + ")");
            intent.putExtra("android.intent.extra.TEXT", "<If you have the time, please describe when and how the crash happened>\n\n--- your device information --\n\n" + h());
            intent.setType("application/zip");
            intent.putExtra("android.intent.extra.STREAM", Uri.parse("file://" + c()));
            activity.startActivity(Intent.createChooser(intent, "Send Email"));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private static String c() {
        return String.valueOf(cd.b()) + "/crashlogs.zip";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            new File((String) it.next()).delete();
        }
    }

    private static String d() {
        return String.valueOf(b()) + "/" + cd.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(List list) {
        try {
            byte[] bArr = new byte[8192];
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(c()), bArr.length));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(str), bArr.length);
                zipOutputStream.putNextEntry(new ZipEntry(str));
                while (true) {
                    int i = bufferedInputStream.read(bArr, 0, bArr.length);
                    if (i == -1) {
                        break;
                    }
                    zipOutputStream.write(bArr, 0, i);
                }
                bufferedInputStream.close();
            }
            zipOutputStream.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        startActivity(new Intent(this, (Class<?>) ActivityWelcome.class));
        finish();
    }

    private static List f() {
        ArrayList arrayList = new ArrayList();
        a(arrayList, b());
        return arrayList;
    }

    private static void g() {
        new File(c()).delete();
    }

    private static String h() {
        return "BOARD: " + Build.BOARD + "\nBRAND: " + Build.BRAND + "\nCPU_ABI: " + Build.CPU_ABI + "\nDEVICE: " + Build.DEVICE + "\nDISPLAY: " + Build.DISPLAY + "\nFINGERPRINT: " + Build.FINGERPRINT + "\nHOST: " + Build.HOST + "\nID: " + Build.ID + "\nMANUFACTURER: " + Build.MANUFACTURER + "\nMODEL: " + Build.MODEL + "\nPRODUCT: " + Build.PRODUCT + "\nTAGS: " + Build.TAGS + "\nTIME: " + new Date(Build.TIME) + "\nTYPE: " + Build.TYPE + "\nUSER: " + Build.USER;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_crashlogs);
        cd.a(getApplicationContext());
        g();
        this.d = f();
        if (this.d.size() <= 0) {
            e();
        }
    }

    @Override // android.app.Activity
    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case 100:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setIcon(R.drawable.ic_launcher);
                builder.setTitle("PitchLab crash detected!");
                builder.setMessage("A previous session of PitchLab has crashed and generated an automated crash report. This crash report contains no personal information and could be very helpful in finding and fixing the cause of the crash.\n\n" + a + "\n\n" + b + "\n\n" + c);
                builder.setPositiveButton("Email", new b(this));
                builder.setNeutralButton("Later", new c(this));
                builder.setNegativeButton("Delete", new d(this));
                builder.setCancelable(false);
                return builder.create();
            case 101:
                AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
                builder2.setIcon(R.drawable.ic_launcher);
                builder2.setTitle("Tidy up");
                builder2.setMessage("The crash report is still stored on your device.  If you decided not to send an email right now, you can save the crash report and deal with it later. Otherwise, you should delete the crash report now to avoid sending duplicate copies or filling up your device storage.\n\n" + b + "\n\n" + c);
                builder2.setPositiveButton("Later", new e(this));
                builder2.setNegativeButton("Delete", new f(this));
                builder2.setCancelable(false);
                return builder2.create();
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
                if (!this.e) {
                    AlertDialog alertDialog = (AlertDialog) dialog;
                    alertDialog.getButton(-1).setOnClickListener(new g(this, alertDialog));
                    alertDialog.getButton(-3).setOnClickListener(new h(this, alertDialog));
                    alertDialog.getButton(-2).setOnClickListener(new i(this, alertDialog));
                    this.e = true;
                }
                break;
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.d.size() > 0) {
            this.g.postDelayed(new a(this), 250L);
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
    }
}
