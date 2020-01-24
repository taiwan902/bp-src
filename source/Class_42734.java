/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;

public final class Class_42734
implements Iterable {
    final Class_4751 Field_42735;
    final Class_4751 Field_42736;

    public Iterator Method_42737() {
        return new Class_7704(this);
    }

    Class_42734(Class_4751 class_4751, Class_4751 class_47512) {
        this.Field_42735 = class_4751;
        this.Field_42736 = class_47512;
    }

    private void Method_42738() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

