/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.HashSet;

public class Class_4394
extends Class_3968 {
    private final ImmutableSet Field_4395;

    protected Class_4394(String string, int n, int n2) {
        super(string, Integer.class);
        if (n < 0) {
            throw new IllegalArgumentException("Min value of " + string + " must be 0 or greater");
        }
        if (n2 <= n) {
            throw new IllegalArgumentException("Max value of " + string + " must be greater than min (" + n + ")");
        }
        HashSet hashSet = Sets.newHashSet();
        for (int i = n; i <= n2; ++i) {
            hashSet.add(i);
        }
        this.Field_4395 = ImmutableSet.copyOf((Collection)hashSet);
    }

    private void Method_4396() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_4397() {
        int n = super.Method_3972();
        n = (-14273 & 4639) * n + this.Field_4395.hashCode();
        return n;
    }

    public Collection Method_4398() {
        return this.Field_4395;
    }

    public boolean Method_4399(Object object) {
        if (this == object) {
            return (699 & 1) != 0;
        }
        if (object != null && this.getClass() == object.getClass()) {
            if (!super.Method_3971(object)) {
                return (164 & 4417) != 0;
            }
            Class_4394 class_4394 = (Class_4394)object;
            return this.Field_4395.equals((Object)class_4394.Field_4395);
        }
        return (19968 & 12389) != 0;
    }

    public String Method_4400(Integer n) {
        return n.toString();
    }

    public static Class_4394 Method_4401(String string, int n, int n2) {
        return new Class_4394(string, n, n2);
    }

    public String Method_4402(Comparable comparable) {
        return this.Method_4400((Integer)comparable);
    }
}

