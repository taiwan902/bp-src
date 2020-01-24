/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_25673
implements Class_1486 {
    private int Field_25674;
    private Class_1699 Field_25675;

    public void Method_25676(Class_29900 class_29900) {
        class_29900.Method_29982(this.Field_25674);
        class_29900.Method_29976(this.Field_25675);
    }

    public Class_1061 Method_25677(Class_283 class_283) {
        return class_283.Method_343(this.Field_25674);
    }

    private void Method_25678() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_25679(Class_29900 class_29900) {
        this.Field_25674 = class_29900.Method_30004();
        this.Field_25675 = class_29900.Method_29970();
    }

    public void Method_25680(Class_14856 class_14856) {
        class_14856.Method_14906(this);
    }

    public Class_1699 Method_25681() {
        return this.Field_25675;
    }

    public void Method_25682(Class_10954 class_10954) {
        this.Method_25680((Class_14856)class_10954);
    }

    public Class_25673() {
    }

    public Class_25673(int n, Class_1699 class_1699) {
        this.Field_25674 = n;
        this.Field_25675 = class_1699;
    }
}

