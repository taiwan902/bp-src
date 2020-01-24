/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Class_33931
implements Class_18171 {
    private Map Field_33932 = new HashMap();

    public boolean Method_33933(String string, Class_13745 class_13745) {
        if (this.Field_33932.containsKey(string)) {
            Class_26062.Method_26066("Expression already defined: " + string);
            return (8464 & -32153) != 0;
        }
        this.Field_33932.put(string, class_13745);
        return (547 & 17793) != 0;
    }

    private void Method_33934() {
        Class_41991[] arrclass_41991 = Class_41991.Method_42108();
        for (int i = -16127 & 2184; i < arrclass_41991.length; ++i) {
            Class_41991 class_41991 = arrclass_41991[i];
            this.Field_33932.put(class_41991.Method_42169(), class_41991);
        }
        Class_39054[] arrclass_39054 = Class_39054.Method_39106();
        for (int i = 20528 & 11405; i < arrclass_39054.length; ++i) {
            Class_39054 class_39054 = arrclass_39054[i];
            this.Field_33932.put(class_39054.Method_39104(), class_39054);
        }
        Class_17281[] arrclass_17281 = Class_17281.Method_17425();
        for (int i = 16560 & 2; i < arrclass_17281.length; ++i) {
            Class_17281 class_17281 = arrclass_17281[i];
            if (class_17281 == null) continue;
            String string = class_17281.Field_17355.trim();
            string = "BIOME_" + string.toUpperCase().replace((char)(50 & 20513), (char)(-27265 & 16479));
            int n = class_17281.Field_17343;
            Class_40687 class_40687 = new Class_40687(n);
            this.Method_33933(string, class_40687);
        }
    }

    public Class_13745 Method_33935(String string) {
        return (Class_13745)this.Field_33932.get(string);
    }

    private void Method_33936() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_33931(Map map) {
        this.Method_33934();
        for (String string : map.keySet()) {
            Class_13745 class_13745 = (Class_13745)map.get(string);
            this.Method_33933(string, class_13745);
        }
    }
}

