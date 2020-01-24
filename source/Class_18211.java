/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Class_18211
implements Iterator {
    final Class_37530 Field_18212;
    private Class_21175 Field_18213;

    public void Method_18214() {
        throw new UnsupportedOperationException();
    }

    private void Method_18215() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_18216() {
        return (this.Field_18213 != null ? -28919 & 1 : 2305 & 16388) != 0;
    }

    Class_18211(Class_37530 class_37530) {
        this.Field_18212 = class_37530;
        this.Field_18213 = Class_37530.Method_37550(this.Field_18212);
    }

    public Object Method_18217() {
        Class_21175 class_21175 = this.Field_18213;
        if (class_21175 == null) {
            throw new NoSuchElementException();
        }
        Object object = class_21175.Method_21179();
        this.Field_18213 = class_21175.Method_21185();
        return object;
    }
}

