/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_18394
implements Runnable {
    final Class_42469 Field_18395;
    final Class_42469 Field_18396;

    Class_18394(Class_42469 class_42469, Class_42469 class_424692) {
        this.Field_18396 = class_42469;
        this.Field_18395 = class_424692;
    }

    public void Method_18397() {
        Class_42469.Method_42529(this.Field_18395);
    }

    private void Method_18398() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

