/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_34451
implements Class_11649 {
    private final int Field_34452;

    Class_34451(int n, Class_7609 class_7609) {
        this(n);
    }

    private void Method_34453() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private Class_34451(int n) {
        this.Field_34452 = n;
    }

    public int Method_34454(Object object) {
        if (object instanceof Class_22553) {
            return ((Class_22553)object).Method_22564();
        }
        if (object instanceof Class_23010) {
            return ((Class_23010)object).Method_23012().Method_22564();
        }
        if (object instanceof Class_23060) {
            return 2 & -28399;
        }
        return this.Field_34452;
    }
}

