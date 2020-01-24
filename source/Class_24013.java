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

public class Class_24013 {
    private final Map Field_24014 = Maps.newHashMap();
    private final Map Field_24015 = Maps.newHashMap();
    private final Map Field_24016 = Maps.newHashMap();
    private final Class_39372 Field_24017;

    private int Method_24018(Class_1956 class_1956, int n) {
        return Class_1956.Method_1986(class_1956) << (-9582 & 53) | n;
    }

    public void Method_24019() {
        this.Field_24014.clear();
        for (Map.Entry entry : this.Field_24016.entrySet()) {
            this.Field_24014.put(entry.getKey(), this.Field_24017.Method_39380((Class_41302)entry.getValue()));
        }
    }

    protected int Method_24020(Class_23823 class_23823) {
        return class_23823.Method_23846() ? -14560 & 6170 : class_23823.Method_23843();
    }

    public Class_39372 Method_24021() {
        return this.Field_24017;
    }

    public Class_24013(Class_39372 class_39372) {
        this.Field_24017 = class_39372;
    }

    public void Method_24022(Class_1956 class_1956, Class_14028 class_14028) {
        this.Field_24015.put(class_1956, class_14028);
    }

    protected Class_31211 Method_24023(Class_1956 class_1956, int n) {
        return (Class_31211)this.Field_24014.get(this.Method_24018(class_1956, n));
    }

    public Class_31211 Method_24024(Class_23823 class_23823) {
        Class_14028 class_14028;
        Class_1956 class_1956 = class_23823.Method_23844();
        Class_31211 class_31211 = this.Method_24023(class_1956, this.Method_24020(class_23823));
        if (class_31211 == null && (class_14028 = (Class_14028)this.Field_24015.get(class_1956)) != null) {
            class_31211 = this.Field_24017.Method_39380(class_14028.Method_14029(class_23823));
        }
        if (class_31211 == null) {
            class_31211 = this.Field_24017.Method_39379();
        }
        return class_31211;
    }

    private void Method_24025() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_24026(Class_1956 class_1956, int n, Class_41302 class_41302) {
        this.Field_24016.put(this.Method_24018(class_1956, n), class_41302);
        this.Field_24014.put(this.Method_24018(class_1956, n), this.Field_24017.Method_39380(class_41302));
    }

    public Class_11372 Method_24027(Class_1956 class_1956, int n) {
        return this.Method_24024(new Class_23823(class_1956, 1555 & 10633, n)).Method_31216();
    }

    public Class_11372 Method_24028(Class_1956 class_1956) {
        return this.Method_24027(class_1956, -32508 & 512);
    }
}

