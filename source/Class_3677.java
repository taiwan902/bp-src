/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashBasedTable
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.ImmutableTable
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Table
 */
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Class_3677
extends Class_3692 {
    private final ImmutableMap Field_3678;
    private ImmutableTable Field_3679;
    private final Class_3238 Field_3680;

    private Class_3677(Class_3238 class_3238, ImmutableMap immutableMap) {
        this.Field_3680 = class_3238;
        this.Field_3678 = immutableMap;
    }

    public void Method_3681(Map map) {
        if (this.Field_3679 != null) {
            throw new IllegalStateException();
        }
        HashBasedTable hashBasedTable = HashBasedTable.create();
        for (Class_3538 class_3538 : this.Field_3678.keySet()) {
            for (Comparable comparable : class_3538.Method_3542()) {
                if (comparable == this.Field_3678.get((Object)class_3538)) continue;
                hashBasedTable.put((Object)class_3538, (Object)comparable, map.get(this.Method_3686(class_3538, comparable)));
            }
        }
        this.Field_3679 = ImmutableTable.copyOf((Table)hashBasedTable);
    }

    public boolean Method_3682(Object object) {
        return (this == object ? 111 & -32495 : 80 & -22910) != 0;
    }

    Class_3677(Class_3238 class_3238, ImmutableMap immutableMap, Class_3869 class_3869) {
        this(class_3238, immutableMap);
    }

    public int Method_3683() {
        return this.Field_3678.hashCode();
    }

    public Collection Method_3684() {
        return Collections.unmodifiableCollection(this.Field_3678.keySet());
    }

    public Class_3436 Method_3685(Class_3538 class_3538, Comparable comparable) {
        if (!this.Field_3678.containsKey((Object)class_3538)) {
            throw new IllegalArgumentException("Cannot set property " + class_3538 + " as it does not exist in " + this.Field_3680.Method_3360());
        }
        if (!class_3538.Method_3542().contains(comparable)) {
            throw new IllegalArgumentException("Cannot set property " + class_3538 + " to " + comparable + " on block " + Class_3238.Field_3271.\u0000, `((Object)this.Field_3680) + ", it is not an allowed value");
        }
        return this.Field_3678.get((Object)class_3538) == comparable ? this : (Class_3436)this.Field_3679.get((Object)class_3538, (Object)comparable);
    }

    private Map Method_3686(Class_3538 class_3538, Comparable comparable) {
        HashMap hashMap = Maps.newHashMap((Map)this.Field_3678);
        hashMap.put(class_3538, comparable);
        return hashMap;
    }

    public Map Method_3687() {
        return this.Method_3689();
    }

    public final Class_3238 Method_3688() {
        return this.Field_3680;
    }

    public ImmutableMap Method_3689() {
        return this.Field_3678;
    }

    private void Method_3690() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Comparable Method_3691(Class_3538 class_3538) {
        if (!this.Field_3678.containsKey((Object)class_3538)) {
            throw new IllegalArgumentException("Cannot get property " + class_3538 + " as it does not exist in " + this.Field_3680.Method_3360());
        }
        return (Comparable)class_3538.Method_3539().cast(this.Field_3678.get((Object)class_3538));
    }
}

