/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_27876 {
    private final Class_39158 Field_27877;
    private Class_14347 Field_27878;
    private final Class_11649 Field_27879;
    private static final Class_6113 Field_27880;
    private int Field_27881;
    static final boolean Field_27882;
    private Class_14347 Field_27883;
    private final Class_18249 Field_27884;

    public void Method_27885(Object object, Class_37748 class_37748) {
        if (!Field_27882 && !this.Field_27877.Method_39160().Method_37084()) {
            throw new AssertionError();
        }
        if (object == null) {
            throw new NullPointerException("msg");
        }
        if (class_37748 == null) {
            throw new NullPointerException("promise");
        }
        int n = this.Field_27879.Method_11650(object);
        if (n < 0) {
            n = 640 & -32702;
        }
        Class_14347 class_14347 = Class_14347.Method_14355(object, n, class_37748);
        Class_14347 class_143472 = this.Field_27883;
        if (class_143472 == null) {
            this.Field_27883 = this.Field_27878 = class_14347;
        } else {
            Class_14347.Method_14357(class_143472, class_14347);
            this.Field_27883 = class_14347;
        }
        this.Field_27881 += 12321 & 1035;
        this.Field_27884.Method_18285(Class_14347.Method_14359(class_14347));
    }

    public Class_27876(Class_39158 class_39158) {
        if (class_39158 == null) {
            throw new NullPointerException("ctx");
        }
        this.Field_27877 = class_39158;
        this.Field_27884 = class_39158.Method_39175().Method_26101().Method_7321();
        this.Field_27879 = class_39158.Method_39175().Method_26110().Method_19101().Method_25566();
    }

    public Class_27581 Method_27886() {
        if (!Field_27882 && !this.Field_27877.Method_39160().Method_37084()) {
            throw new AssertionError();
        }
        Class_14347 class_14347 = this.Field_27878;
        if (class_14347 == null) {
            return null;
        }
        Object object = Class_14347.Method_14354(class_14347);
        Class_37748 class_37748 = Class_14347.Method_14360(class_14347);
        this.Method_27895(class_14347);
        return this.Field_27877.Method_39163(object, class_37748);
    }

    private void Method_27887() {
        if (!(Field_27882 || this.Field_27883 == null && this.Field_27878 == null && this.Field_27881 == 0)) {
            throw new AssertionError();
        }
    }

    public Object Method_27888() {
        if (!Field_27882 && !this.Field_27877.Method_39160().Method_37084()) {
            throw new AssertionError();
        }
        Class_14347 class_14347 = this.Field_27878;
        if (class_14347 == null) {
            return null;
        }
        return Class_14347.Method_14354(class_14347);
    }

    public Class_27581 Method_27889() {
        if (!Field_27882 && !this.Field_27877.Method_39160().Method_37084()) {
            throw new AssertionError();
        }
        Class_14347 class_14347 = this.Field_27878;
        if (class_14347 == null) {
            return null;
        }
        if (this.Field_27881 == (-28391 & 17059)) {
            return this.Method_27886();
        }
        Class_37748 class_37748 = this.Field_27877.Method_39177();
        Class_25349 class_25349 = new Class_25349(class_37748);
        while (class_14347 != null) {
            Class_14347 class_143472 = Class_14347.Method_14356(class_14347);
            Object object = Class_14347.Method_14354(class_14347);
            Class_37748 class_377482 = Class_14347.Method_14360(class_14347);
            this.Method_27895(class_14347);
            this.Field_27877.Method_39163(object, class_377482);
            Class_37748[] arrclass_37748 = new Class_37748[2785 & -11263];
            arrclass_37748[26764 & 290] = class_377482;
            class_25349.Method_25353(arrclass_37748);
            class_14347 = class_143472;
        }
        this.Method_27887();
        return class_37748;
    }

    private static void Method_27890(Class_37748 class_37748, Throwable throwable) {
        if (!(class_37748 instanceof Class_40957) && !class_37748.tryFailure(throwable)) {
            Field_27880.Method_6123("Failed to mark a promise as failure because it's done already: {}", class_37748, throwable);
        }
    }

    public void Method_27891(Throwable throwable) {
        if (!Field_27882 && !this.Field_27877.Method_39160().Method_37084()) {
            throw new AssertionError();
        }
        if (throwable == null) {
            throw new NullPointerException("cause");
        }
        Class_14347 class_14347 = this.Field_27878;
        while (class_14347 != null) {
            Class_14347 class_143472 = Class_14347.Method_14356(class_14347);
            Class_24761.Method_24766(Class_14347.Method_14354(class_14347));
            Class_37748 class_37748 = Class_14347.Method_14360(class_14347);
            this.Method_27895(class_14347);
            Class_27876.Method_27890(class_37748, throwable);
            class_14347 = class_143472;
        }
        this.Method_27887();
    }

    private void Method_27892() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_37748 Method_27893() {
        if (!Field_27882 && !this.Field_27877.Method_39160().Method_37084()) {
            throw new AssertionError();
        }
        Class_14347 class_14347 = this.Field_27878;
        if (class_14347 == null) {
            return null;
        }
        Class_37748 class_37748 = Class_14347.Method_14360(class_14347);
        Class_24761.Method_24766(Class_14347.Method_14354(class_14347));
        this.Method_27895(class_14347);
        return class_37748;
    }

    static {
        Field_27882 = !Class_27876.class.desiredAssertionStatus() ? 515 & -32743 : 2692 & -32703;
        Field_27880 = Class_10201.Method_10203(Class_27876.class);
    }

    public boolean Method_27894() {
        if (!Field_27882 && !this.Field_27877.Method_39160().Method_37084()) {
            throw new AssertionError();
        }
        return (this.Field_27878 == null ? 21047 & 1417 : 29500 & 1216) != 0;
    }

    private void Method_27895(Class_14347 class_14347) {
        Class_14347 class_143472 = Class_14347.Method_14356(class_14347);
        this.Field_27884.Method_18283(Class_14347.Method_14359(class_14347));
        Class_14347.Method_14361(class_14347);
        this.Field_27881 -= -32719 & 771;
        if (class_143472 == null) {
            this.Field_27883 = null;
            this.Field_27878 = null;
            if (!Field_27882 && this.Field_27881 != 0) {
                throw new AssertionError();
            }
        } else {
            this.Field_27878 = class_143472;
            if (!Field_27882 && this.Field_27881 <= 0) {
                throw new AssertionError();
            }
        }
    }
}

