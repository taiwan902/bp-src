/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_27925
implements Callable {
    final Class_18 Field_27926;

    Class_27925(Class_18 class_18) {
        this.Field_27926 = class_18;
    }

    public Object Method_27927() {
        return this.Method_27929();
    }

    private void Method_27928() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_27929() {
        return this.Field_27926.Field_84.Field_39706 ? "Yes" : "No";
    }
}

