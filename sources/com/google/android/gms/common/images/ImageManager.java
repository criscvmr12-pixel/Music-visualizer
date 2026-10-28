package com.google.android.gms.common.images;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import com.google.android.gms.internal.jk;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class ImageManager {
    private static final Object a = new Object();
    private static HashSet b = new HashSet();
    private final Context c;
    private final Handler d;
    private final ExecutorService e;
    private final b f;
    private final jk g;
    private final Map h;
    private final Map i;
    private final Map j;

    final class ImageReceiver extends ResultReceiver {
        final /* synthetic */ ImageManager a;
        private final Uri b;
        private final ArrayList c;

        @Override // android.os.ResultReceiver
        public void onReceiveResult(int i, Bundle bundle) {
            this.a.e.execute(new c(this.a, this.b, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }
    }
}
