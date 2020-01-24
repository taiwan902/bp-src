/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.google.common.collect.Iterators
 */
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

public class Class_3657
implements Class_3656 {
    private final List Field_3658 = new ArrayList();
    private final IdentityHashMap Field_3659 = new IdentityHashMap(1609 & 768);

    public void Method_3660(Object object, int n) {
        this.Field_3659.put(object, n);
        while (this.Field_3658.size() <= n) {
            this.Field_3658.add(null);
        }
        this.Field_3658.set(n, object);
    }

    private void Method_3661() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_3662(Object object) {
        Integer n = (Integer)this.Field_3659.get(object);
        return n == null ? -1 & -1 : n;
    }

    public final Object Method_3663(int n) {
        return n >= 0 && n < this.Field_3658.size() ? this.Field_3658.get(n) : null;
    }

    public Iterator Method_3664() {
        return Iterators.filter(this.Field_3658.iterator(), (Predicate)Predicates.notNull());
    }
}

