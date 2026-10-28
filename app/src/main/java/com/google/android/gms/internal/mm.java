package com.google.android.gms.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class mm extends lf {
    private static Method e;
    private static Method f;
    private static Method g;
    private static Method h;
    private static Method i;
    private static Method j;
    private static String k;
    private static nz m;
    private static long l = 0;
    static boolean d = false;

    protected mm(Context context, nx nxVar, ny nyVar) {
        super(context, nxVar, nyVar);
    }

    static String a() throws mn {
        if (k == null) {
            throw new mn();
        }
        return k;
    }

    static String a(Context context, nx nxVar) throws mn {
        if (g == null) {
            throw new mn();
        }
        try {
            ByteBuffer byteBuffer = (ByteBuffer) g.invoke(null, context);
            if (byteBuffer == null) {
                throw new mn();
            }
            return nxVar.a(byteBuffer.array(), true);
        } catch (IllegalAccessException e2) {
            throw new mn(e2);
        } catch (InvocationTargetException e3) {
            throw new mn(e3);
        }
    }

    static ArrayList a(MotionEvent motionEvent, DisplayMetrics displayMetrics) throws mn {
        if (h == null || motionEvent == null) {
            throw new mn();
        }
        try {
            return (ArrayList) h.invoke(null, motionEvent, displayMetrics);
        } catch (IllegalAccessException e2) {
            throw new mn(e2);
        } catch (InvocationTargetException e3) {
            throw new mn(e3);
        }
    }

    protected static synchronized void a(String str, Context context, nx nxVar) {
        if (!d) {
            try {
                m = new nz(nxVar, null);
                k = str;
                e(context);
                l = b().longValue();
                d = true;
            } catch (mn e2) {
            } catch (UnsupportedOperationException e3) {
            }
        }
    }

    static Long b() throws mn {
        if (e == null) {
            throw new mn();
        }
        try {
            return (Long) e.invoke(null, new Object[0]);
        } catch (IllegalAccessException e2) {
            throw new mn(e2);
        } catch (InvocationTargetException e3) {
            throw new mn(e3);
        }
    }

    static String b(Context context, nx nxVar) throws mn {
        if (j == null) {
            throw new mn();
        }
        try {
            ByteBuffer byteBuffer = (ByteBuffer) j.invoke(null, context);
            if (byteBuffer == null) {
                throw new mn();
            }
            return nxVar.a(byteBuffer.array(), true);
        } catch (IllegalAccessException e2) {
            throw new mn(e2);
        } catch (InvocationTargetException e3) {
            throw new mn(e3);
        }
    }

    private static String b(byte[] bArr, String str) throws mn {
        try {
            return new String(m.a(bArr, str), "UTF-8");
        } catch (oa e2) {
            throw new mn(e2);
        } catch (UnsupportedEncodingException e3) {
            throw new mn(e3);
        }
    }

    static String c() throws mn {
        if (f == null) {
            throw new mn();
        }
        try {
            return (String) f.invoke(null, new Object[0]);
        } catch (IllegalAccessException e2) {
            throw new mn(e2);
        } catch (InvocationTargetException e3) {
            throw new mn(e3);
        }
    }

    static String d(Context context) throws mn {
        if (i == null) {
            throw new mn();
        }
        try {
            String str = (String) i.invoke(null, context);
            if (str == null) {
                throw new mn();
            }
            return str;
        } catch (IllegalAccessException e2) {
            throw new mn(e2);
        } catch (InvocationTargetException e3) {
            throw new mn(e3);
        }
    }

    private static void e(Context context) throws mn {
        try {
            byte[] bArrA = m.a(oc.a());
            byte[] bArrA2 = m.a(bArrA, oc.b());
            File cacheDir = context.getCacheDir();
            if (cacheDir == null && (cacheDir = context.getDir("dex", 0)) == null) {
                throw new mn();
            }
            File fileCreateTempFile = File.createTempFile("ads", ".jar", cacheDir);
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(bArrA2, 0, bArrA2.length);
            fileOutputStream.close();
            DexClassLoader dexClassLoader = new DexClassLoader(fileCreateTempFile.getAbsolutePath(), cacheDir.getAbsolutePath(), null, context.getClassLoader());
            Class clsLoadClass = dexClassLoader.loadClass(b(bArrA, oc.c()));
            Class clsLoadClass2 = dexClassLoader.loadClass(b(bArrA, oc.i()));
            Class clsLoadClass3 = dexClassLoader.loadClass(b(bArrA, oc.g()));
            Class clsLoadClass4 = dexClassLoader.loadClass(b(bArrA, oc.m()));
            Class clsLoadClass5 = dexClassLoader.loadClass(b(bArrA, oc.e()));
            Class clsLoadClass6 = dexClassLoader.loadClass(b(bArrA, oc.k()));
            e = clsLoadClass.getMethod(b(bArrA, oc.d()), new Class[0]);
            f = clsLoadClass2.getMethod(b(bArrA, oc.j()), new Class[0]);
            g = clsLoadClass3.getMethod(b(bArrA, oc.h()), Context.class);
            h = clsLoadClass4.getMethod(b(bArrA, oc.n()), MotionEvent.class, DisplayMetrics.class);
            i = clsLoadClass5.getMethod(b(bArrA, oc.f()), Context.class);
            j = clsLoadClass6.getMethod(b(bArrA, oc.l()), Context.class);
            String name = fileCreateTempFile.getName();
            fileCreateTempFile.delete();
            new File(cacheDir, name.replace(".jar", ".dex")).delete();
        } catch (oa e2) {
            throw new mn(e2);
        } catch (FileNotFoundException e3) {
            throw new mn(e3);
        } catch (IOException e4) {
            throw new mn(e4);
        } catch (ClassNotFoundException e5) {
            throw new mn(e5);
        } catch (NoSuchMethodException e6) {
            throw new mn(e6);
        } catch (NullPointerException e7) {
            throw new mn(e7);
        }
    }

    @Override // com.google.android.gms.internal.lf
    protected void b(Context context) {
        try {
            try {
                a(1, c());
            } catch (IOException e2) {
                return;
            }
        } catch (mn e3) {
        }
        try {
            a(2, a());
        } catch (mn e4) {
        }
        try {
            a(25, b().longValue());
        } catch (mn e5) {
        }
        try {
            a(24, d(context));
        } catch (mn e6) {
        }
    }

    @Override // com.google.android.gms.internal.lf
    protected void c(Context context) {
        try {
            try {
                a(2, a());
            } catch (mn e2) {
            }
            try {
                a(1, c());
            } catch (mn e3) {
            }
            try {
                long jLongValue = b().longValue();
                a(25, jLongValue);
                if (l != 0) {
                    a(17, jLongValue - l);
                    a(23, l);
                }
            } catch (mn e4) {
            }
            try {
                ArrayList arrayListA = a(this.a, this.b);
                a(14, ((Long) arrayListA.get(0)).longValue());
                a(15, ((Long) arrayListA.get(1)).longValue());
                if (arrayListA.size() >= 3) {
                    a(16, ((Long) arrayListA.get(2)).longValue());
                }
            } catch (mn e5) {
            }
            try {
                a(27, a(context, this.c));
            } catch (mn e6) {
            }
            try {
                a(29, b(context, this.c));
            } catch (mn e7) {
            }
        } catch (IOException e8) {
        }
    }
}
