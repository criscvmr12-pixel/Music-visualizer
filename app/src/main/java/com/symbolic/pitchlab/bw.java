package com.symbolic.pitchlab;

/* JADX INFO: loaded from: classes.dex */
public class bw implements bo {
    private int a;
    private bn b;
    private bx c = new bx(this);

    public bw(int i, bn bnVar) {
        this.a = i;
        this.b = bnVar;
        this.c.start();
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
        this.b = null;
    }
}
