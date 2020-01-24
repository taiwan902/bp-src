/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_35969
implements Class_27121 {
    final Class_30282 Field_35970;

    Class_35969(Class_30282 class_30282, Class_35818 class_35818) {
        this(class_30282);
    }

    public Class_37082 Method_35971() {
        return Class_30282.Method_30297(this.Field_35970)[Math.abs(Class_30282.Method_30298(this.Field_35970).getAndIncrement() % Class_30282.Method_30297(this.Field_35970).length)];
    }

    private void Method_35972() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private Class_35969(Class_30282 class_30282) {
        this.Field_35970 = class_30282;
    }
}

