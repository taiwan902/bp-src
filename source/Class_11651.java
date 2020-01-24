/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;

public final class Class_11651 {
    private Class_28917[] Field_11652;
    private final int Field_11653;
    private Class_41802 Field_11654;
    final Thread Field_11655;
    final Class_32390 Field_11656;
    private Class_41802 Field_11657;
    private Class_41802 Field_11658;
    private int Field_11659;

    Class_28917 Method_11660() {
        return new Class_28917(this);
    }

    static Class_28917[] Method_11661(Class_11651 class_11651) {
        return class_11651.Field_11652;
    }

    Class_28917 Method_11662() {
        Class_28917 class_28917;
        int n = this.Field_11659;
        if (n == 0) {
            if (!this.Method_11665()) {
                return null;
            }
            n = this.Field_11659;
        }
        if (Class_28917.Method_28929(class_28917 = this.Field_11652[--n]) != Class_28917.Method_28931(class_28917)) {
            throw new IllegalStateException("recycled multiple times");
        }
        Class_28917.Method_28927(class_28917, 9601 & 2132);
        Class_28917.Method_28926(class_28917, 2082 & -24128);
        this.Field_11659 = n;
        return class_28917;
    }

    static Class_28917[] Method_11663(Class_11651 class_11651, Class_28917[] arrclass_28917) {
        class_11651.Field_11652 = arrclass_28917;
        return class_11651.Field_11652;
    }

    static int Method_11664(Class_11651 class_11651, int n) {
        class_11651.Field_11659 = n;
        return class_11651.Field_11659;
    }

    Class_11651(Class_32390 class_32390, Thread thread, int n) {
        this.Field_11656 = class_32390;
        this.Field_11655 = thread;
        this.Field_11653 = n;
        this.Field_11652 = new Class_28917[Class_32390.Method_32409()];
    }

    boolean Method_11665() {
        if (this.Method_11668()) {
            return (1025 & 27171) != 0;
        }
        this.Field_11654 = null;
        this.Field_11657 = this.Field_11658;
        return (195 & 4876) != 0;
    }

    static Class_41802 Method_11666(Class_11651 class_11651) {
        return class_11651.Field_11658;
    }

    static Class_41802 Method_11667(Class_11651 class_11651, Class_41802 class_41802) {
        class_11651.Field_11658 = class_41802;
        return class_11651.Field_11658;
    }

    boolean Method_11668() {
        boolean bl = -29873 & 17440;
        Class_41802 class_41802 = this.Field_11657;
        Class_41802 class_418022 = this.Field_11654;
        while (class_41802 != null) {
            if (class_41802.Method_41809(this)) {
                bl = 4369 & -31577;
                break;
            }
            Class_41802 class_418023 = Class_41802.Method_41812(class_41802);
            if (Class_41802.Method_41811(class_41802).get() == null) {
                if (class_41802.Method_41808()) {
                    while (class_41802.Method_41809(this)) {
                    }
                }
                if (class_418022 != null) {
                    Class_41802.Method_41814(class_418022, class_418023);
                }
            } else {
                class_418022 = class_41802;
            }
            class_41802 = class_418023;
        }
        this.Field_11654 = class_418022;
        this.Field_11657 = class_41802;
        return bl;
    }

    void Method_11669(Class_28917 class_28917) {
        if ((Class_28917.Method_28931(class_28917) | Class_28917.Method_28929(class_28917)) != 0) {
            throw new IllegalStateException("recycled already");
        }
        Class_28917.Method_28927(class_28917, Class_28917.Method_28926(class_28917, Class_32390.Method_32401()));
        int n = this.Field_11659;
        if (n == this.Field_11652.length) {
            if (n == this.Field_11653) {
                return;
            }
            this.Field_11652 = Arrays.copyOf(this.Field_11652, n << (5835 & 2049));
        }
        this.Field_11652[n] = class_28917;
        this.Field_11659 = n + (281 & -13789);
    }

    private void Method_11670() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static int Method_11671(Class_11651 class_11651) {
        return class_11651.Field_11659;
    }
}

