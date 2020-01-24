/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;

public class Class_8290 {
    private static Map Field_8291 = new HashMap();

    private void Method_8292() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void Method_8293() {
        Map map = Field_8291;
        synchronized (map) {
            Field_8291.clear();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static float Method_8294(int n, float f, float f2, float f3) {
        Map map = Field_8291;
        synchronized (map) {
            Integer n2 = n;
            Class_42854 class_42854 = (Class_42854)Field_8291.get(n2);
            if (class_42854 == null) {
                class_42854 = new Class_42854(f, f2, f3);
                Field_8291.put(n2, class_42854);
            }
            float f4 = class_42854.Method_42859(f);
            return f4;
        }
    }
}

