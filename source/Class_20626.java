/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_20626
implements Callable {
    final Class_11372 Field_20627;
    final Class_24069 Field_20628;

    public String Method_20629() {
        return this.Field_20627.Method_11414() + " frames";
    }

    private void Method_20630() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Object Method_20631() {
        return this.Method_20629();
    }

    Class_20626(Class_24069 class_24069, Class_11372 class_11372) {
        this.Field_20628 = class_24069;
        this.Field_20627 = class_11372;
    }
}

