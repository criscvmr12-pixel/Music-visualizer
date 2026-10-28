package com.google.android.gms.internal;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class hi {
    public static final Handler a = new Handler(Looper.getMainLooper());

    public static int a(Context context, int i) {
        return a(context.getResources().getDisplayMetrics(), i);
    }

    public static int a(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, i, displayMetrics);
    }

    public static String a(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (string == null || a()) {
            string = "emulator";
        }
        return a(string);
    }

    public static String a(String str) {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (NoSuchAlgorithmException e) {
            }
        }
        return null;
    }

    public static void a(ViewGroup viewGroup, am amVar, String str) {
        a(viewGroup, amVar, str, -16777216, -1);
    }

    private static void a(ViewGroup viewGroup, am amVar, String str, int i, int i2) {
        if (viewGroup.getChildCount() != 0) {
            return;
        }
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(i);
        textView.setBackgroundColor(i2);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i);
        int iA = a(context, 3);
        frameLayout.addView(textView, new FrameLayout.LayoutParams(amVar.g - iA, amVar.d - iA, 17));
        viewGroup.addView(frameLayout, amVar.g, amVar.d);
    }

    public static void a(ViewGroup viewGroup, am amVar, String str, String str2) {
        hj.e(str2);
        a(viewGroup, amVar, str, -65536, -16777216);
    }

    public static boolean a() {
        return Build.DEVICE.startsWith("generic");
    }

    public static boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
