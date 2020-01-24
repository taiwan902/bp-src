/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_4452
extends ThreadLocal {
    public Class_4810 Method_4453() {
        return new Class_4810();
    }

    private void Method_4454() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_4810 Method_4455(double d, double d2, double d3) {
        Class_4810 class_4810 = (Class_4810)this.get();
        class_4810.Method_4816(Class_13337.Method_13371(d), Class_13337.Method_13371(d2), Class_13337.Method_13371(d3));
        return class_4810;
    }

    public Object Method_4456() {
        return this.Method_4453();
    }

    public Class_4810 Method_4457(int n, int n2, int n3) {
        Class_4810 class_4810 = (Class_4810)this.get();
        class_4810.Method_4816(n, n2, n3);
        return class_4810;
    }
}

