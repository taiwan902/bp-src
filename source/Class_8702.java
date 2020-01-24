/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 */
import com.google.common.base.Objects;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

public class Class_8702 {
    private Map Field_8703 = Maps.newIdentityHashMap();
    private Set Field_8704 = Sets.newIdentityHashSet();

    private void Method_8705() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Map Method_8706() {
        IdentityHashMap identityHashMap = Maps.newIdentityHashMap();
        for (Class_3238 class_3238 : Class_3238.Field_3271) {
            if (this.Field_8704.contains(class_3238)) continue;
            identityHashMap.putAll(((Class_34361)Objects.firstNonNull(this.Field_8703.get(class_3238), (Object)new Class_45391())).Method_34362(class_3238));
        }
        return identityHashMap;
    }

    public void Method_8707(Class_3238 class_3238, Class_34361 class_34361) {
        this.Field_8703.put(class_3238, class_34361);
    }

    public void Method_8708(Class_3238 ... arrclass_3238) {
        Collections.addAll(this.Field_8704, arrclass_3238);
    }
}

