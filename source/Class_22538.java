/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Map;

public class Class_22538
extends Class_13017 {
    private final Class_1956 Field_22539;

    public Class_22538(String string, String string2, Class_1782 class_1782, Class_1956 class_1956) {
        super(string + string2, class_1782);
        this.Field_22539 = class_1956;
        int n = Class_1956.Method_1986(class_1956);
        if (n != 0) {
            Class_27930.Field_27937.put(string + n, this.\u0000strictfp());
        }
    }

    private void Method_22540() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_1956 Method_22541() {
        return this.Field_22539;
    }
}

