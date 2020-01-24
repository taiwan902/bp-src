/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Map;

public final class Class_28917
implements Class_22999 {
    private int Field_28918;
    private Class_11651 Field_28919;
    private Object Field_28920;
    private int Field_28921;

    static Object Method_28922(Class_28917 class_28917, Object object) {
        class_28917.Field_28920 = object;
        return class_28917.Field_28920;
    }

    static Class_11651 Method_28923(Class_28917 class_28917) {
        return class_28917.Field_28919;
    }

    static Object Method_28924(Class_28917 class_28917) {
        return class_28917.Field_28920;
    }

    static Class_11651 Method_28925(Class_28917 class_28917, Class_11651 class_11651) {
        class_28917.Field_28919 = class_11651;
        return class_28917.Field_28919;
    }

    static int Method_28926(Class_28917 class_28917, int n) {
        class_28917.Field_28918 = n;
        return class_28917.Field_28918;
    }

    static int Method_28927(Class_28917 class_28917, int n) {
        class_28917.Field_28921 = n;
        return class_28917.Field_28921;
    }

    public void Method_28928() {
        Thread thread = Thread.currentThread();
        if (thread == this.Field_28919.Field_11655) {
            this.Field_28919.Method_11669(this);
            return;
        }
        Map map = (Map)Class_32390.Method_32400().Method_34684();
        Class_41802 class_41802 = (Class_41802)map.get(this.Field_28919);
        if (class_41802 == null) {
            class_41802 = new Class_41802(this.Field_28919, thread);
            map.put(this.Field_28919, class_41802);
        }
        class_41802.Method_41810(this);
    }

    static int Method_28929(Class_28917 class_28917) {
        return class_28917.Field_28918;
    }

    private void Method_28930() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static int Method_28931(Class_28917 class_28917) {
        return class_28917.Field_28921;
    }

    Class_28917(Class_11651 class_11651) {
        this.Field_28919 = class_11651;
    }
}

