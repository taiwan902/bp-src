/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class Class_3873
implements Comparator {
    final Class_3855 Field_3874;

    public int Method_3875(Class_3538 class_3538, Class_3538 class_35382) {
        return class_3538.Method_3541().compareTo(class_35382.Method_3541());
    }

    public int Method_3876(Object object, Object object2) {
        return this.Method_3875((Class_3538)object, (Class_3538)object2);
    }

    private void Method_3877() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_3873(Class_3855 class_3855) {
        this.Field_3874 = class_3855;
    }
}

