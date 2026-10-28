package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class hz {

    public class a implements SafeParcelable {
        public static final lg CREATOR = new lg();
        protected final int a;
        protected final boolean b;
        protected final int c;
        protected final boolean d;
        protected final String e;
        protected final int f;
        protected final Class g;
        protected final String h;
        private final int i;
        private ic j;
        private le k;

        a(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, hu huVar) {
            this.i = i;
            this.a = i2;
            this.b = z;
            this.c = i3;
            this.d = z2;
            this.e = str;
            this.f = i4;
            if (str2 == null) {
                this.g = null;
                this.h = null;
            } else {
                this.g = Cif.class;
                this.h = str2;
            }
            if (huVar == null) {
                this.k = null;
            } else {
                this.k = huVar.c();
            }
        }

        protected a(int i, boolean z, int i2, boolean z2, String str, int i3, Class cls, le leVar) {
            this.i = 1;
            this.a = i;
            this.b = z;
            this.c = i2;
            this.d = z2;
            this.e = str;
            this.f = i3;
            this.g = cls;
            if (cls == null) {
                this.h = null;
            } else {
                this.h = cls.getCanonicalName();
            }
            this.k = leVar;
        }

        public static a a(String str, int i) {
            return new a(0, false, 0, false, str, i, null, null);
        }

        public static a a(String str, int i, le leVar, boolean z) {
            return new a(leVar.c(), z, leVar.d(), false, str, i, null, leVar);
        }

        public static a a(String str, int i, Class cls) {
            return new a(11, false, 11, false, str, i, cls, null);
        }

        public static a b(String str, int i) {
            return new a(4, false, 4, false, str, i, null, null);
        }

        public static a b(String str, int i, Class cls) {
            return new a(11, true, 11, true, str, i, cls, null);
        }

        public static a c(String str, int i) {
            return new a(6, false, 6, false, str, i, null, null);
        }

        public static a d(String str, int i) {
            return new a(7, false, 7, false, str, i, null, null);
        }

        public static a e(String str, int i) {
            return new a(7, true, 7, true, str, i, null, null);
        }

        public int a() {
            return this.i;
        }

        public Object a(Object obj) {
            return this.k.a(obj);
        }

        public void a(ic icVar) {
            this.j = icVar;
        }

        public int b() {
            return this.a;
        }

        public boolean c() {
            return this.b;
        }

        public int d() {
            return this.c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            lg lgVar = CREATOR;
            return 0;
        }

        public boolean e() {
            return this.d;
        }

        public String f() {
            return this.e;
        }

        public int g() {
            return this.f;
        }

        public Class h() {
            return this.g;
        }

        String i() {
            if (this.h == null) {
                return null;
            }
            return this.h;
        }

        public boolean j() {
            return this.k != null;
        }

        hu k() {
            if (this.k == null) {
                return null;
            }
            return hu.a(this.k);
        }

        public HashMap l() {
            ky.a((Object) this.h);
            ky.a(this.j);
            return this.j.a(this.h);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Field\n");
            sb.append("            versionCode=").append(this.i).append('\n');
            sb.append("                 typeIn=").append(this.a).append('\n');
            sb.append("            typeInArray=").append(this.b).append('\n');
            sb.append("                typeOut=").append(this.c).append('\n');
            sb.append("           typeOutArray=").append(this.d).append('\n');
            sb.append("        outputFieldName=").append(this.e).append('\n');
            sb.append("      safeParcelFieldId=").append(this.f).append('\n');
            sb.append("       concreteTypeName=").append(i()).append('\n');
            if (h() != null) {
                sb.append("     concreteType.class=").append(h().getCanonicalName()).append('\n');
            }
            sb.append("          converterName=").append(this.k == null ? "null" : this.k.getClass().getCanonicalName()).append('\n');
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            lg lgVar = CREATOR;
            lg.a(this, parcel, i);
        }
    }

    private void a(StringBuilder sb, a aVar, Object obj) {
        if (aVar.b() == 11) {
            sb.append(((hz) aVar.h().cast(obj)).toString());
        } else {
            if (aVar.b() != 7) {
                sb.append(obj);
                return;
            }
            sb.append("\"");
            sb.append(lr.a((String) obj));
            sb.append("\"");
        }
    }

    private void a(StringBuilder sb, a aVar, ArrayList arrayList) {
        sb.append("[");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append(",");
            }
            Object obj = arrayList.get(i);
            if (obj != null) {
                a(sb, aVar, obj);
            }
        }
        sb.append("]");
    }

    protected Object a(a aVar, Object obj) {
        return aVar.k != null ? aVar.a(obj) : obj;
    }

    protected abstract Object a(String str);

    protected boolean a(a aVar) {
        if (aVar.d() == 11) {
            return aVar.e() ? d(aVar.f()) : c(aVar.f());
        }
        return b(aVar.f());
    }

    protected Object b(a aVar) {
        String strF = aVar.f();
        if (aVar.h() == null) {
            return a(aVar.f());
        }
        ky.a(a(aVar.f()) == null, "Concrete field shouldn't be value object: %s", aVar.f());
        HashMap mapD = aVar.e() ? d() : c();
        if (mapD != null) {
            return mapD.get(strF);
        }
        try {
            return getClass().getMethod("get" + Character.toUpperCase(strF.charAt(0)) + strF.substring(1), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public abstract HashMap b();

    protected abstract boolean b(String str);

    public HashMap c() {
        return null;
    }

    protected boolean c(String str) {
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    public HashMap d() {
        return null;
    }

    protected boolean d(String str) {
        throw new UnsupportedOperationException("Concrete type arrays not supported");
    }

    public String toString() {
        HashMap mapB = b();
        StringBuilder sb = new StringBuilder(100);
        for (String str : mapB.keySet()) {
            a aVar = (a) mapB.get(str);
            if (a(aVar)) {
                Object objA = a(aVar, b(aVar));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"").append(str).append("\":");
                if (objA != null) {
                    switch (aVar.d()) {
                        case 8:
                            sb.append("\"").append(lo.a((byte[]) objA)).append("\"");
                            break;
                        case 9:
                            sb.append("\"").append(lo.b((byte[]) objA)).append("\"");
                            break;
                        case 10:
                            ls.a(sb, (HashMap) objA);
                            break;
                        default:
                            if (aVar.c()) {
                                a(sb, aVar, (ArrayList) objA);
                            } else {
                                a(sb, aVar, objA);
                            }
                            break;
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }
}
