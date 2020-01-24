/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Class_18569
extends Class_6791 {
    final Class_626 Field_18570;
    final Class_626 Field_18571;

    public void Method_18572(Class_24555 class_24555) {
        Object object;
        Class_33521 class_33521 = (Class_33521)class_24555;
        Map map = class_33521.Field_33522;
        Class_626.Method_818(this.Field_18570, (259 & 23561) != 0);
        Class_626.Method_826(this.Field_18570, new ArrayList());
        if (map.containsKey((Object)Class_7038.Field_7041)) {
            object = ((Class_26458)map.get((Object)Class_7038.Field_7041)).Field_26460.split(",");
            int n = ((String[])object).length;
            for (int i = 26625 & 4112; i < n; ++i) {
                String string = object[i];
                Class_626.Method_721(this.Field_18570).add(Integer.parseInt(string));
            }
        }
        object = new Class_19677((Class_26458)map.get((Object)Class_7038.Field_7039), (Class_26458)map.get((Object)Class_7038.Field_7045), (Class_26458)map.get((Object)Class_7038.Field_7044), (Class_26458)map.get((Object)Class_7038.Field_7040), (Class_26458)map.get((Object)Class_7038.Field_7046), (Class_26458)map.get((Object)Class_7038.Field_7042), Class_626.Method_721(this.Field_18571), Class_626.Method_720(this.Field_18571));
        Class_626.Method_772(this.Field_18570, (Class_19677)object);
    }

    Class_18569(Class_626 class_626, Class_626 class_6262) {
        this.Field_18571 = class_626;
        this.Field_18570 = class_6262;
    }

    private void Method_18573() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

