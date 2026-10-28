package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
class ex implements Runnable {
    final /* synthetic */ et a;

    ex(et etVar) {
        this.a = etVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.a.f) {
            if (this.a.j.e != -2) {
                return;
            }
            this.a.c.f().a(this.a);
            if (this.a.j.e == -3) {
                hj.d("Loading URL in WebView: " + this.a.j.b);
                this.a.c.loadUrl(this.a.j.b);
            } else {
                hj.d("Loading HTML in WebView.");
                this.a.c.loadDataWithBaseURL(gx.a(this.a.j.b), this.a.j.c, "text/html", "UTF-8", null);
            }
        }
    }
}
