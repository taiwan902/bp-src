/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Map;
import java.util.Set;

public abstract class Class_41931
implements Class_34361 {
    protected Map Field_41932 = Maps.newLinkedHashMap();

    public String Method_41933(Map map) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            if (stringBuilder.length() != 0) {
                stringBuilder.append(",");
            }
            Class_3538 class_3538 = (Class_3538)entry.getKey();
            Comparable comparable = (Comparable)entry.getValue();
            stringBuilder.append(class_3538.Method_3541());
            stringBuilder.append("=");
            stringBuilder.append(class_3538.Method_3540(comparable));
        }
        if (stringBuilder.length() == 0) {
            stringBuilder.append("normal");
        }
        return stringBuilder.toString();
    }

    private void Method_41934() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected abstract Class_41302 Method_41935(Class_3436 var1);

    public Map Method_41936(Class_3238 class_3238) {
        for (Class_3436 class_3436 : class_3238.Method_3360().Method_3865()) {
            this.Field_41932.put(class_3436, this.Method_41935(class_3436));
        }
        return this.Field_41932;
    }
}

