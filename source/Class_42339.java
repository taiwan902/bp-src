/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class Class_42339
implements Comparator {
    private final Class_1061 Field_42340;

    public Class_42339(Class_1061 class_1061) {
        this.Field_42340 = class_1061;
    }

    public int Method_42341(Class_1061 class_1061, Class_1061 class_10612) {
        double d;
        double d2 = this.Field_42340.Method_1356(class_1061);
        return d2 < (d = this.Field_42340.Method_1356(class_10612)) ? -1 & -1 : (d2 > d ? 393 & -8175 : 4547 & -31744);
    }

    public int Method_42342(Object object, Object object2) {
        return this.Method_42341((Class_1061)object, (Class_1061)object2);
    }

    private void Method_42343() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

