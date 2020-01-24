/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.concurrent.Callable;

public class Class_29076
implements Callable {
    final Class_283 Field_29077;

    private void Method_29078() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_29079() {
        return this.Field_29077.Field_325.size() + " total; " + this.Field_29077.Field_325.toString();
    }

    Class_29076(Class_283 class_283) {
        this.Field_29077 = class_283;
    }

    public Object Method_29080() {
        return this.Method_29079();
    }
}

