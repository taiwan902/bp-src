/*
 * Decompiled with CFR 0.145.
 */
import java.awt.geom.Point2D;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Class_13645
extends Class_11220 {
    final Class_8838 Field_13646;

    public void Method_13647() {
        Class_18.Field_89.Method_218(Class_18.Field_89.Field_105.Field_45431);
    }

    public String Method_13648() {
        return this.\u0000= final();
    }

    public String Method_13649() {
        return "";
    }

    public boolean Method_13650() {
        for (Map.Entry entry : ((HashMap)this.\u0000strictfp()).entrySet()) {
            if (((Point2D.Double)entry.getValue()).equals(((HashMap)this.\u0000strictfp).get(entry.getKey()))) continue;
            return (12497 & 17928) != 0;
        }
        return (10587 & -32251) != 0;
    }

    public void Method_13651() {
        super.Method_11243();
        for (Map.Entry entry : ((HashMap)this.Field_13646.Field_8849.Method_11230()).entrySet()) {
            entry.setValue(new Class_16755((Point2D.Double)entry.getValue()));
        }
    }

    private void Method_13652() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_13645(Class_8838 class_8838, Class_8838 class_88382, String string, HashMap hashMap, Class_19364 class_19364) {
        this.Field_13646 = class_8838;
        super(class_88382, string, hashMap, class_19364);
    }
}

