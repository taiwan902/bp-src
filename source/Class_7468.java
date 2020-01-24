/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_7468 {
    final int Field_7469;
    final int Field_7470;
    Object Field_7471;
    Class_7468 Field_7472;

    public final boolean Method_7473(Object object) {
        Object object2;
        Object object3;
        Integer n;
        if (!(object instanceof Class_7468)) {
            return (4257 & 27392) != 0;
        }
        Class_7468 class_7468 = (Class_7468)object;
        Integer n2 = this.Method_7477();
        if ((n2 == (n = Integer.valueOf(class_7468.Method_7477())) || n2 != null && ((Object)n2).equals(n)) && ((object3 = this.Method_7478()) == (object2 = class_7468.Method_7478()) || object3 != null && object3.equals(object2))) {
            return (1331 & 12865) != 0;
        }
        return (-28350 & 3584) != 0;
    }

    public final int Method_7474() {
        return Class_29437.Method_29452(this.Field_7469);
    }

    public final String Method_7475() {
        return this.Method_7477() + "=" + this.Method_7478();
    }

    private void Method_7476() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public final int Method_7477() {
        return this.Field_7469;
    }

    public final Object Method_7478() {
        return this.Field_7471;
    }

    Class_7468(int n, int n2, Object object, Class_7468 class_7468) {
        this.Field_7471 = object;
        this.Field_7472 = class_7468;
        this.Field_7469 = n2;
        this.Field_7470 = n;
    }
}

