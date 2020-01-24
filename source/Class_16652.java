/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import sun.misc.Unsafe;

public final class Class_16652
extends AtomicLongFieldUpdater {
    private final Unsafe Field_16653;
    private final long Field_16654;

    public boolean Method_16655(Object object, long l, long l2) {
        return this.Field_16653.compareAndSwapLong(object, this.Field_16654, l, l2);
    }

    public void Method_16656(Object object, long l) {
        this.Field_16653.putOrderedLong(object, this.Field_16654, l);
    }

    Class_16652(Unsafe unsafe, Class class_, String string) {
        Field field = class_.getDeclaredField(string);
        if (!Modifier.isVolatile(field.getModifiers())) {
            throw new IllegalArgumentException("Must be volatile");
        }
        this.Field_16653 = unsafe;
        this.Field_16654 = unsafe.objectFieldOffset(field);
    }

    public boolean Method_16657(Object object, long l, long l2) {
        return this.Field_16653.compareAndSwapLong(object, this.Field_16654, l, l2);
    }

    public long Method_16658(Object object) {
        return this.Field_16653.getLongVolatile(object, this.Field_16654);
    }

    public void Method_16659(Object object, long l) {
        this.Field_16653.putLongVolatile(object, this.Field_16654, l);
    }

    private void Method_16660() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

