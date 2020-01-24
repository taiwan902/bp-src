/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_12158
implements Runnable {
    final Class_37228 Field_12159;
    final Class_19025 Field_12160;

    private void Method_12161() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_12158(Class_19025 class_19025, Class_37228 class_37228) {
        this.Field_12160 = class_19025;
        this.Field_12159 = class_37228;
    }

    public void Method_12162() {
        Class_1061 class_1061;
        Class_570 class_570 = Class_18.Field_89.Field_72;
        if (class_570 != null && (class_1061 = class_570.Method_343(this.Field_12159.Field_37230)) != null && class_1061 instanceof Class_626) {
            Class_626 class_626 = (Class_626)class_1061;
            class_626.Field_666.Field_7224 = this.Field_12159.Field_37232;
            class_626.Field_666.Field_7226 = this.Field_12159.Field_37229;
        }
    }
}

