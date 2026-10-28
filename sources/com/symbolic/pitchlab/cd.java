package com.symbolic.pitchlab;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class cd {
    private static final List a = new ArrayList();
    private static final List b = new ArrayList();
    private static int c = 0;
    private static int d = 44100;
    private static int e = 0;
    private static float f = 440.0f;
    private static String g = "";
    private static List h = a;
    private static int i = -1;
    private static String j = "";
    private static List k = b;
    private static int l = -1;
    private static int m = 5;
    private static int n = 0;
    private static float o = 5.0f;
    private static int p = 0;
    private static int q = 0;
    private static String r = "";
    private static String s = "";
    private static boolean t = false;
    private static int u = 1;
    private static int v = 0;

    public static synchronized String a() {
        return "1_0_22";
    }

    public static synchronized void a(float f2) {
        f = f2;
    }

    public static synchronized void a(int i2) {
        d = i2;
    }

    public static synchronized void a(Context context) {
        SharedPreferences sharedPreferencesC = c(context);
        c = sharedPreferencesC.getInt("viewMode", 0);
        d = sharedPreferencesC.getInt("sampleRate", 44100);
        e = sharedPreferencesC.getInt("analysisRate", 0);
        f = sharedPreferencesC.getFloat("A4ReferenceHz", 440.0f);
        m = sharedPreferencesC.getInt("texTypeSpectrogram", 5);
        n = sharedPreferencesC.getInt("noteNameStyle", 0);
        o = sharedPreferencesC.getFloat("inTuneThreshold", 5.0f);
        p = sharedPreferencesC.getInt("screenOrientation", 0);
        q = sharedPreferencesC.getInt("usageMask", 0);
        r = sharedPreferencesC.getString("audioSetupVersion", "");
        s = sharedPreferencesC.getString("audioAnalysisVersion", "");
        t = sharedPreferencesC.getBoolean("welcomeShown_1_0_22", false);
        j = sharedPreferencesC.getString("temperamentName", "");
        k = ce.a(sharedPreferencesC, "customTemperamentCount", "customTemperamentInstance");
        l = sharedPreferencesC.getInt("customTemperamentFocus", -1);
        g = sharedPreferencesC.getString("instrumentName", "");
        h = cb.a(sharedPreferencesC, "customInstrumentCount", "customInstrumentInstance");
        i = sharedPreferencesC.getInt("customInstrumentFocus", -1);
    }

    public static synchronized void a(String str) {
        g = str;
    }

    public static synchronized void a(List list) {
        h = new ArrayList(list);
    }

    public static synchronized void a(boolean z) {
        t = z;
    }

    public static synchronized String b() {
        return String.valueOf(Environment.getExternalStorageDirectory().getAbsolutePath()) + "/PitchLab";
    }

    public static synchronized void b(float f2) {
        o = f2;
    }

    public static synchronized void b(int i2) {
        e = i2;
    }

    public static synchronized void b(Context context) {
        SharedPreferences.Editor editorEdit = c(context).edit();
        editorEdit.clear();
        editorEdit.putInt("viewMode", c);
        editorEdit.putInt("sampleRate", d);
        editorEdit.putInt("analysisRate", e);
        editorEdit.putFloat("A4ReferenceHz", f);
        editorEdit.putString("instrumentName", g);
        editorEdit.putString("temperamentName", j);
        editorEdit.putInt("texTypeSpectrogram", m);
        editorEdit.putInt("noteNameStyle", n);
        editorEdit.putFloat("inTuneThreshold", o);
        editorEdit.putInt("screenOrientation", p);
        editorEdit.putInt("usageMask", q);
        editorEdit.putString("audioSetupVersion", r);
        editorEdit.putString("audioAnalysisVersion", s);
        cb.a(editorEdit, "customInstrumentCount", "customInstrumentInstance", h);
        editorEdit.putInt("customInstrumentFocus", i);
        ce.a(editorEdit, "customTemperamentCount", "customTemperamentInstance", k);
        editorEdit.putInt("customTemperamentFocus", l);
        editorEdit.putBoolean("welcomeShown_1_0_22", t);
        editorEdit.commit();
    }

    public static synchronized void b(String str) {
        j = str;
    }

    public static synchronized void b(List list) {
        k = new ArrayList(list);
    }

    public static synchronized int c() {
        return d;
    }

    private static SharedPreferences c(Context context) {
        return context.getSharedPreferences("com.symbolic.pitchlab.settings", 0);
    }

    public static synchronized void c(int i2) {
        i = i2;
    }

    public static synchronized void c(String str) {
        r = str;
    }

    public static synchronized int d() {
        return e;
    }

    public static synchronized void d(int i2) {
        l = i2;
    }

    public static synchronized void d(String str) {
        s = str;
    }

    public static synchronized float e() {
        return f;
    }

    public static synchronized void e(int i2) {
        m = i2;
    }

    public static synchronized float f() {
        return 440.0f;
    }

    public static synchronized void f(int i2) {
        n = i2;
    }

    public static synchronized String g() {
        return g;
    }

    public static synchronized void g(int i2) {
        p = i2;
    }

    public static synchronized List h() {
        return new ArrayList(h);
    }

    public static synchronized void h(int i2) {
        c = i2;
    }

    public static synchronized int i() {
        return i;
    }

    public static synchronized void i(int i2) {
        q = i2;
    }

    public static synchronized String j() {
        return j;
    }

    public static synchronized void j(int i2) {
        u = i2;
    }

    public static synchronized List k() {
        return new ArrayList(k);
    }

    public static synchronized void k(int i2) {
        v = i2;
    }

    public static synchronized int l() {
        return l;
    }

    public static synchronized int m() {
        return m;
    }

    public static synchronized int n() {
        return n;
    }

    public static synchronized float o() {
        return o;
    }

    public static synchronized int p() {
        return p;
    }

    public static synchronized int q() {
        return c;
    }

    public static synchronized int r() {
        return q;
    }

    public static synchronized String s() {
        return r;
    }

    public static synchronized String t() {
        return s;
    }

    public static synchronized boolean u() {
        return t;
    }

    public static synchronized int v() {
        return u;
    }

    public static synchronized int w() {
        return v;
    }

    public static synchronized void x() {
        c = 0;
        d = 44100;
        e = 0;
        f = 440.0f;
        g = "";
        i = -1;
        j = "";
        l = -1;
        m = 5;
        t = false;
        n = 0;
        o = 5.0f;
        p = 0;
        q = 0;
        r = "";
        s = "";
    }
}
