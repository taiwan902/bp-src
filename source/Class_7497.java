/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;

public final class Class_7497
implements Iterable {
    final Class_4751 Field_7498;
    final Class_4751 Field_7499;

    private void Method_7500() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Iterator Method_7501() {
        return new Class_14431(this);
    }

    Class_7497(Class_4751 class_4751, Class_4751 class_47512) {
        this.Field_7498 = class_4751;
        this.Field_7499 = class_47512;
    }
}

