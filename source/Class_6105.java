/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_6105
implements Callable {
    final double Field_6106;
    final Class_24997 Field_6107;
    final double Field_6108;
    final double Field_6109;

    public Object Method_6110() {
        return this.Method_6112();
    }

    private void Method_6111() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_6105(Class_24997 class_24997, double d, double d2, double d3) {
        this.Field_6107 = class_24997;
        this.Field_6106 = d;
        this.Field_6109 = d2;
        this.Field_6108 = d3;
    }

    public String Method_6112() {
        return Class_13220.Method_13236(this.Field_6106, this.Field_6109, this.Field_6108);
    }
}

