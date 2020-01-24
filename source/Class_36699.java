/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class Class_36699
implements Comparator {
    final Class_22497 Field_36700;

    private void Method_36701() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_36702(Class_19219 class_19219, Class_19219 class_192192) {
        return class_19219 instanceof Class_23091 && class_192192 instanceof Class_32426 ? 1737 & -32765 : (class_192192 instanceof Class_23091 && class_19219 instanceof Class_32426 ? -1 & -1 : (class_192192.Method_19220() < class_19219.Method_19220() ? -1 & -1 : (class_192192.Method_19220() > class_19219.Method_19220() ? -14141 & 29 : 2304 & 8844)));
    }

    Class_36699(Class_22497 class_22497) {
        this.Field_36700 = class_22497;
    }

    public int Method_36703(Object object, Object object2) {
        return this.Method_36702((Class_19219)object, (Class_19219)object2);
    }
}

