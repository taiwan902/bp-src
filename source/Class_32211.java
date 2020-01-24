/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_32211
implements Class_27121 {
    final Class_30282 Field_32212;

    public Class_37082 Method_32213() {
        return Class_30282.Method_30297(this.Field_32212)[Class_30282.Method_30298(this.Field_32212).getAndIncrement() & Class_30282.Method_30297(this.Field_32212).length - (-15195 & 9)];
    }

    private void Method_32214() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_32211(Class_30282 class_30282, Class_35818 class_35818) {
        this(class_30282);
    }

    private Class_32211(Class_30282 class_30282) {
        this.Field_32212 = class_30282;
    }
}

