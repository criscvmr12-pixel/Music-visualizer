package com.symbolic.pitchlab;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.pm.PackageManager;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class bz {
    private static final String[] a = {"1.0.22: Updated feature set to avoid potential patent issues (sorry people, please don't complain).", "1.0.21: Improved error checking to fix intermittent crash.", "1.0.20: Integrated ads to support this free version. Sorry people, I know ads are terrible but it's the only way to keep this free version of PitchLab alive.", "1.0.19: Improved audio-error recovery instructions. Updated title page.", "1.0.18: Fixed 5-string banjo tunings (big thanks to Mike Rivers).", "1.0.17: Updated title page.", "1.0.16: Updated audio analysis to cover bass instruments (previous version now available via compatibility options). Reworked Partials display to show waveform data. Updated built-in help text. Added Bass Guitar tunings (thanks Cameron).", "1.0.15: Fixed Guitar/OpenD tuning (thanks Aidan).  Reworked audio setup (thanks Peter).", "1.0.14: Added text hint when there are tuning views that have not been accessed.", "1.0.13: Added instrument tuner visualization plus a database of common instrument tunings and an editor for user-defined tunings. Added display option to lock screen orientation (thanks Nate). Improved flat notation support (thanks Charles).", "1.0.12: Fix for corrupted 1.0.11 release (sorry people, my fault).", "1.0.11: Added crash detection and logging system (writes crashlogs to external storage). Added debug options to enable user diagnosis of compatibility issues. Fixed intermittent crash on HTC One X (huge thanks to Bernard Spiegeleer).", "1.0.10: Graphics compatibility fix for Galaxy S2 (huge thanks to Mr Anon).", "1.0.9: Reworked audio setup code (old versions now available through compatibility options). Added 'BigStrobe' visualization for small screen devices.  Added sharp/flat notation option.", "1.0.8: Added 'Partials' visualization.", "1.0.7: Reworked audio setup code plus a few minor layout tweaks for different resolutions.", "1.0.6: Fixed responsiveness issue on Nexus 7.", "1.0.5: General compatibility tweaks and adjusted tablet layouts.", "1.0.4: Fixed Bluetooth security violation when un-muting the microphone in some situations.", "1.0.3: Improved text clarity on smaller screens. e.g. Samsung M901 (thanks Sam!).", "1.0.2: Now defaults to 32bit textures for Chromatic Tiles & Spectrogram displays to fix a graphical issue on HTC One X (thanks Jon!).", "1.0.1: Improved display contrast and updated credits text.", "1.0.0: Initial release."};

    public static Dialog a(Activity activity, Dialog dialog) {
        TextView textView = (TextView) dialog.findViewById(android.R.id.message);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setTextColor(activity.getApplicationContext().getResources().getColor(android.R.color.secondary_text_dark_nodisable));
        return dialog;
    }

    public static Dialog a(Activity activity, String str) {
        String str2 = "PitchLab";
        try {
            str2 = String.valueOf("PitchLab") + " " + activity.getPackageManager().getPackageInfo(activity.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setIcon(R.drawable.ic_launcher);
        builder.setTitle(str2);
        builder.setMessage(Html.fromHtml(str));
        builder.setPositiveButton("OK", new ca());
        builder.setCancelable(true);
        return builder.create();
    }

    public static String a() {
        return "pitchlabapp@gmail.com";
    }

    private static String a(String str) {
        return "<b>** " + str + " **</b><br/><br/>";
    }

    public static String b() {
        String str = String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf("") + "Welcome to PitchLab, a general purpose chromatic tuner and pitch visualization tool.<br/><br/>") + a("Latest Release")) + a[0] + "<br/><br/>") + a("Quick Start")) + "Change visualization mode by swiping the screen left/right or by pressing and holding the current display to get a pop-up view selection menu.<br/><br/>") + "Press the Menu button to access the options screen or, if your device doesn't have a Menu button, select the 'Options' item from the pop-up view selection menu.<br/><br/>") + "Needle displays show deviation in cents from true note tuning.<br/><br/>") + "Strobe displays provide extremely accurate feedback when close to the true note tuning: if a strobe moves to the left the analysed note is flat, if a strobe moves to the right the analysed note is sharp.<br/><br/>") + "Take some time to understand each visualization mode by playing (or humming) single notes.  Vary the note pitch by tuning up or down by a small amount to see how changes in pitch are reflected in the different visualizations.  The Chord visualization requires multiple notes to be played simultaneously so try playing a few chords on your instrument to understand the results.<br/><br/>") + a("Visualization Modes")) + "<b>Instrument:</b> Combination radial strobe and string/note indicators for easy instrument tuning. Includes a database of common tunings for Guitar, Violin/Fiddle, Mandolin, Ukulele, Banjo, Bouzouki and Pedal Steel, plus a built-in editor for up to 100 user-defined instrument tunings.<br/><br/>") + "<b>Dial & Strobe:</b> Combination dial tuner and innovative linear strobe for rapid and extremely accurate hands-free instrument tuning (this linear strobe is a genuine implementation of the strobe-tuner concept, not a decorative imitation).<br/><br/>") + "<b>Spectrogram:</b> Scrolling display of live sound analysis, showing the perceived pitch of a wide range of sound types (including human voices and singing).<br/><br/>") + "<b>Chords:</b> Grid-based estimation display of common chord types (maj/min, maj7/min7, dom7/dim7), ideal for quickly determining the 'strum along' chords for a tune where the chords are reasonably clear.<br/><br/>") + "<b>BigStrobe:</b> A large, single strobe display, optimized for small screen devices.<br/><br/>") + a("Instrument/Temperament Editor")) + "Press 'New' to create a new custom definition, edit the name and available parameters as required and then save.<br/><br/>") + "To manage existing custom definitions, press 'Load', 'Edit' or 'Delete' and then select the definition on which you want that operation to be performed.<br/><br/>") + "Copy a custom definition by using the 'Edit' operation to change its name and then save it under the new name (you can then delete the old copy if required).<br/><br/>") + a("Compatibility")) + "If notes on the Chromatic Tiles or Spectrogram display do not appear to line up correctly with the note calibration markers, please use the Compatibility options to switch the Spectrogram texture format to RGBA-5551.<br/><br/>") + "If PitchLab reports a sample rate error, use the compatibility options to change the version of audio setup code that is in use.  One of the available versions might work on your device.<br/><br/>") + "Otherwise, please email <a href=\"mailto:pitchlabapp@gmail.com\">pitchlabapp@gmail.com</a> to report the issue.<br/><br/>") + a("Performance")) + "If the tuning displays are slow or unresponsive, use the options screen to lower the sample rate to 22khz first; if that doesn't fix the problem, also drop the analysis rate to 'low' or try an even lower sample rate.<br/><br/>") + a("Bugs & Crashes")) + "Email <a href=\"mailto:pitchlabapp@gmail.com\">pitchlabapp@gmail.com</a> to report issues for quick resolution.  If you are feeling adventurous, try to narrow down the cause of the issue by using the debug options to disable different internal functions of the app.<br/><br/>") + a("Credits")) + "Bitmap resources by Rob James of <a href=\"http://www.gomobli.com\">www.gomobli.com</a><br/><br/>") + "Google Breakpad:  Copyright (c) 2006, Google Inc. All rights reserved.<br/><br/>") + a("Release Notes");
        for (String str2 : a) {
            str = String.valueOf(str) + str2 + "<br/><br/>";
        }
        return str;
    }
}
