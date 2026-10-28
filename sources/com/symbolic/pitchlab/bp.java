package com.symbolic.pitchlab;

/* JADX INFO: loaded from: classes.dex */
public class bp {
    public static bo a(int i, bn bnVar) {
        String strS = cd.s();
        if ((cd.w() & 1) != 0) {
            return new bw(i, bnVar);
        }
        if (strS.equals("1.0.0")) {
            return new bq(i, bnVar);
        }
        return strS.equals("1.0.7") ? new bs(i, bnVar) : new bu(i, bnVar);
    }

    public static String[] a() {
        return new String[]{"1.0.0", "1.0.7", "Latest"};
    }
}
