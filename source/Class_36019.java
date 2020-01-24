/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;

public final class Class_36019
implements Iterable {
    final Class_4751 Field_36020;
    final Class_4751 Field_36021;

    public Iterator Method_36022() {
        return new Class_22278(this);
    }

    Class_36019(Class_4751 class_4751, Class_4751 class_47512) {
        this.Field_36021 = class_4751;
        this.Field_36020 = class_47512;
    }

    private void Method_36023() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

