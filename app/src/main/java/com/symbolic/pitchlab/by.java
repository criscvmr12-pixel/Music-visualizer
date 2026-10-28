package com.symbolic.pitchlab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class by {
    private static Map b = null;
    public static final String[][] a = {new String[]{"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"}, new String[]{"C", "Db", "D", "Eb", "E", "F", "Gb", "G", "Ab", "A", "Bb", "B"}};

    public static int a(String str) {
        int i = 0;
        String str2 = "";
        while (!a(str.charAt(i))) {
            str2 = String.valueOf(str2) + str.charAt(i);
            i++;
        }
        String str3 = "";
        for (int i2 = i; i2 < str.length(); i2++) {
            str3 = String.valueOf(str3) + str.charAt(i2);
        }
        return ((Integer) a().get(str2)).intValue() + (Integer.parseInt(str3) * 12);
    }

    private static int a(String str, int i) {
        while (i < str.length() && b(str.charAt(i))) {
            i++;
        }
        return i;
    }

    public static String a(int i, int i2) {
        return String.format("%s%d", a[i2][i % 12], Integer.valueOf(i / 12));
    }

    public static String a(int[] iArr, int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 : iArr) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(a(i2, i));
        }
        return sb.toString();
    }

    private static Map a() {
        if (b == null) {
            b = new HashMap();
            for (int i = 0; i < a.length; i++) {
                for (int i2 = 0; i2 < 12; i2++) {
                    b.put(a[i][i2], Integer.valueOf(i2));
                }
            }
        }
        return b;
    }

    private static boolean a(char c) {
        return c >= '0' && c <= '9';
    }

    private static boolean b(char c) {
        return c == ' ';
    }

    public static int[] b(String str) {
        int iA = a(str, 0);
        ArrayList arrayList = new ArrayList();
        while (iA < str.length()) {
            int i = iA;
            while (i < str.length() && !b(str.charAt(i))) {
                i++;
            }
            arrayList.add(Integer.valueOf(a(str.substring(iA, i))));
            iA = a(str, i);
        }
        int[] iArr = new int[arrayList.size()];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr;
    }
}
