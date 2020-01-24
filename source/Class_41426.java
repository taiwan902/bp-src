/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Iterator;

public class Class_41426
extends Class_31422
implements Iterable {
    private final Collection Field_41427;

    public Iterator Method_41428() {
        return this.Field_41427.iterator();
    }

    private void Method_41429() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

