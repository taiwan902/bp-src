/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import sun.misc.Unsafe;

public final class Class_9912
extends AtomicIntegerFieldUpdater {
    private final long Field_9913;
    private final Unsafe Field_9914;

    public boolean Method_9915(Object object, int n, int n2) {
        return this.Field_9914.compareAndSwapInt(object, this.Field_9913, n, n2);
    }

    public void Method_9916(Object object, int n) {
        this.Field_9914.putIntVolatile(object, this.Field_9913, n);
    }

    public boolean Method_9917(Object object, int n, int n2) {
        return this.Field_9914.compareAndSwapInt(object, this.Field_9913, n, n2);
    }

    Class_9912(Unsafe unsafe, Class class_, String string) {
        Field field = class_.getDeclaredField(string);
        if (!Modifier.isVolatile(field.getModifiers())) {
            throw new IllegalArgumentException("Must be volatile");
        }
        this.Field_9914 = unsafe;
        this.Field_9913 = unsafe.objectFieldOffset(field);
    }

    public int Method_9918(Object object) {
        return this.Field_9914.getIntVolatile(object, this.Field_9913);
    }

    private void Method_9919() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_9920(Object object, int n) {
        this.Field_9914.putOrderedInt(object, this.Field_9913, n);
    }
}

