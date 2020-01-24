/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_47088
extends Class_42759 {
    protected void Method_47089(Class_39158 class_39158, Class_22553 class_22553, List list) {
        while (class_22553.Method_22564() >= (-11772 & 11468)) {
            class_22553.Method_22567();
            int n = class_22553.Method_22640();
            if (class_22553.Method_22564() < n) {
                class_22553.Method_22608();
                return;
            }
            list.add(class_22553.Method_22601(n));
        }
        return;
    }

    private void Method_47090() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

