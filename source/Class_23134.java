/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_23134
extends Class_1956 {
    public boolean Method_23135(Class_23823 class_23823) {
        return (3141 & 16529) != 0;
    }

    public Class_23134() {
        this.\u0000strictfp(Class_3987.Field_4003);
    }

    private void Method_23136() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_23823 Method_23137(Class_23823 class_23823, Class_283 class_283, Class_626 class_626) {
        if (!class_626.Field_694.Method_18094()) {
            class_23823.Field_23826 -= 4129 & 8321;
        }
        class_283.Method_519(class_626, "random.bow", 0.37037036f * 1.35f, 0.023529412f * 17.0f / (\u0000strictfp.nextFloat() * (0.42105263f * 0.95f) + 0.20879121f * 3.831579f));
        if (!class_283.Field_306) {
            class_283.Method_350(new Class_35722(class_283, class_626));
        }
        class_626.Method_750(Class_19863.Field_19917[Class_1956.Method_1986(this)]);
        return class_23823;
    }
}

