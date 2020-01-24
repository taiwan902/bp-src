/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

public final class Class_21214
extends AtomicReferenceFieldUpdater {
    private final Unsafe Field_21215;
    private final long Field_21216;

    public void Method_21217(Object object, Object object2) {
        this.Field_21215.putOrderedObject(object, this.Field_21216, object2);
    }

    public boolean Method_21218(Object object, Object object2, Object object3) {
        return this.Field_21215.compareAndSwapObject(object, this.Field_21216, object2, object3);
    }

    private void Method_21219() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_21220(Object object, Object object2) {
        this.Field_21215.putObjectVolatile(object, this.Field_21216, object2);
    }

    Class_21214(Unsafe unsafe, Class class_, String string) {
        Field field = class_.getDeclaredField(string);
        if (!Modifier.isVolatile(field.getModifiers())) {
            throw new IllegalArgumentException("Must be volatile");
        }
        this.Field_21215 = unsafe;
        this.Field_21216 = unsafe.objectFieldOffset(field);
    }

    public boolean Method_21221(Object object, Object object2, Object object3) {
        return this.Field_21215.compareAndSwapObject(object, this.Field_21216, object2, object3);
    }

    public Object Method_21222(Object object) {
        return this.Field_21215.getObjectVolatile(object, this.Field_21216);
    }
}

