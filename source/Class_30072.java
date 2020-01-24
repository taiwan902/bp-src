/*
 * Decompiled with CFR 0.145.
 */
import java.io.Serializable;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Iterator;

public final class Class_30072
extends Class_23527
implements Serializable,
Collection {
    public final boolean Method_30073(Collection collection) {
        throw new UnsupportedOperationException();
    }

    private void Method_30074() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_30072(Class_21500 class_21500) {
        super(class_21500);
    }

    public final Iterator Method_30075() {
        Class_21500 class_21500 = this.map;
        Class_26851[] arrclass_26851 = class_21500.Field_21506;
        int n = arrclass_26851 == null ? 8208 & 18950 : arrclass_26851.length;
        return new Class_38522(arrclass_26851, n, 4374 & 10304, n, class_21500);
    }

    public final boolean Method_30076(Object object) {
        return this.map.Method_21556(object);
    }

    public final boolean Method_30077(Object object) {
        throw new UnsupportedOperationException();
    }

    public final boolean Method_30078(Object object) {
        if (object != null) {
            Iterator iterator = this.Method_30075();
            while (iterator.hasNext()) {
                if (!object.equals(iterator.next())) continue;
                iterator.remove();
                return (-32475 & 14355) != 0;
            }
        }
        return (1094 & 16657) != 0;
    }
}

