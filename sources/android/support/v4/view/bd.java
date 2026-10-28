package android.support.v4.view;

import android.view.View;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
class bd implements Comparator {
    bd() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(View view, View view2) {
        ax axVar = (ax) view.getLayoutParams();
        ax axVar2 = (ax) view2.getLayoutParams();
        if (axVar.a != axVar2.a) {
            return axVar.a ? 1 : -1;
        }
        return axVar.e - axVar2.e;
    }
}
