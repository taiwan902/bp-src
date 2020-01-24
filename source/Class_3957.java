/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.google.common.collect.Collections2
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Map;

public class Class_3957
extends Class_3968 {
    private final Map Field_3958 = Maps.newHashMap();
    private final ImmutableSet Field_3959;

    private void Method_3960() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static Class_3957 Method_3961(String string, Class class_, Enum ... arrenum) {
        return Class_3957.Method_3964(string, class_, Lists.newArrayList((Object[])arrenum));
    }

    public static Class_3957 Method_3962(String string, Class class_, Predicate predicate) {
        return Class_3957.Method_3964(string, class_, Collections2.filter((Collection)Lists.newArrayList((Object[])class_.getEnumConstants()), (Predicate)predicate));
    }

    protected Class_3957(String string, Class class_, Collection collection) {
        super(string, class_);
        this.Field_3959 = ImmutableSet.copyOf((Collection)collection);
        for (Enum enum_ : collection) {
            String string2 = ((Class_3955)((Object)enum_)).Method_3956();
            if (this.Field_3958.containsKey(string2)) {
                throw new IllegalArgumentException("Multiple values have the same name '" + string2 + "'");
            }
            this.Field_3958.put(string2, enum_);
        }
    }

    public static Class_3957 Method_3963(String string, Class class_) {
        return Class_3957.Method_3962(string, class_, Predicates.alwaysTrue());
    }

    public static Class_3957 Method_3964(String string, Class class_, Collection collection) {
        return new Class_3957(string, class_, collection);
    }

    public String Method_3965(Enum enum_) {
        return ((Class_3955)((Object)enum_)).Method_3956();
    }

    public Collection Method_3966() {
        return this.Field_3959;
    }

    public String Method_3967(Comparable comparable) {
        return this.Method_3965((Enum)((Object)comparable));
    }
}

