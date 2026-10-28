package android.support.v4.c;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
abstract class f {
    h b;
    i c;
    k d;

    f() {
    }

    public static boolean a(Map map, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            return set.size() == set2.size() && set.containsAll(set2);
        } catch (ClassCastException e) {
            return false;
        } catch (NullPointerException e2) {
            return false;
        }
    }

    public static boolean b(Map map, Collection collection) {
        int size = map.size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public static boolean c(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    protected abstract int a();

    protected abstract int a(Object obj);

    protected abstract Object a(int i, int i2);

    protected abstract Object a(int i, Object obj);

    protected abstract void a(int i);

    protected abstract void a(Object obj, Object obj2);

    public Object[] a(Object[] objArr, int i) {
        int iA = a();
        Object[] objArr2 = objArr.length < iA ? (Object[]) Array.newInstance(objArr.getClass().getComponentType(), iA) : objArr;
        for (int i2 = 0; i2 < iA; i2++) {
            objArr2[i2] = a(i2, i);
        }
        if (objArr2.length > iA) {
            objArr2[iA] = null;
        }
        return objArr2;
    }

    protected abstract int b(Object obj);

    protected abstract Map b();

    public Object[] b(int i) {
        int iA = a();
        Object[] objArr = new Object[iA];
        for (int i2 = 0; i2 < iA; i2++) {
            objArr[i2] = a(i2, i);
        }
        return objArr;
    }

    protected abstract void c();

    public Set d() {
        if (this.b == null) {
            this.b = new h(this);
        }
        return this.b;
    }

    public Set e() {
        if (this.c == null) {
            this.c = new i(this);
        }
        return this.c;
    }

    public Collection f() {
        if (this.d == null) {
            this.d = new k(this);
        }
        return this.d;
    }
}
