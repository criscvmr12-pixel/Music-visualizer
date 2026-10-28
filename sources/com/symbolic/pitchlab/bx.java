package com.symbolic.pitchlab;

/* JADX INFO: loaded from: classes.dex */
class bx extends Thread {
    final /* synthetic */ bw a;

    bx(bw bwVar) {
        this.a = bwVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        short[] sArr = new short[1024];
        int length = this.a.a / sArr.length;
        int i = 0;
        while (!interrupted()) {
            try {
                Thread.sleep(length);
                int i2 = 0;
                while (i2 < sArr.length) {
                    sArr[i2] = (short) (i >> 16);
                    i2++;
                    i = 1013904223 + (i * 1664525);
                }
                this.a.b.a(sArr, sArr.length, this.a.a);
            } catch (Exception e) {
                return;
            }
        }
    }
}
