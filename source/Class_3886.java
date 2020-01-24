/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collections;
import java.util.Iterator;

public class Class_3886
implements Iterable {
    private final Class Field_3887;
    private final Iterable[] Field_3888;

    Class_3886(Class class_, Iterable[] arriterable, Class_18127 class_18127) {
        this(class_, arriterable);
    }

    private Class_3886(Class class_, Iterable[] arriterable) {
        this.Field_3887 = class_;
        this.Field_3888 = arriterable;
    }

    private void Method_3889() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Iterator Method_3890() {
        return this.Field_3888.length <= 0 ? Collections.singletonList(Class_3878.Method_3885(this.Field_3887, 2080 & 4352)).iterator() : new Class_3977(this.Field_3887, this.Field_3888, null);
    }
}

