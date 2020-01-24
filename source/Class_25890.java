/*
 * Decompiled with CFR 0.145.
 */
import java.io.Serializable;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class Class_25890
extends Class_23527
implements Serializable,
Set {
    private final Object Field_25891;

    public boolean Method_25892(Object object) {
        return (this.map.Method_21565(object) != null ? -32761 & 577 : -32639 & 28790) != 0;
    }

    public boolean Method_25893(Object object) {
        Set set;
        return (object instanceof Set && ((set = (Set)object) == this || this.containsAll(set) && set.containsAll(this)) ? 25219 & 5193 : -32724 & 2561) != 0;
    }

    private void Method_25894() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_25895(Object object) {
        Object object2 = this.Field_25891;
        if (object2 == null) {
            throw new UnsupportedOperationException();
        }
        return (this.map.Method_21524(object, object2, (8361 & 18497) != 0) == null ? 8485 & 19091 : 9600 & -30712) != 0;
    }

    public int Method_25896() {
        int n = 1026 & 333;
        Iterator iterator = this.Method_25897();
        while (iterator.hasNext()) {
            Object e = iterator.next();
            n += e.hashCode();
        }
        return n;
    }

    public Iterator Method_25897() {
        Class_21500 class_21500 = this.map;
        Class_26851[] arrclass_26851 = class_21500.Field_21506;
        int n = arrclass_26851 == null ? -17583 & 16386 : arrclass_26851.length;
        return new Class_43630(arrclass_26851, n, 1840 & 20551, n, class_21500);
    }

    public boolean Method_25898(Collection collection) {
        int n = 16384 & 800;
        Object object = this.Field_25891;
        if (object == null) {
            throw new UnsupportedOperationException();
        }
        for (Object e : collection) {
            if (this.map.Method_21524(e, object, (16917 & 13377) != 0) != null) continue;
            n = 905 & 6145;
        }
        return n != 0;
    }

    Class_25890(Class_21500 class_21500, Object object) {
        super(class_21500);
        this.Field_25891 = object;
    }

    public boolean Method_25899(Object object) {
        return this.map.Method_21566(object);
    }
}

