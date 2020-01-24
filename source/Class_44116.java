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

public class Class_44116
extends Class_41931 {
    final Class_36433 Field_44117;

    Class_44116(Class_36433 class_36433) {
        this.Field_44117 = class_36433;
    }

    private void Method_44118() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected Class_41302 Method_44119(Class_3436 class_3436) {
        LinkedHashMap linkedHashMap = Maps.newLinkedHashMap((Map)class_3436.Method_3439());
        String string = Class_5700.Field_5701.Method_3965((Class_5750)linkedHashMap.remove(Class_5700.Field_5701));
        linkedHashMap.remove(Class_5700.Field_5702);
        String string2 = (Boolean)class_3436.Method_3440(Class_5700.Field_5702) != false ? "all" : "normal";
        return new Class_41302(string + "_double_slab", string2);
    }
}

