/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_25647
implements Callable {
    final Class_31428 Field_25648;
    final int Field_25649;
    final int Field_25650;

    public Object Method_25651() {
        return this.Method_25653();
    }

    Class_25647(Class_31428 class_31428, int n, int n2) {
        this.Field_25648 = class_31428;
        this.Field_25650 = n;
        this.Field_25649 = n2;
    }

    private void Method_25652() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_25653() {
        return this.Field_25648.Method_31433(this.Field_25650, this.Field_25649) ? "True" : "False";
    }
}

