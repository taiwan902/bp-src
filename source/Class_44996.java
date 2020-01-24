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
import java.util.List;
import java.util.Map;

public class Class_44996
extends Class_41931 {
    private final List Field_44997;
    private final Class_3538 Field_44998;
    private final String Field_44999;

    protected Class_41302 Method_45000(Class_3436 class_3436) {
        LinkedHashMap linkedHashMap = Maps.newLinkedHashMap((Map)class_3436.Method_3439());
        String string = this.Field_44998 == null ? ((Class_2080)Class_3238.Field_3271.\u0000, `((Object)class_3436.Method_3442())).Method_2086() : this.Field_44998.Method_3540((Comparable)linkedHashMap.remove(this.Field_44998));
        if (this.Field_44999 != null) {
            string = string + this.Field_44999;
        }
        for (Class_3538 class_3538 : this.Field_44997) {
            linkedHashMap.remove(class_3538);
        }
        return new Class_41302(string, this.\u0000strictfp((Map)linkedHashMap));
    }

    private Class_44996(Class_3538 class_3538, String string, List list) {
        this.Field_44998 = class_3538;
        this.Field_44999 = string;
        this.Field_44997 = list;
    }

    private void Method_45001() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_44996(Class_3538 class_3538, String string, List list, Class_17174 class_17174) {
        this(class_3538, string, list);
    }
}

