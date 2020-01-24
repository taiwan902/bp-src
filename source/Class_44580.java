/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_44580
extends Class_26851 {
    final Class_26851[] Field_44581;

    private void Method_44582() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_44580(Class_26851[] arrclass_26851) {
        super(-1 & -1, null, null, null);
        this.Field_44581 = arrclass_26851;
    }

    Class_26851 Method_44583(int n, Object object) {
        Class_26851[] arrclass_26851 = this.Field_44581;
        block0 : do {
            Class_26851 class_26851;
            int n2;
            if (object == null || arrclass_26851 == null || (n2 = arrclass_26851.length) == 0 || (class_26851 = Class_21500.Method_21573(arrclass_26851, n2 - (-32695 & 4609) & n)) == null) {
                return null;
            }
            do {
                Object object2;
                int n3;
                if ((n3 = class_26851.Field_26852) == n && ((object2 = class_26851.Field_26855) == object || object2 != null && object.equals(object2))) {
                    return class_26851;
                }
                if (n3 >= 0) continue;
                if (class_26851 instanceof Class_44580) {
                    arrclass_26851 = ((Class_44580)class_26851).Field_44581;
                    continue block0;
                }
                return class_26851.Method_26860(n, object);
            } while ((class_26851 = class_26851.Field_26854) != null);
            break;
        } while (true);
        return null;
    }
}

