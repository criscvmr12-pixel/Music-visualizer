package com.google.android.gms.a;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.g;
import com.google.android.gms.internal.ky;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    private final String a;
    private Object b;

    protected e(String str) {
        this.a = str;
    }

    protected final Object a(Context context) throws f {
        if (this.b == null) {
            ky.a(context);
            Context contextC = g.c(context);
            if (contextC == null) {
                throw new f("Could not get remote context.");
            }
            try {
                this.b = a((IBinder) contextC.getClassLoader().loadClass(this.a).newInstance());
            } catch (ClassNotFoundException e) {
                throw new f("Could not load creator class.");
            } catch (IllegalAccessException e2) {
                throw new f("Could not access creator.");
            } catch (InstantiationException e3) {
                throw new f("Could not instantiate creator.");
            }
        }
        return this.b;
    }

    protected abstract Object a(IBinder iBinder);
}
