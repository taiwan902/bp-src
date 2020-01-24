/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class Class_20842 {
    private static Map Field_20843 = null;

    public static void Method_20844(Class_35973 class_35973, Class_1456 class_1456, float f, float f2) {
        Class_16271 class_16271 = Class_20842.Method_20848(class_1456);
        if (class_16271 != null) {
            class_16271.Method_16276(class_35973, class_1456, f, f2);
        }
    }

    public static synchronized void Method_20845(String string, Class_16271 class_16271) {
        Class_20842.Method_20847().put(string, class_16271);
    }

    public static String Method_20846(Class_1456 class_1456) {
        String string = class_1456.\u0000, `();
        if (string != null && !string.isEmpty()) {
            string = Class_35310.Method_35314(string);
        }
        return string;
    }

    private static Map Method_20847() {
        if (Field_20843 == null) {
            Field_20843 = new HashMap();
        }
        return Field_20843;
    }

    public static synchronized Class_16271 Method_20848(Class_1456 class_1456) {
        String string = Class_20842.Method_20846(class_1456);
        Class_16271 class_16271 = (Class_16271)Class_20842.Method_20847().get(string);
        if (class_16271 == null) {
            class_16271 = new Class_16271();
            Class_20842.Method_20847().put(string, class_16271);
            Class_35907 class_35907 = new Class_35907(string);
            String string2 = "http://s.optifine.net/users/" + string + ".cfg";
            Class_16234.Field_16239.submit(new Class_32448(string2, class_35907));
        }
        return class_16271;
    }

    private void Method_20849() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

