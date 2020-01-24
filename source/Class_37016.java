/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Map;
import java.util.Set;

public class Class_37016
implements Class_1486 {
    private Map Field_37017;

    public Class_37016(Map map) {
        this.Field_37017 = map;
    }

    private void Method_37018() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_37019(Class_29900 class_29900) {
        int n = class_29900.Method_30004();
        this.Field_37017 = Maps.newHashMap();
        for (int i = 24672 & 261; i < n; ++i) {
            Class_13017 class_13017 = Class_19863.Method_20025(class_29900.Method_29991(32767 & 32767));
            int n2 = class_29900.Method_30004();
            if (class_13017 == null) continue;
            this.Field_37017.put(class_13017, n2);
        }
    }

    public void Method_37020(Class_14856 class_14856) {
        class_14856.Method_14879(this);
    }

    public void Method_37021(Class_10954 class_10954) {
        this.Method_37020((Class_14856)class_10954);
    }

    public void Method_37022(Class_29900 class_29900) {
        class_29900.Method_29982(this.Field_37017.size());
        for (Map.Entry entry : this.Field_37017.entrySet()) {
            class_29900.Method_29960(((Class_13017)entry.getKey()).Field_13024);
            class_29900.Method_29982((Integer)entry.getValue());
        }
    }

    public Class_37016() {
    }

    public Map Method_37023() {
        return this.Field_37017;
    }
}

