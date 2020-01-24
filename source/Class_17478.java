/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collections;

public class Class_17478
implements Runnable {
    final Object[] Field_17479;
    final Class_41005 Field_17480;
    final Class_6274 Field_17481;
    final Class_41005 Field_17482;

    Class_17478(Class_41005 class_41005, Class_41005 class_410052, Object[] arrobject, Class_6274 class_6274) {
        this.Field_17482 = class_41005;
        this.Field_17480 = class_410052;
        this.Field_17479 = arrobject;
        this.Field_17481 = class_6274;
    }

    public void Method_17483() {
        Collections.addAll(Class_41005.Method_41047(this.Field_17480), this.Field_17479);
        Class_41005.Method_41036(this.Field_17480, this.Field_17481);
    }

    private void Method_17484() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

