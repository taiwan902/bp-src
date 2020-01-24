/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_31054
implements Runnable {
    final Class_20343 Field_31055;
    final Class_41731 Field_31056;

    Class_31054(Class_41731 class_41731, Class_20343 class_20343) {
        this.Field_31056 = class_41731;
        this.Field_31055 = class_20343;
    }

    public void Method_31057() {
        Class_41731.Method_41772(this.Field_31056, this.Field_31055);
        Class_41731.Method_41781(this.Field_31056, null);
    }

    private void Method_31058() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

