/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_37570
extends Class_26851 {
    Class_37570 Field_37571;
    Class_37570 Field_37572;
    Class_37570 Field_37573;
    boolean Field_37574;
    Class_37570 Field_37575;

    Class_37570(int n, Object object, Object object2, Class_26851 class_26851, Class_37570 class_37570) {
        super(n, object, object2, class_26851);
        this.Field_37573 = class_37570;
    }

    Class_26851 Method_37576(int n, Object object) {
        return this.Method_37578(n, object, null);
    }

    private void Method_37577() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    final Class_37570 Method_37578(int n, Object object, Class class_) {
        if (object != null) {
            Class_37570 class_37570 = this;
            do {
                Class_37570 class_375702;
                int n2;
                Class_37570 class_375703 = class_37570.Field_37571;
                Class_37570 class_375704 = class_37570.Field_37572;
                int n3 = class_37570.hash;
                if (n3 > n) {
                    class_37570 = class_375703;
                    continue;
                }
                if (n3 < n) {
                    class_37570 = class_375704;
                    continue;
                }
                Object object2 = class_37570.key;
                if (object2 == object || object2 != null && object.equals(object2)) {
                    return class_37570;
                }
                if (class_375703 == null && class_375704 == null) break;
                if ((class_ != null || (class_ = Class_21500.Method_21572(object)) != null) && (n2 = Class_21500.Method_21526(class_, object, object2)) != 0) {
                    class_37570 = n2 < 0 ? class_375703 : class_375704;
                    continue;
                }
                if (class_375703 == null) {
                    class_37570 = class_375704;
                    continue;
                }
                if (class_375704 == null || (class_375702 = class_375704.Method_37578(n, object, class_)) == null) {
                    class_37570 = class_375703;
                    continue;
                }
                return class_375702;
            } while (class_37570 != null);
        }
        return null;
    }
}

