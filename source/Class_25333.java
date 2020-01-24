/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.Queue;

public final class Class_25333
implements Runnable {
    final Class_46518 Field_25334;

    private Class_25333(Class_46518 class_46518) {
        this.Field_25334 = class_46518;
    }

    public void Method_25335() {
        Iterator iterator = this.Field_25334.Field_46533.iterator();
        while (iterator.hasNext()) {
            Class_45231 class_45231 = (Class_45231)iterator.next();
            if (!class_45231.isCancelled()) continue;
            iterator.remove();
        }
    }

    Class_25333(Class_46518 class_46518, Class_9921 class_9921) {
        this(class_46518);
    }

    private void Method_25336() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

