/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.Queue;

public final class Class_29565
implements Runnable {
    final Class_46724 Field_29566;

    public void Method_29567() {
        Iterator iterator = this.Field_29566.Field_46734.iterator();
        while (iterator.hasNext()) {
            Class_45231 class_45231 = (Class_45231)iterator.next();
            if (!class_45231.isCancelled()) continue;
            iterator.remove();
        }
    }

    private Class_29565(Class_46724 class_46724) {
        this.Field_29566 = class_46724;
    }

    private void Method_29568() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_29565(Class_46724 class_46724, Class_22832 class_22832) {
        this(class_46724);
    }
}

