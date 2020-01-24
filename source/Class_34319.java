/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.Properties;
import java.util.Set;

public class Class_34319
extends Properties {
    private Set Field_34320 = new LinkedHashSet();

    public synchronized Object Method_34321(Object object, Object object2) {
        this.Field_34320.add(object);
        return super.put(object, object2);
    }

    private void Method_34322() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Set Method_34323() {
        Set<Object> set = super.keySet();
        this.Field_34320.retainAll(set);
        return Collections.unmodifiableSet(this.Field_34320);
    }

    public synchronized Enumeration Method_34324() {
        return Collections.enumeration(this.Method_34323());
    }
}

