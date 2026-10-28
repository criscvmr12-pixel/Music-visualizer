package com.symbolic.pitchlab;

import android.media.AudioRecord;

/* JADX INFO: loaded from: classes.dex */
public class bq implements bo {
    private short[] a;
    private AudioRecord b;
    private br c;
    private bn d;

    public bq(int i, bn bnVar) throws Exception {
        br brVar = null;
        this.d = bnVar;
        int iMax = Math.max(i / 10, AudioRecord.getMinBufferSize(i, 16, 2));
        this.a = new short[iMax];
        this.b = new AudioRecord(0, i, 16, 2, iMax);
        if (this.b.getRecordingState() != 1) {
            throw new Exception("AudioRecord failed to initialise");
        }
        try {
            this.b.startRecording();
            this.c = new br(this, brVar);
            this.c.start();
        } catch (Exception e) {
            this.b.release();
            this.b = null;
            throw e;
        }
    }

    @Override // com.symbolic.pitchlab.bo
    public void a() {
        if (this.c != null) {
            this.c.interrupt();
            try {
                this.c.join();
            } catch (Exception e) {
            }
            this.c = null;
        }
        if (this.b != null) {
            this.b.stop();
            this.b.release();
            this.b = null;
        }
        this.a = null;
        this.d = null;
    }
}
