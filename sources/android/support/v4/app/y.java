package android.support.v4.app;

import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
class y extends w {
    static boolean a = false;
    final android.support.v4.c.m b = new android.support.v4.c.m();
    final android.support.v4.c.m c = new android.support.v4.c.m();
    final String d;
    h e;
    boolean f;
    boolean g;

    y(String str, h hVar, boolean z) {
        this.d = str;
        this.e = hVar;
        this.f = z;
    }

    void a(h hVar) {
        this.e = hVar;
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (this.b.b() > 0) {
            printWriter.print(str);
            printWriter.println("Active Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < this.b.b(); i++) {
                z zVar = (z) this.b.b(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.b.a(i));
                printWriter.print(": ");
                printWriter.println(zVar.toString());
                zVar.a(str2, fileDescriptor, printWriter, strArr);
            }
        }
        if (this.c.b() > 0) {
            printWriter.print(str);
            printWriter.println("Inactive Loaders:");
            String str3 = str + "    ";
            for (int i2 = 0; i2 < this.c.b(); i2++) {
                z zVar2 = (z) this.c.b(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.c.a(i2));
                printWriter.print(": ");
                printWriter.println(zVar2.toString());
                zVar2.a(str3, fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // android.support.v4.app.w
    public boolean a() {
        int iB = this.b.b();
        boolean z = false;
        for (int i = 0; i < iB; i++) {
            z zVar = (z) this.b.b(i);
            z |= zVar.h && !zVar.f;
        }
        return z;
    }

    void b() {
        if (a) {
            Log.v("LoaderManager", "Starting in " + this);
        }
        if (this.f) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doStart when already started: " + this, runtimeException);
        } else {
            this.f = true;
            for (int iB = this.b.b() - 1; iB >= 0; iB--) {
                ((z) this.b.b(iB)).a();
            }
        }
    }

    void c() {
        if (a) {
            Log.v("LoaderManager", "Stopping in " + this);
        }
        if (!this.f) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doStop when not started: " + this, runtimeException);
        } else {
            for (int iB = this.b.b() - 1; iB >= 0; iB--) {
                ((z) this.b.b(iB)).e();
            }
            this.f = false;
        }
    }

    void d() {
        if (a) {
            Log.v("LoaderManager", "Retaining in " + this);
        }
        if (!this.f) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doRetain when not started: " + this, runtimeException);
        } else {
            this.g = true;
            this.f = false;
            for (int iB = this.b.b() - 1; iB >= 0; iB--) {
                ((z) this.b.b(iB)).b();
            }
        }
    }

    void e() {
        if (this.g) {
            if (a) {
                Log.v("LoaderManager", "Finished Retaining in " + this);
            }
            this.g = false;
            for (int iB = this.b.b() - 1; iB >= 0; iB--) {
                ((z) this.b.b(iB)).c();
            }
        }
    }

    void f() {
        for (int iB = this.b.b() - 1; iB >= 0; iB--) {
            ((z) this.b.b(iB)).k = true;
        }
    }

    void g() {
        for (int iB = this.b.b() - 1; iB >= 0; iB--) {
            ((z) this.b.b(iB)).d();
        }
    }

    void h() {
        if (!this.g) {
            if (a) {
                Log.v("LoaderManager", "Destroying Active in " + this);
            }
            for (int iB = this.b.b() - 1; iB >= 0; iB--) {
                ((z) this.b.b(iB)).f();
            }
            this.b.c();
        }
        if (a) {
            Log.v("LoaderManager", "Destroying Inactive in " + this);
        }
        for (int iB2 = this.c.b() - 1; iB2 >= 0; iB2--) {
            ((z) this.c.b(iB2)).f();
        }
        this.c.c();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        android.support.v4.c.d.a(this.e, sb);
        sb.append("}}");
        return sb.toString();
    }
}
