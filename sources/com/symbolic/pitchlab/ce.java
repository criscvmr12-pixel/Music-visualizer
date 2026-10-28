package com.symbolic.pitchlab;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ce {
    static final /* synthetic */ boolean a;
    private static List d;
    private String b;
    private float[] c;

    static {
        a = !ce.class.desiredAssertionStatus();
        d = null;
    }

    public ce(String str, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13) {
        this.b = str;
        this.c = new float[]{a(d2), a(d3), a(d4), a(d5), a(d6), a(d7), a(d8), a(d9), a(d10), a(d11), a(d12), a(d13)};
    }

    public ce(String str, float[] fArr) {
        this.b = str;
        if (!a && fArr.length != 12) {
            throw new AssertionError();
        }
        this.c = (float[]) fArr.clone();
    }

    private static float a(double d2) {
        return (float) d2;
    }

    public static ce a(List list, String str) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                return null;
            }
            if (((ce) list.get(i2)).a().compareTo(str) == 0) {
                return (ce) list.get(i2);
            }
            i = i2 + 1;
        }
    }

    public static List a(SharedPreferences sharedPreferences, String str, String str2) {
        int i = sharedPreferences.getInt(str, 0);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            String str3 = String.valueOf(str2) + Integer.toString(i2) + "_";
            String str4 = String.valueOf(str3) + "Name";
            if (sharedPreferences.contains(str4)) {
                String string = sharedPreferences.getString(str4, String.format("<unknown %d>", Integer.valueOf(i2)));
                float[] fArr = new float[12];
                for (int i3 = 0; i3 < 12; i3++) {
                    fArr[i3] = sharedPreferences.getFloat(String.valueOf(str3) + "Cents" + Integer.toString(i3), 0.0f);
                }
                arrayList.add(new ce(string, fArr));
            }
        }
        return a(arrayList);
    }

    public static List a(List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new cf());
        return arrayList;
    }

    public static List a(List list, ce ceVar) {
        ArrayList arrayList = new ArrayList(list);
        int i = 0;
        int i2 = -1;
        while (true) {
            int i3 = i;
            if (i3 >= arrayList.size() || i2 >= 0) {
                break;
            }
            if (((ce) arrayList.get(i3)).a().compareTo(ceVar.a()) == 0) {
                i2 = i3;
            }
            i = i3 + 1;
        }
        if (i2 >= 0) {
            arrayList.set(i2, ceVar);
        } else {
            arrayList.add(ceVar);
        }
        return a(arrayList);
    }

    public static void a(SharedPreferences.Editor editor, String str, String str2, List list) {
        editor.putInt(str, list.size());
        for (int i = 0; i < list.size(); i++) {
            ce ceVar = (ce) list.get(i);
            String str3 = String.valueOf(str2) + Integer.toString(i) + "_";
            editor.putString(String.valueOf(str3) + "Name", ceVar.a());
            float[] fArrB = ceVar.b();
            for (int i2 = 0; i2 < 12; i2++) {
                editor.putFloat(String.valueOf(str3) + "Cents" + Integer.toString(i2), fArrB[i2]);
            }
        }
    }

    public static boolean a(String str) {
        return str.length() > 0 && str.charAt(0) == '!';
    }

    public static String b(String str) {
        return a(str) ? str.substring(1) : str;
    }

    public static List c() {
        if (d == null) {
            d = new ArrayList();
            d.add(new ce("Equal Tempered (Perfect Octave)", 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d));
            d.add(new ce("Equal Tempered (Perfect Fifth)", -2.5d, -2.2d, -2.0d, -1.7d, -1.4d, -1.1d, -0.8d, -0.6d, -0.3d, 0.0d, 0.3d, 0.6d));
            d.add(new ce("Kirnberger I", 15.6d, 5.9d, 19.6d, 9.8d, 2.0d, 13.7d, 5.9d, 17.6d, 7.8d, 0.0d, 11.7d, 3.9d));
            d.add(new ce("Kirnberger IIa", 4.9d, -4.9d, 8.8d, -1.0d, -8.8d, 2.9d, -4.9d, 6.8d, -2.9d, 0.0d, 1.0d, -6.8d));
            d.add(new ce("Kirnberger IIb", 5.9d, -3.9d, 9.8d, 0.0d, -9.8d, 3.9d, -5.9d, 7.8d, -2.0d, 0.0d, 2.0d, -7.8d));
            d.add(new ce("Kirnberger III", 10.3d, 0.5d, 3.4d, 4.4d, -3.4d, 8.3d, 0.5d, 6.8d, 2.4d, 0.0d, 6.4d, -1.5d));
            d.add(new ce("Meantone", 8.8d, -9.8d, 2.9d, 15.6d, -2.9d, 11.7d, -7.8d, 5.9d, -10.8d, 0.0d, 13.7d, -5.9d));
            d.add(new ce("Meantone (#, -1/4)", 10.3d, -13.7d, 3.4d, -20.5d, -3.4d, 13.7d, -10.3d, 6.8d, -17.1d, 0.0d, -24.0d, -6.8d));
            d.add(new ce("Meantone (b, -1/4)", 10.3d, 27.4d, 3.4d, 20.5d, -3.4d, 13.7d, 30.8d, 6.8d, 24.0d, 0.0d, 17.1d, -6.8d));
            d.add(new ce("Meantone (Homogeneous)", 7.0d, -9.4d, 2.3d, 14.1d, -2.3d, 9.4d, -7.0d, 4.7d, -11.7d, 0.0d, 11.7d, -4.7d));
            d.add(new ce("Meantone (Homogeneous third)", 12.6d, -16.8d, 4.2d, 25.1d, -4.2d, 16.8d, -12.6d, 8.4d, -21.0d, 0.0d, 21.0d, -8.4d));
            d.add(new ce("Meantone (Homogeneous gradated)", 4.9d, -6.5d, 1.6d, 9.8d, -1.6d, 6.5d, -4.9d, 3.3d, -8.1d, 0.0d, 8.1d, -3.3d));
            d.add(new ce("Pythagorean", -5.9d, 7.8d, -2.0d, -11.7d, 2.0d, -7.8d, 5.9d, -3.9d, 9.8d, 0.0d, -9.8d, 3.9d));
            d.add(new ce("Pythagorean (Perfect)", 15.6d, 7.8d, 19.6d, 11.7d, 2.0d, 13.7d, 5.9d, 17.6d, 9.8d, 0.0d, 11.7d, 3.9d));
            d.add(new ce("Valotti", 5.9d, 0.0d, 2.0d, 3.9d, -2.0d, 7.8d, -2.0d, 3.9d, 2.0d, 0.0d, 5.9d, -3.9d));
            d.add(new ce("Young I", 5.9d, 0.0d, 2.0d, 3.9d, -2.0d, 5.9d, -2.0d, 3.9d, 2.0d, 0.0d, 5.9d, -2.0d));
            d.add(new ce("Young II", 5.9d, -3.9d, 2.0d, 0.0d, -2.0d, 3.9d, -5.9d, 3.9d, -2.0d, 0.0d, 2.0d, -3.9d));
        }
        return d;
    }

    public String a() {
        return this.b;
    }

    public float[] b() {
        return this.c;
    }
}
