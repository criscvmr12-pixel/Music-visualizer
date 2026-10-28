package com.symbolic.pitchlab;

/* JADX INFO: loaded from: classes.dex */
class br extends Thread {
    final /* synthetic */ bq a;

    private br(bq bqVar) {
        this.a = bqVar;
    }

    /* synthetic */ br(bq bqVar, br brVar) {
        this(bqVar);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (!interrupted()) {
            int i = this.a.b.read(this.a.a, 0, this.a.a.length);
            if (i > 0) {
                this.a.d.a(this.a.a, i, this.a.b.getSampleRate());
            }
        }
    }
}
