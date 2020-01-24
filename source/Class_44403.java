/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_44403
extends Class_42376 {
    private final Class_21361 Field_44404;
    final Class_28889 Field_44405;

    Class_44403(Class_28889 class_28889, int n, int n2, int n3, int n4, int n5, Class_21361 class_21361, Class_16089 class_16089) {
        this(class_28889, n, n2, n3, n4, n5, class_21361);
    }

    private Class_44403(Class_28889 class_28889, int n, int n2, int n3, int n4, int n5, Class_21361 class_21361) {
        this.Field_44405 = class_28889;
        super(n, n2, n3, n4, n5, class_28889.Method_28893(class_21361));
        this.Field_44404 = class_21361;
    }

    static Class_21361 Method_44406(Class_44403 class_44403) {
        return class_44403.Field_44404;
    }

    private void Method_44407() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

