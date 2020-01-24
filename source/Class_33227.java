/*
 * Decompiled with CFR 0.145.
 */
import java.io.Serializable;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class Class_33227
extends Class_23527
implements Serializable,
Set {
    private void Method_33228() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_33229(Map.Entry entry) {
        return (this.map.Method_21524(entry.getKey(), entry.getValue(), (1546 & 2369) != 0) == null ? -22375 & 327 : 16416 & 280) != 0;
    }

    public boolean Method_33230(Object object) {
        Object object2;
        Map.Entry entry;
        Object k;
        Object v;
        return (object instanceof Map.Entry && (k = (entry = (Map.Entry)object).getKey()) != null && (object2 = this.map.Method_21559(k)) != null && (v = entry.getValue()) != null && (v == object2 || v.equals(object2)) ? 16575 & 2817 : 14528 & -32224) != 0;
    }

    public boolean Method_33231(Object object) {
        Object v;
        Object k;
        Map.Entry entry;
        return (object instanceof Map.Entry && (k = (entry = (Map.Entry)object).getKey()) != null && (v = entry.getValue()) != null && this.map.Method_21538(k, v) ? 17765 & 4097 : 18752 & 9745) != 0;
    }

    Class_33227(Class_21500 class_21500) {
        super(class_21500);
    }

    public boolean Method_33232(Object object) {
        return this.Method_33229((Map.Entry)object);
    }

    public boolean Method_33233(Collection collection) {
        int n = 8857 & 22820;
        for (Map.Entry entry : collection) {
            if (!this.Method_33229(entry)) continue;
            n = 2305 & 81;
        }
        return n != 0;
    }

    public final boolean Method_33234(Object object) {
        Set set;
        return (object instanceof Set && ((set = (Set)object) == this || this.containsAll(set) && set.containsAll(this)) ? 529 & -29663 : 8192 & 19276) != 0;
    }

    public Iterator Method_33235() {
        Class_21500 class_21500 = this.map;
        Class_26851[] arrclass_26851 = class_21500.Field_21506;
        int n = arrclass_26851 == null ? 1154 & 4725 : arrclass_26851.length;
        return new Class_47124(arrclass_26851, n, -21757 & 16468, n, class_21500);
    }

    public final int Method_33236() {
        int n = 2080 & 578;
        Class_26851[] arrclass_26851 = this.map.Field_21506;
        if (arrclass_26851 != null) {
            Class_26851 class_26851;
            Class_24767 class_24767 = new Class_24767(arrclass_26851, arrclass_26851.length, 19466 & 8192, arrclass_26851.length);
            while ((class_26851 = class_24767.Method_24775()) != null) {
                n += class_26851.Method_26858();
            }
        }
        return n;
    }
}

