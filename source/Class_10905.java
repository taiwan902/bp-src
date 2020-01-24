/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_10905
implements Runnable {
    final Class_41005 Field_10906;

    private void Method_10907() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_10908() {
        Object e;
        Class_6274 class_6274 = this.Field_10906.pipeline();
        while ((e = Class_41005.Method_41047(this.Field_10906).poll()) != null) {
            class_6274.Method_6277(e);
        }
        class_6274.Method_6283();
    }

    Class_10905(Class_41005 class_41005) {
        this.Field_10906 = class_41005;
    }
}

