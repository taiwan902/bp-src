/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_14577
implements Callable {
    final Class_37781 Field_14578;
    final Class_23823 Field_14579;

    public Object Method_14580() {
        return this.Method_14581();
    }

    Class_14577(Class_37781 class_37781, Class_23823 class_23823) {
        this.Field_14578 = class_37781;
        this.Field_14579 = class_23823;
    }

    public String Method_14581() {
        return this.Field_14579.Method_23899();
    }

    private void Method_14582() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

