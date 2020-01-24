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

public class Class_43006
extends Class_41931 {
    final Class_36433 Field_43007;

    private void Method_43008() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected Class_41302 Method_43009(Class_3436 class_3436) {
        LinkedHashMap linkedHashMap = Maps.newLinkedHashMap((Map)class_3436.Method_3439());
        String string = Class_4180.Field_4181.Method_3965((Class_4194)linkedHashMap.remove(Class_4180.Field_4181));
        if (Class_4194.Field_4199 != class_3436.Method_3440(Class_4180.Field_4181)) {
            linkedHashMap.remove(Class_4180.Field_4182);
        }
        return new Class_41302(string, this.\u0000strictfp((Map)linkedHashMap));
    }

    Class_43006(Class_36433 class_36433) {
        this.Field_43007 = class_36433;
    }
}

