/*
 * Decompiled with CFR 0.145.
 */
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public interface Class_39112
extends Class_26864,
Collection {
    public boolean Method_39113(int var1);

    @Deprecated
    default public boolean Method_39114(Predicate predicate) {
        return this.Method_39122(arg_0 -> Class_39112.Method_39123(predicate, arg_0));
    }

    public boolean Method_39115(int var1);

    @Deprecated
    default public boolean Method_39116(Integer n) {
        return this.Method_39113(n);
    }

    @Deprecated
    default public boolean Method_39117(Object object) {
        return this.Method_39116((Integer)object);
    }

    public Class_15384 Method_39118();

    @Deprecated
    default public boolean Method_39119(Object object) {
        if (object == null) {
            return (9219 & 2048) != 0;
        }
        return this.Method_39124((Integer)object);
    }

    @Deprecated
    default public boolean Method_39120(Object object) {
        if (object == null) {
            return (5136 & -14171) != 0;
        }
        return this.Method_39115((Integer)object);
    }

    default public Iterator Method_39121() {
        return this.Method_39118();
    }

    default public boolean Method_39122(IntPredicate intPredicate) {
        Objects.requireNonNull(intPredicate);
        int n = 14336 & 17025;
        Class_15384 class_15384 = this.Method_39118();
        while (class_15384.hasNext()) {
            if (!intPredicate.test(class_15384.Method_15385())) continue;
            class_15384.remove();
            n = 641 & 21769;
        }
        return n != 0;
    }

    private static boolean Method_39123(Predicate predicate, int n) {
        return predicate.test(n);
    }

    public boolean Method_39124(int var1);
}

