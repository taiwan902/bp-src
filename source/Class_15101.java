/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_15101
implements Runnable {
    final Class_24814 Field_15102;
    final Class_39158 Field_15103;

    public void Method_15104() {
        Class_24814.Method_24860(this.Field_15102, this.Field_15103);
    }

    Class_15101(Class_24814 class_24814, Class_39158 class_39158) {
        this.Field_15102 = class_24814;
        this.Field_15103 = class_39158;
    }

    private void Method_15105() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

