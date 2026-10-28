package com.symbolic.pitchlab;

/* JADX INFO: loaded from: classes.dex */
class bk implements bn {
    final /* synthetic */ ActivityVisualiser a;

    bk(ActivityVisualiser activityVisualiser) {
        this.a = activityVisualiser;
    }

    @Override // com.symbolic.pitchlab.bn
    public void a(short[] sArr, int i, int i2) {
        PitchLabNative.processStreamedSamples(sArr, i, i2);
    }
}
