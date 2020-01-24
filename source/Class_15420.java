/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_15420 {
    private final Class_33560[] Field_15421;
    private final Class_33560[] Field_15422;
    private int Field_15423;
    private final Runnable Field_15424 = new Class_11304(this);
    final Class_14963 Field_15425;
    private final Class_33560[] Field_15426;
    private final int Field_15427;
    private final Class_33560[] Field_15428;
    private final Thread Field_15429 = Thread.currentThread();
    final Class_14963 Field_15430;
    private static final Class_6113 Field_15431 = Class_10201.Method_10203(Class_15420.class);
    private final Class_33560[] Field_15432;
    private final int Field_15433;
    private final Class_33560[] Field_15434;
    private final int Field_15435;

    private static void Method_15436(Class_33560[] arrclass_33560) {
        if (arrclass_33560 == null) {
            return;
        }
        Class_33560[] arrclass_335602 = arrclass_33560;
        int n = arrclass_335602.length;
        for (int i = 16 & 17452; i < n; ++i) {
            Class_33560 class_33560 = arrclass_335602[i];
            Class_15420.Method_15441(class_33560);
        }
    }

    Class_15420(Class_14963 class_14963, Class_14963 class_149632, int n, int n2, int n3, int n4, int n5) {
        if (n4 < 0) {
            throw new IllegalArgumentException("maxCachedBufferCapacity: " + n4 + " (expected: >= 0)");
        }
        if (n5 < (-23033 & 81)) {
            throw new IllegalArgumentException("freeSweepAllocationThreshold: " + n4 + " (expected: > 0)");
        }
        this.Field_15433 = n5;
        this.Field_15430 = class_14963;
        this.Field_15425 = class_149632;
        if (class_149632 != null) {
            this.Field_15421 = Class_15420.Method_15454(n, 18465 & 8368);
            this.Field_15426 = Class_15420.Method_15454(n2, class_149632.Field_14977);
            this.Field_15427 = Class_15420.Method_15446(class_149632.Field_14971);
            this.Field_15428 = Class_15420.Method_15440(n3, n4, class_149632);
        } else {
            this.Field_15421 = null;
            this.Field_15426 = null;
            this.Field_15428 = null;
            this.Field_15427 = -1 & -1;
        }
        if (class_14963 != null) {
            this.Field_15422 = Class_15420.Method_15454(n, -32665 & 25120);
            this.Field_15432 = Class_15420.Method_15454(n2, class_14963.Field_14977);
            this.Field_15435 = Class_15420.Method_15446(class_14963.Field_14971);
            this.Field_15434 = Class_15420.Method_15440(n3, n4, class_14963);
        } else {
            this.Field_15422 = null;
            this.Field_15432 = null;
            this.Field_15434 = null;
            this.Field_15435 = -1 & -1;
        }
        Class_26907.Method_26917(this.Field_15429, this.Field_15424);
    }

    boolean Method_15437(Class_14963 class_14963, Class_43430 class_43430, int n, int n2) {
        return this.Method_15445(this.Method_15456(class_14963, n2), class_43430, n);
    }

    boolean Method_15438(Class_14963 class_14963, Class_43430 class_43430, int n, int n2) {
        return this.Method_15445(this.Method_15442(class_14963, n2), class_43430, n);
    }

    private static int Method_15439(Class_33560[] arrclass_33560) {
        if (arrclass_33560 == null) {
            return 258 & 2128;
        }
        int n = 25608 & -28672;
        Class_33560[] arrclass_335602 = arrclass_33560;
        int n2 = arrclass_335602.length;
        for (int i = 11328 & 4498; i < n2; ++i) {
            Class_33560 class_33560 = arrclass_335602[i];
            n += Class_15420.Method_15453(class_33560);
        }
        return n;
    }

    private static Class_35911[] Method_15440(int n, int n2, Class_14963 class_14963) {
        if (n > 0) {
            int n3 = Math.min(class_14963.Field_14972, n2);
            int n4 = Math.max(4507 & -8187, n3 / class_14963.Field_14971);
            Class_35911[] arrclass_35911 = new Class_35911[n4];
            for (int i = 4776 & -32767; i < arrclass_35911.length; ++i) {
                arrclass_35911[i] = new Class_35911(n);
            }
            return arrclass_35911;
        }
        return null;
    }

    private static void Method_15441(Class_33560 class_33560) {
        if (class_33560 == null) {
            return;
        }
        Class_33560.Method_33567(class_33560);
    }

    private Class_33560 Method_15442(Class_14963 class_14963, int n) {
        int n2 = Class_14963.Method_14994(n);
        if (class_14963.Method_14988()) {
            return Class_15420.Method_15451(this.Field_15426, n2);
        }
        return Class_15420.Method_15451(this.Field_15432, n2);
    }

    void Method_15443() {
        Class_26907.Method_26915(this.Field_15429, this.Field_15424);
        this.Method_15450();
    }

    boolean Method_15444(Class_14963 class_14963, Class_8772 class_8772, long l, int n) {
        Class_33560 class_33560 = class_14963.Method_14999(n) ? (Class_14963.Method_14987(n) ? this.Method_15456(class_14963, n) : this.Method_15442(class_14963, n)) : this.Method_15449(class_14963, n);
        if (class_33560 == null) {
            return (608 & 4124) != 0;
        }
        return class_33560.Method_33573(class_8772, l);
    }

    private boolean Method_15445(Class_33560 class_33560, Class_43430 class_43430, int n) {
        if (class_33560 == null) {
            return (1280 & -3897) != 0;
        }
        boolean bl = class_33560.Method_33570(class_43430, n);
        if ((this.Field_15423 += 195 & 12801) >= this.Field_15433) {
            this.Field_15423 = 21457 & 8236;
            this.Method_15452();
        }
        return bl;
    }

    private static int Method_15446(int n) {
        int n2 = 4290 & 17961;
        while (n > (10377 & 515)) {
            n >>= 4865 & -15343;
            ++n2;
        }
        return n2;
    }

    private void Method_15447() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    boolean Method_15448(Class_14963 class_14963, Class_43430 class_43430, int n, int n2) {
        return this.Method_15445(this.Method_15449(class_14963, n2), class_43430, n);
    }

    private Class_33560 Method_15449(Class_14963 class_14963, int n) {
        if (class_14963.Method_14988()) {
            int n2 = Class_15420.Method_15446(n >> this.Field_15427);
            return Class_15420.Method_15451(this.Field_15428, n2);
        }
        int n3 = Class_15420.Method_15446(n >> this.Field_15435);
        return Class_15420.Method_15451(this.Field_15434, n3);
    }

    private void Method_15450() {
        int n = Class_15420.Method_15439(this.Field_15421) + Class_15420.Method_15439(this.Field_15426) + Class_15420.Method_15439(this.Field_15428) + Class_15420.Method_15439(this.Field_15422) + Class_15420.Method_15439(this.Field_15432) + Class_15420.Method_15439(this.Field_15434);
        if (n > 0 && Field_15431.Method_6131()) {
            Field_15431.Method_6122("Freed {} thread-local buffer(s) from thread: {}", n, this.Field_15429.getName());
        }
    }

    private static Class_33560 Method_15451(Class_33560[] arrclass_33560, int n) {
        if (arrclass_33560 == null || n > arrclass_33560.length - (10757 & 20769)) {
            return null;
        }
        return arrclass_33560[n];
    }

    void Method_15452() {
        Class_15420.Method_15436(this.Field_15421);
        Class_15420.Method_15436(this.Field_15426);
        Class_15420.Method_15436(this.Field_15428);
        Class_15420.Method_15436(this.Field_15422);
        Class_15420.Method_15436(this.Field_15432);
        Class_15420.Method_15436(this.Field_15434);
    }

    private static int Method_15453(Class_33560 class_33560) {
        if (class_33560 == null) {
            return -20094 & 20080;
        }
        return class_33560.Method_33569();
    }

    private static Class_45321[] Method_15454(int n, int n2) {
        if (n > 0) {
            Class_45321[] arrclass_45321 = new Class_45321[n2];
            for (int i = 3138 & 20745; i < arrclass_45321.length; ++i) {
                arrclass_45321[i] = new Class_45321(n);
            }
            return arrclass_45321;
        }
        return null;
    }

    static void Method_15455(Class_15420 class_15420) {
        class_15420.Method_15450();
    }

    private Class_33560 Method_15456(Class_14963 class_14963, int n) {
        int n2 = Class_14963.Method_14991(n);
        if (class_14963.Method_14988()) {
            return Class_15420.Method_15451(this.Field_15421, n2);
        }
        return Class_15420.Method_15451(this.Field_15422, n2);
    }
}

