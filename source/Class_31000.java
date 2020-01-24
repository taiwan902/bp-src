/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_31000
implements Callable {
    final int Field_31001;
    final Class_17665 Field_31002;
    final int Field_31003;
    final int Field_31004;

    Class_31000(Class_17665 class_17665, int n, int n2, int n3) {
        this.Field_31002 = class_17665;
        this.Field_31004 = n;
        this.Field_31001 = n2;
        this.Field_31003 = n3;
    }

    public String Method_31005() {
        return Class_13220.Method_13236(this.Field_31004, this.Field_31001, this.Field_31003);
    }

    public Object Method_31006() {
        return this.Method_31005();
    }

    private void Method_31007() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

