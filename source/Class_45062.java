/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_45062
extends Class_36292
implements Class_11116 {
    private static final Class_32390 Field_45063 = new Class_32521();

    Class_45062(Class_22999 class_22999, Class_15116 class_15116) {
        this(class_22999);
    }

    static Class_45062 Method_45064(Class_42469 class_42469, Object object, int n, Class_37748 class_37748) {
        return Class_45062.Method_45065(class_42469, object, n, class_37748);
    }

    private Class_45062(Class_22999 class_22999) {
        super(class_22999, null);
    }

    private static Class_45062 Method_45065(Class_42469 class_42469, Object object, int n, Class_37748 class_37748) {
        Class_45062 class_45062 = (Class_45062)Field_45063.Method_32408();
        Class_45062.init((Class_36292)class_45062, (Class_42469)class_42469, (Object)object, (int)n, (Class_37748)class_37748);
        return class_45062;
    }

    private void Method_45066() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_45067(Class_22999 class_22999) {
        Field_45063.Method_32402(this, class_22999);
    }
}

