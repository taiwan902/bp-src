/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.collect.Maps
 */
import com.google.common.base.Predicate;
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class Class_7506
implements Predicate {
    private final Map Field_7507 = Maps.newHashMap();
    private final Class_3855 Field_7508;

    private Class_7506(Class_3855 class_3855) {
        this.Field_7508 = class_3855;
    }

    private void Method_7509() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_7510(Class_3436 class_3436) {
        if (class_3436 != null && class_3436.Method_3442().equals(this.Field_7508.Method_3863())) {
            for (Map.Entry entry : this.Field_7507.entrySet()) {
                Comparable comparable = class_3436.Method_3440((Class_3538)entry.getKey());
                if (((Predicate)entry.getValue()).apply((Object)comparable)) continue;
                return (1985 & -28626) != 0;
            }
            return (-7149 & 4937) != 0;
        }
        return (2324 & -31703) != 0;
    }

    public static Class_7506 Method_7511(Class_3238 class_3238) {
        return new Class_7506(class_3238.Method_3360());
    }

    public boolean Method_7512(Object object) {
        return this.Method_7510((Class_3436)object);
    }

    public Class_7506 Method_7513(Class_3538 class_3538, Predicate predicate) {
        if (!this.Field_7508.Method_3864().contains(class_3538)) {
            throw new IllegalArgumentException(this.Field_7508 + " cannot support property " + class_3538);
        }
        this.Field_7507.put(class_3538, predicate);
        return this;
    }
}

