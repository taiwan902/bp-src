/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.LinkedHashMap;
import java.util.Map;

public class Class_46425
extends Class_41931 {
    final Class_36433 Field_46426;

    private void Method_46427() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_46425(Class_36433 class_36433) {
        this.Field_46426 = class_36433;
    }

    protected Class_41302 Method_46428(Class_3436 class_3436) {
        LinkedHashMap linkedHashMap = Maps.newLinkedHashMap((Map)class_3436.Method_3439());
        String string = Class_38701.Field_38703.Method_3965((Class_34956)linkedHashMap.remove(Class_38701.Field_38703));
        linkedHashMap.remove(Class_5700.Field_5702);
        String string2 = (Boolean)class_3436.Method_3440(Class_38701.Field_38702) != false ? "all" : "normal";
        return new Class_41302(string + "_double_slab", string2);
    }
}

