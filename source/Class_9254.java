/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_9254 {
    final long Field_9255;
    final int Field_9256;
    Class_9254 Field_9257;
    Object Field_9258;

    Class_9254(int n, long l, Object object, Class_9254 class_9254) {
        this.Field_9258 = object;
        this.Field_9257 = class_9254;
        this.Field_9255 = l;
        this.Field_9256 = n;
    }

    private void Method_9259() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public final int Method_9260() {
        return Class_14376.Method_14396(this.Field_9255);
    }

    public final boolean Method_9261(Object object) {
        Long l;
        Object object2;
        Object object3;
        if (!(object instanceof Class_9254)) {
            return (-19947 & 3336) != 0;
        }
        Class_9254 class_9254 = (Class_9254)object;
        Long l2 = this.Method_9263();
        if ((l2 == (l = Long.valueOf(class_9254.Method_9263())) || l2 != null && l2.equals(l)) && ((object3 = this.Method_9262()) == (object2 = class_9254.Method_9262()) || object3 != null && object3.equals(object2))) {
            return (-31727 & 17323) != 0;
        }
        return (4748 & 259) != 0;
    }

    public final Object Method_9262() {
        return this.Field_9258;
    }

    public final long Method_9263() {
        return this.Field_9255;
    }

    public final String Method_9264() {
        return this.Method_9263() + "=" + this.Method_9262();
    }
}

