package com.symbolic.pitchlab;

/* JADX INFO: loaded from: classes.dex */
public class PitchLabNative {
    private static boolean a = false;

    public static synchronized void a() {
        if (!a) {
            System.loadLibrary("PitchLab");
            initialiseNative(ActivityCrashlogs.a());
            a = true;
        }
    }

    public static native synchronized void appPaused();

    public static native synchronized void drawFrame(int i, int i2, int i3, int i4, int i5, int i6);

    public static native synchronized String getNoteNameTitle(int i);

    public static native synchronized int getNumNoteNames();

    public static native synchronized int getNumViews();

    public static native synchronized String getViewName(int i);

    private static native synchronized void initialiseNative(String str);

    public static native synchronized void processStreamedSamples(short[] sArr, int i, int i2);

    public static native synchronized void setAnalysisParameters(String str, int[] iArr, float[] fArr, float f, float f2, int i, int i2);

    public static native synchronized void surfaceChanged(int i, int i2);

    public static native synchronized void surfaceCreated();
}
