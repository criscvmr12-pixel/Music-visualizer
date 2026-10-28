package com.symbolic.pitchlab;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class cb {
    private static List a = null;
    private String b;
    private int[] c;

    public cb(String str, String str2) {
        this.b = str;
        this.c = by.b(str2);
    }

    public static cb a(List list, String str) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                return null;
            }
            if (((cb) list.get(i2)).a().compareTo(str) == 0) {
                return (cb) list.get(i2);
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
                arrayList.add(new cb(sharedPreferences.getString(str4, String.format("<unknown %d>", Integer.valueOf(i2))), sharedPreferences.getString(String.valueOf(str3) + "Notes", "")));
            }
        }
        return a(arrayList);
    }

    public static List a(List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new cc());
        return arrayList;
    }

    public static List a(List list, cb cbVar) {
        ArrayList arrayList = new ArrayList(list);
        int i = 0;
        int i2 = -1;
        while (true) {
            int i3 = i;
            if (i3 >= arrayList.size() || i2 >= 0) {
                break;
            }
            if (((cb) arrayList.get(i3)).a().compareTo(cbVar.a()) == 0) {
                i2 = i3;
            }
            i = i3 + 1;
        }
        if (i2 >= 0) {
            arrayList.set(i2, cbVar);
        } else {
            arrayList.add(cbVar);
        }
        return a(arrayList);
    }

    public static void a(SharedPreferences.Editor editor, String str, String str2, List list) {
        editor.putInt(str, list.size());
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                return;
            }
            cb cbVar = (cb) list.get(i2);
            String str3 = String.valueOf(str2) + Integer.toString(i2) + "_";
            editor.putString(String.valueOf(str3) + "Name", cbVar.a());
            editor.putString(String.valueOf(str3) + "Notes", cbVar.toString());
            i = i2 + 1;
        }
    }

    public static boolean a(String str) {
        return str.length() > 0 && str.charAt(0) == '!';
    }

    public static String b(String str) {
        return a(str) ? str.substring(1) : str;
    }

    public static List c() {
        if (a == null) {
            a = new ArrayList();
            a.add(new cb("Guitar, Standard", "E2 A2 D3 G3 B3 E4"));
            a.add(new cb("Guitar, Drop D", "D2 A2 D3 G3 B3 E4"));
            a.add(new cb("Guitar, Open D", "D2 A2 D3 F#3 A3 D4"));
            a.add(new cb("Guitar, Open G", "D2 G2 D3 G3 B3 D4"));
            a.add(new cb("Guitar, Open A", "E2 A2 E3 A3 C#4 E4"));
            a.add(new cb("Guitar, Lute", "E2 A2 D3 F#3 B3 E4"));
            a.add(new cb("Guitar, Irish", "D2 A2 D3 G3 A3 D4"));
            a.add(new cb("Bass Guitar, (4 String), Standard", "E1 A1 D2 G2"));
            a.add(new cb("Bass Guitar, (5 String), Low B", "B0 E1 A1 D2 G2"));
            a.add(new cb("Bass Guitar, (5 String), Low E", "E1 A1 D2 G2 C3"));
            a.add(new cb("Bass Guitar, (6 String), Standard", "B0 E1 A1 D2 G2 C3"));
            a.add(new cb("Violin", "G3 D4 A4 E5"));
            a.add(new cb("Violin (Tenor)", "G2 D3 A3 E4"));
            a.add(new cb("Viola", "C3 G3 D4 A4"));
            a.add(new cb("Fiddle, Standard", "G3 D4 A4 E5"));
            a.add(new cb("Fiddle, Cajun", "F3 C4 G4 D5"));
            a.add(new cb("Fiddle, Open G", "G3 D4 G4 B4"));
            a.add(new cb("Fiddle, Sawmill", "G3 D4 G4 D5"));
            a.add(new cb("Fiddle, Gee-dad", "G3 D4 A4 D5"));
            a.add(new cb("Fiddle, Open D", "D3 D4 A4 D5"));
            a.add(new cb("Fiddle, High bass", "A3 D4 A4 E5"));
            a.add(new cb("Fiddle, Cross tuning", "A3 E4 A4 E5"));
            a.add(new cb("Fiddle, Calico", "A3 E4 A4 C#5"));
            a.add(new cb("Mandolin", "G3 G3 D4 D4 A4 A4 E5 E5"));
            a.add(new cb("Mandolin (Octave)", "G2 G2 D3 D3 A3 A3 E4 E4"));
            a.add(new cb("Ukulele (Concert), Standard", "G4 C4 E4 A4"));
            a.add(new cb("Ukulele (Concert), D6/Soprano", "A4 D4 F#4 B4"));
            a.add(new cb("Ukulele (Tenor)", "G3 C4 E4 A4"));
            a.add(new cb("Ukulele (Baritone)", "D3 G3 B3 E4"));
            a.add(new cb("Ukulele (Bass)", "E1 A1 D2 G2"));
            a.add(new cb("Banjo (5 string), Standard/Open G", "G4 D3 G3 B3 D4"));
            a.add(new cb("Banjo (5 string), C tuning", "G4 C3 G3 B3 D4"));
            a.add(new cb("Banjo (5 string), Double C", "G4 C3 G3 C4 D4"));
            a.add(new cb("Banjo (5 string), Sawmill", "G4 D3 G3 C4 D4"));
            a.add(new cb("Banjo (5 string), Open D", "F#4 D3 F#3 A3 D4"));
            a.add(new cb("Banjo (5 string), Guitar", "G4 D3 G3 B3 E4"));
            a.add(new cb("Banjo (5 string), Willie Moore", "G4 D3 G3 A3 D4"));
            a.add(new cb("Banjo (5 string), Dock Boggs (Low C)", "F#4 C3 G3 A3 D4"));
            a.add(new cb("Banjo (5 string), Dock Boggs (Low D)", "F#4 D3 G3 A3 D4"));
            a.add(new cb("Banjo (5 string), Cumberland Gap", "G4 E3 A3 D4 E4"));
            a.add(new cb("Banjo (5 string), G Minor", "G4 D3 G3 A#3 D4"));
            a.add(new cb("Banjo (5 string), Open C", "G4 C3 G3 C4 E4"));
            a.add(new cb("Banjo (Plectrum)", "C3 G3 B3 D4"));
            a.add(new cb("Banjo (Tenor), Standard", "C3 G3 D4 A4"));
            a.add(new cb("Banjo (Tenor), Irish", "G2 D3 A3 E4"));
            a.add(new cb("Banjo (Long neck)", "G4 B2 E3 G#3 B3"));
            a.add(new cb("Bouzouki (8 string)", "C3 C4 F3 F4 A3 A3 D4 D4"));
            a.add(new cb("Bouzouki (6 string)", "D3 D4 A3 A3 D4 D4"));
            a.add(new cb("Pedal Steel, Standard/E9th", "B2 D3 E3 F#3 G#3 B3 E4 G#4 D#4 F#4"));
            a.add(new cb("Pedal Steel, C6th", "C2 F2 A2 C3 E3 G3 A3 C4 E4 D4"));
            a.add(new cb("Pedal Steel, A7th", "A1 E2 G2 A2 C#3 E3 G3 A3 C#4 E4"));
            a.add(new cb("Pedal Steel, C Diatonic", "G2 A2 C3 E3 F3 G3 A3 B3 C4 E4"));
        }
        return a;
    }

    public String a() {
        return this.b;
    }

    public int[] b() {
        return (int[]) this.c.clone();
    }

    public String toString() {
        return by.a(this.c, 0);
    }
}
