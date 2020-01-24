/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_23556
implements Callable {
    final String Field_23557;
    final Class_1699 Field_23558;

    Class_23556(Class_1699 class_1699, String string) {
        this.Field_23558 = class_1699;
        this.Field_23557 = string;
    }

    private void Method_23559() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_23560() {
        return Class_1674.Field_1675[((Class_1674)Class_1699.Method_1717(this.Field_23558).get(this.Field_23557)).Method_1683()];
    }

    public Object Method_23561() {
        return this.Method_23560();
    }
}

