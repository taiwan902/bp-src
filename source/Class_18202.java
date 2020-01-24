/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_18202
implements Runnable {
    final Class_17594 Field_18203;
    final Class_22205 Field_18204;

    public void Method_18205() {
        Class_22205.Method_22220(this.Field_18204).remove(this.Field_18203);
    }

    private void Method_18206() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_18202(Class_22205 class_22205, Class_17594 class_17594) {
        this.Field_18204 = class_22205;
        this.Field_18203 = class_17594;
    }
}

