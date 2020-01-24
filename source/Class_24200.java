/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_24200
extends Class_20941 {
    final Class_32295 Field_24201;

    private void Method_24202() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_4286 Method_24203(Random random) {
        return random.nextBoolean() ? Class_32295.Field_32297 : Class_32295.Field_32298;
    }

    Class_24200(Class_32295 class_32295, int n, Class_17281 class_17281) {
        this.Field_24201 = class_32295;
        super(n, class_17281);
    }
}

