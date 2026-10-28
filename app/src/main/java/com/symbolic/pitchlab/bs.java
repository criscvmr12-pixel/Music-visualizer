package com.symbolic.pitchlab;

import android.media.AudioRecord;

/* JADX INFO: loaded from: classes.dex */
public class bs implements bo {
    private short[] a;
    private AudioRecord b;
    private bt c;
    private bn d;

    public bs(int i, bn bnVar) throws Exception {
        bt btVar = null;
        this.d = bnVar;
        int minBufferSize = AudioRecord.getMinBufferSize(i, 16, 2);
        if (minBufferSize <= 0) {
            throw new Exception(String.format("AudioRecord: failed", new Object[0]));
        }
        this.a = new short[minBufferSize];
        this.b = new AudioRecord(0, i, 16, 2, minBufferSize);
        try {
            this.b.startRecording();
            this.c = new bt(this, btVar);
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
