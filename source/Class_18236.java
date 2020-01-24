/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public final class Class_18236
extends ArrayList {
    private static final Class_32390 Field_18237 = new Class_33857();
    private final Class_22999 Field_18238;

    private Class_18236(Class_22999 class_22999) {
        this(class_22999, 12 & 10315);
    }

    Class_18236(Class_22999 class_22999, Class_33857 class_33857) {
        this(class_22999);
    }

    private Class_18236(Class_22999 class_22999, int n) {
        super(n);
        this.Field_18238 = class_22999;
    }

    public static Class_18236 Method_18239() {
        return Class_18236.Method_18244(-14200 & 1560);
    }

    public boolean Method_18240(Collection collection) {
        Class_18236.Method_18242(collection);
        return super.addAll(collection);
    }

    private void Method_18241() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static void Method_18242(Collection collection) {
        if (collection instanceof RandomAccess && collection instanceof List) {
            List list = (List)collection;
            int n = list.size();
            for (int i = 20928 & -32716; i < n; ++i) {
                if (list.get(i) != null) continue;
                throw new IllegalArgumentException("c contains null values");
            }
        } else {
            for (Object e : collection) {
                if (e != null) continue;
                throw new IllegalArgumentException("c contains null values");
            }
        }
    }

    public boolean Method_18243(int n, Collection collection) {
        Class_18236.Method_18242(collection);
        return super.addAll(n, collection);
    }

    public static Class_18236 Method_18244(int n) {
        Class_18236 class_18236 = (Class_18236)Field_18237.Method_32408();
        class_18236.ensureCapacity(n);
        return class_18236;
    }

    public Object Method_18245(int n, Object object) {
        if (object == null) {
            throw new NullPointerException("element");
        }
        return super.set(n, object);
    }

    public void Method_18246(int n, Object object) {
        if (object == null) {
            throw new NullPointerException("element");
        }
        super.add(n, object);
    }

    public boolean Method_18247() {
        this.clear();
        return Field_18237.Method_32402(this, this.Field_18238);
    }

    public boolean Method_18248(Object object) {
        if (object == null) {
            throw new NullPointerException("element");
        }
        return super.add(object);
    }
}

