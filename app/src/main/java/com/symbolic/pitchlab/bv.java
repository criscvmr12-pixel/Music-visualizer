package com.symbolic.pitchlab;

import android.media.AudioRecord;

/* JADX INFO: loaded from: classes.dex */
class bv extends Thread {
    private bn a;
    private AudioRecord b;
    private short[] c;

    bv(bn bnVar, AudioRecord audioRecord, int i) {
        this.a = bnVar;
        this.b = audioRecord;
        this.c = new short[i];
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (!interrupted()) {
            try {
                int i = this.b.read(this.c, 0, this.c.length);
                if (i > 0) {
                    this.a.a(this.c, i, this.b.getSampleRate());
                }
            } catch (Exception e) {
            }
        }
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
