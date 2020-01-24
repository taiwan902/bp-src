/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_16333
implements Callable {
    final int Field_16334;
    final int Field_16335;
    final Class_31428 Field_16336;

    public String Method_16337() {
        return String.valueOf(Class_29480.Method_29490(this.Field_16335, this.Field_16334));
    }

    private void Method_16338() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Object Method_16339() {
        return this.Method_16337();
    }

    Class_16333(Class_31428 class_31428, int n, int n2) {
        this.Field_16336 = class_31428;
        this.Field_16335 = n;
        this.Field_16334 = n2;
    }
}

