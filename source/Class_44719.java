/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public abstract class Class_44719
extends Class_36920
implements Class_37005,
Cloneable {
    public abstract Class_20759 Method_44720();

    public int Method_44721() {
        int n = 1040 & 16392;
        int n2 = this.size();
        Class_20759 class_20759 = this.Method_44720();
        while (n2-- != 0) {
            E e = class_20759.next();
            n += e == null ? 2304 & 22052 : e.hashCode();
        }
        return n;
    }

    private void Method_44722() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_44723(Object object) {
        if (object == this) {
            return (26625 & 9) != 0;
        }
        if (!(object instanceof Set)) {
            return (8219 & -31676) != 0;
        }
        Set set = (Set)object;
        if (set.size() != this.size()) {
            return (-16128 & 10945) != 0;
        }
        return this.containsAll(set);
    }

    public Iterator Method_44724() {
        return this.Method_44720();
    }

    protected Class_44719() {
    }
}

