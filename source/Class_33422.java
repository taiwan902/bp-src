/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_33422
extends Class_20870 {
    final Class_33348 Field_33423;

    public Class_4751 Method_33424() {
        return new Class_4751(this.Field_33423);
    }

    private void Method_33425() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_33426(int n) {
        this.Field_33423.\u0000strictfp.Method_483(this.Field_33423, (byte)n);
    }

    Class_33422(Class_33348 class_33348) {
        this.Field_33423 = class_33348;
    }

    public Class_283 Method_33427() {
        return this.Field_33423.\u0000strictfp;
    }
}

