/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_14030 {
    private final Class_18600[] Field_14031;
    private final Class_1486 Field_14032;

    private void Method_14033() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static Class_18600[] Method_14034(Class_14030 class_14030) {
        return class_14030.Field_14031;
    }

    static Class_1486 Method_14035(Class_14030 class_14030) {
        return class_14030.Field_14032;
    }

    public Class_14030(Class_1486 class_1486, Class_18600 ... arrclass_18600) {
        this.Field_14032 = class_1486;
        this.Field_14031 = arrclass_18600;
    }
}

