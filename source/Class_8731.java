/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.IdentityHashMap;
import java.util.Map;

public class Class_8731 {
    private static Map Field_8732 = new IdentityHashMap();

    public static void Method_8733(Class_3238 class_3238, int n) {
        if (!Field_8732.containsKey(class_3238)) {
            Field_8732.put(class_3238, class_3238.Method_3384());
        }
        class_3238.Method_3363(n);
    }

    private void Method_8734() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

