package com.symbolic.pitchlab;

/* JADX INFO: loaded from: classes.dex */
class bt extends Thread {
    final /* synthetic */ bs a;

    private bt(bs bsVar) {
        this.a = bsVar;
    }

    /* synthetic */ bt(bs bsVar, bt btVar) {
        this(bsVar);
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
