/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_30391
implements Callable {
    final Class_35869 Field_30392;

    Class_30391(Class_35869 class_35869) {
        this.Field_30392 = class_35869;
    }

    public Object Method_30393() {
        return this.Method_30394();
    }

    public String Method_30394() {
        return this.Field_30392.Method_35899();
    }

    private void Method_30395() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

