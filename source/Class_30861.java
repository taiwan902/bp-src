/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class Class_30861
implements Comparator {
    final Class_11777 Field_30862;

    public int Method_30863(Class_41302 class_41302, Class_41302 class_413022) {
        return class_41302.Method_41305().compareTo(class_413022.Method_41305());
    }

    private void Method_30864() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_30861(Class_11777 class_11777) {
        this.Field_30862 = class_11777;
    }

    public int Method_30865(Object object, Object object2) {
        return this.Method_30863((Class_41302)object, (Class_41302)object2);
    }
}

