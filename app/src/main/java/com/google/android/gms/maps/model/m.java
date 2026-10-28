package com.google.android.gms.maps.model;

/* JADX INFO: loaded from: classes.dex */
public final class m {
    public float a;
    public float b;

    public StreetViewPanoramaOrientation a() {
        return new StreetViewPanoramaOrientation(this.b, this.a);
    }

    public m a(float f) {
        this.b = f;
        return this;
    }

    public m b(float f) {
        this.a = f;
        return this;
    }
}
