/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public abstract class Class_33560 {
    private int Field_33561;
    private final int Field_33562;
    private int Field_33563;
    private final Class_6248[] Field_33564;
    private int Field_33565;
    private int Field_33566;

    static void Method_33567(Class_33560 class_33560) {
        class_33560.Method_33572();
    }

    protected abstract void Method_33568(Class_8772 var1, long var2, Class_43430 var4, int var5);

    public int Method_33569() {
        int n = 4434 & -8152;
        this.Field_33566 = 9482 & -30716;
        this.Field_33565 = 267 & 2592;
        int n2 = this.Field_33563;
        do {
            if (Class_33560.Method_33571(this.Field_33564[n2])) {
                ++n;
            } else {
                return n;
            }
            n2 = this.Method_33576(n2);
        } while (true);
    }

    public boolean Method_33570(Class_43430 class_43430, int n) {
        Class_6248 class_6248 = this.Field_33564[this.Field_33563];
        if (class_6248.Field_6250 == null) {
            return (21219 & 256) != 0;
        }
        this.Field_33566 += -18253 & 1293;
        if (this.Field_33565 < this.Field_33566) {
            this.Field_33565 = this.Field_33566;
        }
        this.Method_33568(class_6248.Field_6250, class_6248.Field_6249, class_43430, n);
        class_6248.Field_6250 = null;
        this.Field_33563 = this.Method_33576(this.Field_33563);
        return (-30647 & 37) != 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static boolean Method_33571(Class_6248 class_6248) {
        Class_8772 class_8772 = class_6248.Field_6250;
        if (class_8772 == null) {
            return (4128 & 1925) != 0;
        }
        Class_14963 class_14963 = class_8772.Field_8789;
        synchronized (class_14963) {
            class_8772.Field_8776.Method_36661(class_8772, class_6248.Field_6249);
        }
        class_6248.Field_6250 = null;
        return (-16339 & 10243) != 0;
    }

    private void Method_33572() {
        int n;
        this.Field_33566 = -18350 & 289;
        this.Field_33565 = 17056 & 12379;
        if (n <= this.Field_33562) {
            return;
        }
        int n2 = this.Field_33563;
        for (n = this.Method_33575() - this.Field_33565; n > 0; --n) {
            if (!Class_33560.Method_33571(this.Field_33564[n2])) {
                return;
            }
            n2 = this.Method_33576(n2);
        }
    }

    public boolean Method_33573(Class_8772 class_8772, long l) {
        Class_6248 class_6248 = this.Field_33564[this.Field_33561];
        if (class_6248.Field_6250 != null) {
            return (13316 & 17347) != 0;
        }
        this.Field_33566 -= 1 & 16467;
        class_6248.Field_6250 = class_8772;
        class_6248.Field_6249 = l;
        this.Field_33561 = this.Method_33576(this.Field_33561);
        return (4417 & 3241) != 0;
    }

    private void Method_33574() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private int Method_33575() {
        return this.Field_33561 - this.Field_33563 & this.Field_33564.length - (22529 & -23119);
    }

    Class_33560(int n) {
        this.Field_33564 = new Class_6248[Class_33560.Method_33577(n)];
        for (int i = 8232 & 513; i < this.Field_33564.length; ++i) {
            this.Field_33564[i] = new Class_6248(null);
        }
        this.Field_33562 = n / (-7801 & 66);
    }

    private int Method_33576(int n) {
        return n + (9249 & 4619) & this.Field_33564.length - (12975 & 2385);
    }

    private static int Method_33577(int n) {
        if (n <= (8490 & 2754)) {
            return 17094 & -30717;
        }
        --n;
        n |= n >> (-15871 & 4371);
        n |= n >> (142 & 9571);
        n |= n >> (12550 & 3100);
        n |= n >> (45 & 776);
        n |= n >> (18448 & -32140);
        return ++n;
    }
}

