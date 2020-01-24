/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class Class_12192
implements Map {
    private final Map Field_12193 = Maps.newLinkedHashMap();

    public Set Method_12194() {
        return this.Field_12193.keySet();
    }

    public boolean Method_12195(Object object) {
        return this.Field_12193.containsKey(object.toString().toLowerCase());
    }

    public Set Method_12196() {
        return this.Field_12193.entrySet();
    }

    public void Method_12197() {
        this.Field_12193.clear();
    }

    public boolean Method_12198(Object object) {
        return this.Field_12193.containsKey(object);
    }

    public Collection Method_12199() {
        return this.Field_12193.values();
    }

    public Object Method_12200(Object object) {
        return this.Field_12193.remove(object.toString().toLowerCase());
    }

    public Object Method_12201(Object object, Object object2) {
        return this.Method_12205((String)object, object2);
    }

    private void Method_12202() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_12203(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.Method_12205((String)entry.getKey(), entry.getValue());
        }
    }

    public Object Method_12204(Object object) {
        return this.Field_12193.get(object.toString().toLowerCase());
    }

    public Object Method_12205(String string, Object object) {
        return this.Field_12193.put(string.toLowerCase(), object);
    }

    public int Method_12206() {
        return this.Field_12193.size();
    }

    public boolean Method_12207() {
        return this.Field_12193.isEmpty();
    }
}

