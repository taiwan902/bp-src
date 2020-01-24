/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_39989
extends Class_36292 {
    private static final Class_32390 Field_39990 = new Class_35701();

    private Class_39989(Class_22999 class_22999) {
        super(class_22999, null);
    }

    Class_39989(Class_22999 class_22999, Class_15116 class_15116) {
        this(class_22999);
    }

    private static Class_39989 Method_39991(Class_42469 class_42469, Object object, int n, Class_37748 class_37748) {
        Class_39989 class_39989 = (Class_39989)Field_39990.Method_32408();
        Class_39989.init((Class_36292)class_39989, (Class_42469)class_42469, (Object)object, (int)n, (Class_37748)class_37748);
        return class_39989;
    }

    protected void Method_39992(Class_22999 class_22999) {
        Field_39990.Method_32402(this, class_22999);
    }

    private void Method_39993() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_39994(Class_42469 class_42469, Object object, Class_37748 class_37748) {
        super.Method_36298(class_42469, object, class_37748);
        Class_42469.Method_42529(class_42469);
    }

    static Class_39989 Method_39995(Class_42469 class_42469, Object object, int n, Class_37748 class_37748) {
        return Class_39989.Method_39991(class_42469, object, n, class_37748);
    }
}

