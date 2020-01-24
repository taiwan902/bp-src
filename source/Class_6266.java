/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

public final class Class_6266
implements PrivilegedExceptionAction {
    public Object Method_6267() {
        return this.Method_6269();
    }

    private void Method_6268() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_6266() {
    }

    public Unsafe Method_6269() {
        Class<Unsafe> class_ = Unsafe.class;
        Field[] arrfield = class_.getDeclaredFields();
        int n = arrfield.length;
        for (int i = -32640 & 21828; i < n; ++i) {
            Field field = arrfield[i];
            field.setAccessible((-18423 & 17921) != 0);
            Object object = field.get(null);
            if (!class_.isInstance(object)) continue;
            return (Unsafe)class_.cast(object);
        }
        throw new NoSuchFieldError("the Unsafe");
    }
}

