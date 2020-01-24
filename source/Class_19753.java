/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_19753
implements Callable {
    final Class_24752 Field_19754;
    final Class_34695 Field_19755;

    public Object Method_19756() {
        return this.Method_19757();
    }

    public String Method_19757() {
        return this.Field_19754.getClass().getName();
    }

    Class_19753(Class_34695 class_34695, Class_24752 class_24752) {
        this.Field_19755 = class_34695;
        this.Field_19754 = class_24752;
    }

    private void Method_19758() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

