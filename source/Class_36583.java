/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public abstract class Class_36583
implements Class_22837 {
    private final Class_22553 Field_36584;
    private final boolean Field_36585;

    public Class_22553 Method_36586() {
        return this.Method_36589(4488 & 322, Integer.MAX_VALUE & -1);
    }

    protected abstract Class_22553 Method_36587(int var1, int var2);

    protected abstract Class_22553 Method_36588(int var1, int var2);

    public Class_22553 Method_36589(int n, int n2) {
        if (n == 0 && n2 == 0) {
            return this.Field_36584;
        }
        Class_36583.Method_36600(n, n2);
        return this.Method_36587(n, n2);
    }

    public String Method_36590() {
        return Class_22304.Method_22312(this) + "(directByDefault: " + this.Field_36585 + (char)(297 & 4137);
    }

    public Class_22553 Method_36591(int n) {
        if (Class_7799.Method_7858()) {
            return this.Method_36597(n);
        }
        return this.Method_36595(n);
    }

    public Class_22553 Method_36592(int n, int n2) {
        if (n == 0 && n2 == 0) {
            return this.Field_36584;
        }
        Class_36583.Method_36600(n, n2);
        return this.Method_36588(n, n2);
    }

    private void Method_36593() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected static Class_22553 Method_36594(Class_22553 class_22553) {
        switch (Class_11142.Field_11143[Class_24943.Method_24968().ordinal()]) {
            case 1: {
                Class_20340 class_20340 = Class_34813.Field_34818.Method_24960(class_22553);
                if (class_20340 == null) break;
                class_22553 = new Class_41287(class_22553, class_20340);
                break;
            }
            case 2: 
            case 3: {
                Class_20340 class_20340 = Class_34813.Field_34818.Method_24960(class_22553);
                if (class_20340 == null) break;
                class_22553 = new Class_35168(class_22553, class_20340);
            }
        }
        return class_22553;
    }

    public Class_22553 Method_36595(int n) {
        return this.Method_36592(n, Integer.MAX_VALUE & Integer.MAX_VALUE);
    }

    protected Class_36583(boolean bl) {
        this.Field_36585 = bl && Class_7799.Method_7858() ? 1377 & -32115 : 9794 & 168;
        this.Field_36584 = new Class_32584(this);
    }

    public Class_22553 Method_36596(int n) {
        if (this.Field_36585) {
            return this.Method_36597(n);
        }
        return this.Method_36595(n);
    }

    public Class_22553 Method_36597(int n) {
        return this.Method_36589(n, -1 & Integer.MAX_VALUE);
    }

    public Class_22553 Method_36598(int n, int n2) {
        if (this.Field_36585) {
            return this.Method_36589(n, n2);
        }
        return this.Method_36592(n, n2);
    }

    public Class_22553 Method_36599() {
        return this.Method_36592(-31972 & 18688, Integer.MAX_VALUE & Integer.MAX_VALUE);
    }

    private static void Method_36600(int n, int n2) {
        if (n < 0) {
            throw new IllegalArgumentException("initialCapacity: " + n + " (expectd: 0+)");
        }
        if (n > n2) {
            Object[] arrobject = new Object[19210 & 12294];
            arrobject[9729 & 16616] = n;
            arrobject[24857 & 4609] = n2;
            throw new IllegalArgumentException(String.format("initialCapacity: %d (expected: not greater than maxCapacity(%d)", arrobject));
        }
    }

    public Class_22553 Method_36601() {
        if (Class_7799.Method_7858()) {
            return this.Method_36597(-25824 & 25923);
        }
        return this.Method_36595(10624 & 17765);
    }

    public Class_22553 Method_36602() {
        if (this.Field_36585) {
            return this.Method_36586();
        }
        return this.Method_36599();
    }
}

