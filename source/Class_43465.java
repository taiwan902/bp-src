/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_43465
extends Class_42469 {
    private final Class_31885 Field_43466;

    public Class_31885 Method_43467() {
        return this.Field_43466;
    }

    private static boolean Method_43468(Class_31885 class_31885) {
        return class_31885 instanceof Class_31877;
    }

    private void Method_43469() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static boolean Method_43470(Class_31885 class_31885) {
        return class_31885 instanceof Class_35822;
    }

    Class_43465(Class_24814 class_24814, Class_17563 class_17563, String string, Class_31885 class_31885) {
        super(class_24814, class_17563, string, Class_43465.Method_43470(class_31885), Class_43465.Method_43468(class_31885));
        if (class_31885 == null) {
            throw new NullPointerException("handler");
        }
        this.Field_43466 = class_31885;
    }
}

