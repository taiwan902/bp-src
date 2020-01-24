/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.Sys
 */
import internal.org.lwjgl.Sys;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_33222
implements Callable {
    final Class_18 Field_33223;

    Class_33222(Class_18 class_18) {
        this.Field_33223 = class_18;
    }

    public String Method_33224() {
        return Sys.getVersion();
    }

    private void Method_33225() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Object Method_33226() {
        return this.Method_33224();
    }
}

