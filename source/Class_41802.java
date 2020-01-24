/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public final class Class_41802 {
    private final int Field_41803 = Class_32390.Method_32407().getAndIncrement();
    private Class_24236 Field_41804;
    private final WeakReference Field_41805;
    private Class_24236 Field_41806 = this.Field_41804 = new Class_24236(null);
    private Class_41802 Field_41807;

    boolean Method_41808() {
        return (Class_24236.Method_24241(this.Field_41804) != this.Field_41804.get() ? 24777 & 1057 : 12804 & 16529) != 0;
    }

    boolean Method_41809(Class_11651 class_11651) {
        int n;
        int n2;
        Class_24236 class_24236 = this.Field_41806;
        if (class_24236 == null) {
            return (2404 & 20480) != 0;
        }
        if (Class_24236.Method_24241(class_24236) == (16404 & -22512)) {
            if (Class_24236.Method_24242(class_24236) == null) {
                return (-12030 & 3589) != 0;
            }
            this.Field_41806 = class_24236 = Class_24236.Method_24242(class_24236);
        }
        if ((n = Class_24236.Method_24241(class_24236)) == (n2 = class_24236.get())) {
            return (769 & 5184) != 0;
        }
        int n3 = n2 - n;
        if (Class_11651.Method_11671(class_11651) + n3 > Class_11651.Method_11661(class_11651).length) {
            Class_11651.Method_11663(class_11651, Arrays.copyOf(Class_11651.Method_11661(class_11651), (Class_11651.Method_11671(class_11651) + n3) * (1170 & 16387)));
        }
        Class_28917[] arrclass_28917 = Class_24236.Method_24244(class_24236);
        Class_28917[] arrclass_289172 = Class_11651.Method_11661(class_11651);
        int n4 = Class_11651.Method_11671(class_11651);
        while (n < n2) {
            Class_28917 class_28917 = arrclass_28917[n];
            if (Class_28917.Method_28931(class_28917) == 0) {
                Class_28917.Method_28927(class_28917, Class_28917.Method_28929(class_28917));
            } else if (Class_28917.Method_28931(class_28917) != Class_28917.Method_28929(class_28917)) {
                throw new IllegalStateException("recycled already");
            }
            Class_28917.Method_28925(class_28917, class_11651);
            arrclass_289172[n4++] = class_28917;
            arrclass_28917[n++] = null;
        }
        Class_11651.Method_11664(class_11651, n4);
        if (n2 == (8341 & 4152) && Class_24236.Method_24242(class_24236) != null) {
            this.Field_41806 = Class_24236.Method_24242(class_24236);
        }
        Class_24236.Method_24243(class_24236, n2);
        return (-31723 & 10409) != 0;
    }

    void Method_41810(Class_28917 class_28917) {
        Class_28917.Method_28926(class_28917, this.Field_41803);
        Class_24236 class_24236 = this.Field_41804;
        int n = class_24236.get();
        if (n == (4113 & 25010)) {
            this.Field_41804 = class_24236 = Class_24236.Method_24240(class_24236, new Class_24236(null));
            n = class_24236.get();
        }
        Class_24236.Method_24244((Class_24236)class_24236)[n] = class_28917;
        Class_28917.Method_28925(class_28917, null);
        class_24236.lazySet(n + (32163 & -32683));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    Class_41802(Class_11651 class_11651, Thread thread) {
        this.Field_41805 = new WeakReference<Thread>(thread);
        Class_11651 class_116512 = class_11651;
        synchronized (class_116512) {
            this.Field_41807 = Class_11651.Method_11666(class_11651);
            Class_11651.Method_11667(class_11651, this);
        }
    }

    static WeakReference Method_41811(Class_41802 class_41802) {
        return class_41802.Field_41805;
    }

    static Class_41802 Method_41812(Class_41802 class_41802) {
        return class_41802.Field_41807;
    }

    private void Method_41813() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static Class_41802 Method_41814(Class_41802 class_41802, Class_41802 class_418022) {
        class_41802.Field_41807 = class_418022;
        return class_41802.Field_41807;
    }
}

