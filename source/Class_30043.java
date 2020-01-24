/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Class_30043
extends AbstractSet {
    private static final Set Field_30044 = Sets.newHashSet();
    private final Map Field_30045 = Maps.newHashMap();
    private final Class Field_30046;
    private final Set Field_30047 = Sets.newIdentityHashSet();
    private final List Field_30048 = Lists.newArrayList();

    public boolean Method_30049(Object object) {
        for (Class class_ : this.Field_30047) {
            if (!class_.isAssignableFrom(object.getClass())) continue;
            this.Method_30054(object, class_);
        }
        return (8193 & 5) != 0;
    }

    static Map Method_30050(Class_30043 class_30043) {
        return class_30043.Field_30045;
    }

    public boolean Method_30051(Object object) {
        return Iterators.contains(this.Method_30056(object.getClass()).iterator(), (Object)object);
    }

    public int Method_30052() {
        return this.Field_30048.size();
    }

    public Iterator Method_30053() {
        return this.Field_30048.isEmpty() ? Iterators.emptyIterator() : Iterators.unmodifiableIterator(this.Field_30048.iterator());
    }

    private void Method_30054(Object object, Class class_) {
        List list = (List)this.Field_30045.get(class_);
        if (list == null) {
            Object[] arrobject = new Object[-12271 & 8329];
            arrobject[-32700 & 7969] = object;
            this.Field_30045.put(class_, Lists.newArrayList((Object[])arrobject));
        } else {
            list.add(object);
        }
    }

    public boolean Method_30055(Object object) {
        Object object2 = object;
        int n = 11848 & -28396;
        for (Class class_ : this.Field_30047) {
            List list;
            if (!class_.isAssignableFrom(object2.getClass()) || (list = (List)this.Field_30045.get(class_)) == null || !list.remove(object2)) continue;
            n = -16255 & 4903;
        }
        return n != 0;
    }

    public Iterable Method_30056(Class class_) {
        return new Class_18947(this, class_);
    }

    protected Class Method_30057(Class class_) {
        if (this.Field_30046.isAssignableFrom(class_)) {
            if (!this.Field_30047.contains(class_)) {
                this.Method_30058(class_);
            }
            return class_;
        }
        throw new IllegalArgumentException("Don't know how to search for " + class_);
    }

    protected void Method_30058(Class class_) {
        Field_30044.add(class_);
        for (Object e : this.Field_30048) {
            if (!class_.isAssignableFrom(e.getClass())) continue;
            this.Method_30054(e, class_);
        }
        this.Field_30047.add(class_);
    }

    private void Method_30059() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_30043(Class class_) {
        this.Field_30046 = class_;
        this.Field_30047.add(class_);
        this.Field_30045.put(class_, this.Field_30048);
        for (Class class_2 : Field_30044) {
            this.Method_30058(class_2);
        }
    }
}

