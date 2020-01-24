/*
 * Decompiled with CFR 0.145.
 */
import java.io.PrintStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_26398 {
    private float Field_26399;
    private float Field_26400;
    private Class_39133 Field_26401;
    private Class_11708 Field_26402;

    public void Method_26403(String string) {
        System.out.println(string + "Entity " + this.Field_26399 + "," + this.Field_26400);
        this.Field_26402.Method_11710(string + "\t");
        this.Field_26401.Method_39139(string + "\t");
    }

    private void Method_26404() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

