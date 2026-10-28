package com.symbolic.pitchlab;

import android.media.AudioRecord;

/* JADX INFO: loaded from: classes.dex */
public class bu implements bo {
    private AudioRecord a;
    private bv b;
    private int c = 16;
    private int d = 2;
    private int e;

    public bu(int i, bn bnVar) throws Exception {
        this.e = AudioRecord.getMinBufferSize(i, this.c, this.d);
        if (this.e <= 0) {
            throw new Exception(String.format("AudioRecord: failed with getMinBufferSize=%d", Integer.valueOf(this.e)));
        }
        this.a = new AudioRecord(0, i, this.c, this.d, this.e);
        try {
            this.a.startRecording();
            this.b = new bv(bnVar, this.a, this.e);
            this.b.start();
        } catch (Exception e) {
            this.a.release();
            this.a = null;
            throw e;
        }
    }

    @Override // com.symbolic.pitchlab.bo
    public void a() {
        if (this.b != null) {
            this.b.interrupt();
            try {
                this.b.join();
            } catch (Exception e) {
            }
            this.b = null;
        }
        if (this.a != null) {
            this.a.stop();
            this.a.release();
            this.a = null;
        }
    }
}
