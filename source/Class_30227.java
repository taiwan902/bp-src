/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_30227
implements Class_25993 {
    private final int Field_30228;
    private final Class_1782 Field_30229;

    public int Method_30230() {
        return this.Field_30228;
    }

    public Class_1782 Method_30231() {
        return this.Field_30229;
    }

    public Class_30227(Class_1782 class_1782, int n) {
        this.Field_30229 = class_1782;
        this.Field_30228 = n;
    }

    private void Method_30232() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

