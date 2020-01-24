/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_46887
extends Class_42759 {
    private void Method_46888() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void Method_46889(Class_39158 class_39158, Class_22553 class_22553, List list) {
        class_22553.Method_22567();
        byte[] arrby = new byte[-32765 & 2599];
        for (int i = -31656 & 18691; i < arrby.length; ++i) {
            if (!class_22553.Method_22583()) {
                class_22553.Method_22608();
                return;
            }
            arrby[i] = class_22553.Method_22555();
            if (arrby[i] < 0) continue;
            Class_29900 class_29900 = new Class_29900(Class_16620.Method_16632(arrby));
            try {
                int n = class_29900.Method_30004();
                if (class_22553.Method_22564() >= n) {
                    list.add(class_22553.Method_22601(n));
                    return;
                }
                class_22553.Method_22608();
            }
            finally {
                class_29900.Method_29972();
            }
            return;
        }
        throw new Class_41300("length wider than 21-bit");
    }
}

