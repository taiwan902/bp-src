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

public class Class_42590
extends Class_41931 {
    final Class_36433 Field_42591;

    Class_42590(Class_36433 class_36433) {
        this.Field_42591 = class_36433;
    }

    protected Class_41302 Method_42592(Class_3436 class_3436) {
        LinkedHashMap linkedHashMap = Maps.newLinkedHashMap((Map)class_3436.Method_3439());
        if (class_3436.Method_3440(Class_43717.Field_43718) != Class_4595.Field_4601) {
            linkedHashMap.remove(Class_43717.Field_43719);
        }
        return new Class_41302((Class_2080)Class_3238.Field_3271.\u0000, `((Object)class_3436.Method_3442()), this.\u0000strictfp((Map)linkedHashMap));
    }

    private void Method_42593() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

